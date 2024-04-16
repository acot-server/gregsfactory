import gregtech.*;


def assembler = recipemap('assembler');

crafting.removeByOutput(item('enderio:item_item_conduit'));
crafting.removeByOutput(item('enderio:item_liquid_conduit'));
crafting.removeByOutput(item('enderio:item_liquid_conduit', 1));
crafting.removeByOutput(item('enderio:item_liquid_conduit', 2));

//EnderIO Conduit
crafting.addShaped(item('enderio:item_item_conduit') * 3), [
    [metaitem('screwSteel'),ore('toolWrench'),metaitem('screwSteel')],
    [metaitem('pipeSmallItemCobalt'),metaitem('pipeSmallItemCobalt'),metaitem('pipeSmallItemCobalt')],
    [metaitem('screwSteel'),ore('toolScrewdriver'),metaitem('screwSteel')]
]

assembler.recipeBuilder()
    .inputs(
        metaitem('pipeSmallItemCobalt') * 3,
        metaitem('screwSteel') * 4
    )
    .outputs(item('enderio:item_item_conduit') * 12)
    .EUt(48)
    .duration(300)
    .buildAndRegister();

//Facade Conduit
crafting.addShaped(item('enderio:item_conduit_facade') * 4), [
    [null,metaitem('plateIron'),null],
    [metaitem('plateIron'),ore('stone'),metaitem('plateIron')],
    [null,metaitem('plateIron'),null]
]

crafting.addShaped(item('enderio:item_liquid_conduit') * 3), [
    [metaitem('plateRubber'),ore('toolWrench'),metaitem('plateRubber')],
    [metaitem('pipeSmallFluidGold'),metaitem('pipeSmallFluidGold'),metaitem('pipeSmallFluidGold')],
    [metaitem('plateRubber'),ore('toolScrewdriver'),metaitem('plateRubber')]
]

assembler.recipeBuilder()
    .inputs(
        metaitem('pipeSmallFluidGold') * 3,
        metaitem('screwSteel') * 4
    )
    .fluidInputs(fluid('rubber') * 288)
    .outputs(item('enderio:item_liquid_conduit') * 12)
    .EUt(48)
    .duration(300)
    .buildAndRegister();

assembler.recipeBuilder()
    .inputs(
        metaitem('pipeSmallFluidGold') * 3,
        metaitem('screwSteel') * 4
    )
    .fluidInputs(fluid('silicone_rubber') * 144)
    .outputs(item('enderio:item_liquid_conduit') * 12)
    .EUt(48)
    .duration(300)
    .buildAndRegister();

assembler.recipeBuilder()
    .inputs(
        metaitem('pipeSmallFluidGold') * 3,
        metaitem('screwSteel') * 4
    )
    .fluidInputs(fluid('styrene_butadiene_rubber') * 72)
    .outputs(item('enderio:item_liquid_conduit') * 12)
    .EUt(48)
    .duration(300)
    .buildAndRegister();

crafting.addShaped(item('enderio:item_liquid_conduit', 1) * 3), [
    [metaitem('plateRubber'),ore('toolWrench'),metaitem('plateRubber')],
    [metaitem('pipeSmallFluidSteel'),metaitem('pipeSmallFluidSteel'),metaitem('pipeSmallFluidSteel')],
    [metaitem('plateRubber'),ore('toolScrewdriver'),metaitem('plateRubber')]
]

assembler.recipeBuilder()
    .inputs(
        metaitem('pipeSmallFluidSteel') * 3,
        metaitem('screwAluminium') * 4
    )
    .fluidInputs(fluid('rubber') * 288)
    .outputs(item('enderio:item_liquid_conduit', 1) * 12)
    .EUt(120)
    .duration(300)
    .buildAndRegister();

assembler.recipeBuilder()
    .inputs(
        metaitem('pipeSmallFluidSteel') * 3,
        metaitem('screwAluminium') * 4
    )
    .fluidInputs(fluid('silicone_rubber') * 144)
    .outputs(item('enderio:item_liquid_conduit', 1) * 12)
    .EUt(120)
    .duration(300)
    .buildAndRegister();

assembler.recipeBuilder()
    .inputs(
        metaitem('pipeSmallFluidSteel') * 3,
        metaitem('screwAluminium') * 4
    )
    .fluidInputs(fluid('styrene_butadiene_rubber') * 72)
    .outputs(item('enderio:item_liquid_conduit', 1) * 12)
    .EUt(120)
    .duration(300)
    .buildAndRegister();

// Ender Fluid Link Cover * 1
mods.gregtech.assembler.removeByInput(480, [metaitem('plateEnderPearl') * 9, metaitem('plateDoubleStainlessSteel'), metaitem('sensor.hv'), metaitem('emitter.hv'), metaitem('electric.pump.hv')], [fluid('plastic') * 288])

assembler.recipeBuilder()
    .inputs(
        metaitem('plateEnderPearl') * 18,
        metaitem('plateDoubleAluminium') * 2,
        metaitem('sensor.mv') * 2,
        metaitem('emitter.mv') * 2,
        metaitem('electric.pump.mv') * 2
    )
    .fluidInputs(fluid('plastic') * 576)
    .outputs(metaitem('cover.ender_fluid_link') * 2)
    .EUt(120)
    .duration(300)
    .buildAndRegister();

//Ender fluid conduit
crafting.addShaped(item('enderio:item_liquid_conduit', 2) * 2), [
    [metaitem('plateRubber'),ore('toolWrench'),metaitem('plateRubber')],
    [metaitem('pipeSmallFluidTitanium'),metaitem('cover.ender_fluid_link'),metaitem('pipeSmallFluidTitanium')],
    [metaitem('plateRubber'),ore('toolScrewdriver'),metaitem('plateRubber')]
]

assembler.recipeBuilder()
    .inputs(
        metaitem('pipeSmallFluidTitanium') * 3,
        metaitem('screwStainlessSteel') * 4,
        metaitem('cover.ender_fluid_link') * 1
    )
    .fluidInputs(fluid('rubber') * 288)
    .outputs(item('enderio:item_liquid_conduit', 2) * 12)
    .EUt(480)
    .duration(300)
    .buildAndRegister();

assembler.recipeBuilder()
    .inputs(
        metaitem('pipeSmallFluidTitanium') * 3,
        metaitem('screwStainlessSteel') * 4,
        metaitem('cover.ender_fluid_link') * 1
    )
    .fluidInputs(fluid('silicone_rubber') * 144)
    .outputs(item('enderio:item_liquid_conduit', 2) * 12)
    .EUt(480)
    .duration(300)
    .buildAndRegister();

assembler.recipeBuilder()
    .inputs(
        metaitem('pipeSmallFluidTitanium') * 3,
        metaitem('screwStainlessSteel') * 4,
        metaitem('cover.ender_fluid_link') * 1
    )
    .fluidInputs(fluid('styrene_butadiene_rubber') * 72)
    .outputs(item('enderio:item_liquid_conduit', 2) * 12)
    .EUt(480)
    .duration(300)
    .buildAndRegister();
