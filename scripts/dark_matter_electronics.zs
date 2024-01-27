import crafttweaker.item.IIngredient;
import mods.gregtech.recipe.RecipeMap;
import crafttweaker.item.IItemStack;


//Delta Processor -- UV Circuit
circuit_assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:708> * 2,
        <gregtech:meta_item_1:645> * 4,
        <gregtech:meta_item_1:535> * 8,
        <gregtech:meta_item_1:533> * 8,
        <gregtech:meta_item_1:705> * 4,
        <gregtech:meta_bolt:32003> * 12  
    ])
    .fluidInputs(<liquid:americium> * 576)
    .outputs(<contenttweaker:delta_processor> * 4)
    .EUt(300000)
    .duration(4000)
    .buildAndRegister();

//Delta Supercomputer -- UHV Circuit
circuit_assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:407> * 2,
        <contenttweaker:delta_processor> * 4,
        <gregtech:meta_item_1:535> * 12,
        <gregtech:meta_item_1:533> * 12,
        <gregtech:meta_item_1:592> * 32,
        <gregtech:meta_wire_fine:32003> * 16
    ])
    .fluidInputs(<liquid:americium> * 576)
    .outputs(<contenttweaker:delta_supercomputer> * 2)
    .EUt(1000000)
    .duration(6000)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs([
        <gregtech:meta_stick_long:32003> * 32,
        <contenttweaker:delta_supercomputer> * 4,
        <gregtech:meta_item_1:533> * 32,
        <gregtech:meta_item_1:534> * 32,
        <gregtech:meta_item_1:535> * 32,
        <gregtech:meta_item_1:536> * 32,
        <gregtech:meta_foil:1010> * 64,
        <gregtech:meta_item_1:592> * 64,
        <gregtech:wire_quadruple:32003> * 32,
        <gregtech:meta_plate:32003> * 12
    ])
    .fluidInputs([
        <liquid:americium> * 576,
        <liquid:polybenzimidazole> * 2304,
        <liquid:soldering_alloy> * 5760
    ])
    .outputs(<contenttweaker:delta_mainframe> * 1)
    .EUt(6000000)
    .duration(8000)
    .buildAndRegister();