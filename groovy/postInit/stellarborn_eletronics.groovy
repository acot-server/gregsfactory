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
    .fluidInputs(fluid('darkenergyalloy') * 288)
    .outputs(item('contenttweaker:omega_processor') * 4)
    .stationResearch(b -> b.researchStack(item('contenttweaker:phenomenal_mainframe')).CWUt(192,2560000).EUt(75000000))
    .EUt(6000000)
    .duration(9000)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs(
        metaitem('circuit_board.wetware') * 2,
        item('contenttweaker:omega_processor') * 4,
        metaitem('smd.transistor.supracausal') * 32,
        metaitem('smd.capacitor.supracausal') * 32,
        metaitem('smd.resistor.supracausal') * 32,
        metaitem('smd.diode.supracausal') * 32,
        metaitem('plate.random_access_memory') * 32,
        metaitem('wireFineWakfustasis') * 16
    )
    .fluidInputs(fluid('darkenergyalloy') * 288)
    .outputs(item('contenttweaker:omega_supercomputer') * 2)
    .stationResearch(b -> b.researchStack(item('contenttweaker:omega_processor')).CWUt(208,5120000).EUt(150000000))
    .EUt(48000000)
    .duration(11000)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs(
        metaitem('stickLongWakfustasis') * 32,
        item('contenttweaker:omega_supercomputer') * 4,
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
        fluid('darkenergyalloy') * 576,
        fluid('polybenzimidazole') * 2304,
        fluid('soldering_alloy') * 5760
    )
    .outputs(item('contenttweaker:omega_universal_mainframe') * 1)
    .stationResearch(b -> b.researchStack(item('contenttweaker:omega_supercomputer')).CWUt(256,10240000).EUt(300000000))
    .EUt(600000000)
    .duration(13000)
    .buildAndRegister();