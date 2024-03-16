import gregtech.*;

def centrifuge = recipemap('centrifuge');

centrifuge.recipeBuilder()
    .inputs(item('minecraft:porkchop') * 32)
    .fluidInputs(fluid('sulfuric_acid') * 500)
    .fluidOutputs(fluid('diluted_sulfuric_acid') * 500)
    .outputs(item('gregtech:meta_dust_small', 32000) * 2)
    .EUt(120000)
    .duration(2000)
    .buildAndRegister();

centrifuge.recipeBuilder()
    .inputs(ore('treeSapling') * 64)
    .fluidInputs(fluid('sulfuric_acid') * 500)
    .fluidOutputs(fluid('diluted_sulfuric_acid') * 500)
    .outputs(item('gregtech:meta_dust_small', 32000) * 2)
    .EUt(120000)
    .duration(2000)
    .buildAndRegister();

centrifuge.recipeBuilder()
    .inputs(item('botania:manaresource', 5) * 1)
    .fluidInputs(fluid('sulfuric_acid') * 5000)
    .fluidOutputs(fluid('diluted_sulfuric_acid') * 5000)
    .outputs(metaitem('dustWakfu') * 4)
    .EUt(640000)
    .duration(2000)
    .buildAndRegister();

centrifuge.recipeBuilder()
    .inputs(item('draconicevolution:chaos_shard', 2) * 1)
    .fluidInputs(fluid('sulfuric_acid') * 5000)
    .fluidOutputs(fluid('diluted_sulfuric_acid') * 5000)
    .outputs(metaitem('dustWakfu') * 6)
    .EUt(1200000)
    .duration(2000)
    .buildAndRegister();

centrifuge.recipeBuilder()
    .inputs(item('draconicevolution:chaos_shard', 1) * 1)
    .fluidInputs(fluid('sulfuric_acid') * 5000)
    .fluidOutputs(fluid('diluted_sulfuric_acid') * 5000)
    .outputs(metaitem('dustWakfu') * 10)
    .EUt(1200000)
    .duration(2000)
    .buildAndRegister();

centrifuge.recipeBuilder()
    .inputs(item('draconicevolution:chaos_shard') * 1)
    .fluidInputs(fluid('sulfuric_acid') * 5000)
    .fluidOutputs(fluid('diluted_sulfuric_acid') * 5000)
    .outputs(metaitem('dustWakfu') * 16)
    .EUt(1200000)
    .duration(2000)
    .buildAndRegister();

centrifuge.recipeBuilder()
    .inputs(metaitem('dustWakfu') * 9)
    .fluidInputs(fluid('hydrofluoric_acid') * 5000)
    .outputs(metaitem('dustSmallStasis') * 2)
    .EUt(1200000)
    .duration(2000)
    .buildAndRegister();