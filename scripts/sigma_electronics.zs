import crafttweaker.item.IIngredient;
import mods.gregtech.recipe.RecipeMap;
import crafttweaker.item.IItemStack;

circuit_assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:708> * 2,
        <gregtech:meta_item_1:705> * 8,
        <gregtech:meta_item_1:599> * 4,
        <gregtech:meta_wire_fine:32005> * 8,
        <gregtech:meta_bolt:32004> * 4
    ])
    .fluidInputs(<liquid:neutronium> * 288)
    .outputs(<contenttweaker:sigma_processor> * 4)
    .EUt(500000)
    .duration(7000)
    .buildAndRegister();

circuit_assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:407> * 1,
        <contenttweaker:sigma_processor> * 4,
        <gregtech:meta_item_1:537> * 4,
        <gregtech:meta_item_1:540> * 4,
        <gregtech:meta_item_1:592> * 48,
        <gregtech:meta_wire_fine:32005> * 16
    ])
    .fluidInputs(<liquid:neutronium> * 288)
    .outputs(<contenttweaker:sigma_supercomputer> * 2)
    .EUt(6000000)
    .duration(9000)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs([
        <gregtech:meta_stick_long:32005> * 32,
        <contenttweaker:sigma_supercomputer> * 4,
        <gregtech:meta_item_1:537> * 32,
        <gregtech:meta_item_1:538> * 32,
        <gregtech:meta_item_1:539> * 32,
        <gregtech:meta_item_1:540> * 32,
        <gregtech:meta_foil:1010> * 64,
        <gregtech:meta_item_1:592> * 64,
        <gregtech:wire_quadruple:32005> * 32,
        <gregtech:meta_plate:32005> * 8
    ])
    .fluidInputs([
        <liquid:neutronium> * 576,
        <liquid:polybenzimidazole> * 2304,
        <liquid:soldering_alloy> * 5760
    ])
    .outputs(<contenttweaker:sigma_mainframe> * 1)
    .EUt(48000000)
    .duration(11000)
    .buildAndRegister();