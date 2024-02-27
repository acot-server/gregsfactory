import gregtech.*
def assembler = recipemap("assembler");
def assembly_line = recipemap('assembly_line');
def research_station = recipemap('research_station');

crafting.removeByOutput(item('actuallyadditions:block_giant_chest'));
crafting.removeByOutput(item('actuallyadditions:block_giant_chest_medium'));
crafting.removeByOutput(item('actuallyadditions:block_giant_chest_large'));
crafting.removeByOutput(item('storagedrawers:upgrade_storage'));
crafting.removeByOutput(item('storagedrawers:upgrade_storage', 1));
crafting.removeByOutput(item('storagedrawers:upgrade_storage', 2));
crafting.removeByOutput(item('storagedrawers:upgrade_storage', 3));
crafting.removeByOutput(item('storagedrawers:upgrade_storage', 4));
crafting.removeByOutput(item('chickenchunks:chunk_loader'));
crafting.removeByOutput(item('chickenchunks:chunk_loader', 1));

//drawer upgrade x2
crafting.addShaped(item('storagedrawers:upgrade_storage'), [
    [ore('toolWrench'),ore('screwBronze'),ore('toolScrewdriver')],
    [ore('screwBronze'),ore('plankWood'),ore('screwBronze')],
    [ore('plateBronze'),ore('screwBronze'),ore('plateBronze')]
])
assembler.recipeBuilder()
    .inputs(
        ore('screwBronze') * 4,
        ore('plateBronze') * 2,
        ore('plateWood') * 1
    )
    .outputs(item('storagedrawers:upgrade_storage') * 2)
    .EUt(8)
    .duration(100)
    .buildAndRegister();

//small storage crate
crafting.addShaped(item('actuallyadditions:block_giant_chest'), [
    [ore('craftingToolSaw'),item('storagedrawers:upgrade_storage'),ore('toolScrewdriver')],
    [item('storagedrawers:upgrade_storage'),item('gregtech:machine', 1625),item('storagedrawers:upgrade_storage')],
    [ore('plateIron'),ore('plateIron'),ore('plateIron')]
])

assembler.recipeBuilder()
    .inputs(
        item('storagedrawers:upgrade_storage') * 3,
        ore('plateIron') * 3,
        item('gregtech:machine', 1625) * 1
    )
    .outputs(item('actuallyadditions:block_giant_chest'))
    .EUt(24)
    .duration(200)
    .buildAndRegister();

//drawer upgrade x4
crafting.addShaped(item('storagedrawers:upgrade_storage', 1), [
    [ore('toolWrench'),ore('screwSteel'),ore('toolScrewdriver')],
    [ore('screwSteel'),ore('plankWood'),ore('screwSteel')],
    [ore('plateSteel'),ore('screwSteel'),ore('plateSteel')]
])
assembler.recipeBuilder()
    .inputs(
        ore('screwSteel') * 4,
        ore('plateSteel') * 2,
        ore('plateWood') * 1
    )
    .outputs(item('storagedrawers:upgrade_storage', 1) * 2)
    .EUt(16)
    .duration(100)
    .buildAndRegister();

//medium storage crate
crafting.addShaped(item('actuallyadditions:block_giant_chest_medium'), [
    [ore('craftingToolSaw'),item('storagedrawers:upgrade_storage', 1),ore('toolScrewdriver')],
    [item('storagedrawers:upgrade_storage', 1),item('gregtech:machine', 1626),item('storagedrawers:upgrade_storage', 1)],
    [ore('plateSteel'),ore('plateSteel'),ore('plateSteel')]
])

assembler.recipeBuilder()
    .inputs(
        item('storagedrawers:upgrade_storage', 1) * 3,
        ore('plateBronze') * 3,
        item('gregtech:machine', 1626) * 1
    )
    .outputs(item('actuallyadditions:block_giant_chest_medium') * 2)
    .EUt(48)
    .duration(300)
    .buildAndRegister();

assembler.recipeBuilder()
    .inputs(
        item('storagedrawers:upgrade_storage', 1) * 3,
        ore('plateSteel') * 3,
        item('gregtech:machine', 1626) * 1
    )
    .outputs(item('actuallyadditions:block_giant_chest_medium'))
    .EUt(32)
    .duration(300)
    .buildAndRegister();

//drawer upgrade x8
crafting.addShaped(item('storagedrawers:upgrade_storage', 2), [
    [ore('toolWrench'),ore('screwAluminium'),ore('toolScrewdriver')],
    [ore('screwAluminium'),ore('plankWood'),ore('screwAluminium')],
    [ore('plateAluminium'),ore('screwAluminium'),ore('plateAluminium')]
])
assembler.recipeBuilder()
    .inputs(
        ore('screwAluminium') * 4,
        ore('plateAluminium') * 2,
        ore('plateWood') * 1
    )
    .outputs(item('storagedrawers:upgrade_storage', 2) * 2)
    .EUt(48)
    .duration(100)
    .buildAndRegister();

//large storage crate
crafting.addShaped(item('actuallyadditions:block_giant_chest_large'), [
    [ore('craftingToolSaw'),item('storagedrawers:upgrade_storage', 2),ore('toolScrewdriver')],
    [item('storagedrawers:upgrade_storage', 1),item('gregtech:machine', 1627),item('storagedrawers:upgrade_storage', 1)],
    [ore('plateAluminium'),ore('plateAluminium'),ore('plateAluminium')]
])

assembler.recipeBuilder()
    .inputs(
        item('storagedrawers:upgrade_storage', 2) * 3,
        ore('plateSteel') * 3,
        item('gregtech:machine', 1627) * 1
    )
    .outputs(item('actuallyadditions:block_giant_chest_large') * 1)
    .EUt(120)
    .duration(300)
    .buildAndRegister();

assembler.recipeBuilder()
    .inputs(
        item('storagedrawers:upgrade_storage', 2) * 3,
        ore('plateAluminium') * 3,
        item('gregtech:machine', 1627) * 1
    )
    .outputs(item('actuallyadditions:block_giant_chest_large') * 2)
    .EUt(160)
    .duration(300)
    .buildAndRegister();

//drawer upgrade x16
crafting.addShaped(item('storagedrawers:upgrade_storage', 3), [
    [ore('toolWrench'),ore('screwStainlessSteel'),ore('toolScrewdriver')],
    [ore('screwStainlessSteel'),ore('plankWood'),ore('screwStainlessSteel')],
    [ore('plateStainlessSteel'),ore('screwStainlessSteel'),ore('plateStainlessSteel')]
])
assembler.recipeBuilder()
    .inputs(
        ore('screwStainlessSteel') * 4,
        ore('plateStainlessSteel') * 2,
        ore('plateWood') * 1
    )
    .outputs(item('storagedrawers:upgrade_storage', 3) * 2)
    .EUt(192)
    .duration(100)
    .buildAndRegister();

//drawer upgrade x32
crafting.addShaped(item('storagedrawers:upgrade_storage', 4), [
    [ore('toolWrench'),ore('plateDoubleStainlessSteel'),ore('toolScrewdriver')],
    [ore('screwTitanium'),ore('plankWood'),ore('screwTitanium')],
    [ore('plateDoubleStainlessSteel'),ore('screwTitanium'),ore('plateDoubleStainlessSteel')]
])
assembler.recipeBuilder()
    .inputs(
        ore('screwTitanium') * 4,
        ore('plateDoubleStainlessSteel') * 2,
        ore('plateWood') * 1
    )
    .outputs(item('storagedrawers:upgrade_storage', 4) * 2)
    .EUt(768)
    .duration(100)
    .buildAndRegister();

//Spot Loader
crafting.addShaped(item('chickenchunks:chunk_loader', 1) * 4, [
    [ore('gemEnderEye'),ore('gemEmerald'),ore('gemEnderEye')],
    [ore('blockRedstone'),item('gregtech:machine_casing', 1),ore('blockLapis')],
    [ore('blockObsidian'),ore('blockObsidian'),ore('blockObsidian')]
]);

assembler.recipeBuilder()
    .inputs(
        ore('gemEnderEye') * 1,
        ore('gemEmerald') * 1,
        ore('dustRedstone') * 2,
        item('gregtech:machine_casing', 1) * 1
    )
    .outputs(item('chickenchunks:chunk_loader', 1) * 2)
    .EUt(30)
    .duration(400)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs(
        item('chickenchunks:chunk_loader', 1) * 16,
        ore('circuitIv') * 8,
        item('gregtech:meta_item_1', 261) * 4,
        item('gregtech:meta_item_1', 221) * 8,
        item('gregtech:meta_item_1', 236) * 8,
        item('gregtech:meta_item_1', 206) * 4,
        item('gregtech:meta_item_1', 748).withNbt(["Charge": 400000000L]) * 1
    )
    .fluidInputs(
        fluid('soldering_alloy') * 2880
        )
    .outputs(item('chickenchunks:chunk_loader') * 3)
    .stationResearch(b -> b.researchStack(item('chickenchunks:chunk_loader', 1)).CWUt(4,2000000).EUt(2048))
    .EUt(8192)
    .duration(600)
    .buildAndRegister();