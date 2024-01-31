import crafttweaker.item.IIngredient;
import mods.gregtech.recipe.RecipeMap;
import crafttweaker.item.IItemStack;

val assembly_line as RecipeMap = <recipemap:assembly_line>;
val assembler as RecipeMap = <recipemap:assembler>;
val centrifuge as RecipeMap = <recipemap:centrifuge>;


//Anti Matter Containment Field
assembly_line.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:209> * 4,
        <gregtech:meta_item_1:224> * 2,
        <gregtech:meta_item_1:239> * 2,
        <gregtech:machine:993> * 1
    ])
    .outputs(<contenttweaker:antimatter_field> * 1)
    .EUt(200000)
    .duration(2000)
    .buildAndRegister();
