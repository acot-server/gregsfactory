import mods.gregtech.recipe.RecipeMap;


sifter.recipeBuilder()
    .inputs([
        <minecraft:sand> * 1
    ])
    .outputs(<gregtech:meta_dust:2023> * 1)
    .chancedOutput(<gregtech:meta_dust:2023> * 1, 8000, 500)
    .EUt(12)
    .duration(30)
    .buildAndRegister();