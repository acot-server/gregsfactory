import gregtech.*;

def centrifuge = recipemap('centrifuge');

centrifuge.recipeBuilder()
    .inputs(ore('listAllFood') * 32)
    .fluidInputs(fluid('sulfuric_acid') * 500)
    .fluidOutputs(
        fluid('diluted_sulfuric_acid') * 500,
        fluid('wakfu') * 72
        )
    .EUt(120)
    .duration(2000)
    .buildAndRegister();

centrifuge.recipeBuilder()
    .inputs(ore('treeSapling') * 32)
    .fluidInputs(fluid('sulfuric_acid') * 500)
    .fluidOutputs(
        fluid('diluted_sulfuric_acid') * 500,
        fluid('wakfu') * 72
        )
    .EUt(120)
    .duration(2000)
    .buildAndRegister();

centrifuge.recipeBuilder()
    .inputs(item('botania:manaresource', 5) * 1)
    .fluidInputs(fluid('sulfuric_acid') * 5000)
    .fluidOutputs(
        fluid('diluted_sulfuric_acid') * 5000,
        fluid('wakfu') * 144
        )
    .EUt(640)
    .duration(2000)
    .buildAndRegister();

centrifuge.recipeBuilder()
    .inputs(item('draconicevolution:chaos_shard', 2) * 1)
    .fluidInputs(fluid('sulfuric_acid') * 5000)
    .fluidOutputs(
        fluid('diluted_sulfuric_acid') * 5000,
        fluid('wakfu') * 288
        )
    .EUt(1200)
    .duration(2000)
    .buildAndRegister();

centrifuge.recipeBuilder()
    .inputs(item('draconicevolution:chaos_shard', 1) * 1)
    .fluidInputs(fluid('sulfuric_acid') * 5000)
    .fluidOutputs(
        fluid('diluted_sulfuric_acid') * 5000,
        fluid('wakfu') * 432
        )
    .EUt(1200)
    .duration(2000)
    .buildAndRegister();

centrifuge.recipeBuilder()
    .inputs(item('draconicevolution:chaos_shard') * 1)
    .fluidInputs(fluid('sulfuric_acid') * 5000)
    .fluidOutputs(
        fluid('diluted_sulfuric_acid') * 5000,
        fluid('wakfu') * 576
        )
    .EUt(1200)
    .duration(2000)
    .buildAndRegister();

centrifuge.recipeBuilder()
    .inputs(metaitem('dustWakfu') * 9)
    .fluidInputs(fluid('hydrofluoric_acid') * 5000)
    .outputs(metaitem('dustSmallStasis') * 2)
    .EUt(1200)
    .duration(2000)
    .buildAndRegister();