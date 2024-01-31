import crafttweaker.item.IIngredient;
import mods.gregtech.recipe.RecipeMap;
import crafttweaker.item.IItemStack;

circuit_assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:708> * 2,
        <gregtech:meta_item_1:705> * 8,
        <gregtech:meta_item_1:599> * 4,
        <gregtech:meta_wire_fine:32006> * 8,
        <gregtech:meta_bolt:32005> * 4
    ])
    .fluidInputs(<liquid:darkmatteralloy> * 288)
    .outputs(<contenttweaker:phenomenal_processor> * 4)
    .EUt(2000000)
    .duration(8000)
    .buildAndRegister();

circuit_assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:407> * 1,
        <contenttweaker:phenomenal_processor> * 4,
        <gregtech:meta_item_1:537> * 4,
        <gregtech:meta_item_1:540> * 4,
        <gregtech:meta_item_1:592> * 48,
        <gregtech:meta_wire_fine:32006> * 16
    ])
    .fluidInputs(<liquid:darkmatteralloy> * 288)
    .outputs(<contenttweaker:phenomenal_supercomputer> * 2)
    .EUt(16000000)
    .duration(10000)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs([
        <gregtech:meta_stick_long:32006> * 32,
        <contenttweaker:phenomenal_supercomputer> * 4,
        <gregtech:meta_item_1:537> * 64,
        <gregtech:meta_item_1:538> * 64,
        <gregtech:meta_item_1:539> * 64,
        <gregtech:meta_item_1:540> * 64,
        <gregtech:meta_foil:1010> * 64,
        <gregtech:meta_item_1:592> * 64,
        <gregtech:wire_quadruple:32006> * 32,
        <gregtech:meta_plate:32006> * 8
    ])
    .fluidInputs([
        <liquid:darkmatteralloy> * 576,
        <liquid:polybenzimidazole> * 2304,
        <liquid:soldering_alloy> * 5760
    ])
    .outputs(<contenttweaker:phenomenal_mainframe> * 1)
    .EUt(120000000)
    .duration(12000)
    .buildAndRegister();