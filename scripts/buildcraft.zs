import crafttweaker.item.IIngredient;
import mods.gregtech.recipe.RecipeMap;
import crafttweaker.item.IItemStack;

recipes.removeByRecipeName("buildcraftbuilders:quarry");
recipes.addShaped("quarryGT",<buildcraftbuilders:quarry> * 1,
    [
        [<gregtech:meta_gear:324>,<ore:circuitMv>,<gregtech:meta_gear:324>],
        [<gregtech:meta_gear:301>,<gregtech:meta_gear:324>,<gregtech:meta_gear:301>],
        [<gregtech:meta_item_1:128>,<gregtech:drill_mv>,<gregtech:meta_item_1:128>]
    ]);