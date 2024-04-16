import crafttweaker.item.IIngredient;
import mods.gregtech.recipe.RecipeMap;
import crafttweaker.item.IItemStack;

recipes.removeByRecipeName("gregtech:hermetic_casing_lv");
recipes.removeByRecipeName("gregtech:hermetic_casing_mv");
recipes.addShaped("hermtic_casing_lv_alt",<gregtech:hermetic_casing> * 1,
    [
      [<ore:plateSteel>,<ore:plateSteel>,<ore:plateSteel>],
      [<ore:plateSteel>,<ore:pipeLargeFluidSteel>,<ore:plateSteel>],
      [<ore:plateSteel>,<ore:plateSteel>,<ore:plateSteel>]  
    ]);

recipes.addShaped("hermtic_casing_mv_alt",<gregtech:hermetic_casing:1> * 1,
    [
      [<ore:plateAluminium>,<ore:plateAluminium>,<ore:plateAluminium>],
      [<ore:plateAluminium>,<ore:pipeLargeFluidAluminium>,<ore:plateAluminium>],
      [<ore:plateAluminium>,<ore:plateAluminium>,<ore:plateAluminium>]  
    ]);