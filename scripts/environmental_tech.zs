import crafttweaker.item.IIngredient;
import mods.gregtech.recipe.RecipeMap;
import crafttweaker.item.IItemStack;

//Void Ore Miner

recipes.removeByRecipeName("environmentaltech:m_multiblocks/m_void/m_ore/void_ore_miner_cont_1");
recipes.removeByRecipeName("environmentaltech:m_multiblocks/m_void/m_ore/void_ore_miner_cont_2");
recipes.removeByRecipeName("environmentaltech:m_multiblocks/m_void/m_ore/void_ore_miner_cont_3");
recipes.removeByRecipeName("environmentaltech:m_multiblocks/m_void/m_ore/void_ore_miner_cont_4");
recipes.removeByRecipeName("environmentaltech:m_multiblocks/m_void/m_ore/void_ore_miner_cont_5");
recipes.removeByRecipeName("environmentaltech:m_multiblocks/m_void/m_ore/void_ore_miner_cont_6");
recipes.removeByRecipeName("environmentaltech:m_multiblocks/m_components/m_structurepanel/structure_panel");
recipes.removeByRecipeName("environmentaltech:m_multiblocks/connector");
recipes.removeByRecipeName("environmentaltech:m_multiblocks/m_components/m_modifiers/modifier_null");
recipes.removeByRecipeName("environmentaltech:m_multiblocks/m_void/modifier_accuracy");
recipes.removeByRecipeName("environmentaltech:m_multiblocks/m_solar/modifire_piezo");
recipes.removeByRecipeName("environmentaltech:m_multiblocks/m_nanobot/modifier_water_breathing");
recipes.removeByRecipeName("environmentaltech:m_multiblocks/m_nanobot/modifier_strength");
recipes.removeByRecipeName("environmentaltech:m_multiblocks/m_nanobot/modifier_saturation");
recipes.removeByRecipeName("environmentaltech:m_multiblocks/m_nanobot/modifier_resistance");
recipes.removeByRecipeName("environmentaltech:m_multiblocks/m_nanobot/modifier_fire_resistance");
recipes.removeByRecipeName("environmentaltech:m_multiblocks/m_nanobot/modifier_regeneration");
recipes.removeByRecipeName("environmentaltech:m_multiblocks/m_nanobot/modifier_night_vision");
recipes.removeByRecipeName("environmentaltech:m_multiblocks/m_nanobot/modifier_luck");
recipes.removeByRecipeName("environmentaltech:m_multiblocks/m_nanobot/modifier_jump_boost");
recipes.removeByRecipeName("environmentaltech:m_multiblocks/m_nanobot/modifier_invisibility");
recipes.removeByRecipeName("environmentaltech:m_multiblocks/m_nanobot/modifier_health_boost");
recipes.removeByRecipeName("environmentaltech:m_multiblocks/m_nanobot/modifier_haste");
recipes.removeByRecipeName("environmentaltech:m_multiblocks/m_nanobot/modifier_glowing");
recipes.removeByRecipeName("environmentaltech:m_multiblocks/m_nanobot/modifier_flight_speed");
recipes.removeByRecipeName("environmentaltech:m_multiblocks/m_nanobot/modifier_creative_flight");
recipes.removeByRecipeName("environmentaltech:m_multiblocks/m_components/m_structureframe/structure_frame_1");
recipes.removeByRecipeName("environmentaltech:m_multiblocks/m_components/m_structureframe/structure_frame_2");
recipes.removeByRecipeName("environmentaltech:m_multiblocks/m_components/m_structureframe/structure_frame_3");
recipes.removeByRecipeName("environmentaltech:m_multiblocks/m_components/m_structureframe/structure_frame_4");
recipes.removeByRecipeName("environmentaltech:m_multiblocks/m_components/m_structureframe/structure_frame_5");
recipes.removeByRecipeName("environmentaltech:m_multiblocks/m_components/m_structureframe/structure_frame_6");



assembler.recipeBuilder()
    .inputs([
        <industrialforegoing:laser_base> * 1,
        <ore:circuitEv> * 4,
        <ore:craftingLensRed> * 1,
        <gregtech:meta_item_1:220> * 2,
        <gregtech:meta_item_1:235> * 2
    ])
    .fluidInputs(<liquid:nitrogen> * 12000)
    .outputs(<environmentaltech:void_ore_miner_cont_1> * 1)
    .EUt(1024)
    .duration(3000)
    .buildAndRegister();

assembler.recipeBuilder()
    .inputs([
        <environmentaltech:void_ore_miner_cont_1> * 1,
        <ore:circuitIv> * 4,
        <ore:craftingLensRed> * 1,
        <gregtech:meta_item_1:221> * 2,
        <gregtech:meta_item_1:236> * 2
    ])
    .fluidInputs(<liquid:liquid_helium> * 12000)
    .outputs(<environmentaltech:void_ore_miner_cont_2> * 1)
    .EUt(4096)
    .duration(4000)
    .buildAndRegister();

assembler.recipeBuilder()
    .inputs([
        <environmentaltech:void_ore_miner_cont_2> * 1,
        <ore:circuitLuv> * 4,
        <ore:craftingLensRed> * 1,
        <gregtech:meta_item_1:222> * 2,
        <gregtech:meta_item_1:237> * 2
    ])
    .fluidInputs(<liquid:liquid_helium> * 12000)
    .outputs(<environmentaltech:void_ore_miner_cont_3> * 1)
    .EUt(16384)
    .duration(4000)
    .buildAndRegister();

assembler.recipeBuilder()
    .inputs([
        <environmentaltech:void_ore_miner_cont_3> * 1,
        <ore:circuitZpm> * 4,
        <ore:craftingLensRed> * 1,
        <gregtech:meta_item_1:223> * 2,
        <gregtech:meta_item_1:238> * 2
    ])
    .fluidInputs(<liquid:liquid_helium> * 12000)
    .outputs(<environmentaltech:void_ore_miner_cont_4> * 1)
    .EUt(65536)
    .duration(4000)
    .buildAndRegister();

assembler.recipeBuilder()
    .inputs([
        <environmentaltech:void_ore_miner_cont_4> * 1,
        <ore:circuitUv> * 4,
        <ore:craftingLensRed> * 1,
        <gregtech:meta_item_1:224> * 2,
        <gregtech:meta_item_1:239> * 2
    ])
    .fluidInputs(<liquid:liquid_helium> * 12000)
    .outputs(<environmentaltech:void_ore_miner_cont_5> * 1)
    .EUt(262144)
    .duration(4000)
    .buildAndRegister();

assembler.recipeBuilder()
    .inputs([
        <environmentaltech:void_ore_miner_cont_5> * 1,
        <ore:circuitUhv> * 4,
        <ore:craftingLensRed> * 1,
        <gregtech:meta_item_1:225> * 2,
        <gregtech:meta_item_1:240> * 2
    ])
    .fluidInputs(<liquid:liquid_helium> * 12000)
    .outputs(<environmentaltech:void_ore_miner_cont_6> * 1)
    .EUt(1048576)
    .duration(4000)
    .buildAndRegister();

//Connector
circuit_assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:735> * 1,
        <ore:circuitLv> * 1,
        <gregtech:meta_wire_fine:2517> * 6
    ])
    .fluidInputs(<liquid:soldering_alloy> * 144)
    .outputs(<environmentaltech:connector> * 2)
    .EUt(24)
    .duration(300)
    .buildAndRegister();

//Structure Panel
assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_block_frame_0:2> * 1,
        <environmentaltech:connector> * 4,
        <gregtech:meta_plate:41> * 4,
        <gregtech:meta_screw:324> * 16
    ])
    .outputs(<environmentaltech:structure_panel> * 1)
    .EUt(32)
    .duration(400)
    .buildAndRegister();

//Nul Modifier
assembler.recipeBuilder()
    .inputs([
        <gregtech:meta_block_frame_0:2> * 1,
        <gregtech:meta_plate:51> * 4,
        <gregtech:transparent_casing> * 4,
        <gregtech:meta_screw:324> * 16
    ])
    .outputs(<environmentaltech:modifier_null> * 1)
    .EUt(128)
    .duration(600)
    .buildAndRegister();

//Accuracy Modifier
assembler.recipeBuilder()
    .inputs([
        <environmentaltech:modifier_null> * 1,
        <ore:circuitMv> * 4,
        <gregtech:meta_wire_fine:2517> * 32
    ])
    .outputs(<environmentaltech:modifier_accuracy> * 1)
    .EUt(128)
    .duration(100)
    .buildAndRegister();

//Piezo Modifier
assembler.recipeBuilder()
    .inputs([
        <environmentaltech:modifier_null> * 1,
        <ore:circuitMv> * 4,
        <gregtech:meta_gem_exquisite:214> * 6
    ])
    .outputs(<environmentaltech:modifier_piezo> * 1)
    .EUt(128)
    .duration(100)
    .buildAndRegister();

//Water Breathing Modifier
assembler.recipeBuilder()
    .inputs([
        <environmentaltech:modifier_null> * 1,
        <gregtech:meta_rotor:323> * 1,
        <gregtech:fluid_pipe_small:1012> * 4,
        <gregtech:meta_item_1:78> * 4
    ])
    .outputs(<environmentaltech:modifier_water_breathing> * 1)
    .EUt(128)
    .duration(100)
    .buildAndRegister();

//Strength Modifier
assembler.recipeBuilder()
    .inputs([
        <environmentaltech:modifier_null> * 1,
        <gregtech:meta_tool_head_buzz_saw:2> * 4
    ])
    .outputs(<environmentaltech:modifier_strength> * 1)
    .EUt(128)
    .duration(100)
    .buildAndRegister();

//Saturation Modifier
assembler.recipeBuilder()
    .inputs([
        <environmentaltech:modifier_null> * 1,
        <forestry:royal_jelly> * 16
    ])
    .outputs(<environmentaltech:modifier_saturation> * 1)
    .EUt(128)
    .duration(100)
    .buildAndRegister();

//Resistance Modifier
assembler.recipeBuilder()
    .inputs([
        <environmentaltech:modifier_null> * 1,
        <gregtech:meta_item_1:203> * 8
    ])
    .outputs(<environmentaltech:modifier_resistance> * 1)
    .EUt(128)
    .duration(100)
    .buildAndRegister();

//Fire Resistance Modifier
assembler.recipeBuilder()
    .inputs([
        <environmentaltech:modifier_null> * 1,
        <gregtech:meta_plate_double:287> * 8
    ])
    .outputs(<environmentaltech:modifier_fire_resistance> * 1)
    .EUt(128)
    .duration(100)
    .buildAndRegister();

//Regeneration Modifier
assembler.recipeBuilder()
    .inputs([
        <environmentaltech:modifier_null> * 1,
        <gregtech:meta_item_1:218> * 8
    ])
    .outputs(<environmentaltech:modifier_regeneration> * 1)
    .EUt(128)
    .duration(100)
    .buildAndRegister();

//Night Vision Modifier
assembler.recipeBuilder()
    .inputs([
        <environmentaltech:modifier_null> * 1,
        <enderio:block_electric_light> * 4
    ])
    .outputs(<environmentaltech:modifier_night_vision> * 1)
    .EUt(128)
    .duration(100)
    .buildAndRegister();

//Luck Modifier
assembler.recipeBuilder()
    .inputs([
        <environmentaltech:modifier_null> * 1,
        <minecraft:enchanting_table> * 4
    ])
    .outputs(<environmentaltech:modifier_luck> * 1)
    .EUt(128)
    .duration(100)
    .buildAndRegister();

//Jump Boost Modifier
assembler.recipeBuilder()
    .inputs([
        <environmentaltech:modifier_null> * 1,
        <gregtech:meta_item_1:173> * 4
    ])
    .outputs(<environmentaltech:modifier_jump_boost> * 1)
    .EUt(128)
    .duration(100)
    .buildAndRegister();

//Invisibility Modifier
assembler.recipeBuilder()
    .inputs([
        <environmentaltech:modifier_null> * 1,
        <gregtech:meta_item_1:282> * 4
    ])
    .outputs(<environmentaltech:modifier_invisibility> * 1)
    .EUt(128)
    .duration(100)
    .buildAndRegister();

//Health Boost Modifier
assembler.recipeBuilder()
    .inputs([
        <environmentaltech:modifier_null> * 1,
        <minecraft:golden_apple:1> * 4
    ])
    .outputs(<environmentaltech:modifier_health_boost> * 1)
    .EUt(128)
    .duration(100)
    .buildAndRegister();

//Haste Modifier
assembler.recipeBuilder()
    .inputs([
        <environmentaltech:modifier_null> * 1,
        <minecraft:glowstone_dust> * 4
    ])
    .outputs(<environmentaltech:modifier_haste> * 1)
    .EUt(128)
    .duration(100)
    .buildAndRegister();

//Glowing Modifier
assembler.recipeBuilder()
    .inputs([
        <environmentaltech:modifier_null> * 1,
        <gregtech:meta_plate:1601> * 4
    ])
    .outputs(<environmentaltech:modifier_glowing> * 1)
    .EUt(128)
    .duration(100)
    .buildAndRegister();

//Flight Speed Modifier
assembler.recipeBuilder()
    .inputs([
        <environmentaltech:modifier_null> * 1,
        <gregtech:meta_item_1:128> * 4
    ])
    .outputs(<environmentaltech:modifier_flight_speed> * 1)
    .EUt(128)
    .duration(100)
    .buildAndRegister();

//Creative Flight Modifier
assembler.recipeBuilder()
    .inputs([
        <environmentaltech:modifier_null> * 1,
        <projecte:item.pe_swrg> * 1
    ])
    .outputs(<environmentaltech:modifier_creative_flight> * 1)
    .EUt(128)
    .duration(100)
    .buildAndRegister();

//Creative Flight Modifier
assembler.recipeBuilder()
    .inputs([
        <environmentaltech:modifier_null> * 1,
        <gregtech:meta_item_1:233> * 4
    ])
    .outputs(<environmentaltech:modifier_speed> * 1)
    .EUt(128)
    .duration(100)
    .buildAndRegister();

//Structure Frame Tier 1
assembler.recipeBuilder()
    .inputs([
        <gregtech:wire_coil:1> * 1,
        <gregtech:meta_screw:323> * 16,
        <gregtech:meta_item_1:204> * 4
    ])
    .outputs(<environmentaltech:structure_frame_1> * 1)
    .EUt(128)
    .duration(200)
    .buildAndRegister();

//Structure Frame Tier 2
assembler.recipeBuilder()
    .inputs([
        <gregtech:wire_coil:2> * 1,
        <gregtech:meta_screw:113> * 16,
        <gregtech:meta_item_1:205> * 4
    ])
    .outputs(<environmentaltech:structure_frame_2> * 1)
    .EUt(512)
    .duration(200)
    .buildAndRegister();

//Structure Frame Tier 3
assembler.recipeBuilder()
    .inputs([
        <gregtech:wire_coil:3> * 1,
        <gregtech:meta_screw:22> * 16,
        <gregtech:meta_item_1:206> * 4
    ])
    .outputs(<environmentaltech:structure_frame_3> * 1)
    .EUt(2048)
    .duration(200)
    .buildAndRegister();

//Structure Frame Tier 4
assembler.recipeBuilder()
    .inputs([
        <gregtech:wire_coil:4> * 1,
        <gregtech:meta_screw:115> * 16,
        <gregtech:meta_item_1:207> * 4
    ])
    .outputs(<environmentaltech:structure_frame_4> * 1)
    .EUt(8192)
    .duration(200)
    .buildAndRegister();

//Structure Frame Tier 5
assembler.recipeBuilder()
    .inputs([
        <gregtech:wire_coil:5> * 1,
        <gregtech:meta_screw:2013> * 16,
        <gregtech:meta_item_1:208> * 4
    ])
    .outputs(<environmentaltech:structure_frame_5> * 1)
    .EUt(32768)
    .duration(200)
    .buildAndRegister();

//Structure Frame Tier 6
assembler.recipeBuilder()
    .inputs([
        <gregtech:wire_coil:6> * 1,
        <gregtech:meta_screw:396> * 16,
        <gregtech:meta_item_1:209> * 4
    ])
    .outputs(<environmentaltech:structure_frame_6> * 1)
    .EUt(131072)
    .duration(200)
    .buildAndRegister();