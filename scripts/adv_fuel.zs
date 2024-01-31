import crafttweaker.item.IIngredient;
import mods.gregtech.recipe.RecipeMap;
import crafttweaker.item.IItemStack;

val uu = <liquid:uu_matter>;
mixer.recipeBuilder()
    .inputs(<ore:dustIron> * 1)
    .fluidInputs(<liquid:hydrogen> * 250)
    .fluidOutputs(<liquid:uu_matter> * 250)
    .EUt(24)
    .duration(500)
    .buildAndRegister();

autoclave.recipeBuilder()
    .inputs(<ore:dustCoal> * 1)
    .fluidInputs(uu * 125)
    .outputs(<projecte:item.pe_fuel> * 1)
    .EUt(24)
    .duration(500)
    .buildAndRegister();

autoclave.recipeBuilder()
    .inputs(<projecte:item.pe_fuel> * 1)
    .fluidInputs(uu * 250)
    .outputs(<projecte:item.pe_fuel:1> * 1)
    .EUt(96)
    .duration(500)
    .buildAndRegister();

autoclave.recipeBuilder()
    .inputs(<projecte:item.pe_fuel:1> * 1)
    .fluidInputs(uu * 375)
    .outputs(<projecte:item.pe_fuel:2> * 1)
    .EUt(384)
    .duration(500)
    .buildAndRegister();

autoclave.recipeBuilder()
    .inputs(<ore:dustDiamond> * 9)
    .fluidInputs(uu * 500)
    .outputs(<projecte:item.pe_matter> * 1)
    .EUt(1536)
    .duration(500)
    .buildAndRegister();

autoclave.recipeBuilder()
    .inputs(<projecte:item.pe_matter> * 1)
    .fluidInputs(uu * 625)
    .outputs(<projecte:item.pe_matter:1> * 1)
    .EUt(6144)
    .duration(500)
    .buildAndRegister();
