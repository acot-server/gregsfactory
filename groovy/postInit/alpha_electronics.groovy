import gregetech.*;

def assembler = recipemap('assembler');
def assembly_line = recipemap('assembly_line');
def research_station = recipemap('research_station');
    



assembly_line.recipeBuilder()
    .inputs(
        metaitem('processor.neuro') * 2,
        metaitem('crystal.system_on_chip') * 8,
        metaitem('plate.highly_advanced_system_on_chip') * 4,
        metaitem('wireFineDarkenergyalloy') * 32,
        metaitem('boltDarkmatteralloy') * 4
    )
    .fluidInputs(fluid('naquadria') * 288)
    .outputs(metaitem('circuit.alpha_processor') * 4)
    .stationResearch(b -> b.researchStack(metaitem('circuit.delta_mainframe')).CWUt(48).EUt(512000))
    .EUt(1200000)
    .duration(3000)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs(
        metaitem('circuit_board.enigmatic') * 1,
        metaitem('circuit.alpha_processor') * 4,
        metaitem('component.smd.transistor.quantum') * 4,
        metaitem('component.smd.capacitor.quantum') * 4,
        metaitem('component.smd.resistor.quantum') * 4,
        metaitem('component.smd.diode.quantum') * 4,
        metaitem('plate.random_access_memory') * 32,
        metaitem('wireFineDarkenergyalloy') * 16
    )
    .fluidInputs(fluid('naquadria') * 288)
    .outputs(metaitem('circuit.alpha_supercomputer') * 2)
    .stationResearch(b -> b.researchStack(metaitem('circuit.alpha_processor')).CWUt(64).EUt(768000))
    .EUt(2400000)
    .duration(5000)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs(
        metaitem('stickLongDarkenergyalloy') * 32,
        metaitem('circuit.alpha_supercomputer') * 4,
        metaitem('component.smd.transistor.quantum') * 16,
        metaitem('component.smd.capacitor.quantum') * 16,
        metaitem('component.smd.resistor.quantum') * 16,
        metaitem('component.smd.diode.quantum') * 16,
        metaitem('foilPolybenzimidazole') * 64,
        metaitem('plate.random_access_memory') * 64,
        metaitem('wireGtQuadrupleDarkenergyalloy') * 32,
        metaitem('plateDarkenergyalloy') * 8
    )
    .fluidInputs(
        fluid('naquadria') * 576,
        fluid('polybenzimidazole') * 2304,
        fluid('soldering_alloy') * 5760
    )
    .outputs(metaitem('circuit.alpha_mainframe') * 1)
    .stationResearch(b -> b.researchStack(metaitem('circuit.alpha_supercomputer')).CWUt(80).EUt(10240000))
    .EUt(12000000)
    .duration(7000)
    .buildAndRegister();