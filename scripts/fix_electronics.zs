import crafttweaker.item.IIngredient;
import mods.gregtech.recipe.RecipeMap;
import crafttweaker.item.IItemStack;

//Remove Wrong recipes from assembler

// LV Field Generator * 1
<recipemap:assembler>.findRecipe(30, [<minecraft:ender_pearl:0>, <metaitem:plateSteel> * 2, <metaitem:circuit.electronic> * 2, <metaitem:wireGtQuadrupleManganesePhosphide> * 4], null).remove();
// MV Field Generator * 1
<recipemap:assembler>.findRecipe(30, [<minecraft:ender_eye:0>, <metaitem:plateAluminium> * 2, <metaitem:circuit.good_electronic> * 2, <metaitem:wireGtQuadrupleMagnesiumDiboride> * 4], null).remove();
// HV Field Generator * 1
<recipemap:assembler>.findRecipe(30, [<metaitem:quantumeye>, <metaitem:plateStainlessSteel> * 2, <metaitem:circuit.advanced_integrated> * 2, <metaitem:wireGtQuadrupleMercuryBariumCalciumCuprate> * 4], null).remove();
// EV Field Generator * 1
<recipemap:assembler>.findRecipe(30, [<minecraft:nether_star:0>, <metaitem:plateDoubleTitanium> * 2, <metaitem:circuit.workstation> * 2, <metaitem:wireGtQuadrupleUraniumTriplatinum> * 4], null).remove();
// IV Field Generator * 1
<recipemap:assembler>.findRecipe(30, [<metaitem:quantumstar>, <metaitem:plateDoubleTungstenSteel> * 2, <metaitem:circuit.mainframe> * 2, <metaitem:wireGtQuadrupleSamariumIronArsenicOxide> * 4], null).remove();

//Add New assembler recipes with good tags

// LV Field Generator * 1
assembler.recipeBuilder()
    .inputs([
        <minecraft:ender_pearl:0> * 1,
        <metaitem:plateSteel> * 2,
        <ore:circuitLv> * 2,
        <metaitem:wireGtQuadrupleManganesePhosphide> * 4
    ])
    .outputs(<gregtech:meta_item_1:202> * 1)
    .EUt(30)
    .duration(100)
    .buildAndRegister();

// MV Field Generator * 1
assembler.recipeBuilder()
    .inputs([
        <minecraft:ender_eye:0> * 1,
        <metaitem:plateAluminium> * 2,
        <ore:circuitMv> * 2,
        <metaitem:wireGtQuadrupleMagnesiumDiboride> * 4
    ])
    .outputs(<gregtech:meta_item_1:203> * 1)
    .EUt(30)
    .duration(100)
    .buildAndRegister();

// HV Field Generator * 1
assembler.recipeBuilder()
    .inputs([
        <metaitem:quantumeye> * 1,
        <metaitem:plateStainlessSteel> * 2,
        <ore:circuitHv> * 2,
        <metaitem:wireGtQuadrupleMercuryBariumCalciumCuprate> * 4
    ])
    .outputs(<gregtech:meta_item_1:204> * 1)
    .EUt(30)
    .duration(100)
    .buildAndRegister();

// EV Field Generator * 1
assembler.recipeBuilder()
    .inputs([
        <minecraft:nether_star:0> * 1,
        <metaitem:plateDoubleTitanium> * 2,
        <ore:circuitEv> * 2,
        <metaitem:wireGtQuadrupleUraniumTriplatinum> * 4
    ])
    .outputs(<gregtech:meta_item_1:205> * 1)
    .EUt(30)
    .duration(100)
    .buildAndRegister();

// IV Field Generator * 1
assembler.recipeBuilder()
    .inputs([
        <metaitem:quantumstar> * 1,
        <metaitem:plateDoubleTungstenSteel> * 2,
        <ore:circuitIv> * 2,
        <metaitem:wireGtQuadrupleSamariumIronArsenicOxide> * 4
    ])
    .outputs(<gregtech:meta_item_1:206> * 1)
    .EUt(30)
    .duration(100)
    .buildAndRegister();