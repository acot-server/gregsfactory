import crafttweaker.item.IIngredient;
import mods.gregtech.recipe.RecipeMap;
import crafttweaker.item.IItemStack;

circuit_assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:708> * 2,
        <gregtech:meta_item_1:705> * 8,
        <gregtech:meta_item_1:599> * 4,
        <gregtech:meta_wire_fine:32007> * 8,
        <gregtech:meta_bolt:32006> * 4
    ])
    .fluidInputs(<liquid:darkenergyalloy> * 288)
    .outputs(<contenttweaker:omega_processor> * 4)
    .EUt(6000000)
    .duration(9000)
    .buildAndRegister();

circuit_assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:407> * 1,
        <contenttweaker:omega_processor> * 4,
        <gregtech:meta_item_1:544> * 4,
        <gregtech:meta_item_1:543> * 4,
        <gregtech:meta_item_1:592> * 64,
        <gregtech:meta_wire_fine:32007> * 16
    ])
    .fluidInputs(<liquid:darkenergyalloy> * 288)
    .outputs(<contenttweaker:omega_supercomputer> * 2)
    .EUt(48000000)
    .duration(11000)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs([
        <gregtech:meta_stick_long:32007> * 32,
        <contenttweaker:omega_supercomputer> * 4,
        <gregtech:meta_item_1:541> * 64,
        <gregtech:meta_item_1:542> * 64,
        <gregtech:meta_item_1:543> * 64,
        <gregtech:meta_item_1:544> * 64,
        <gregtech:meta_foil:1010> * 64,
        <gregtech:meta_item_1:592> * 64,
        <gregtech:wire_quadruple:32007> * 32,
        <gregtech:meta_plate:32007> * 8
    ])
    .fluidInputs([
        <liquid:darkenergyalloy> * 576,
        <liquid:polybenzimidazole> * 2304,
        <liquid:soldering_alloy> * 5760
    ])
    .outputs(<contenttweaker:omega_universal_mainframe> * 1)
    .EUt(600000000)
    .duration(13000)
    .buildAndRegister();