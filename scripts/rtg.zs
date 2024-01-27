#priority 99

import mods.gregtech.multiblock.Builder;
import mods.gregtech.multiblock.FactoryBlockPattern;
import mods.gregtech.multiblock.RelativeDirection;
import mods.gregtech.multiblock.functions.IPatternBuilderFunction;
import mods.gregtech.IControllerTile;
import mods.gregtech.multiblock.CTPredicate;
import mods.gregtech.multiblock.IBlockPattern;
import mods.gregtech.recipe.FactoryRecipeMap;
import mods.gregtech.machine.Renderer;
import mods.gregtech.machine.MachineBuilder;
import mods.gregtech.recipe.RecipeMapBuilder;
import mods.gregtech.recipe.RecipeMaps;
import mods.gregtech.recipe.RecipeMap;

global rtg as RecipeMap = FactoryRecipeMap.start("rtg")
                .minInputs(1)
                .maxInputs(1)
                .build();

//RTG Generator
MachineBuilder.create(32550, "rtggen")
    .setRecipeMap(rtg)
    .setRenderer("machines/replicator")
    .addTier(2,3,4,5)
    .setGenerator()
    .buildAndRegister();

//Recipes for RTG Generator
//RTG Tier 1 (MV)
assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_plate_double:55> * 8,
        <gregtech:wire_coil> * 4,
        <gregtech:meta_item_1:218> * 1,
        <ore:circuitMv> * 3,
        <gregtech:machine:987> * 1
    ])
    .outputs(<gregtech:machine:32554> * 1)
    .EUt(128)
    .duration(2000)
    .buildAndRegister();

//RTG Tier 2 (HV)
assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_plate_double:55> * 12,
        <gregtech:wire_coil:1> * 4,
        <gregtech:meta_item_1:219> * 1,
        <ore:circuitHv> * 3,
        <gregtech:machine:988> * 1
    ])
    .outputs(<gregtech:machine:32555> * 1)
    .EUt(384)
    .duration(2000)
    .buildAndRegister();

//RTG Tier 3 (EV)
assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_plate_double:55> * 16,
        <gregtech:wire_coil:2> * 4,
        <gregtech:meta_item_1:220> * 1,
        <ore:circuitEv> * 3,
        <gregtech:machine:989> * 1
    ])
    .outputs(<gregtech:machine:32556> * 1)
    .EUt(1640)
    .duration(2000)
    .buildAndRegister();

//RTG Tier 4 (IV)
assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_plate_double:55> * 20,
        <gregtech:wire_coil:3> * 4,
        <gregtech:meta_item_1:221> * 1,
        <ore:circuitIv> * 3,
        <gregtech:machine:990> * 1
    ])
    .outputs(<gregtech:machine:32557> * 1)
    .EUt(4286)
    .duration(2000)
    .buildAndRegister();

//Empty Fuel Rod
assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_plate_double:55> * 4,
        <gregtech:fluid_pipe_tiny:324> * 1,
        <gregtech:meta_plate_double:25> * 1
    ])
    .outputs(<contenttweaker:empty_nuclear_fuel_rod> * 1)
    .EUt(64)
    .duration(1200)
    .buildAndRegister();

//U238 Fuel Rod
canner.recipeBuilder()
    .inputs([
        <contenttweaker:empty_nuclear_fuel_rod> * 1,
        <gregtech:meta_dust:116> * 1
    ])
    .outputs(<contenttweaker:u238_fuel_rod> * 1)
    .EUt(96)
    .duration(1200)
    .buildAndRegister();

rtg.recipeBuilder()
    .inputs(<contenttweaker:u238_fuel_rod> * 1)
    .EUt(-64)
    .duration(72000)
    .buildAndRegister();

//U235 Fuel Rod
canner.recipeBuilder()
    .inputs([
        <contenttweaker:empty_nuclear_fuel_rod> * 1,
        <gregtech:meta_dust:117> * 1
    ])
    .outputs(<contenttweaker:u235_fuel_rod> * 1)
    .EUt(96)
    .duration(1200)
    .buildAndRegister();

rtg.recipeBuilder()
    .inputs(<contenttweaker:u235_fuel_rod> * 1)
    .EUt(-128)
    .duration(72000)
    .buildAndRegister();

//Pu239 Fuel Rod
canner.recipeBuilder()
    .inputs([
        <contenttweaker:empty_nuclear_fuel_rod> * 1,
        <gregtech:meta_dust:81> * 1
    ])
    .outputs(<contenttweaker:pu239_fuel_rod> * 1)
    .EUt(224)
    .duration(1800)
    .buildAndRegister();

rtg.recipeBuilder()
    .inputs(<contenttweaker:pu239_fuel_rod> * 1)
    .EUt(-256)
    .duration(72000)
    .buildAndRegister();

//Pu241 Fuel Rod
canner.recipeBuilder()
    .inputs([
        <contenttweaker:empty_nuclear_fuel_rod> * 1,
        <gregtech:meta_dust:82> * 1
    ])
    .outputs(<contenttweaker:pu241_fuel_rod> * 1)
    .EUt(224)
    .duration(1800)
    .buildAndRegister();

rtg.recipeBuilder()
    .inputs(<contenttweaker:pu241_fuel_rod> * 1)
    .EUt(-512)
    .duration(72000)
    .buildAndRegister();

//U238+Pu239 Fuel Rod
assembler.recipeBuilder()
    .inputs([
        <contenttweaker:pu239_fuel_rod> * 1,
        <contenttweaker:u238_fuel_rod> * 1
    ])
    .fluidInputs(<liquid:lead> * 576)
    .outputs(<contenttweaker:u238_pu239_fuel_rod> * 1)
    .EUt(1024)
    .duration(2400)
    .buildAndRegister();

rtg.recipeBuilder()
    .inputs(<contenttweaker:u238_pu239_fuel_rod> * 1)
    .EUt(-1024)
    .duration(72000)
    .buildAndRegister();

//U235+Pu239
assembler.recipeBuilder()
    .inputs([
        <contenttweaker:pu239_fuel_rod> * 1,
        <contenttweaker:u235_fuel_rod> * 1
    ])
    .fluidInputs(<liquid:lead> * 576)
    .outputs(<contenttweaker:u235_pu239_fuel_rod> * 1)
    .EUt(1024)
    .duration(2400)
    .buildAndRegister();

rtg.recipeBuilder()
    .inputs(<contenttweaker:u235_pu239_fuel_rod> * 1)
    .EUt(-1536)
    .duration(72000)
    .buildAndRegister();

//U238+Pu241
assembler.recipeBuilder()
    .inputs([
        <contenttweaker:pu241_fuel_rod> * 1,
        <contenttweaker:u238_fuel_rod> * 1
    ])
    .fluidInputs(<liquid:lead> * 576)
    .outputs(<contenttweaker:u238_pu241_fuel_rod> * 1)
    .EUt(1024)
    .duration(2400)
    .buildAndRegister();

rtg.recipeBuilder()
    .inputs(<contenttweaker:u238_pu241_fuel_rod> * 1)
    .EUt(-2048)
    .duration(72000)
    .buildAndRegister();

//U235+Pu241
assembler.recipeBuilder()
    .inputs([
        <contenttweaker:pu241_fuel_rod> * 1,
        <contenttweaker:u235_fuel_rod> * 1
    ])
    .fluidInputs(<liquid:lead> * 576)
    .outputs(<contenttweaker:u235_pu241_fuel_rod> * 1)
    .EUt(1024)
    .duration(2400)
    .buildAndRegister();

rtg.recipeBuilder()
    .inputs(<contenttweaker:u235_pu241_fuel_rod> * 1)
    .EUt(-4096)
    .duration(72000)
    .buildAndRegister();

//Naquadah
canner.recipeBuilder()
    .inputs([
        <contenttweaker:empty_nuclear_fuel_rod> * 1,
        <gregtech:meta_dust:124> * 1
    ])
    .outputs(<contenttweaker:nq_fuel_rod> * 1)
    .EUt(3072)
    .duration(3000)
    .buildAndRegister();

rtg.recipeBuilder()
    .inputs(<contenttweaker:nq_fuel_rod> * 1)
    .EUt(-8192)
    .duration(72000)
    .buildAndRegister();