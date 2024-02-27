import gregtech.*


def assembly_line = recipemap('assembly_line');
def research_station = recipemap('research_station');

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
    .outputs(item('contenttweaker:precursor_database') * 1)
    .stationResearch(b -> b.researchStack(metaitem('tool.dataorb')).CWUt(4,2000000).EUt(32768))
    .EUt(32768)
    .duration(72000)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs(
        metaitem('hull.zpm') * 1,
        metaitem('petri_dish') * 8,
        ore('circuitZpm') * 4,
        metaitem('electric.pump.zpm') * 2,
        metaitem('rotorNaquadahAlloy') * 4
    )
    .fluidInputs(
        fluid('soldering_alloy') * 2880
        )
    .outputs(metaitem('devtech:bioassembler.zpm') * 1)
    .stationResearch(b -> b.researchStack(metaitem('circuit.wetware_mainframe')).CWUt(128,2560000).EUt(580000))
    .EUt(131072)
    .duration(1200)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs(
        metaitem('hull.uv') * 1,
        metaitem('petri_dish') * 8,
        ore('circuitUv') * 4,
        metaitem('electric.pump.uv') * 2,
        metaitem('rotorDarkmatteralloy') * 4
    )
    .fluidInputs(
        fluid('soldering_alloy') * 2880
        )
    .outputs(metaitem('devtech:bioassembler.uv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('devtech:bioassembler.zpm')).CWUt(144,2880000).EUt(2000000))
    .EUt(524288)
    .duration(1200)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs(
        metaitem('hull.uhv') * 1,
        metaitem('petri_dish') * 8,
        ore('circuitUhv') * 4,
        metaitem('electric.pump.uhv') * 2,
        metaitem('rotorDarkenergyalloy') * 4
    )
    .fluidInputs(
        fluid('soldering_alloy') * 2880
        )
    .outputs(metaitem('devtech:bioassembler.uhv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('devtech:bioassembler.uv')).CWUt(160,3200000).EUt(8000000))
    .EUt(2000000)
    .duration(1200)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs(
        metaitem('hull.uev') * 1,
        metaitem('petri_dish') * 8,
        ore('circuitUev') * 4,
        metaitem('electric.pump.uev') * 2,
        metaitem('rotorStellarite') * 4
    )
    .fluidInputs(
        fluid('soldering_alloy') * 2880
        )
    .outputs(metaitem('devtech:bioassembler.uev') * 1)
    .stationResearch(b -> b.researchStack(metaitem('devtech:bioassembler.uhv')).CWUt(172,35200006).EUt(24000000))
    .EUt(8000000)
    .duration(1200)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs(
        metaitem('hull.uiv') * 1,
        metaitem('petri_dish') * 8,
        ore('circuitUiv') * 4,
        metaitem('electric.pump.uiv') * 2,
        metaitem('rotorStellarite') * 4
    )
    .fluidInputs(
        fluid('soldering_alloy') * 2880
        )
    .outputs(metaitem('devtech:bioassembler.uiv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('devtech:bioassembler.uev')).CWUt(192,3840000).EUt(60000000))
    .EUt(32000000)
    .duration(1200)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs(
        metaitem('hull.uxv') * 1,
        metaitem('petri_dish') * 8,
        ore('circuitUxv') * 4,
        metaitem('electric.pump.uxv') * 2,
        metaitem('rotorRunicalloy') * 4
    )
    .fluidInputs(
        fluid('soldering_alloy') * 2880
        )
    .outputs(metaitem('devtech:bioassembler.uxv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('devtech:bioassembler.uiv')).CWUt(224,4480000).EUt(160000000))
    .EUt(128000000)
    .duration(1200)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs(
        metaitem('hull.opv') * 1,
        metaitem('petri_dish') * 8,
        ore('circuitOpv') * 4,
        metaitem('electric.pump.opv') * 2,
        metaitem('rotorWakfustasis') * 4
    )
    .fluidInputs(
        fluid('soldering_alloy') * 2880
        )
    .outputs(metaitem('devtech:bioassembler.opv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('devtech:bioassembler.uxv')).CWUt(240,4800000).EUt(320000000))
    .EUt(500000000)
    .duration(1200)
    .buildAndRegister();