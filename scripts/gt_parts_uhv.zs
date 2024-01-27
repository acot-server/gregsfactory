import crafttweaker.item.IIngredient;
import mods.gregtech.recipe.RecipeMap;
import crafttweaker.item.IItemStack;



assembly_line.recipeBuilder()
    .inputs([
        <gregtech:meta_stick_long:423> * 1,
        <gregtech:meta_stick_long:32003> * 2,
        <gregtech:meta_ring:32003> * 4,
        <gregtech:meta_round:32003> * 8,
        <gregtech:meta_wire_fine:32003> * 64,
        <gregtech:meta_wire_fine:32003> * 64,
        <gregtech:cable_double:32003> * 1
    ])
    .fluidInputs([
        <liquid:soldering_alloy> * 3000,
        <liquid:lubricant> * 2000,
        <liquid:neutronium> * 1000
    ])
    .outputs(<gregtech:meta_item_1:135> * 2)
    .EUt(500000)
    .duration(1000)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:135> * 1,
        <gregtech:meta_rotor:32003> * 1,
        <gregtech:meta_ring:1004> * 32,
        <gregtech:meta_screw:32003> * 4,
        <gregtech:fluid_pipe_large:127> * 2,
        <gregtech:cable_double:32003> * 1
    ])
    .fluidInputs([
        <liquid:soldering_alloy> * 3000,
        <liquid:lubricant> * 2000,
        <liquid:neutronium> * 1000,
        <liquid:styrene_butadiene_rubber> * 2500
    ])
    .outputs(<gregtech:meta_item_1:150> * 1)
    .EUt(500000)
    .duration(1000)
    .buildAndRegister();

//OPV Conveyor
assembly_line.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:135> * 1,
        <gregtech:meta_plate:1004> * 2,
        <gregtech:meta_gear_small:32003> * 4,
        <gregtech:meta_round:32003> * 16,
        <gregtech:meta_screw:32003> * 4,
        <gregtech:cable_double:32003> * 1
    ])
    .fluidInputs([
        <liquid:soldering_alloy> * 3000,
        <liquid:lubricant> * 2000,
        <liquid:neutronium> * 1000,
        <liquid:styrene_butadiene_rubber> * 2500
    ])
    .outputs(<gregtech:meta_item_1:165> * 1)
    .EUt(500000)
    .duration(1000)
    .buildAndRegister();

//OPV Piston
assembly_line.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:135> * 1,
        <gregtech:meta_plate:32003> * 4,
        <gregtech:meta_ring:32003> * 4,
        <gregtech:meta_round:32003> * 16,
        <gregtech:meta_stick:32003> * 4,
        <gregtech:meta_gear:32003> * 1,
        <gregtech:meta_gear_small:32003> * 2,
        <gregtech:cable_single:32003> * 2
    ])
    .fluidInputs([
        <liquid:lubricant> * 1000,
        <liquid:soldering_alloy> * 576,
        <liquid:ruthenium_trinium_americium_neutronate> * 576
    ])
    .outputs(<gregtech:meta_item_1:180> * 1)
    .EUt(500000)
    .duration(1000)
    .buildAndRegister();

//OPV Robot Arm
assembly_line.recipeBuilder()
    .inputs([
        <gregtech:meta_stick_long:32003> * 4,
        <gregtech:meta_gear:32003> * 1,
        <gregtech:meta_gear_small:32003> * 3,
        <gregtech:meta_item_1:135> * 2,
        <gregtech:meta_item_1:180> * 1,
        <ore:circuitUhv> * 1,
        <ore:circuitUv> * 2,
        <ore:circuitZpm> * 4,
        <gregtech:cable_single:32003> * 4
    ])
    .fluidInputs([
        <liquid:lubricant> * 1000,
        <liquid:soldering_alloy> * 1728,
        <liquid:ruthenium_trinium_americium_neutronate> * 576
    ])
    .outputs(<gregtech:meta_item_1:195> * 1)
    .EUt(500000)
    .duration(1000)
    .buildAndRegister();

//OPV Field Generator
assembly_line.recipeBuilder()
    .inputs([
        <gregtech:meta_block_frame_8> * 1,
        <gregtech:meta_plate:32003> * 6,
        <gregtech:meta_item_1:283> * 1,
        <gregtech:meta_item_1:225> * 2,
        <ore:circuitUhv> * 2,
        <gregtech:meta_wire_fine:32003> * 64,
        <gregtech:meta_wire_fine:32003> * 64,
        <gregtech:cable_single:32003> * 4
    ])
    .fluidInputs([
        <liquid:soldering_alloy> * 1728,
        <liquid:ruthenium_trinium_americium_neutronate> * 576
    ])
    .outputs(<gregtech:meta_item_1:210> * 1)
    .EUt(500000)
    .duration(1000)
    .buildAndRegister();
    
//OPV Emitter
assembly_line.recipeBuilder()
    .inputs([
        <gregtech:meta_block_frame_8> * 1,
        <gregtech:meta_item_1:135> * 1,
        <gregtech:meta_stick_long:32003> * 4,
        <gregtech:meta_item_1:283> * 1,
        <ore:circuitUhv> * 2,
        <gregtech:meta_foil:32003> * 64,
        <gregtech:meta_foil:32003> * 32,
        <gregtech:cable_single:32003> * 4
    ])
    .fluidInputs([
        <liquid:soldering_alloy> * 1152,
        <liquid:ruthenium_trinium_americium_neutronate> * 576
    ])
    .outputs(<gregtech:meta_item_1:225> * 1)
    .EUt(500000)
    .duration(1000)
    .buildAndRegister();

//OPV Sensor
assembly_line.recipeBuilder()
    .inputs([
        <gregtech:meta_block_frame_8> * 1,
        <gregtech:meta_item_1:135> * 1,
        <gregtech:meta_plate:32004> * 4,
        <gregtech:meta_item_1:283> * 1,
        <ore:circuitUhv> * 2,
        <gregtech:meta_foil:32003> * 64,
        <gregtech:meta_foil:32003> * 32,
        <gregtech:cable_single:32003> * 4
    ])
    .fluidInputs([
        <liquid:soldering_alloy> * 1152,
        <liquid:ruthenium_trinium_americium_neutronate> * 576
    ])
    .outputs(<gregtech:meta_item_1:240> * 1)
    .EUt(500000)
    .duration(1000)
    .buildAndRegister();