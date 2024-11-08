import gregetech.*;


def mixer = recipemap('mixer');
def fusion_reactor = recipemap('fusion_reactor')

mixer.recipeBuilder()
    .inputs(
        metaitem('dustDraconium') * 8,
        metaitem('dustTitanium') * 4
    )
    .circuitMeta(4)
    .fluidInputs(fluid('blue_steel') * 576)
    .outputs(metaitem('dustAwaknedDraconium') * 16)
    .EUt(480)
    .duration(600)
    .buildAndRegister();

fusion_reactor.recipeBuilder()
    .fluidInputs(
        fluid('wakfu') * 72,
        fluid('naquadah') * 144
    )
    .property('eu_to_start', 70000000)
    .fluidOutputs(fluid('stasis') * 144)
    .EUt(491520)
    .duration(16)
    .buildAndRegister();