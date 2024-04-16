#priority 10001
// preprocessor directive to load this file first so others have access to the definitions

/**
 * Global definitions for commonly referenced values.
 * This avoids any inconsistencies that may arise from different definitions in different files.
 */

import mods.gregtech.recipe.RecipeMap;
import mods.gregtech.material.MaterialRegistry;
import crafttweaker.item.IItemStack;
import crafttweaker.item.IIngredient;
import crafttweaker.item.IItemCondition;
import crafttweaker.data.IData;
import crafttweaker.liquid.ILiquidStack;
import crafttweaker.recipes.IRecipeFunction;
import crafttweaker.recipes.IRecipeAction;

global alloy_smelter            as RecipeMap = <recipemap:alloy_smelter>;
global arc_furnace              as RecipeMap = <recipemap:arc_furnace>;
global assembler                as RecipeMap = <recipemap:assembler>;
global assembly_line            as RecipeMap = <recipemap:assembly_line>;
global autoclave                as RecipeMap = <recipemap:autoclave>;
global bender                   as RecipeMap = <recipemap:bender>;
global brewery                   as RecipeMap = <recipemap:brewery>;
global canner                   as RecipeMap = <recipemap:canner>;
global centrifuge                   as RecipeMap = <recipemap:centrifuge>;
global chemical_bath                   as RecipeMap = <recipemap:chemical_bath>;
global chemical_reactor                   as RecipeMap = <recipemap:chemical_reactor>;
global circuit_assembler                   as RecipeMap = <recipemap:circuit_assembler>;
global coke_oven                   as RecipeMap = <recipemap:coke_oven>;
global compressor                   as RecipeMap = <recipemap:compressor>;
global cracker                   as RecipeMap = <recipemap:cracker>;
global cutter                   as RecipeMap = <recipemap:cutter>;
global distillation_tower                   as RecipeMap = <recipemap:distillation_tower>;
global distillery                   as RecipeMap = <recipemap:distillery>;
global blast_furnace                   as RecipeMap = <recipemap:electric_blast_furnace>;
global electric_furnace                   as RecipeMap = <recipemap:electric_furnace>;
global electrolyzer                   as RecipeMap = <recipemap:electrolyzer>;
global electromagnetic_separator                   as RecipeMap = <recipemap:electromagnetic_separator>;
global extractor                   as RecipeMap = <recipemap:extractor>;
global extruder                   as RecipeMap = <recipemap:extruder>;
global fermenter                   as RecipeMap = <recipemap:fermenter>;
global fluid_heater                   as RecipeMap = <recipemap:fluid_heater>;
global fluid_solidifier                   as RecipeMap = <recipemap:fluid_solidifier>;
global forge_hammer                   as RecipeMap = <recipemap:forge_hammer>;
global forming_press                   as RecipeMap = <recipemap:forming_press>;
global fusion_reactor                   as RecipeMap = <recipemap:fusion_reactor>;
global gas_collector                   as RecipeMap = <recipemap:gas_collector>;
global implosion_compressor                   as RecipeMap = <recipemap:implosion_compressor>;
global large_chemical_reactor                   as RecipeMap = <recipemap:large_chemical_reactor>;
global laser_engraver                   as RecipeMap = <recipemap:laser_engraver>;
global lathe                   as RecipeMap = <recipemap:lathe>;
global macerator                   as RecipeMap = <recipemap:macerator>;
global mixer                   as RecipeMap = <recipemap:mixer>;
global ore_washer                   as RecipeMap = <recipemap:ore_washer>;
global packer                   as RecipeMap = <recipemap:packer>;
global primitive_blast_furnace                   as RecipeMap = <recipemap:primitive_blast_furnace>;
global pyrolyse_oven                   as RecipeMap = <recipemap:pyrolyse_oven>;
global rock_breaker                   as RecipeMap = <recipemap:rock_breaker>;
global sifter                   as RecipeMap = <recipemap:sifter>;
global thermal_centrifuge                   as RecipeMap = <recipemap:thermal_centrifuge>;
global vacuum_freezer                   as RecipeMap = <recipemap:vacuum_freezer>;
global wiremill                             as RecipeMap = <recipemap:wiremill>;
global combustion_generator                   as RecipeMap = <recipemap:combustion_generator>;
global gas_turbine                   as RecipeMap = <recipemap:gas_turbine>;
global plasma_generator                   as RecipeMap = <recipemap:plasma_generator>;
global semi_fluid_generator                   as RecipeMap = <recipemap:semi_fluid_generator>;
global steam_turbine                   as RecipeMap = <recipemap:steam_turbine>;
