import gregetech.*;

def assembler = recipemap('assembler');
def assembly_line = recipemap('assembly_line');
def research_station = recipemap('research_station');

//
assembly_line.recipeBuilder()
    .inputs(
        metaitem('frameEuropium') * 1,
        metaitem('field.generator.luv') * 8,
        metaitem('emitter.luv') * 32,
        metaitem('sensor.luv') * 32,
        ore('circuitLuv') * 64,
        item('gregtech:battery_block', 4) * 64
    )
    .fluidInputs(
        fluid('tungsten_steel') * 32000,
        fluid('soldering_alloy') * 16000,
        fluid('polybenzimidazole') * 16000
    )
    .outputs(metaitem('multiblocktweaker:black_hole') * 1)
    .stationResearch(b -> b.researchStack(metaitem('quantumstar')).CWUt(16).EUt(8192))
    .EUt(30000)
    .duration(10000)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs(
        metaitem('multiblocktweaker:black_hole') * 1,
        metaitem('field.generator.zpm') * 8,
        metaitem('emitter.zpm') * 32,
        metaitem('sensor.zpm') * 32,
        ore('circuitZpm') * 64,
        item('gregtech:battery_block', 5) * 64
    )
    .fluidInputs(
        fluid('rhodium_plated_palladium') * 32000,
        fluid('soldering_alloy') * 16000,
        fluid('polybenzimidazole') * 16000
    )
    .outputs(metaitem('multiblocktweaker:ae_black_hole') * 1)
    .stationResearch(b -> b.researchStack(metaitem('multiblocktweaker:black_hole')).CWUt(32).EUt(32768))
    .EUt(100000)
    .duration(10000)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs(
        metaitem('multiblocktweaker:ae_black_hole') * 1,
        metaitem('field.generator.uv') * 8,
        metaitem('emitter.uv') * 32,
        metaitem('sensor.uv') * 32,
        ore('circuitUv') * 64,
        item('gregtech:battery_block', 7) * 64
    )
    .fluidInputs(
        fluid('rhodium_plated_palladium') * 48000,
        fluid('soldering_alloy') * 16000,
        fluid('polybenzimidazole') * 16000,
        fluid('darkmatteralloy') * 10000
    )
    .outputs(metaitem('multiblocktweaker:se_black_hole') * 1)
    .stationResearch(b -> b.researchStack(metaitem('multiblocktweaker:ae_black_hole')).CWUt(64).EUt(131072))
    .EUt(1000000)
    .duration(10000)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs(
        metaitem('multiblocktweaker:se_black_hole') * 1,
        metaitem('field.generator.uhv') * 8,
        metaitem('emitter.uhv') * 32,
        metaitem('sensor.uhv') * 32,
        ore('circuitUhv') * 64,
        metaitem('delta.uhv') * 64
    )
    .fluidInputs(
        fluid('rhodium_plated_palladium') * 48000,
        fluid('soldering_alloy') * 16000,
        fluid('polybenzimidazole') * 16000,
        fluid('darkenergyalloy') * 10000
    )
    .outputs(metaitem('multiblocktweaker:re_black_hole') * 1)
    .stationResearch(b -> b.researchStack(metaitem('multiblocktweaker:se_black_hole')).CWUt(128).EUt(524288))
    .EUt(10000000)
    .duration(10000)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs(
        metaitem('multiblocktweaker:re_black_hole') * 1,
        metaitem('field.generator.uiv') * 8,
        metaitem('emitter.uiv') * 32,
        metaitem('sensor.uiv') * 32,
        ore('circuitUiv') * 64,
        metaitem('sigma.uiv') * 64
    )
    .fluidInputs(
        fluid('rhodium_plated_palladium') * 48000,
        fluid('stellarite') * 16000,
        fluid('polybenzimidazole') * 16000,
        fluid('runicalloy') * 10000
    )
    .outputs(metaitem('multiblocktweaker:te_black_hole') * 1)
    .stationResearch(b -> b.researchStack(metaitem('multiblocktweaker:re_black_hole')).CWUt(512).EUt(32000000))
    .EUt(100000000)
    .duration(10000)
    .buildAndRegister();