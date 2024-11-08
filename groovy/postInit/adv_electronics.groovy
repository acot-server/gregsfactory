import gregtech.*


def assembly_line = recipemap('assembly_line');
def research_station = recipemap('research_station');
def chemical_reactor = recipemap('chemical_reactor')

assembly_line.recipeBuilder()
    .inputs(
        metaitem('plate.random_access_memory') * 64,
        metaitem('plate.random_access_memory') * 64,
        metaitem('tool.dataorb') * 64,
        metaitem('tool.dataorb') * 64,
        ore('circuitLuv') * 16,
        ore('circuitIv') * 32
    )
    .fluidInputs(
        fluid('naquadah') * 5760,
        fluid('soldering_alloy') * 2880
        )
    .outputs(metaitem('circuit.sophia_data_base') * 1)
    .stationResearch(b -> b.researchStack(metaitem('circuit.wetware_processor')).CWUt(4,2000000).EUt(32768))
    .EUt(32768)
    .duration(72000)
    .buildAndRegister();


assembly_line.recipeBuilder()
    .inputs(
        metaitem('board.wetware') * 16,
        ore('pipeTinyFluidDraconium') * 32,
        metaitem('electric.pump.zpm') * 16,
        ore('circuitZpm') * 4,
        ore('circuitLuv') * 12
    )
    .fluidInputs(
        fluid('sterilized_growth_medium') * 500,
        fluid('soldering_alloy') * 2880
        )
    .outputs(metaitem('board.enigmatic') * 16)
    .stationResearch(b -> b.researchStack(metaitem('circuit.sophia_data_base')).CWUt(8,8000000).EUt(32768))
    .EUt(491520)
    .duration(500)
    .buildAndRegister();

chemical_reactor.recipeBuilder()
    .inputs(
        metaitem('board.enigmatic') * 8,
        ore('foilTrinium') * 64
        )
    .fluidInputs(fluid('iron_iii_chloride') * 8000)
    .outputs(metaitem('circuit_board.enigmatic') * 8)
    .EUt(491520)
    .duration(500)
    .buildAndRegister();

chemical_reactor.recipeBuilder()
    .inputs(
        metaitem('board.enigmatic') * 8,
        ore('foilTrinium') * 64
        )
    .fluidInputs(fluid('sodium_persulfate') * 16000)
    .outputs(metaitem('circuit_board.enigmatic') * 8)
    .EUt(491520)
    .duration(500)
    .buildAndRegister();