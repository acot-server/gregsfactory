import gregetech.*;

def assembler = recipemap('assembler');
def assembly_line = recipemap('assembly_line');
def research_station = recipemap('research_station');
    



assembly_line.recipeBuilder()
    .inputs(
        metaitem('processor.neuro') * 2,
        metaitem('component.smd.transistor.wetware') * 16,
        metaitem('component.smd.capacitor.wetware') * 16,
        metaitem('component.smd.resistor.wetware') * 16,
        metaitem('component.smd.diode.wetware') * 16,
        metaitem('crystal.system_on_chip') * 12,
        metaitem('wireFineRunicalloy') * 48,
        metaitem('boltRunicalloy') * 12  
    )
    .fluidInputs(fluid('darkmatteralloy') * 288)
    .outputs(item('contenttweaker:phenomenal_processor') * 4)
    .stationResearch(b -> b.researchStack(item('contenttweaker:sigma_mainframe')).CWUt(144).EUt(1000000))
    .EUt(2000000)
    .duration(8000)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs(
        metaitem('circuit_board.wetware') * 2,
        item('contenttweaker:phenomenal_processor') * 4,
        metaitem('component.smd.transistor.wetware') * 32,
        metaitem('component.smd.capacitor.wetware') * 32,
        metaitem('component.smd.resistor.wetware') * 32,
        metaitem('component.smd.diode.wetware') * 32,
        metaitem('plate.random_access_memory') * 32,
        metaitem('wireFineRunicalloy') * 16
    )
    .fluidInputs(fluid('darkmatteralloy') * 288)
    .outputs(item('contenttweaker:phenomenal_supercomputer') * 2)
    .stationResearch(b -> b.researchStack(item('contenttweaker:phenomenal_processor')).CWUt(160).EUt(1500000))
    .EUt(16000000)
    .duration(10000)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs(
        metaitem('stickLongRunicalloy') * 32,
        item('contenttweaker:phenomenal_supercomputer') * 4,
        metaitem('component.smd.transistor.wetware') * 64,
        metaitem('component.smd.capacitor.wetware') * 64,
        metaitem('component.smd.resistor.wetware') * 64,
        metaitem('component.smd.diode.wetware') * 64,
        metaitem('foilPolybenzimidazole') * 64,
        metaitem('plate.random_access_memory') * 64,
        metaitem('wireGtQuadrupleRunicalloy') * 32,
        metaitem('plateRunicalloy') * 8
    )
    .fluidInputs(
        fluid('darkmatteralloy') * 576,
        fluid('polybenzimidazole') * 2304,
        fluid('soldering_alloy') * 5760
    )
    .outputs(item('contenttweaker:phenomenal_mainframe') * 1)
    .stationResearch(b -> b.researchStack(item('contenttweaker:phenomenal_processor')).CWUt(176).EUt(3000000))
    .EUt(120000000)
    .duration(12000)
    .buildAndRegister();