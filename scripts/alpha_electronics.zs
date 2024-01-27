import crafttweaker.item.IIngredient;
import mods.gregtech.recipe.RecipeMap;
import crafttweaker.item.IItemStack;

circuit_assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:708> * 2,
        <gregtech:meta_item_1:705> * 8,
        <gregtech:meta_item_1:599> * 4,
        <gregtech:meta_wire_fine:32004> * 8,
        <gregtech:meta_bolt:32003> * 4
    ])
    .fluidInputs(<liquid:naquadria> * 288)
    .outputs(<contenttweaker:alpha_processor> * 4)
    .EUt(1200000)
    .duration(6000)
    .buildAndRegister();

circuit_assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:407> * 1,
        <contenttweaker:alpha_processor> * 4,
        <gregtech:meta_item_1:535> * 4,
        <gregtech:meta_item_1:533> * 4,
        <gregtech:meta_item_1:592> * 32,
        <gregtech:meta_wire_fine:32004> * 16
    ])
    .fluidInputs(<liquid:naquadria> * 288)
    .outputs(<contenttweaker:alpha_supercomputer> * 2)
    .EUt(2400000)
    .duration(8000)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs([
        <gregtech:meta_stick_long:32004> * 32,
        <contenttweaker:alpha_supercomputer> * 4,
        <gregtech:meta_item_1:533> * 64,
        <gregtech:meta_item_1:534> * 64,
        <gregtech:meta_item_1:535> * 64,
        <gregtech:meta_item_1:536> * 64,
        <gregtech:meta_foil:1010> * 64,
        <gregtech:meta_item_1:592> * 64,
        <gregtech:wire_quadruple:32004> * 32,
        <gregtech:meta_plate:32004> * 8
    ])
    .fluidInputs([
        <liquid:naquadria> * 576,
        <liquid:polybenzimidazole> * 2304,
        <liquid:soldering_alloy> * 5760
    ])
    .outputs(<contenttweaker:alpha_mainframe> * 1)
    .EUt(12000000)
    .duration(10000)
    .buildAndRegister();