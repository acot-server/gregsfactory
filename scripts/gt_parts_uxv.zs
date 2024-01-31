import crafttweaker.item.IIngredient;
import mods.gregtech.recipe.RecipeMap;
import crafttweaker.item.IItemStack;



assembly_line.recipeBuilder()
    .inputs([
        <gregtech:meta_stick_long:423> * 1,
        <gregtech:meta_stick_long:32006> * 2,
        <gregtech:meta_ring:32006> * 4,
        <gregtech:meta_round:32006> * 8,
        <gregtech:meta_wire_fine:32006> * 64,
        <gregtech:meta_wire_fine:32006> * 64,
        <gregtech:cable_double:32006> * 1
    ])
    .fluidInputs([
        <liquid:soldering_alloy> * 3000,
        <liquid:lubricant> * 2000,
        <liquid:neutronium> * 1000
    ])
    .outputs(<gregtech:meta_item_1:138> * 2)
    .EUt(60000000)
    .duration(1000)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:138> * 1,
        <gregtech:meta_rotor:32005> * 1,
        <gregtech:meta_ring:1004> * 32,
        <gregtech:meta_screw:32005> * 4,
        <gregtech:fluid_pipe_large:127> * 2,
        <gregtech:cable_double:32006> * 1
    ])
    .fluidInputs([
        <liquid:soldering_alloy> * 3000,
        <liquid:lubricant> * 2000,
        <liquid:neutronium> * 1000,
        <liquid:styrene_butadiene_rubber> * 2500
    ])
    .outputs(<gregtech:meta_item_1:153> * 1)
    .EUt(60000000)
    .duration(1000)
    .buildAndRegister();

//OPV Conveyor
assembly_line.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:138> * 1,
        <gregtech:meta_plate:1004> * 2,
        <gregtech:meta_gear_small:32005> * 4,
        <gregtech:meta_round:32006> * 16,
        <gregtech:meta_screw:32006> * 4,
        <gregtech:cable_double:32006> * 1
    ])
    .fluidInputs([
        <liquid:soldering_alloy> * 3000,
        <liquid:lubricant> * 2000,
        <liquid:neutronium> * 1000,
        <liquid:styrene_butadiene_rubber> * 2500
    ])
    .outputs(<gregtech:meta_item_1:168> * 1)
    .EUt(60000000)
    .duration(1000)
    .buildAndRegister();

//OPV Piston
assembly_line.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:138> * 1,
        <gregtech:meta_plate:32006> * 4,
        <gregtech:meta_ring:32006> * 4,
        <gregtech:meta_round:32006> * 16,
        <gregtech:meta_stick:32006> * 4,
        <gregtech:meta_gear:32006> * 1,
        <gregtech:meta_gear_small:32006> * 2,
        <gregtech:cable_single:32006> * 2
    ])
    .fluidInputs([
        <liquid:lubricant> * 1000,
        <liquid:soldering_alloy> * 576,
        <liquid:ruthenium_trinium_americium_neutronate> * 576
    ])
    .outputs(<gregtech:meta_item_1:183> * 1)
    .EUt(60000000)
    .duration(1000)
    .buildAndRegister();

//OPV Robot Arm
assembly_line.recipeBuilder()
    .inputs([
        <gregtech:meta_stick_long:32006> * 4,
        <gregtech:meta_gear:32006> * 1,
        <gregtech:meta_gear_small:32006> * 3,
        <gregtech:meta_item_1:138> * 2,
        <gregtech:meta_item_1:183> * 1,
        <ore:circuitUxv> * 1,
        <ore:circuitUiv> * 2,
        <ore:circuitUev> * 4,
        <gregtech:cable_single:32006> * 4
    ])
    .fluidInputs([
        <liquid:lubricant> * 1000,
        <liquid:soldering_alloy> * 1728,
        <liquid:ruthenium_trinium_americium_neutronate> * 576
    ])
    .outputs(<gregtech:meta_item_1:198> * 1)
    .EUt(60000000)
    .duration(1000)
    .buildAndRegister();

//OPV Field Generator
assembly_line.recipeBuilder()
    .inputs([
        <gregtech:meta_block_frame_8> * 1,
        <gregtech:meta_plate:32006> * 6,
        <gregtech:meta_item_1:283> * 1,
        <gregtech:meta_item_1:228> * 2,
        <ore:circuitUxv> * 2,
        <gregtech:meta_wire_fine:32006> * 64,
        <gregtech:meta_wire_fine:32006> * 64,
        <gregtech:cable_single:32006> * 4
    ])
    .fluidInputs([
        <liquid:soldering_alloy> * 1728,
        <liquid:ruthenium_trinium_americium_neutronate> * 576
    ])
    .outputs(<gregtech:meta_item_1:213> * 1)
    .EUt(60000000)
    .duration(1000)
    .buildAndRegister();
    
//OPV Emitter
assembly_line.recipeBuilder()
    .inputs([
        <gregtech:meta_block_frame_8> * 1,
        <gregtech:meta_item_1:138> * 1,
        <gregtech:meta_stick_long:32006> * 4,
        <gregtech:meta_item_1:283> * 1,
        <ore:circuitUxv> * 2,
        <gregtech:meta_foil:32006> * 64,
        <gregtech:meta_foil:32006> * 32,
        <gregtech:cable_single:32006> * 4
    ])
    .fluidInputs([
        <liquid:soldering_alloy> * 1152,
        <liquid:ruthenium_trinium_americium_neutronate> * 576
    ])
    .outputs(<gregtech:meta_item_1:228> * 1)
    .EUt(60000000)
    .duration(1000)
    .buildAndRegister();

//OPV Sensor
assembly_line.recipeBuilder()
    .inputs([
        <gregtech:meta_block_frame_8> * 1,
        <gregtech:meta_item_1:138> * 1,
        <gregtech:meta_plate:32006> * 4,
        <gregtech:meta_item_1:283> * 1,
        <ore:circuitUxv> * 2,
        <gregtech:meta_foil:32006> * 64,
        <gregtech:meta_foil:32006> * 32,
        <gregtech:cable_single:32006> * 4
    ])
    .fluidInputs([
        <liquid:soldering_alloy> * 1152,
        <liquid:ruthenium_trinium_americium_neutronate> * 576
    ])
    .outputs(<gregtech:meta_item_1:243> * 1)
    .EUt(60000000)
    .duration(1000)
    .buildAndRegister();