import crafttweaker.item.IIngredient;
import mods.gregtech.recipe.RecipeMap;
import crafttweaker.item.IItemStack;
import mods.jei.JEI;

alloy_smelter.recipeBuilder()
    .inputs(<minecraft:quartz> * 4)
    .notConsumable(<gregtech:meta_item_1:18>)
    .outputs(<enderio:block_fused_quartz> * 1)
    .EUt(8)
    .duration(200)
    .buildAndRegister();

alloy_smelter.recipeBuilder()
    .inputs([
        <minecraft:iron_ingot> * 1,
        <minecraft:ender_pearl> * 1
    ])
    .outputs(<enderio:item_alloy_ingot:5> * 1)
    .EUt(8)
    .duration(200)
    .buildAndRegister();

alloy_smelter.recipeBuilder()
    .inputs([
        <minecraft:iron_ingot> * 1,
        <minecraft:redstone> * 1
    ])
    .outputs(<enderio:item_alloy_ingot:4> * 1)
    .EUt(8)
    .duration(200)
    .buildAndRegister();


blast_furnace.recipeBuilder()
    .inputs([
        <minecraft:redstone> * 1,
        <minecraft:glowstone_dust> * 1,
        <minecraft:gold_ingot> * 1
    ])
    .outputs(<enderio:item_alloy_ingot:1> * 1)
    .EUt(32)
    .duration(300)
    .buildAndRegister();

alloy_smelter.recipeBuilder()
    .inputs([
        <enderio:item_alloy_ingot:1> * 1,
        <minecraft:ender_pearl> * 1
    ])
    .outputs(<enderio:item_alloy_ingot:2> * 1)
    .EUt(24)
    .duration(200)
    .buildAndRegister();

alloy_smelter.recipeBuilder()
    .inputs([
        <appliedenergistics2:material:5> * 1,
        <minecraft:redstone> * 1
    ])
    .outputs(<enderio:item_alloy_ingot:3> * 1)
    .EUt(12)
    .duration(200)
    .buildAndRegister();

alloy_smelter.recipeBuilder()
    .inputs([
        <gregtech:meta_dust:297> * 4,
        <ore:ingotSteel> * 1
    ])
    .outputs(<enderio:item_alloy_ingot:6> * 1)
    .EUt(16)
    .duration(300)
    .buildAndRegister();

alloy_smelter.recipeBuilder()
    .inputs([
        <gregtech:meta_dust:277> * 4,
        <minecraft:soul_sand> * 1
    ])
    .outputs(<enderio:item_alloy_ingot:7> * 1)
    .EUt(10)
    .duration(250)
    .buildAndRegister();

alloy_smelter.recipeBuilder()
    .inputs([
        <enderio:item_alloy_ingot:6> * 2,
        <gregtech:meta_dust:1603> * 10
    ])
    .outputs(<enderio:item_alloy_ingot:8> * 1)
    .EUt(24)
    .duration(400)
    .buildAndRegister();


blast_furnace.recipeBuilder()
    .inputs([
        <minecraft:iron_ingot> * 1,
        <gregtech:meta_dust:271> * 1,
        <appliedenergistics2:material:5> * 1
    ])
    .outputs(<enderio:item_alloy_ingot> * 1)
    .EUt(32)
    .duration(300)
    .buildAndRegister();

// Infinite Water Cover * 1
<recipemap:assembler>.findRecipe(480, [<metaitem:electric.pump.hv> * 2, <minecraft:cauldron:0>, <metaitem:circuit.advanced_integrated>], null).remove();

assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:142> * 2,
        <minecraft:cauldron> * 1,
        <ore:circuitLv> * 1
    ])
    .outputs(<gregtech:meta_item_1:310> * 1)
    .EUt(24)
    .duration(100)
    .buildAndRegister();

assembler.recipeBuilder()
    .inputs([
        <ore:plateDoubleSteel> * 2,
        <ore:plateRedAlloy> * 1,
        <ore:plateSilicon> * 2,
        <ore:circuitUlv> * 1
    ])
    .outputs(<enderio:item_material:41> * 1)
    .EUt(12)
    .duration(600)
    .buildAndRegister();

assembler.recipeBuilder()
    .inputs([
        <ore:plateDoubleBronze> * 2,
        <ore:plateRedAlloy> * 1,
        <ore:plateSilicon> * 2,
        <ore:circuitUlv> * 1
    ])
    .outputs(<enderio:item_material:45> * 1)
    .EUt(12)
    .duration(600)
    .buildAndRegister();



JEI.removeAndHide(<enderio:block_simple_alloy_smelter>);
JEI.removeAndHide(<enderio:block_alloy_smelter>);
JEI.removeAndHide(<enderio:block_enhanced_alloy_smelter>);
JEI.removeAndHide(<enderio:block_simple_sag_mill>);
JEI.removeAndHide(<enderio:block_sag_mill>);
JEI.removeAndHide(<enderio:block_enhanced_sag_mill>);

