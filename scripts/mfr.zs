import crafttweaker.item.IIngredient;
import mods.gregtech.recipe.RecipeMap;
import crafttweaker.item.IItemStack;

//Machine Case

recipes.removeByRecipeName("teslacorelib:machine_case");
recipes.addShaped("casingGT",<teslacorelib:machine_case> * 2,
        [
            [<ore:plateDoubleWroughtIron>,<ore:plateDoubleWroughtIron>,<ore:plateDoubleWroughtIron>],
            [<ore:circuitLv>,<gregtech:machine:986>,<ore:circuitLv>],
            [<gregtech:meta_item_1:127>,<ore:batteryLv>,<gregtech:meta_item_1:127>]
        ]);

//Laser Drill
recipes.removeByRecipeName("industrialforegoing:laser_drill");
recipes.removeByRecipeName("industrialforegoing:laser_drill_enderio");

assembler.recipeBuilder()
    .inputs([
        <teslacorelib:machine_case> * 1,
        <ore:circuitHv> * 2,
        <ore:craftingLensRed> * 1,
        <gregtech:meta_item_1:219> * 1,
        <gregtech:meta_item_1:741> * 1
    ])
    .fluidInputs(<liquid:nitrogen> * 12000)
    .outputs(<industrialforegoing:laser_drill> * 1)
    .EUt(256)
    .duration(2000)
    .buildAndRegister();

//Laser Base

recipes.removeByRecipeName("industrialforegoing:laser_base");
recipes.removeByRecipeName("industrialforegoing:laser_base_enderio");

assembler.recipeBuilder()
    .inputs([
        <teslacorelib:machine_case> * 1,
        <ore:circuitHv> * 4,
        <ore:craftingLensRed> * 1,
        <gregtech:meta_item_1:234> * 4
    ])
    .fluidInputs(<liquid:nitrogen> * 12000)
    .outputs(<industrialforegoing:laser_base> * 1)
    .EUt(256)
    .duration(2000)
    .buildAndRegister();
