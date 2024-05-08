import crafttweaker.item.IIngredient;
import mods.gregtech.recipe.RecipeMap;
import crafttweaker.item.IItemStack;

recipes.removeByRecipeName("projecte:collector_mk1");
recipes.addShaped("Collector_MK1_alt", <projecte:collector_mk1> * 1,
    [
        [<minecraft:glowstone>,<ore:blockGlass>,<minecraft:glowstone>],
        [<minecraft:glowstone>,<ore:blockDiamond>,<minecraft:glowstone>],
        [<minecraft:glowstone>,<gregtech:machine:15>,<minecraft:glowstone>]
    ]);
recipes.removeByRecipeName("projecte:collector_mk2");
recipes.addShaped("Collector_MK2_alt", <projecte:collector_mk2> * 1,
    [
        [<gregtech:meta_plate:1601>,<projecte:item.pe_matter>,<gregtech:meta_plate:1601>],
        [<gregtech:meta_plate:1601>,<projecte:collector_mk1>,<gregtech:meta_plate:1601>],
        [<gregtech:meta_plate:1601>,<gregtech:machine:51>,<gregtech:meta_plate:1601>]
    ]);

recipes.removeByRecipeName("projecte:collector_mk3");
recipes.addShaped("Collector_MK3_alt", <projecte:collector_mk3> * 1,
    [
        [<gregtech:meta_plate:1601>,<projecte:item.pe_matter:1>,<gregtech:meta_plate:1601>],
        [<gregtech:meta_plate:1601>,<projecte:collector_mk2>,<gregtech:meta_plate:1601>],
        [<gregtech:meta_plate:1601>,<gregtech:machine:53>,<gregtech:meta_plate:1601>]
    ]);

<projecte:item.pe_matter>.displayName = "Impure Dark Matter";
<projecte:item.pe_matter>.addTooltip("Primitive form of dark matter, it's enough to make armor and tools, but Enigmatic technologies need an extremly pure form of dark matter.");

recipes.removeByRecipeName("gregtech:block_compress_blaze");
recipes.removeByRecipeName("projecte:transmutation_table");
recipes.removeByRecipeName("projecte:philosophers_stone");
recipes.removeByRecipeName("projecte:philosophers_stone_alt");
recipes.removeByRecipeName("projecte:condenser_mk1");
assembler.recipeBuilder()
    .inputs([
        <minecraft:beacon> * 2,
        <ore:circuitHv> * 4,
        <gregtech:meta_item_1:741> * 8
    ])
    .fluidInputs(<liquid:plutonium_241> * 1440)
    .outputs(<projecte:transmutation_table> * 1)
    .EUt(396625813)
    .duration(1200)
    .buildAndRegister();

assembler.recipeBuilder()
    .inputs([
        <ore:plateGlowstone> * 4,
        <ore:plateRedAlloy> * 4,
        <ore:circuitLv> * 1,
        <ore:gemFlawlessDiamond> * 1
    ])
    .outputs(<projecte:item.pe_philosophers_stone>.withTag({}) * 1)
    .EUt(30)
    .duration(600)
    .buildAndRegister();

assembler.recipeBuilder()
    .inputs([
        <gregtech:machine:1562> * 2,
        <projecte:item.pe_covalence_dust> * 64,
        <projecte:item.pe_covalence_dust:1> * 64,
        <projecte:item.pe_covalence_dust:2> * 64,
        <ore:circuitEv> * 6,
        <gregtech:machine:989> * 1
    ])
    .outputs(<projecte:condenser_mk1> * 1)
    .EUt(2000)
    .duration(2400)
    .buildAndRegister();
