import gregetech.*;

def assembler = recipemap('assembler');
def assembly_line = recipemap('assembly_line');
def research_station = recipemap('research_station');
    

//Delta Processor -- UV Circuit
assembly_line.recipeBuilder()
    .inputs(
        metaitem('processor.neuro') * 2,
        metaitem('component.smd.transistor.quantum') * 8,
        metaitem('component.smd.capacitor.quantum') * 8,
        metaitem('component.smd.resistor.quantum') * 8,
        metaitem('component.smd.diode.quantum') * 8,
        metaitem('crystal.system_on_chip') * 4,
        metaitem('wireFineDarkmatteralloy') * 32,
        metaitem('boltDarkmatteralloy') * 12  
    )
    .fluidInputs(fluid('americium') * 576)
    .outputs(metaitem('circuit.delta_processor') * 4)
    .stationResearch(b -> b.researchStack(metaitem('crystal.system_on_chip')).CWUt(16).EUt(512000))
    .EUt(300000)
    .duration(2000)
    .buildAndRegister();

//Delta Supercomputer -- UHV Circuit
assembly_line.recipeBuilder()
    .inputs(
        metaitem('circuit_board.enigmatic') * 2,
        metaitem('circuit.delta_processor') * 4,
        metaitem('component.smd.transistor.quantum') * 12,
        metaitem('component.smd.capacitor.quantum') * 12,
        metaitem('component.smd.resistor.quantum') * 12,
        metaitem('component.smd.diode.quantum') * 12,
        metaitem('plate.random_access_memory') * 32,
        metaitem('wireFineDarkmatteralloy') * 16
    )
    .fluidInputs(fluid('americium') * 576)
    .outputs(metaitem('circuit.delta_supercomputer') * 2)
    .stationResearch(b -> b.researchStack(metaitem('circuit.delta_processor')).CWUt(32).EUt(680000))
    .EUt(1000000)
    .duration(4000)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs(
        metaitem('stickLongDarkmatteralloy') * 32,
        metaitem('circuit.delta_supercomputer') * 4,
        metaitem('component.smd.transistor.quantum') * 12,
        metaitem('component.smd.capacitor.quantum') * 12,
        metaitem('component.smd.resistor.quantum') * 12,
        metaitem('component.smd.diode.quantum') * 12,
        metaitem('plate.random_access_memory') * 64,
        metaitem('foilPolybenzimidazole') * 64,
        metaitem('wireGtQuadrupleDarkmatteralloy') * 32,
        metaitem('plateDarkmatteralloy') * 8
    )
    .fluidInputs(
        fluid('americium') * 576,
        fluid('polybenzimidazole') * 2304,
        fluid('soldering_alloy') * 5760
    )
    .outputs(metaitem('circuit.delta_mainframe') * 1)
    .stationResearch(b -> b.researchStack(metaitem('circuit.delta_supercomputer')).CWUt(48).EUt(1000000))
    .EUt(6000000)
    .duration(6000)
    .buildAndRegister();