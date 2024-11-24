import gregtech.*;

def chemical_reactor = recipemap('chemical_reactor')

chemical_reactor.recipeBuilder()
    .inputs(ore('listAllFood') * 32)
    .fluidInputs(fluid('sulfuric_acid') * 500)
    .fluidOutputs(
        fluid('diluted_sulfuric_acid') * 500,
        fluid('wakfu') * 72
        )
    .EUt(120)
    .duration(2000)
    .buildAndRegister();

chemical_reactor.recipeBuilder()
    .inputs(ore('treeSapling') * 32)
    .fluidInputs(fluid('sulfuric_acid') * 500)
    .fluidOutputs(
        fluid('diluted_sulfuric_acid') * 500,
        fluid('wakfu') * 72
        )
    .EUt(120)
    .duration(2000)
    .buildAndRegister();

chemical_reactor.recipeBuilder()
    .inputs(item('botania:manaresource', 5) * 1)
    .fluidInputs(fluid('sulfuric_acid') * 5000)
    .fluidOutputs(
        fluid('diluted_sulfuric_acid') * 5000,
        fluid('wakfu') * 576
        )
    .EUt(640)
    .duration(2000)
    .buildAndRegister();

chemical_reactor.recipeBuilder()
    .inputs(item('draconicevolution:chaos_shard', 2) * 1)
    .fluidInputs(fluid('sulfuric_acid') * 5000)
    .fluidOutputs(
        fluid('diluted_sulfuric_acid') * 5000,
        fluid('wakfu') * 1728
        )
    .EUt(1200)
    .duration(2000)
    .buildAndRegister();

chemical_reactor.recipeBuilder()
    .inputs(item('draconicevolution:chaos_shard', 1) * 1)
    .fluidInputs(fluid('sulfuric_acid') * 5000)
    .fluidOutputs(
        fluid('diluted_sulfuric_acid') * 5000,
        fluid('wakfu') * 5184
        )
    .EUt(1200)
    .duration(2000)
    .buildAndRegister();

chemical_reactor.recipeBuilder()
    .inputs(item('draconicevolution:chaos_shard') * 1)
    .fluidInputs(fluid('sulfuric_acid') * 5000)
    .fluidOutputs(
        fluid('diluted_sulfuric_acid') * 5000,
        fluid('wakfu') * 15552
        )
    .EUt(1200)
    .duration(2000)
    .buildAndRegister();

chemical_reactor.recipeBuilder()
    .inputs(metaitem('dustWakfu') * 9)
    .fluidInputs(fluid('hydrofluoric_acid') * 5000)
    .fluidOutputs(fluid('stasis') * 72)
    .EUt(1200)
    .duration(2000)
    .buildAndRegister();