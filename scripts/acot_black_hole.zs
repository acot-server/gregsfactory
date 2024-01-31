#priority 98

import mods.gregtech.multiblock.Builder;
import mods.gregtech.multiblock.FactoryBlockPattern;
import mods.gregtech.multiblock.RelativeDirection;
import mods.gregtech.multiblock.functions.IPatternBuilderFunction;
import mods.gregtech.IControllerTile;
import mods.gregtech.multiblock.CTPredicate;
import mods.gregtech.multiblock.IBlockPattern;
import mods.gregtech.recipe.FactoryRecipeMap;
import mods.gregtech.recipe.RecipeMap;

global black_hole as RecipeMap = FactoryRecipeMap.start("Black_hole_syhnt")
        .minInputs(0)
        .maxInputs(2)
        .maxFluidInputs(2)
        .maxFluidOutputs(1)
        .build();

val id = 32500;
val loc = "black_hole";

Builder.start(loc, id)
    .withPattern(function(controller as IControllerTile) as IBlockPattern {
        return FactoryBlockPattern.start()
            .aisle("CCCCC", "CCCCC", "CGGGC", "CCCCC", "CCCCC")
            .aisle("CCCCC", "C###C", "G#D#G", "C###C", "CCCCC")
            .aisle("CCCCC", "C#D#C", "GDRDG", "C#D#C", "CCCCC")
            .aisle("CCCCC", "C###C", "G#D#G", "C###C", "CCCCC")
            .aisle("CCCCC", "CCSCC", "CGGGC", "CCCCC", "CCCCC")
            .where("S", controller.self())
            .where("G", CTPredicate.states(<metastate:gregtech:transparent_casing:1>))
            .where("R", CTPredicate.states(<metastate:projecte:matter_block:1>))
            .where("D", CTPredicate.states(<metastate:gregtech:fusion_casing:2>))
            .where("C", CTPredicate.states(<blockstate:projecte:matter_block>).setMinGlobalLimited(75) | controller.autoAbilities())
            .where("#", CTPredicate.getAir())
            .build();
    } as IPatternBuilderFunction)
    .withRecipeMap(black_hole)
    .withBaseTexture(<blockstate:projecte:matter_block>)
    .buildAndRegister();


assembly_line.recipeBuilder()
    .inputs([
        <gregtech:meta_block_frame_2:1> * 1,
        <gregtech:meta_item_1:207> * 8,
        <gregtech:meta_item_1:222> * 32,
        <gregtech:meta_item_1:237> * 32,
        <ore:circuitLuv> * 64,
        <gregtech:meta_item_1:749> * 64
    ])
    .fluidInputs([
        <liquid:tungsten_steel> * 36000,
        <liquid:soldering_alloy> * 2880,
        <liquid:polybenzimidazole> * 2880
    ])
    .outputs(<gregtech:machine:32500> * 1)
    .EUt(30000)
    .duration(10000)
    .buildAndRegister();

black_hole.recipeBuilder()
    .circuit(1)
    .notConsumable(<contenttweaker:precursor_database>)
    .fluidInputs([
        <liquid:neutronium> * 32,
        <liquid:tritanium> * 64
    ])
    .fluidOutputs(<liquid:darkmatteralloy> * 32)
    .EUt(300000)
    .duration(400)
    .buildAndRegister();

black_hole.recipeBuilder()
    .circuit(2)
    .notConsumable(<contenttweaker:precursor_database>)
    .fluidInputs([
        <liquid:titanium> * 144,
        <liquid:steel> * 288
    ])
    .fluidOutputs(<liquid:tritanium> * 72)
    .EUt(120000)
    .duration(400)
    .buildAndRegister();

black_hole.recipeBuilder()
    .circuit(3)
    .notConsumable(<contenttweaker:precursor_database>)
    .fluidInputs([
        <liquid:tungsten_steel> * 144,
        <liquid:chrome> * 144
    ])
    .fluidOutputs(<liquid:neutronium> * 72)
    .EUt(224000)
    .duration(400)
    .buildAndRegister();

global ae_black_hole as RecipeMap = FactoryRecipeMap.start("Ae_black_hole_art")
        .minInputs(0)
        .maxInputs(2)
        .maxFluidInputs(2)
        .maxFluidOutputs(2)
        .build();

val id1 = 32501;
val loc1 = "ae_black_hole";

Builder.start(loc1, id1)
    .withPattern(function(controller as IControllerTile) as IBlockPattern {
        return FactoryBlockPattern.start()
            .aisle("CCCCC", "CCCCC", "CGGGC", "CCCCC", "CCCCC")
            .aisle("CCCCC", "C###C", "G#D#G", "C###C", "CCCCC")
            .aisle("CCCCC", "C#D#C", "GDRDG", "C#D#C", "CCCCC")
            .aisle("CCCCC", "C###C", "G#D#G", "C###C", "CCCCC")
            .aisle("CCCCC", "CCSCC", "CGGGC", "CCCCC", "CCCCC")
            .where("S", controller.self())
            .where("G", CTPredicate.states(<metastate:gregtech:transparent_casing:1>))
            .where("R", CTPredicate.states(<metastate:gregtech:fusion_casing:2>))
            .where("D", CTPredicate.states(<metastate:gregtech:fusion_casing:3>))
            .where("C", CTPredicate.states(<metastate:projecte:matter_block:1>).setMinGlobalLimited(75) | controller.autoAbilities())
            .where("#", CTPredicate.getAir())
            .build();
    } as IPatternBuilderFunction)
    .withRecipeMap(ae_black_hole)
    .withBaseTexture(<metastate:projecte:matter_block:1>)
    .buildAndRegister();



assembly_line.recipeBuilder()
    .inputs([
        <gregtech:machine:32500> *1,
        <gregtech:meta_item_1:208> * 8,
        <gregtech:meta_item_1:223> * 32,
        <gregtech:meta_item_1:238> * 32,
        <ore:circuitZpm> * 64,
        <gregtech:meta_item_1:750> * 64
    ])
    .fluidInputs([
        <liquid:rhodium_plated_palladium> * 36000,
        <liquid:soldering_alloy> * 2880,
        <liquid:polybenzimidazole> * 2880
    ])
    .outputs(<gregtech:machine:32501> * 1)
    .EUt(100000)
    .duration(10000)
    .buildAndRegister();

ae_black_hole.recipeBuilder()
    .circuit(1)
    .notConsumable(<contenttweaker:precursor_database>)
    .fluidInputs(
        <liquid:neutronium> * 16,
        <liquid:tritanium> * 32
    )
    .fluidOutputs(<liquid:darkmatteralloy> * 144)
    .EUt(1000000)
    .duration(400)
    .buildAndRegister();

ae_black_hole.recipeBuilder()
    .circuit(2)
    .notConsumable(<contenttweaker:precursor_database>)
    .fluidInputs([
        <liquid:neutronium> * 32,
        <liquid:darkmatteralloy> * 16
    ])
    .fluidOutputs([
        <liquid:darkmatteralloy> * 144,
        <liquid:darkenergyalloy> * 32
        ])
    .EUt(1000000)
    .duration(400)
    .buildAndRegister();


global se_black_hole as RecipeMap = FactoryRecipeMap.start("Se_black_hole_art")
        .minInputs(0)
        .maxInputs(2)
        .maxFluidInputs(2)
        .maxFluidOutputs(3)
        .build();

val id2 = 32502;
val loc2 = "se_black_hole";

Builder.start(loc2, id2)
    .withPattern(function(controller as IControllerTile) as IBlockPattern {
        return FactoryBlockPattern.start()
            .aisle("CCCCC", "CCCCC", "CGGGC", "CCCCC", "CCCCC")
            .aisle("CCCCC", "C###C", "G#D#G", "C###C", "CCCCC")
            .aisle("CCCCC", "C#D#C", "GDRDG", "C#D#C", "CCCCC")
            .aisle("CCCCC", "C###C", "G#D#G", "C###C", "CCCCC")
            .aisle("CCCCC", "CCSCC", "CGGGC", "CCCCC", "CCCCC")
            .where("S", controller.self())
            .where("G", CTPredicate.states(<metastate:gregtech:transparent_casing:1>))
            .where("R", CTPredicate.states(<metastate:gregtech:fusion_casing:2>))
            .where("D", CTPredicate.states(<metastate:gregtech:fusion_casing:3>))
            .where("C", CTPredicate.states(<metastate:gregtech:meta_block_compressed_2000:4>).setMinGlobalLimited(75) | controller.autoAbilities())
            .where("#", CTPredicate.getAir())
            .build();
    } as IPatternBuilderFunction)
    .withRecipeMap(se_black_hole)
    .withBaseTexture(<metastate:gregtech:meta_block_compressed_2000:4>)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs([
        <gregtech:machine:32501> * 1,
        <gregtech:meta_item_1:209> * 8,
        <gregtech:meta_item_1:224> * 32,
        <gregtech:meta_item_1:239> * 32,
        <ore:circuitUv> * 64,
        <gregtech:meta_item_1:751> * 64
    ])
    .fluidInputs([
        <liquid:rhodium_plated_palladium> * 36000,
        <liquid:soldering_alloy> * 2880,
        <liquid:polybenzimidazole> * 2880,
        <liquid:darkmatteralloy> * 1440
    ])
    .outputs(<gregtech:machine:32502> * 1)
    .EUt(1000000)
    .duration(10000)
    .buildAndRegister();

se_black_hole.recipeBuilder()
    .circuit(1)
    .notConsumable(<contenttweaker:precursor_database>)
    .fluidInputs([
        <liquid:darkenergyalloy> * 32,
        <liquid:darkmatteralloy> * 32
    ])
    .fluidOutputs(<liquid:stellarite> * 144)
    .EUt(4000000)
    .duration(400)
    .buildAndRegister();

se_black_hole.recipeBuilder()
    .circuit(2)
    .notConsumable(<contenttweaker:precursor_database>)
    .fluidInputs([
        <liquid:neutronium> * 64,
        <liquid:darkmatteralloy> * 64
    ])
    .fluidOutputs(<liquid:darkenergyalloy> * 576)
    .EUt(4000000)
    .duration(400)
    .buildAndRegister();

se_black_hole.recipeBuilder()
    .circuit(3)
    .notConsumable(<contenttweaker:precursor_database>)
    .fluidInputs([
        <liquid:neutronium> * 144,
        <liquid:tritanium> * 144
    ])
    .fluidOutputs(<liquid:darkmatteralloy> * 1296)
    .EUt(4000000)
    .duration(400)
    .buildAndRegister();

se_black_hole.recipeBuilder()
    .circuit(4)
    .notConsumable(<contenttweaker:precursor_database>)
    .fluidInputs([
        <liquid:darkenergyalloy> * 96,
        <liquid:stellarite> * 72
    ])
    .fluidOutputs([
        <liquid:darkmatteralloy> * 1440,
        <liquid:darkenergyalloy> * 720,
        <liquid:stellarite> * 288
    ])
    .EUt(4000000)
    .duration(400)
    .buildAndRegister();

circuit_assembler.recipeBuilder()
    .inputs([
      <gregtech:meta_item_1:592> * 64,
      <gregtech:meta_item_1:592> * 64,
      <gregtech:meta_item_1:262> * 64,
      <gregtech:meta_item_1:262> * 64,
      <ore:circuitLuv> * 16,
      <ore:circuitIv> * 32
    ])
    .fluidInputs(<liquid:naquadah> * 5760)
    .outputs(<contenttweaker:precursor_database> * 1)
    .EUt(32768)
    .duration(72000)
    .buildAndRegister();

global re_black_hole as RecipeMap = FactoryRecipeMap.start("Re_black_hole_art")
        .minInputs(0)
        .maxInputs(2)
        .maxFluidInputs(2)
        .maxFluidOutputs(4)
        .build();

val id3 = 32503;
val loc3 = "re_black_hole";

Builder.start(loc3, id3)
    .withPattern(function(controller as IControllerTile) as IBlockPattern {
        return FactoryBlockPattern.start()
            .aisle("CCCCC", "CCCCC", "CGGGC", "CCCCC", "CCCCC")
            .aisle("CCCCC", "C###C", "G#D#G", "C###C", "CCCCC")
            .aisle("CCCCC", "C#D#C", "GDRDG", "C#D#C", "CCCCC")
            .aisle("CCCCC", "C###C", "G#D#G", "C###C", "CCCCC")
            .aisle("CCCCC", "CCSCC", "CGGGC", "CCCCC", "CCCCC")
            .where("S", controller.self())
            .where("G", CTPredicate.states(<metastate:gregtech:transparent_casing:1>))
            .where("R", CTPredicate.states(<metastate:gregtech:fusion_casing:3>))
            .where("D", CTPredicate.states(<metastate:gregtech:fusion_casing:3>))
            .where("C", CTPredicate.states(<metastate:gregtech:meta_block_compressed_2000:5>).setMinGlobalLimited(75) | controller.autoAbilities())
            .where("#", CTPredicate.getAir())
            .build();
    } as IPatternBuilderFunction)
    .withRecipeMap(re_black_hole)
    .withBaseTexture(<metastate:gregtech:meta_block_compressed_2000:5>)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs([
        <gregtech:machine:32502> * 1,
        <gregtech:meta_item_1:210> * 8,
        <gregtech:meta_item_1:225> * 32,
        <gregtech:meta_item_1:240> * 32,
        <ore:circuitUhv> * 64,
        <gregtech:meta_item_1:754> * 64
    ])
    .fluidInputs([
        <liquid:rhodium_plated_palladium> * 36000,
        <liquid:darkmatteralloy> * 2880,
        <liquid:polybenzimidazole> * 2880,
        <liquid:darkenergyalloy> * 1440
    ])
    .outputs(<gregtech:machine:32503> * 1)
    .EUt(10000000)
    .duration(10000)
    .buildAndRegister();

re_black_hole.recipeBuilder()
    .circuit(1)
    .notConsumable(<contenttweaker:precursor_database>)
    .fluidInputs([
        <liquid:darkenergyalloy> * 144,
        <liquid:stellarite> * 144
    ])
    .fluidOutputs(<liquid:runicalloy> * 72)
    .EUt(16000000)
    .duration(400)
    .buildAndRegister();

re_black_hole.recipeBuilder()
    .circuit(2)
    .notConsumable(<contenttweaker:precursor_database>)
    .fluidInputs([
        <liquid:neutronium> * 144,
        <liquid:tritanium> * 144
    ])
    .fluidOutputs(<liquid:darkmatteralloy> * 2880)
    .EUt(16000000)
    .duration(400)
    .buildAndRegister();

re_black_hole.recipeBuilder()
    .circuit(3)
    .notConsumable(<contenttweaker:precursor_database>)
    .fluidInputs([
        <liquid:neutronium> * 144,
        <liquid:darkmatteralloy> * 144
    ])
    .fluidOutputs(<liquid:darkenergyalloy> * 1440)
    .EUt(16000000)
    .duration(400)
    .buildAndRegister();

re_black_hole.recipeBuilder()
    .circuit(4)
    .notConsumable(<contenttweaker:precursor_database>)
    .fluidInputs([
        <liquid:darkenergyalloy> * 144,
        <liquid:darkmatteralloy> * 144
    ])
    .fluidOutputs(<liquid:stellarite> * 576)
    .EUt(16000000)
    .duration(400)
    .buildAndRegister();

re_black_hole.recipeBuilder()
    .circuit(5)
    .notConsumable(<contenttweaker:precursor_database>)
    .fluidInputs([
        <liquid:runicalloy> * 72,
        <liquid:stellarite> * 144
    ])
    .fluidOutputs([
        <liquid:darkmatteralloy> * 2880,
        <liquid:darkenergyalloy> * 1440,
        <liquid:stellarite> * 576,
        <liquid:runicalloy> * 288
    ])
    .EUt(16000000)
    .duration(400)
    .buildAndRegister();

global te_black_hole as RecipeMap = FactoryRecipeMap.start("Te_black_hole_art")
        .minInputs(0)
        .maxInputs(2)
        .minOutputs(0)
        .maxOutputs(40)
        .maxFluidInputs(2)
        .maxFluidOutputs(5)
        .build();

val id4 = 32504;
val loc4 = "te_black_hole";

Builder.start(loc4, id4)
    .withPattern(function(controller as IControllerTile) as IBlockPattern {
        return FactoryBlockPattern.start()
            .aisle("CCCCC", "CCCCC", "CGGGC", "CCCCC", "CCCCC")
            .aisle("CCCCC", "C###C", "G#D#G", "C###C", "CCCCC")
            .aisle("CCCCC", "C#D#C", "GDRDG", "C#D#C", "CCCCC")
            .aisle("CCCCC", "C###C", "G#D#G", "C###C", "CCCCC")
            .aisle("CCCCC", "CCSCC", "CGGGC", "CCCCC", "CCCCC")
            .where("S", controller.self())
            .where("G", CTPredicate.states(<metastate:gregtech:transparent_casing:1>))
            .where("R", CTPredicate.states(<metastate:gregtech:fusion_casing:3>))
            .where("D", CTPredicate.states(<metastate:gregtech:fusion_casing:3>))
            .where("C", CTPredicate.states(<metastate:gregtech:meta_block_compressed_2000:6>).setMinGlobalLimited(70) | controller.autoAbilities())
            .where("#", CTPredicate.getAir())
            .build();
    } as IPatternBuilderFunction)
    .withRecipeMap(te_black_hole)
    .withBaseTexture(<metastate:gregtech:meta_block_compressed_2000:6>)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs([
        <gregtech:machine:32503> * 1,
        <gregtech:meta_item_1:212> * 8,
        <gregtech:meta_item_1:227> * 32,
        <gregtech:meta_item_1:242> * 32,
        <ore:circuitUiv> * 64,
        <gregtech:meta_item_1:756> * 64
    ])
    .fluidInputs([
        <liquid:rhodium_plated_palladium> * 36000,
        <liquid:stellarite> * 2880,
        <liquid:polybenzimidazole> * 2880,
        <liquid:runicalloy> * 1440
    ])
    .outputs(<gregtech:machine:32504> * 1)
    .EUt(80000000)
    .duration(10000)
    .buildAndRegister();

te_black_hole.recipeBuilder()
    .circuit(1)
    .notConsumable(<contenttweaker:precursor_database>)
    .fluidInputs([
        <liquid:stellarite> * 144,
        <liquid:runicalloy> * 144
    ])
    .fluidOutputs(<liquid:wakfustasis> * 72)
    .EUt(64000000)
    .duration(400)
    .buildAndRegister();

te_black_hole.recipeBuilder()
    .circuit(2)
    .notConsumable(<contenttweaker:precursor_database>)
    .fluidInputs([
        <liquid:neutronium> * 288,
        <liquid:tritanium> * 288
    ])
    .fluidOutputs(<liquid:darkmatteralloy> * 28800)
    .EUt(64000000)
    .duration(400)
    .buildAndRegister();

te_black_hole.recipeBuilder()
    .circuit(3)
    .notConsumable(<contenttweaker:precursor_database>)
    .fluidInputs([
        <liquid:neutronium> * 288,
        <liquid:darkmatteralloy> * 288
    ])
    .fluidOutputs(<liquid:darkenergyalloy> * 14400)
    .EUt(64000000)
    .duration(400)
    .buildAndRegister();

te_black_hole.recipeBuilder()
    .circuit(4)
    .notConsumable(<contenttweaker:precursor_database>)
    .fluidInputs([
        <liquid:darkenergyalloy> * 288,
        <liquid:darkmatteralloy> * 288
    ])
    .fluidOutputs(<liquid:stellarite> * 5760)
    .EUt(64000000)
    .duration(400)
    .buildAndRegister();

te_black_hole.recipeBuilder()
    .circuit(5)
    .notConsumable(<contenttweaker:precursor_database>)
    .fluidInputs([
        <liquid:wakfustasis> * 72,
        <liquid:runicalloy> * 144
    ])
    .fluidOutputs([
        <liquid:darkmatteralloy> * 28800,
        <liquid:darkenergyalloy> * 14400,
        <liquid:stellarite> * 5760,
        <liquid:runicalloy> * 2880,
        <liquid:wakfustasis> * 1440
    ])
    .EUt(64000000)
    .duration(400)
    .buildAndRegister();

te_black_hole.recipeBuilder()
    .circuit(6)
    .notConsumable(<contenttweaker:precursor_database>)
    .fluidInputs(
        <liquid:wakfustasis> * 8
    )
    .outputs([
        <minecraft:stone> * 64,
        <minecraft:log> * 64,
        <minecraft:netherrack> * 64,
        <minecraft:soul_sand> * 64,
        <minecraft:obsidian> * 64,
        <minecraft:coal> * 64,
        <minecraft:coal:1> * 64,
        <minecraft:diamond> * 64,
        <minecraft:string> * 64,
        <minecraft:feather> * 64,
        <minecraft:gunpowder> * 64,
        <minecraft:glowstone_dust> * 64,
        <minecraft:clay_ball> * 64,
        <minecraft:leather> * 64,
        <minecraft:slime_ball> * 64,
        <minecraft:bone> * 64,
        <minecraft:ender_pearl> * 16,
        <minecraft:blaze_rod> * 64,
        <minecraft:ghast_tear> * 64,
        <minecraft:emerald> * 64,
        <minecraft:nether_star> * 64,
        <minecraft:quartz> * 64,
        <appliedenergistics2:material> * 64,
        <appliedenergistics2:material:1> * 64,
        <appliedenergistics2:material:7> * 64,
        <minecraft:reeds> * 64,
        <astralsorcery:itemcraftingcomponent:1> * 64,
        <astralsorcery:itemcraftingcomponent> * 64,
        <gregtech:meta_dust:2> * 64,
        <gregtech:meta_dust:3> * 64,
        <gregtech:meta_dust:4> * 64,
        <gregtech:meta_dust:6> * 64,
        <gregtech:meta_dust:8> * 64,
        <gregtech:meta_dust:10> * 64,
        <gregtech:meta_dust:11> * 64,
        <gregtech:meta_dust:13> * 64
    ])
    .EUt(160000000)
    .duration(30)
    .buildAndRegister();

te_black_hole.recipeBuilder()
    .circuit(7)
    .notConsumable(<contenttweaker:precursor_database>)
    .fluidInputs(
        <liquid:wakfustasis> * 8
    )
    .outputs([
        <gregtech:meta_dust:15> * 64,
        <gregtech:meta_dust:16> * 64,
        <gregtech:meta_dust:18> * 64,
        <gregtech:meta_dust:19> * 64,
        <gregtech:meta_dust:20> * 64,
        <gregtech:meta_dust:22> * 64,
        <gregtech:meta_dust:23> * 64,
        <gregtech:meta_dust:25> * 64,
        <gregtech:meta_dust:27> * 64,
        <gregtech:meta_dust:33> * 64,
        <gregtech:meta_dust:39> * 64,
        <gregtech:meta_dust:41> * 64,
        <gregtech:meta_dust:48> * 64,
        <gregtech:meta_dust:50> * 64,
        <gregtech:meta_dust:51> * 64,
        <gregtech:meta_dust:53> * 64,
        <gregtech:meta_dust:55> * 64,
        <gregtech:meta_dust:56> * 64,
        <gregtech:meta_dust:58> * 64,
        <gregtech:meta_dust:59> * 64,
        <gregtech:meta_dust:61> * 64,
        <gregtech:meta_dust:64> * 64,
        <gregtech:meta_dust:66> * 64,
        <gregtech:meta_dust:69> * 64,
        <gregtech:meta_dust:71> * 64,
        <gregtech:meta_dust:75> * 64,
        <gregtech:meta_dust:77> * 64,
        <gregtech:meta_dust:78> * 64,
        <gregtech:meta_dust:80> * 64,
        <gregtech:meta_dust:81> * 64,
        <gregtech:meta_dust:82> * 64,
        <gregtech:meta_dust:83> * 64,
        <gregtech:meta_dust:90> * 64,
        <gregtech:meta_dust:93> * 64,
        <gregtech:meta_dust:95> * 64,
        <gregtech:meta_dust:99> * 64
    ])
    .EUt(160000000)
    .duration(30)
    .buildAndRegister();

te_black_hole.recipeBuilder()
    .circuit(8)
    .notConsumable(<contenttweaker:precursor_database>)
    .fluidInputs(
        <liquid:wakfustasis> * 8
    )
    .outputs([
        <gregtech:meta_dust:100> * 64,
        <gregtech:meta_dust:101> * 64,
        <gregtech:meta_dust:103> * 64,
        <gregtech:meta_dust:104> * 64,
        <gregtech:meta_dust:109> * 64,
        <gregtech:meta_dust:112> * 64,
        <gregtech:meta_dust:113> * 64,
        <gregtech:meta_dust:115> * 64,
        <gregtech:meta_dust:116> * 64,
        <gregtech:meta_dust:117> * 64, 
        <gregtech:meta_dust:118> * 64,
        <gregtech:meta_dust:121> * 64,
        <gregtech:meta_dust:122> * 64,
        <gregtech:meta_dust:124> * 64,
        <gregtech:meta_dust:125> * 64,
        <gregtech:meta_dust:126> * 64,
        <gregtech:meta_dust:127> * 64,
        <gregtech:meta_dust:128> * 64,
        <gregtech:meta_dust:129> * 64,
        <gregtech:meta_dust:130> * 64,
        <gregtech:meta_dust:214> * 64,
        <gregtech:meta_dust:250> * 64,
        <gregtech:meta_dust:251> * 64,
        <gregtech:meta_dust:1000> * 64,
        <gregtech:meta_dust:1004> * 64,
        <gregtech:meta_dust:1006> * 64,
        <gregtech:meta_dust:1007> * 64,
        <gregtech:meta_dust:1008> * 64,
        <gregtech:meta_dust:1010> * 64,
        <gregtech:meta_dust:1011> * 64,
        <gregtech:meta_dust:1012> * 64,
        <gregtech:meta_dust:1013> * 64,
        <gregtech:meta_dust:1015> * 64,
        <gregtech:meta_dust:1016> * 64,
        <gregtech:meta_dust:1068> * 64,
        <gregtech:meta_dust:1616> * 64
    ])
    .EUt(160000000)
    .duration(30)
    .buildAndRegister();

te_black_hole.recipeBuilder()
    .circuit(9)
    .notConsumable(<contenttweaker:precursor_database>)
    .fluidInputs(
        <liquid:wakfustasis> * 8
    )
    .outputs([
        <gregtech:meta_dust:32000> * 64,
        <gregtech:meta_dust:32001> * 64,
        <gregtech:meta_dust:32003> * 64,
        <gregtech:meta_dust:32004> * 64,
        <gregtech:meta_dust:32005> * 64,
        <gregtech:meta_dust:32006> * 64,
        <gregtech:meta_dust:32007> * 64,
        <gregtech:meta_gem:250> * 64,
        <gregtech:meta_gem:251> * 64,
        <gregtech:meta_gem:257> * 64,
        <gregtech:meta_gem:268> * 64,
        <gregtech:meta_gem:281> * 64,
        <gregtech:meta_gem:282> * 64,
        <gregtech:meta_gem:285> * 64,
        <gregtech:meta_gem:289> * 64,
        <gregtech:meta_gem:308> * 64,
        <gregtech:meta_gem:309> * 64,
        <gregtech:meta_gem:311> * 64,
        <gregtech:meta_gem:312> * 64,
        <gregtech:meta_gem:314> * 64,
        <gregtech:meta_gem:316> * 64,
        <gregtech:meta_gem:321> * 64,
        <gregtech:meta_gem:329> * 64,
        <gregtech:meta_gem:333> * 64,
        <gregtech:meta_gem:340> * 64,
        <gregtech:meta_gem:365> * 64,
        <gregtech:meta_gem:385> * 64,
        <gregtech:meta_gem:1017> * 64,
        <gregtech:meta_gem:2000> * 64,
        <gregtech:meta_gem:2004> * 64,
        <gregtech:meta_gem:2005> * 64,
        <gregtech:meta_gem:2006> * 64,
        <gregtech:meta_gem:2010> * 64,
        <gregtech:meta_gem:2016> * 64,
        <gregtech:meta_gem:2017> * 64,
        <gregtech:meta_gem:2029> * 64
    ])
    .EUt(160000000)
    .duration(30)
    .buildAndRegister();

te_black_hole.recipeBuilder()
    .circuit(10)
    .notConsumable(<contenttweaker:precursor_database>)
    .fluidInputs(
        <liquid:wakfustasis> * 8
    )
    .outputs([
        <projecte:item.pe_matter> * 64,
        <projecte:item.pe_matter:1> * 64,
        <minecraft:dye:4> * 64,
        <minecraft:redstone> * 64,
        <minecraft:dye> * 64,
        <minecraft:dye:1> * 64,
        <minecraft:dye:2> * 64,
        <minecraft:dye:3> * 64,
        <minecraft:dye:5> * 64,
        <minecraft:dye:6> * 64,
        <minecraft:dye:7> * 64,
        <minecraft:dye:8> * 64,
        <minecraft:dye:9> * 64,
        <minecraft:dye:10> * 64,
        <minecraft:dye:11> * 64,
        <minecraft:dye:12> * 64,
        <minecraft:dye:13> * 64,
        <minecraft:dye:14> * 64,
        <gregtech:meta_dust:341> * 64
    ])
    .EUt(160000000)
    .duration(30)
    .buildAndRegister();