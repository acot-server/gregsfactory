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
    .notConsumable(<gregtech:meta_item_1:676>)
    .circuit(1)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 72,
        <liquid:thorium> * 720
    ])
    .outputs(<gregtech:meta_item_1:663> * 10)
    .duration(80)
    .EUt(32768)
    .buildAndRegister();

//MV Precog from scratch

bio_circuit_assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:407> * 1,
        <gregtech:meta_item_1:709> * 16
    ])
    .notConsumable(<gregtech:meta_item_1:676>)
    .circuit(2)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 72,
        <liquid:thorium> * 720
    ])
    .outputs(<gregtech:meta_item_1:664> * 10)
    .duration(80)
    .EUt(65536)
    .buildAndRegister();

//HV Precog from scratch

bio_circuit_assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:407> * 1,
        <gregtech:meta_item_1:709> * 16
    ])
    .notConsumable(<gregtech:meta_item_1:676>)
    .circuit(3)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 112,
        <liquid:thorium> * 1440
    ])
    .outputs(<gregtech:meta_item_1:665> * 10)
    .duration(80)
    .EUt(968304)
    .buildAndRegister();

//EV Precog from scratch

bio_circuit_assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:407> * 1,
        <gregtech:meta_item_1:709> * 16
    ])
    .notConsumable(<gregtech:meta_item_1:676>)
    .circuit(4)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 112,
        <liquid:uranium> * 288
    ])
    .outputs(<gregtech:meta_item_1:666> * 10)
    .duration(80)
    .EUt(131072)
    .buildAndRegister();

//IV Precog from scratch

bio_circuit_assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:407> * 1,
        <gregtech:meta_item_1:709> * 16
    ])
    .notConsumable(<gregtech:meta_item_1:676>)
    .circuit(5)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 144,
        <liquid:uranium> * 576
    ])
    .outputs(<gregtech:meta_item_1:667> * 10)
    .duration(80)
    .EUt(163840)
    .buildAndRegister();

//LuV Precog from scratch

bio_circuit_assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:407> * 1,
        <gregtech:meta_item_1:709> * 16
    ])
    .notConsumable(<gregtech:meta_item_1:676>)
    .circuit(6)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 172,
        <liquid:uranium> * 720
    ])
    .outputs(<gregtech:meta_item_1:668> * 10)
    .duration(80)
    .EUt(393216)
    .buildAndRegister();

//ZPM Precog from scratch

bio_circuit_assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:407> * 1,
        <gregtech:meta_item_1:709> * 16
    ])
    .notConsumable(<gregtech:meta_item_1:676>)
    .circuit(7)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 224,
        <liquid:uranium_235> * 576
    ])
    .outputs(<gregtech:meta_item_1:669> * 10)
    .duration(80)
    .EUt(491520)
    .buildAndRegister();

//UV Precog from scratch

bio_circuit_assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:407> * 1,
        <gregtech:meta_item_1:709> * 16
    ])
    .notConsumable(<gregtech:meta_item_1:676>)
    .circuit(8)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 288,
        <liquid:uranium_235> * 720
    ])
    .outputs(<gregtech:meta_item_1:670> * 10)
    .duration(80)
    .EUt(688128)
    .buildAndRegister();

//UHV Precog from scratch

bio_circuit_assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:407> * 1,
        <gregtech:meta_item_1:709> * 16
    ])
    .notConsumable(<gregtech:meta_item_1:676>)
    .circuit(9)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 288,
        <liquid:plutonium_241> * 720
    ])
    .outputs(<gregtech:meta_item_1:671> * 10)
    .duration(80)
    .EUt(2752512)
    .buildAndRegister();

//UEV Precog from scratch

bio_circuit_assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:407> * 1,
        <gregtech:meta_item_1:709> * 16
    ])
    .notConsumable(<gregtech:meta_item_1:676>)
    .circuit(10)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 310,
        <liquid:plutonium_241> * 1152
    ])
    .outputs(<gregtech:meta_item_1:672> * 10)
    .duration(80)
    .EUt(8257536)
    .buildAndRegister();

//UIV Precog from scratch

bio_circuit_assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:407> * 1,
        <gregtech:meta_item_1:709> * 16
    ])
    .notConsumable(<gregtech:meta_item_1:676>)
    .circuit(11)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 334,
        <liquid:plutonium_241> * 1152
    ])
    .outputs(<gregtech:meta_item_1:673> * 10)
    .duration(80)
    .EUt(24772608)
    .buildAndRegister();

//UXV Precog from scratch

bio_circuit_assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:407> * 1,
        <gregtech:meta_item_1:709> * 16
    ])
    .notConsumable(<gregtech:meta_item_1:676>)
    .circuit(12)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 384,
        <liquid:naquadria> * 1152
    ])
    .outputs(<gregtech:meta_item_1:674> * 10)
    .duration(80)
    .EUt(74317824)
    .buildAndRegister();

//OpV Precog from scratch

bio_circuit_assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:407> * 1,
        <gregtech:meta_item_1:709> * 16
    ])
    .notConsumable(<gregtech:meta_item_1:676>)
    .circuit(13)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 432,
        <liquid:naquadria> * 1440
    ])
    .outputs(<gregtech:meta_item_1:675> * 10)
    .duration(80)
    .EUt(222953472)
    .buildAndRegister();

//MV Precog from LV Precog

bio_circuit_assembler.recipeBuilder()
    .inputs(<gregtech:meta_item_1:663> * 10)
    .notConsumable(<gregtech:meta_item_1:676>)
    .circuit(14)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 36,
        <liquid:thorium> * 720
    ])
    .outputs(<gregtech:meta_item_1:664> * 10)
    .duration(80)
    .EUt(32768)
    .buildAndRegister();

//HV Precog from MV Precog

bio_circuit_assembler.recipeBuilder()
    .inputs(<gregtech:meta_item_1:664> * 10)
    .notConsumable(<gregtech:meta_item_1:676>)
    .circuit(15)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 48,
        <liquid:thorium> * 720
    ])
    .outputs(<gregtech:meta_item_1:665> * 10)
    .duration(80)
    .EUt(32768)
    .buildAndRegister();

//EV Precog from HV Precog

bio_circuit_assembler.recipeBuilder()
    .inputs(<gregtech:meta_item_1:665> * 10)
    .notConsumable(<gregtech:meta_item_1:676>)
    .circuit(16)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 48,
        <liquid:thorium> * 1440
    ])
    .outputs(<gregtech:meta_item_1:666> * 10)
    .duration(80)
    .EUt(65536)
    .buildAndRegister();

//IV Precog from EV Precog

bio_circuit_assembler.recipeBuilder()
    .inputs(<gregtech:meta_item_1:666> * 10)
    .notConsumable(<gregtech:meta_item_1:676>)
    .circuit(17)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 36,
        <liquid:uranium> * 144
    ])
    .outputs(<gregtech:meta_item_1:667> * 10)
    .duration(80)
    .EUt(65536)
    .buildAndRegister();

//LuV Precog from IV Precog

bio_circuit_assembler.recipeBuilder()
    .inputs(<gregtech:meta_item_1:667> * 10)
    .notConsumable(<gregtech:meta_item_1:676>)
    .circuit(18)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 36,
        <liquid:uranium> * 288
    ])
    .outputs(<gregtech:meta_item_1:668> * 10)
    .duration(80)
    .EUt(131072)
    .buildAndRegister();

//ZPM Precog from LuV Precog

bio_circuit_assembler.recipeBuilder()
    .inputs(<gregtech:meta_item_1:668> * 10)
    .notConsumable(<gregtech:meta_item_1:676>)
    .circuit(19)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 72,
        <liquid:uranium_235> * 288
    ])
    .outputs(<gregtech:meta_item_1:669> * 10)
    .duration(80)
    .EUt(262144)
    .buildAndRegister();

//UV Precog from ZPM Precog

bio_circuit_assembler.recipeBuilder()
    .inputs(<gregtech:meta_item_1:669> * 10)
    .notConsumable(<gregtech:meta_item_1:676>)
    .circuit(20)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 72,
        <liquid:uranium_235> * 384
    ])
    .outputs(<gregtech:meta_item_1:670> * 10)
    .duration(80)
    .EUt(524288)
    .buildAndRegister();

//UHV Precog from UV Precog

bio_circuit_assembler.recipeBuilder()
    .inputs(<gregtech:meta_item_1:670> * 10)
    .notConsumable(<gregtech:meta_item_1:676>)
    .circuit(21)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 72,
        <liquid:plutonium_241> * 384
    ])
    .outputs(<gregtech:meta_item_1:671> * 10)
    .duration(80)
    .EUt(2096150)
    .buildAndRegister();

//UEV Precog from UHV Precog

bio_circuit_assembler.recipeBuilder()
    .inputs(<gregtech:meta_item_1:671> * 10)
    .notConsumable(<gregtech:meta_item_1:676>)
    .circuit(22)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 96,
        <liquid:plutonium_241> * 576
    ])
    .outputs(<gregtech:meta_item_1:672> * 10)
    .duration(80)
    .EUt(6288450)
    .buildAndRegister();

//UIV Precog from UEV Precog

bio_circuit_assembler.recipeBuilder()
    .inputs(<gregtech:meta_item_1:672> * 10)
    .notConsumable(<gregtech:meta_item_1:676>)
    .circuit(23)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 96,
        <liquid:plutonium_241> * 576
    ])
    .outputs(<gregtech:meta_item_1:673> * 10)
    .duration(80)
    .EUt(18865350)
    .buildAndRegister();

//UXV Precog from UIV Precog

bio_circuit_assembler.recipeBuilder()
    .inputs(<gregtech:meta_item_1:673> * 10)
    .notConsumable(<gregtech:meta_item_1:676>)
    .circuit(24)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 96,
        <liquid:naquadria> * 720
    ])
    .outputs(<gregtech:meta_item_1:674> * 10)
    .duration(80)
    .EUt(56596050)
    .buildAndRegister();

//UXV Precog from UIV Precog

bio_circuit_assembler.recipeBuilder()
    .inputs(<gregtech:meta_item_1:674> * 10)
    .notConsumable(<gregtech:meta_item_1:676>)
    .circuit(25)
    .fluidInputs([
        <liquid:sterilized_growth_medium> * 144,
        <liquid:naquadria> * 1440
    ])
    .outputs(<gregtech:meta_item_1:675> * 20)
    .duration(80)
    .EUt(169788150)
    .buildAndRegister();

