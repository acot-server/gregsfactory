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

global bio_circuit_assembler as RecipeMap = FactoryRecipeMap.start("bio_circuit_assembler")
                .minInputs(1)
                .maxInputs(6)
                .maxOutputs(1)
                .maxFluidInputs(2)
                .build();

MachineBuilder.create(24000, "bioassembler")
    .setRecipeMap(bio_circuit_assembler)
    .setRenderer("machines/scanner")
    .addTier(7,8,9,10,11,12,12,13)
    .setMachine()
    .buildAndRegister();

//LV Precog CPU

bio_circuit_assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:407> * 1,
        <gregtech:meta_item_1:709> * 16
    ])
    .notConsumable(<contenttweaker:precursor_database>)
    .circuit(1)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 288,
        <liquid:thorium> * 1440
    ])
    .outputs(<contenttweaker:lv_computer_pregoc> * 6)
    .duration(100)
    .EUt(32768)
    .buildAndRegister();

//MV Precog from scratch

bio_circuit_assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:407> * 1,
        <gregtech:meta_item_1:709> * 16
    ])
    .notConsumable(<contenttweaker:precursor_database>)
    .circuit(2)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 288,
        <liquid:thorium> * 1440
    ])
    .outputs(<contenttweaker:mv_computer_pregoc> * 6)
    .duration(100)
    .EUt(65536)
    .buildAndRegister();

//HV Precog from scratch

bio_circuit_assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:407> * 1,
        <gregtech:meta_item_1:709> * 16
    ])
    .notConsumable(<contenttweaker:precursor_database>)
    .circuit(3)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 384,
        <liquid:thorium> * 2880
    ])
    .outputs(<contenttweaker:hv_computer_pregoc> * 6)
    .duration(100)
    .EUt(968304)
    .buildAndRegister();

//EV Precog from scratch

bio_circuit_assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:407> * 1,
        <gregtech:meta_item_1:709> * 16
    ])
    .notConsumable(<contenttweaker:precursor_database>)
    .circuit(4)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 576,
        <liquid:uranium> * 576
    ])
    .outputs(<contenttweaker:ev_computer_pregoc> * 6)
    .duration(100)
    .EUt(131072)
    .buildAndRegister();

//IV Precog from scratch

bio_circuit_assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:407> * 1,
        <gregtech:meta_item_1:709> * 16
    ])
    .notConsumable(<contenttweaker:precursor_database>)
    .circuit(5)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 720,
        <liquid:uranium> * 1152
    ])
    .outputs(<contenttweaker:iv_computer_pregoc> * 6)
    .duration(100)
    .EUt(163840)
    .buildAndRegister();

//LuV Precog from scratch

bio_circuit_assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:407> * 1,
        <gregtech:meta_item_1:709> * 16
    ])
    .notConsumable(<contenttweaker:precursor_database>)
    .circuit(6)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 1152,
        <liquid:uranium> * 1440
    ])
    .outputs(<contenttweaker:luv_computer_pregoc> * 6)
    .duration(100)
    .EUt(393216)
    .buildAndRegister();

//ZPM Precog from scratch

bio_circuit_assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:407> * 1,
        <gregtech:meta_item_1:709> * 16
    ])
    .notConsumable(<contenttweaker:precursor_database>)
    .circuit(7)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 1440,
        <liquid:uranium_235> * 1152
    ])
    .outputs(<contenttweaker:luv_computer_pregoc> * 6)
    .duration(100)
    .EUt(491520)
    .buildAndRegister();

//UV Precog from scratch

bio_circuit_assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:407> * 1,
        <gregtech:meta_item_1:709> * 16
    ])
    .notConsumable(<contenttweaker:precursor_database>)
    .circuit(8)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 2304,
        <liquid:uranium_235> * 1440
    ])
    .outputs(<contenttweaker:uv_computer_pregoc> * 6)
    .duration(100)
    .EUt(688128)
    .buildAndRegister();

//UHV Precog from scratch

bio_circuit_assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:407> * 1,
        <gregtech:meta_item_1:709> * 16
    ])
    .notConsumable(<contenttweaker:precursor_database>)
    .circuit(9)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 2304,
        <liquid:plutonium_241> * 1440
    ])
    .outputs(<contenttweaker:uhv_computer_pregoc> * 6)
    .duration(100)
    .EUt(2752512)
    .buildAndRegister();

//UEV Precog from scratch

bio_circuit_assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:407> * 1,
        <gregtech:meta_item_1:709> * 16
    ])
    .notConsumable(<contenttweaker:precursor_database>)
    .circuit(10)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 2592,
        <liquid:plutonium_241> * 2304
    ])
    .outputs(<contenttweaker:uev_computer_pregoc> * 6)
    .duration(100)
    .EUt(8257536)
    .buildAndRegister();

//UIV Precog from scratch

bio_circuit_assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:407> * 1,
        <gregtech:meta_item_1:709> * 16
    ])
    .notConsumable(<contenttweaker:precursor_database>)
    .circuit(11)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 2592,
        <liquid:plutonium_241> * 2304
    ])
    .outputs(<contenttweaker:uiv_computer_pregoc> * 6)
    .duration(100)
    .EUt(24772608)
    .buildAndRegister();

//UXV Precog from scratch

bio_circuit_assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:407> * 1,
        <gregtech:meta_item_1:709> * 16
    ])
    .notConsumable(<contenttweaker:precursor_database>)
    .circuit(12)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 2880,
        <liquid:naquadria> * 2304
    ])
    .outputs(<contenttweaker:uxv_computer_pregoc> * 6)
    .duration(100)
    .EUt(74317824)
    .buildAndRegister();

//OpV Precog from scratch

bio_circuit_assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:407> * 1,
        <gregtech:meta_item_1:709> * 16
    ])
    .notConsumable(<contenttweaker:precursor_database>)
    .circuit(13)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 3168,
        <liquid:naquadria> * 2880
    ])
    .outputs(<contenttweaker:opv_computer_pregoc> * 6)
    .duration(100)
    .EUt(222953472)
    .buildAndRegister();

//MV Precog from LV Precog

bio_circuit_assembler.recipeBuilder()
    .inputs(<contenttweaker:lv_computer_pregoc> * 6)
    .notConsumable(<contenttweaker:precursor_database>)
    .circuit(14)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 144,
        <liquid:thorium> * 1440
    ])
    .outputs(<contenttweaker:mv_computer_pregoc> * 6)
    .duration(100)
    .EUt(32768)
    .buildAndRegister();

//HV Precog from MV Precog

bio_circuit_assembler.recipeBuilder()
    .inputs(<contenttweaker:mv_computer_pregoc> * 6)
    .notConsumable(<contenttweaker:precursor_database>)
    .circuit(15)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 144,
        <liquid:thorium> * 1440
    ])
    .outputs(<contenttweaker:hv_computer_pregoc> * 6)
    .duration(100)
    .EUt(32768)
    .buildAndRegister();

//EV Precog from HV Precog

bio_circuit_assembler.recipeBuilder()
    .inputs(<contenttweaker:hv_computer_pregoc> * 6)
    .notConsumable(<contenttweaker:precursor_database>)
    .circuit(16)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 144,
        <liquid:thorium> * 2880
    ])
    .outputs(<contenttweaker:ev_computer_pregoc> * 6)
    .duration(100)
    .EUt(65536)
    .buildAndRegister();

//IV Precog from EV Precog

bio_circuit_assembler.recipeBuilder()
    .inputs(<contenttweaker:ev_computer_pregoc> * 6)
    .notConsumable(<contenttweaker:precursor_database>)
    .circuit(17)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 144,
        <liquid:uranium> * 288
    ])
    .outputs(<contenttweaker:iv_computer_pregoc> * 6)
    .duration(100)
    .EUt(65536)
    .buildAndRegister();

//LuV Precog from IV Precog

bio_circuit_assembler.recipeBuilder()
    .inputs(<contenttweaker:iv_computer_pregoc> * 6)
    .notConsumable(<contenttweaker:precursor_database>)
    .circuit(18)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 144,
        <liquid:uranium> * 576
    ])
    .outputs(<contenttweaker:luv_computer_pregoc> * 6)
    .duration(100)
    .EUt(131072)
    .buildAndRegister();

//ZPM Precog from LuV Precog

bio_circuit_assembler.recipeBuilder()
    .inputs(<contenttweaker:luv_computer_pregoc> * 6)
    .notConsumable(<contenttweaker:precursor_database>)
    .circuit(19)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 288,
        <liquid:uranium_235> * 576
    ])
    .outputs(<contenttweaker:zpm_computer_pregoc> * 6)
    .duration(100)
    .EUt(262144)
    .buildAndRegister();

//UV Precog from ZPM Precog

bio_circuit_assembler.recipeBuilder()
    .inputs(<contenttweaker:zpm_computer_pregoc> * 6)
    .notConsumable(<contenttweaker:precursor_database>)
    .circuit(20)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 288,
        <liquid:uranium_235> * 720
    ])
    .outputs(<contenttweaker:uv_computer_pregoc> * 6)
    .duration(100)
    .EUt(524288)
    .buildAndRegister();

//UHV Precog from UV Precog

bio_circuit_assembler.recipeBuilder()
    .inputs(<contenttweaker:uv_computer_pregoc> * 6)
    .notConsumable(<contenttweaker:precursor_database>)
    .circuit(21)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 288,
        <liquid:plutonium_241> * 720
    ])
    .outputs(<contenttweaker:uhv_computer_pregoc> * 6)
    .duration(100)
    .EUt(2096150)
    .buildAndRegister();

//UEV Precog from UHV Precog

bio_circuit_assembler.recipeBuilder()
    .inputs(<contenttweaker:uhv_computer_pregoc> * 6)
    .notConsumable(<contenttweaker:precursor_database>)
    .circuit(22)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 384,
        <liquid:plutonium_241> * 1152
    ])
    .outputs(<contenttweaker:uev_computer_pregoc> * 6)
    .duration(100)
    .EUt(6288450)
    .buildAndRegister();

//UIV Precog from UEV Precog

bio_circuit_assembler.recipeBuilder()
    .inputs(<contenttweaker:uev_computer_pregoc> * 6)
    .notConsumable(<contenttweaker:precursor_database>)
    .circuit(23)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 384,
        <liquid:plutonium_241> * 1152
    ])
    .outputs(<contenttweaker:uiv_computer_pregoc> * 6)
    .duration(100)
    .EUt(18865350)
    .buildAndRegister();

//UXV Precog from UIV Precog

bio_circuit_assembler.recipeBuilder()
    .inputs(<contenttweaker:uiv_computer_pregoc> * 6)
    .notConsumable(<contenttweaker:precursor_database>)
    .circuit(24)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 576,
        <liquid:naquadria> * 1440
    ])
    .outputs(<contenttweaker:uxv_computer_pregoc> * 6)
    .duration(100)
    .EUt(56596050)
    .buildAndRegister();

//UXV Precog from UIV Precog

bio_circuit_assembler.recipeBuilder()
    .inputs(<contenttweaker:uxv_computer_pregoc> * 6)
    .notConsumable(<contenttweaker:precursor_database>)
    .circuit(25)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 720,
        <liquid:naquadria> * 2880
    ])
    .outputs(<contenttweaker:opv_computer_pregoc> * 12)
    .duration(100)
    .EUt(169788150)
    .buildAndRegister();

