import crafttweaker.item.IIngredient;
import mods.gregtech.recipe.RecipeMap;
import crafttweaker.item.IItemStack;



assembly_line.recipeBuilder()
    .inputs([
        <gregtech:meta_stick_long:423> * 1,
        <gregtech:meta_stick_long:32004> * 2,
        <gregtech:meta_ring:32004> * 4,
        <gregtech:meta_round:32004> * 8,
        <gregtech:meta_wire_fine:32004> * 64,
        <gregtech:meta_wire_fine:32004> * 64,
        <gregtech:cable_double:32004> * 1
    ])
    .fluidInputs([
        <liquid:soldering_alloy> * 3000,
        <liquid:lubricant> * 2000,
        <liquid:neutronium> * 1000
    ])
    .outputs(<gregtech:meta_item_1:136> * 2)
    .EUt(2500000)
    .duration(1000)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:136> * 1,
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
    .outputs(<gregtech:meta_item_1:151> * 1)
    .EUt(2500000)
    .duration(1000)
    .buildAndRegister();

//OPV Conveyor
assembly_line.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:136> * 1,
        <gregtech:meta_plate:1004> * 2,
        <gregtech:meta_gear_small:32003> * 4,
        <gregtech:meta_round:32004> * 16,
        <gregtech:meta_screw:32004> * 4,
        <gregtech:cable_double:32004> * 1
    ])
    .fluidInputs([
        <liquid:soldering_alloy> * 3000,
        <liquid:lubricant> * 2000,
        <liquid:neutronium> * 1000,
        <liquid:styrene_butadiene_rubber> * 2500
    ])
    .outputs(<gregtech:meta_item_1:166> * 1)
    .EUt(2500000)
    .duration(1000)
    .buildAndRegister();

//OPV Piston
assembly_line.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:136> * 1,
        <gregtech:meta_plate:32004> * 4,
        <gregtech:meta_ring:32004> * 4,
        <gregtech:meta_round:32004> * 16,
        <gregtech:meta_stick:32004> * 4,
        <gregtech:meta_gear:32004> * 1,
        <gregtech:meta_gear_small:32004> * 2,
        <gregtech:cable_single:32004> * 2
    ])
    .fluidInputs([
        <liquid:lubricant> * 1000,
        <liquid:soldering_alloy> * 576,
        <liquid:ruthenium_trinium_americium_neutronate> * 576
    ])
    .outputs(<gregtech:meta_item_1:181> * 1)
    .EUt(2500000)
    .duration(1000)
    .buildAndRegister();

//OPV Robot Arm
assembly_line.recipeBuilder()
    .inputs([
        <gregtech:meta_stick_long:32004> * 4,
        <gregtech:meta_gear:32004> * 1,
        <gregtech:meta_gear_small:32004> * 3,
        <gregtech:meta_item_1:136> * 2,
        <gregtech:meta_item_1:181> * 1,
        <ore:circuitUev> * 1,
        <ore:circuitUhv> * 2,
        <ore:circuitUv> * 4,
        <gregtech:cable_single:32004> * 4
    ])
    .fluidInputs([
        <liquid:lubricant> * 1000,
        <liquid:soldering_alloy> * 1728,
        <liquid:ruthenium_trinium_americium_neutronate> * 576
    ])
    .outputs(<gregtech:meta_item_1:196> * 1)
    .EUt(2500000)
    .duration(1000)
    .buildAndRegister();

//OPV Field Generator
assembly_line.recipeBuilder()
    .inputs([
        <gregtech:meta_block_frame_8> * 1,
        <gregtech:meta_plate:32004> * 6,
        <gregtech:meta_item_1:283> * 1,
        <gregtech:meta_item_1:226> * 2,
        <ore:circuitUev> * 2,
        <gregtech:meta_wire_fine:32004> * 64,
        <gregtech:meta_wire_fine:32004> * 64,
        <gregtech:cable_single:32004> * 4
    ])
    .fluidInputs([
        <liquid:soldering_alloy> * 1728,
        <liquid:ruthenium_trinium_americium_neutronate> * 576
    ])
    .outputs(<gregtech:meta_item_1:211> * 1)
    .EUt(2500000)
    .duration(1000)
    .buildAndRegister();
    
//OPV Emitter
assembly_line.recipeBuilder()
    .inputs([
        <gregtech:meta_block_frame_8> * 1,
        <gregtech:meta_item_1:136> * 1,
        <gregtech:meta_stick_long:32004> * 4,
        <gregtech:meta_item_1:283> * 1,
        <ore:circuitUev> * 2,
        <gregtech:meta_foil:32004> * 64,
        <gregtech:meta_foil:32004> * 32,
        <gregtech:cable_single:32004> * 4
    ])
    .fluidInputs([
        <liquid:soldering_alloy> * 1152,
        <liquid:ruthenium_trinium_americium_neutronate> * 576
    ])
    .outputs(<gregtech:meta_item_1:226> * 1)
    .EUt(2500000)
    .duration(1000)
    .buildAndRegister();

//OPV Sensor
assembly_line.recipeBuilder()
    .inputs([
        <gregtech:meta_block_frame_8> * 1,
        <gregtech:meta_item_1:136> * 1,
        <gregtech:meta_plate:32005> * 4,
        <gregtech:meta_item_1:283> * 1,
        <ore:circuitUev> * 2,
        <gregtech:meta_foil:32004> * 64,
        <gregtech:meta_foil:32004> * 32,
        <gregtech:cable_single:32004> * 4
    ])
    .fluidInputs([
        <liquid:soldering_alloy> * 1152,
        <liquid:ruthenium_trinium_americium_neutronate> * 576
    ])
    .outputs(<gregtech:meta_item_1:241> * 1)
    .EUt(2500000)
    .duration(1000)
    .buildAndRegister();