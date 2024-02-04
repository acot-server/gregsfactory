import gregetech.*;

def assembler = recipemap('assembler');
def assembly_line = recipemap('assembly_line');
def research_station = recipemap('research_station');
    



assembly_line.recipeBuilder()
    .inputs(
        metaitem('processor.neuro') * 2,
        metaitem('component.smd.transistor.wetware') * 12,
        metaitem('component.smd.capacitor.wetware') * 12,
        metaitem('component.smd.resistor.wetware') * 12,
        metaitem('component.smd.diode.wetware') * 12,
        metaitem('crystal.system_on_chip') * 8,
        metaitem('wireFineStellarite') * 32,
        metaitem('boltStellarite') * 12  
    )
    .fluidInputs(fluid('neutronium') * 288)
    .outputs(item('contenttweaker:sigma_processor') * 4)
    .stationResearch(b -> b.researchStack(item('contenttweaker:alpha_mainframe')).CWUt(96).EUt(780000))
    .EUt(500000)
    .duration(7000)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs(
        metaitem('circuit_board.wetware') * 2,
        item('contenttweaker:sigma_processor') * 4,
        metaitem('component.smd.transistor.wetware') * 24,
        metaitem('component.smd.capacitor.wetware') * 24,
        metaitem('component.smd.resistor.wetware') * 24,
        metaitem('component.smd.diode.wetware') * 24,
        metaitem('plate.random_access_memory') * 32,
        metaitem('wireFineStellarite') * 16
    )
    .fluidInputs(fluid('neutronium') * 288)
    .outputs(item('contenttweaker:sigma_supercomputer') * 2)
    .stationResearch(b -> b.researchStack(item('contenttweaker:sigma_processor')).CWUt(114).EUt(1140000))
    .EUt(6000000)
    .duration(9000)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs(
        metaitem('stickLongStellarite') * 32,
        item('contenttweaker:sigma_supercomputer') * 4,
        metaitem('component.smd.transistor.wetware') * 48,
        metaitem('component.smd.capacitor.wetware') * 48,
        metaitem('component.smd.resistor.wetware') * 48,
        metaitem('component.smd.diode.wetware') * 48,
        metaitem('foilPolybenzimidazole') * 64,
        metaitem('plate.random_access_memory') * 64,
        metaitem('wireGtQuadrupleStellarite') * 32,
        metaitem('plateStellarite') * 8
    )
    .fluidInputs(
        fluid('neutronium') * 576,
        fluid('polybenzimidazole') * 2304,
        fluid('soldering_alloy') * 5760
    )
    .outputs(item('contenttweaker:sigma_mainframe') * 1)
    .stationResearch(b -> b.researchStack(item('contenttweaker:sigma_supercomputer')).CWUt(128).EUt(1650000))
    .EUt(48000000)
    .duration(11000)
    .buildAndRegister();