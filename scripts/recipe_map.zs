#priority 98

import mods.gregtech.multiblock.Builder;
import mods.gregtech.multiblock.FactoryBlockPattern;
import mods.gregtech.multiblock.RelativeDirection;
import mods.gregtech.multiblock.functions.IPatternBuilderFunction;
import mods.gregtech.IControllerTile;
import mods.gregtech.multiblock.CTPredicate;
import mods.gregtech.multiblock.IBlockPattern;
import mods.gregtech.recipe.FactoryRecipeMap;
import mods.gregtech.machine.Renderer;
import mods.gregtech.machine.MachineBuilder;
import mods.gregtech.recipe.RecipeMapBuilder;
import mods.gregtech.recipe.RecipeMaps;
import mods.gregtech.recipe.RecipeMap;

val wakfureactor as RecipeMap = <recipemap:wakfu_generator>;
val naquadahgen as RecipeMap = <recipemap:naquadah_generator>;

MachineBuilder.create(32100, "wakfugenerator")
    .setRecipeMap(wakfureactor)
    .setRenderer("machines/wakfu_reactor")
    .addTier(10,11,12,13,14)
    .setGenerator()
    .buildAndRegister();

MachineBuilder.create(32100, "naquadahgenerator")
    .setRecipeMap(naquadahgen)
    .setRenderer("machines/naquadah_reactor")
    .addTier(5,6,7,8,9)
    .setGenerator()
    .buildAndRegister();
    

wakfureactor.recipeBuilder()
    .fluidInputs(<liquid:wakfu> * 1)
    .EUt(8388608)
    .duration(2000000)
    .buildAndRegister();

wakfureactor.recipeBuilder()
    .fluidInputs(<liquid:stasis> * 1)
    .EUt(8388608)
    .duration(2000000)
    .buildAndRegister();

naquadahgen.recipeBuilder()
    .fluidInputs(<liquid:naquadah> * 32)
    .EUt(8192)
    .duration(10000)
    .buildAndRegister();
naquadahgen.recipeBuilder()
    .fluidInputs(<liquid:naquadah_enriched> * 32)
    .EUt(8192)
    .duration(30000)
    .buildAndRegister();
naquadahgen.recipeBuilder()
    .fluidInputs(<liquid:naquadria> * 32)
    .EUt(32768)
    .duration(50000)
    .buildAndRegister();
