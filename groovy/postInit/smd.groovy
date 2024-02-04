import gregetech.*;

def assembler = recipemap('assembler');
def assembly_line = recipemap('assembly_line');
def research_station = recipemap('research_station');
    




//SMD Q Transistor
assembler.recipeBuilder()
    .inputs([
        item('gregtech:meta_foil', 334) * 1,
        item('gregtech:meta_item_1', 282) * 1,
        item('gregtech:meta_wire_fine', 128) * 8
    ])
    .fluidInputs(fluid('polybenzimidazole') * 288)
    .outputs(item('gregtech:meta_item_1', 533) * 24)
    .EUt(8192)
    .duration(300)
    .buildAndRegister();

//SMD Q Resistor
assembler.recipeBuilder()
    .inputs([
        item('gregtech:meta_dust', 342) * 1,
        item('gregtech:meta_item_1', 282) * 1,
        item('gregtech:meta_wire_fine', 126) * 8
    ])
    .fluidInputs(fluid('polybenzimidazole') * 288)
    .outputs(item('gregtech:meta_item_1', 535) * 32)
    .EUt(8192)
    .duration(300)
    .buildAndRegister();

//SMD Q Capacitor
assembler.recipeBuilder()
    .inputs([
        item('gregtech:meta_foil', 128) * 4,
        item('gregtech:meta_item_1', 282) * 1,
        item('gregtech:meta_foil', 396) * 1
    ])
    .fluidInputs(fluid('polybenzimidazole') * 36)
    .outputs(item('gregtech:meta_item_1', 534) * 48)
    .EUt(8192)
    .duration(300)
    .buildAndRegister();

//SMD Q Diode
assembler.recipeBuilder()
    .inputs([
        item('gregtech:meta_dust', 351) * 1,
        item('gregtech:meta_item_1', 282) * 1,
        item('gregtech:meta_wire_fine', 344) * 8
    ])
    .fluidInputs(fluid('polybenzimidazole') * 36)
    .outputs(item('gregtech:meta_item_1', 536) * 48)
    .EUt(8192)
    .duration(300)
    .buildAndRegister();

//Wetwere Capacitor
assembler.recipeBuilder()
    .inputs([
        item('gregtech:meta_foil', 32003) * 2,
        item('gregtech:meta_item_1', 387) * 1,
        item('gregtech:meta_foil', 32004) * 2
    ])
    .fluidInputs(fluid('polybenzimidazole') * 144)
    .outputs(item('gregtech:meta_item_1', 538) * 32)
    .EUt(131072)
    .duration(200)
    .buildAndRegister();

//Wetwere Diode
assembler.recipeBuilder()
    .inputs([
        item('gregtech:meta_wire_fine', 32003) * 2,
        item('gregtech:meta_item_1', 387) * 1,
        item('gregtech:meta_wire_fine', 32004) * 2
    ])
    .fluidInputs(fluid('polybenzimidazole') * 144)
    .outputs(item('gregtech:meta_item_1', 540) * 32)
    .EUt(131072)
    .duration(200)
    .buildAndRegister();

//Wetwere Resistor
assembler.recipeBuilder()
    .inputs([
        item('gregtech:meta_wire_fine', 32003) * 8,
        item('gregtech:meta_item_1', 387) * 1,
        item('gregtech:meta_dust', 342) * 2
    ])
    .fluidInputs(fluid('polybenzimidazole') * 144)
    .outputs(item('gregtech:meta_item_1', 539) * 32)
    .EUt(131072)
    .duration(200)
    .buildAndRegister();

//Wetwere Transistor
assembler.recipeBuilder()
    .inputs([
        item('gregtech:meta_wire_fine', 32003) * 8,
        item('gregtech:meta_item_1', 387) * 1,
        item('gregtech:meta_foil', 32003) * 2
    ])
    .fluidInputs(fluid('polybenzimidazole') * 144)
    .outputs(item('gregtech:meta_item_1', 537) * 32)
    .EUt(131072)
    .duration(200)
    .buildAndRegister();

//Supracausal Transistor
assembler.recipeBuilder()
    .inputs([
        item('gregtech:meta_wire_fine', 32006) * 8,
        ore('circuitUiv') * 1,
        item('gregtech:meta_foil', 32005) * 2
    ])
    .fluidInputs(fluid('polybenzimidazole') * 144)
    .outputs(item('gregtech:meta_item_1', 544) * 32)
    .EUt(8388608)
    .duration(200)
    .buildAndRegister();

//Supracausal Capacitor
assembler.recipeBuilder()
    .inputs([
        item('gregtech:meta_foil', 32006) * 2,
        ore('circuitUiv') * 1,
        item('gregtech:meta_foil', 32005) * 2
    ])
    .fluidInputs(fluid('polybenzimidazole') * 144)
    .outputs(item('gregtech:meta_item_1', 541) * 32)
    .EUt(8388608)
    .duration(200)
    .buildAndRegister();

//Supracausal Resistor
assembler.recipeBuilder()
    .inputs([
        item('gregtech:meta_wire_fine', 32006) * 8,
        ore('circuitUiv') * 1,
        item('gregtech:meta_dust', 342) * 2
    ])
    .fluidInputs(fluid('polybenzimidazole') * 144)
    .outputs(item('gregtech:meta_item_1', 542) * 32)
    .EUt(8388608)
    .duration(200)
    .buildAndRegister();

//Supracausal Diode
assembler.recipeBuilder()
    .inputs([
        item('gregtech:meta_wire_fine', 32006) * 8,
        ore('circuitUiv') * 1,
        item('gregtech:meta_wire_fine', 32005) * 8
    ])
    .fluidInputs(fluid('polybenzimidazole') * 144)
    .outputs(item('gregtech:meta_item_1', 543) * 32)
    .EUt(8388608)
    .duration(200)
    .buildAndRegister();