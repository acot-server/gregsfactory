import crafttweaker.item.IIngredient;
import mods.gregtech.recipe.RecipeMap;
import crafttweaker.item.IItemStack;

// Granite * 1
<recipemap:rock_breaker>.findRecipe(60, [<minecraft:stone:1>], null).remove();
// Diorite * 1
<recipemap:rock_breaker>.findRecipe(60, [<minecraft:stone:3>], null).remove();
// Andesite * 1
<recipemap:rock_breaker>.findRecipe(60, [<minecraft:stone:5>], null).remove();
// Obsidian * 1
<recipemap:rock_breaker>.findRecipe(240, [<minecraft:redstone:0>], null).remove();
// Marble * 1
<recipemap:rock_breaker>.findRecipe(240, [<projectred-exploration:stone:0>], null).remove();
// Basalt * 1
<recipemap:rock_breaker>.findRecipe(240, [<projectred-exploration:stone:3>], null).remove();
// Black Granite * 1
<recipemap:rock_breaker>.findRecipe(960, [<gregtech:stone_smooth:0>], null).remove();
// Red Granite * 1
<recipemap:rock_breaker>.findRecipe(960, [<gregtech:stone_smooth:1>], null).remove();

rock_breaker.recipeBuilder()
    .notConsumable(<minecraft:stone:1> * 1)
    .outputs(<minecraft:stone:1> * 1)
    .EUt(12)
    .duration(16)
    .buildAndRegister();

rock_breaker.recipeBuilder()
    .notConsumable(<minecraft:stone:3> * 1)
    .outputs(<minecraft:stone:3> * 1)
    .EUt(12)
    .duration(16)
    .buildAndRegister();

rock_breaker.recipeBuilder()
    .notConsumable(<minecraft:stone:5> * 1)
    .outputs(<minecraft:stone:5> * 1)
    .EUt(12)
    .duration(16)
    .buildAndRegister();

rock_breaker.recipeBuilder()
    .notConsumable(<minecraft:redstone> * 1)
    .outputs(<minecraft:obsidian> * 1)
    .EUt(32)
    .duration(16)
    .buildAndRegister();

rock_breaker.recipeBuilder()
    .notConsumable(<gregtech:stone_smooth:2> * 1)
    .outputs(<gregtech:stone_smooth:2> * 1)
    .EUt(48)
    .duration(16)
    .buildAndRegister();

rock_breaker.recipeBuilder()
    .notConsumable(<gregtech:stone_smooth:3> * 1)
    .outputs(<gregtech:stone_smooth:3> * 1)
    .EUt(48)
    .duration(16)
    .buildAndRegister();

rock_breaker.recipeBuilder()
    .notConsumable(<gregtech:stone_smooth:1> * 1)
    .outputs(<gregtech:stone_smooth:1> * 1)
    .EUt(64)
    .duration(16)
    .buildAndRegister();

rock_breaker.recipeBuilder()
    .notConsumable(<gregtech:stone_smooth> * 1)
    .outputs(<gregtech:stone_smooth> * 1)
    .EUt(64)
    .duration(16)
    .buildAndRegister();

rock_breaker.recipeBuilder()
    .notConsumable(<environmentaltech:litherite> * 1)
    .outputs(<environmentaltech:litherite> * 1)
    .EUt(96)
    .duration(16)
    .buildAndRegister();

rock_breaker.recipeBuilder()
    .notConsumable(<environmentaltech:erodium> * 1)
    .outputs(<environmentaltech:erodium> * 1)
    .EUt(96)
    .duration(16)
    .buildAndRegister();

rock_breaker.recipeBuilder()
    .notConsumable(<environmentaltech:kyronite> * 1)
    .outputs(<environmentaltech:kyronite> * 1)
    .EUt(96)
    .duration(16)
    .buildAndRegister();

rock_breaker.recipeBuilder()
    .notConsumable(<environmentaltech:pladium> * 1)
    .outputs(<environmentaltech:pladium> * 1)
    .EUt(96)
    .duration(16)
    .buildAndRegister();

rock_breaker.recipeBuilder()
    .notConsumable(<environmentaltech:ionite> * 1)
    .outputs(<environmentaltech:ionite> * 1)
    .EUt(96)
    .duration(16)
    .buildAndRegister();

rock_breaker.recipeBuilder()
    .notConsumable(<environmentaltech:aethium> * 1)
    .outputs(<environmentaltech:aethium> * 1)
    .EUt(96)
    .duration(16)
    .buildAndRegister();

rock_breaker.recipeBuilder()
    .notConsumable(<environmentaltech:lonsdaleite> * 1)
    .outputs(<environmentaltech:lonsdaleite> * 1)
    .EUt(96)
    .duration(16)
    .buildAndRegister();