import avaritia.*
import gregtech.*

def assembler = recipemap('assembler');
def blast_furnace = recipemap('electric_blast_furnace');
def assembly_line = recipemap('assembly_line');
def research_station = recipemap('research_station');

mods.avaritia.extreme_crafting.removeByOutput(item('avaritia:infinity_helmet'));
mods.avaritia.extreme_crafting.removeByOutput(item('avaritia:infinity_chestplate'));
mods.avaritia.extreme_crafting.removeByOutput(item('avaritia:infinity_pants'));
mods.avaritia.extreme_crafting.removeByOutput(item('avaritia:infinity_boots'));
mods.draconicevolution.fusion.removeByCatalyst(item('draconicevolution:wyvern_helm'));
mods.draconicevolution.fusion.removeByCatalyst(item('draconicevolution:wyvern_chest'));
mods.draconicevolution.fusion.removeByCatalyst(item('draconicevolution:wyvern_legs'));
mods.draconicevolution.fusion.removeByCatalyst(item('draconicevolution:wyvern_boots'));
crafting.removeByOutput(item('draconicevolution:wyvern_helm'));
crafting.removeByOutput(item('draconicevolution:wyvern_chest'));
crafting.removeByOutput(item('draconicevolution:wyvern_legs'));
crafting.removeByOutput(item('draconicevolution:wyvern_boots'));
furnace.removeByInput(item('draconicevolution:draconium_ore'));
furnace.removeByInput(item('draconicevolution:draconium_dust'));
crafting.removeByOutput(item('projecte:item.pe_gem_armor_3'));
crafting.removeByOutput(item('projecte:item.pe_gem_armor_2'))
crafting.removeByOutput(item('projecte:item.pe_gem_armor_1'))
crafting.removeByOutput(item('projecte:item.pe_gem_armor_0'))



blast_furnace.recipeBuilder()
    .inputs(ore('dustDraconium') * 1)
    .fluidInputs(fluid('helium_3') * 2000)
    .outputs(item('draconicevolution:draconium_ingot') * 1)
    .property('temperature', 3500)
    .EUt(512)
    .duration(200)
    .buildAndRegister();

//Wyvern Helm
assembler.recipeBuilder()
    .inputs(
        item('futuremc:netherite_helmet') * 1,
        ore('plateStainlessSteel') * 4,
        item('gregtech:meta_item_1', 741) * 1,
        item('gregtech:meta_item_1', 204) * 2,
        item('draconicevolution:wyvern_core') * 4
    )
    .fluidInputs(fluid('uranium') * 1000)
    .outputs(item('draconicevolution:wyvern_helm') * 1)
    .EUt(480)
    .duration(500)
    .buildAndRegister();

//Wyvern Chest
assembler.recipeBuilder()
    .inputs(
        item('futuremc:netherite_chestplate') * 1,
        ore('plateStainlessSteel') * 4,
        item('gregtech:meta_item_1', 741) * 1,
        item('gregtech:meta_item_1', 204) * 2,
        item('draconicevolution:wyvern_core') * 4
    )
    .fluidInputs(fluid('uranium') * 1000)
    .outputs(item('draconicevolution:wyvern_chest') * 1)
    .EUt(480)
    .duration(500)
    .buildAndRegister();

//Wyvern Legs
assembler.recipeBuilder()
    .inputs(
        item('futuremc:netherite_leggings') * 1,
        ore('plateStainlessSteel') * 4,
        item('gregtech:meta_item_1', 741) * 1,
        item('gregtech:meta_item_1', 204) * 2,
        item('draconicevolution:wyvern_core') * 4
    )
    .fluidInputs(fluid('uranium') * 1000)
    .outputs(item('draconicevolution:wyvern_legs') * 1)
    .EUt(480)
    .duration(500)
    .buildAndRegister();

//Wyvern Boots
assembler.recipeBuilder()
    .inputs(
        item('futuremc:netherite_boots') * 1,
        ore('plateStainlessSteel') * 4,
        item('gregtech:meta_item_1', 741) * 1,
        item('gregtech:meta_item_1', 204) * 2,
        item('draconicevolution:wyvern_core') * 4
    )
    .fluidInputs(fluid('uranium') * 1000)
    .outputs(item('draconicevolution:wyvern_boots') * 1)
    .EUt(480)
    .duration(500)
    .buildAndRegister();

//Draconic Helm
assembler.recipeBuilder()
    .inputs(
        item('draconicevolution:wyvern_helm') * 1,
        ore('plateTungstenSteel') * 4,
        item('gregtech:meta_item_1', 748) * 1,
        item('gregtech:meta_item_1', 206) * 2,
        item('draconicevolution:awakened_core') * 4
    )
    .fluidInputs(fluid('plutonium') * 1000)
    .outputs(item('draconicevolution:draconic_helm') * 1)
    .EUt(7680)
    .duration(500)
    .buildAndRegister();

//Draconic Chest
assembler.recipeBuilder()
    .inputs(
        item('draconicevolution:wyvern_chest') * 1,
        ore('plateTungstenSteel') * 4,
        item('gregtech:meta_item_1', 748) * 1,
        item('gregtech:meta_item_1', 206) * 2,
        item('draconicevolution:awakened_core') * 4
    )
    .fluidInputs(fluid('plutonium') * 1000)
    .outputs(item('draconicevolution:draconic_chest') * 1)
    .EUt(7680)
    .duration(500)
    .buildAndRegister();

//Draconic Legs
assembler.recipeBuilder()
    .inputs(
        item('draconicevolution:wyvern_legs') * 1,
        ore('plateTungstenSteel') * 4,
        item('gregtech:meta_item_1', 748) * 1,
        item('gregtech:meta_item_1', 206) * 2,
        item('draconicevolution:awakened_core') * 4
    )
    .fluidInputs(fluid('plutonium') * 1000)
    .outputs(item('draconicevolution:draconic_legs') * 1)
    .EUt(7680)
    .duration(500)
    .buildAndRegister();

//Draconic Boots
assembler.recipeBuilder()
    .inputs(
        item('draconicevolution:wyvern_boots') * 1,
        ore('plateTungstenSteel') * 4,
        item('gregtech:meta_item_1', 748) * 1,
        item('gregtech:meta_item_1', 206) * 2,
        item('draconicevolution:awakened_core') * 4
    )
    .fluidInputs(fluid('plutonium') * 1000)
    .outputs(item('draconicevolution:draconic_boots') * 1)
    .EUt(7680)
    .duration(500)
    .buildAndRegister();

//Gem armor

assembler.recipeBuilder()
    .inputs(
        item('projecte:item.pe_rm_armor_3') * 1,
        item('gregtech:meta_item_1', 81).withNbt(["Fluid": ["FluidName": "oxygen", "Amount": 32000]]) * 1,
        item('projecte:item.pe_matter', 1) * 1,
        item('gregtech:meta_item_1', 205) * 2,
        item('gregtech:meta_item_1', 742) * 1,
        ore('plateTitanium') * 4
    )
    .outputs(item('projecte:item.pe_gem_armor_3') * 1)
    .EUt(1920)
    .duration(500)
    .buildAndRegister();

assembler.recipeBuilder()
    .inputs(
        item('projecte:item.pe_rm_armor_2') * 1,
        item('botania:flighttiara', 1) * 1,
        item('projecte:item.pe_matter', 1) * 1,
        item('gregtech:meta_item_1', 205) * 2,
        item('gregtech:meta_item_1', 742) * 1,
        ore('plateTitanium') * 4
    )
    .outputs(item('projecte:item.pe_gem_armor_2') * 1)
    .EUt(1920)
    .duration(500)
    .buildAndRegister();

assembler.recipeBuilder()
    .inputs(
        item('projecte:item.pe_rm_armor_1') * 1,
        item('gregtech:meta_item_1', 130) * 2,
        item('projecte:item.pe_matter', 1) * 1,
        item('gregtech:meta_item_1', 205) * 2,
        item('gregtech:meta_item_1', 742) * 1,
        ore('plateTitanium') * 4
    )
    .outputs(item('projecte:item.pe_gem_armor_1') * 1)
    .EUt(1920)
    .duration(500)
    .buildAndRegister();

assembler.recipeBuilder()
    .inputs(
        item('projecte:item.pe_rm_armor_0') * 1,
        ore('foilRubber') * 8,
        item('projecte:item.pe_matter', 1) * 1,
        item('gregtech:meta_item_1', 205) * 2,
        item('gregtech:meta_item_1', 742) * 1,
        ore('plateTitanium') * 4
    )
    .outputs(item('projecte:item.pe_gem_armor_0') * 1)
    .EUt(1920)
    .duration(500)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs(
        item('gregtech:gt_armor', 43) * 1,
        item('draconicevolution:draconic_boots') * 1,
        item('projecte:item.pe_gem_armor_0') * 1,
        item('gregtech:meta_item_1', 210) * 4,
        item('gregtech:meta_item_1', 754) * 1,
        ore('plateDenseNeutronium') * 2,
        item('gregtech:meta_item_1', 497) * 1,
        item('gregtech:machine', 1022) * 1
    )
    .fluidInputs(
        fluid('darkenergyalloy') * 12000,
        fluid('soldering_alloy') * 2880
        )
    .outputs(item('avaritia:infinity_boots') * 1)
    .stationResearch(b -> b.researchStack(item('gregtech:gt_armor', 43)).CWUt(600,200000000).EUt(131072))
    .EUt(1048576)
    .duration(1200)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs(
        item('gregtech:gt_armor', 42) * 1,
        item('draconicevolution:draconic_legs') * 1,
        item('projecte:item.pe_gem_armor_1') * 1,
        item('gregtech:meta_item_1', 210) * 4,
        item('gregtech:meta_item_1', 754) * 1,
        ore('plateDenseNeutronium') * 2,
        item('gregtech:meta_item_1', 497) * 1,
        item('gregtech:machine', 1022) * 1
    )
    .fluidInputs(
        fluid('darkenergyalloy') * 12000,
        fluid('soldering_alloy') * 2880
        )
    .outputs(item('avaritia:infinity_pants') * 1)
    .stationResearch(b -> b.researchStack(item('gregtech:gt_armor', 42)).CWUt(600,200000000).EUt(131072))
    .EUt(1048576)
    .duration(1200)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs(
        item('gregtech:gt_armor', 50) * 1,
        item('draconicevolution:draconic_chest') * 1,
        item('projecte:item.pe_gem_armor_2') * 1,
        item('gregtech:meta_item_1', 210) * 4,
        item('gregtech:meta_item_1', 754) * 1,
        ore('plateDenseNeutronium') * 2,
        item('gregtech:meta_item_1', 497) * 1,
        item('gregtech:machine', 1022) * 1
    )
    .fluidInputs(
        fluid('darkenergyalloy') * 12000,
        fluid('soldering_alloy') * 2880
        )
    .outputs(item('avaritia:infinity_chestplate') * 1)
    .stationResearch(b -> b.researchStack(item('gregtech:gt_armor', 50)).CWUt(600,200000000).EUt(131072))
    .EUt(1048576)
    .duration(1200)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs(
        item('gregtech:gt_armor', 40) * 1,
        item('draconicevolution:draconic_helm') * 1,
        item('projecte:item.pe_gem_armor_3') * 1,
        item('gregtech:meta_item_1', 210) * 4,
        item('gregtech:meta_item_1', 754) * 1,
        ore('plateDenseNeutronium') * 2,
        item('gregtech:meta_item_1', 497) * 1,
        item('gregtech:machine', 1022) * 1
    )
    .fluidInputs(
        fluid('darkenergyalloy') * 12000,
        fluid('soldering_alloy') * 2880
        )
    .outputs(item('avaritia:infinity_helmet') * 1)
    .stationResearch(b -> b.researchStack(item('gregtech:gt_armor', 40)).CWUt(600,200000000).EUt(131072))
    .EUt(1048576)
    .duration(1200)
    .buildAndRegister();