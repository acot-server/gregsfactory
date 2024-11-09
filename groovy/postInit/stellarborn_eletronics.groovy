import gregetech.*;

def assembler = recipemap('assembler');
def assembly_line = recipemap('assembly_line');
def research_station = recipemap('research_station');
    



assembly_line.recipeBuilder()
    .inputs(
        metaitem('processor.neuro') * 2,
        metaitem('smd.transistor.supracausal') * 16,
        metaitem('smd.capacitor.supracausal') * 16,
        metaitem('smd.resistor.supracausal') * 16,
        metaitem('smd.diode.supracausal') * 16,
        metaitem('crystal.system_on_chip') * 32,
        metaitem('wireFineWakfustasis') * 48,
        metaitem('boltWakfustasis') * 12
    )
    .fluidInputs(fluid('wakfustasis') * 2880)
    .outputs(metaitem('circuit.omega_processor') * 4)
    .stationResearch(b -> b.researchStack(metaitem('circuit.phanon_mainframe')).CWUt(192,2560000).EUt(75000000))
    .EUt(6000000)
    .duration(1000)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs(
        metaitem('circuit_board.enigmatic') * 2,
        metaitem('circuit.omega_processor') * 4,
        metaitem('smd.transistor.supracausal') * 32,
        metaitem('smd.capacitor.supracausal') * 32,
        metaitem('smd.resistor.supracausal') * 32,
        metaitem('smd.diode.supracausal') * 32,
        metaitem('plate.random_access_memory') * 32,
        metaitem('wireFineWakfustasis') * 16
    )
    .fluidInputs(fluid('wakfustasis') * 2880)
    .outputs(metaitem('circuit.omega_supercomputer') * 2)
    .stationResearch(b -> b.researchStack(metaitem('circuit.omega_processor')).CWUt(208,5120000).EUt(150000000))
    .EUt(48000000)
    .duration(2000)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs(
        metaitem('stickLongWakfustasis') * 32,
        metaitem('circuit.omega_supercomputer') * 4,
        metaitem('smd.transistor.supracausal') * 64,
        metaitem('smd.capacitor.supracausal') * 64,
        metaitem('smd.resistor.supracausal') * 64,
        metaitem('smd.diode.supracausal') * 64,
        metaitem('foilPolybenzimidazole') * 64,
        metaitem('plate.random_access_memory') * 64,
        metaitem('wireGtQuadrupleWakfustasis') * 32,
        metaitem('plateWakfustasis') * 8
    )
    .fluidInputs(
        fluid('wakfustasis') * 5760,
        fluid('polybenzimidazole') * 2304,
        fluid('soldering_alloy') * 5760
    )
    .outputs(metaitem('circuit.omega_universal_supercomputer') * 1)
    .stationResearch(b -> b.researchStack(metaitem('circuit.omega_supercomputer')).CWUt(256,10240000).EUt(300000000))
    .EUt(600000000)
    .duration(3000)
    .buildAndRegister();