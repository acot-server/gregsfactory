import avaritia.*
import gregtech.*


def blast_furnace = recipemap('electric_blast_furnace');
def cutter = recipemap('cutter');
def laser_engraver = recipemap('laser_engraver');

blast_furnace.recipeBuilder()
    .inputs(
        item('gregtech:meta_block_compressed_6', 3) * 16,
        ore('ingotWakfu') * 4
    )
    .fluidInputs(fluid('fluorine') * 2000)
    .outputs(metaitem('boule.wakfu') * 1)
    .property('temperature', 2400)
    .EUt(480)
    .duration(6000)
    .buildAndRegister();

cutter.recipeBuilder()
    .inputs(metaitem('boule.wakfu') * 1)
    .outputs(metaitem('wafer.wakfu') * 32)
    .EUt(120)
    .duration(6000)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.wakfu') * 1)
    .notConsumable(ore('craftingLensLightBlue'))
    .outputs(metaitem('wafer.central_processing_unit') * 6)
    .EUt(120)
    .duration(300)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.wakfu') * 1)
    .notConsumable(ore('craftingLensGreen'))
    .outputs(metaitem('wafer.random_access_memory') * 6)
    .EUt(120)
    .duration(300)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.wakfu') * 1)
    .notConsumable(ore('craftingLensRed'))
    .outputs(metaitem('wafer.integrated_logic_circuit') * 6)
    .EUt(120)
    .duration(300)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.wakfu') * 1)
    .notConsumable(ore('craftingLensMagenta'))
    .outputs(metaitem('wafer.nano_central_processing_unit') * 2)
    .EUt(1920)
    .duration(300)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.wakfu') * 1)
    .notConsumable(ore('craftingLensCyan'))
    .outputs(metaitem('wafer.simple_system_on_chip') * 6)
    .EUt(120)
    .duration(300)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.wakfu') * 1)
    .notConsumable(ore('craftingLensBlue'))
    .outputs(metaitem('wafer.ultra_low_power_integrated_circuit') * 6)
    .EUt(120)
    .duration(300)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.wakfu') * 1)
    .notConsumable(ore('craftingLensOrange'))
    .outputs(metaitem('wafer.low_power_integrated_circuit') * 6)
    .EUt(120)
    .duration(300)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.wakfu') * 1)
    .notConsumable(ore('craftingLensYellow'))
    .outputs(metaitem('wafer.system_on_chip') * 3)
    .EUt(480)
    .duration(900)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.wakfu') * 1)
    .notConsumable(ore('craftingLensGray'))
    .outputs(metaitem('wafer.nand_memory_chip') * 3)
    .EUt(480)
    .duration(900)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.wakfu') * 1)
    .notConsumable(ore('craftingLensPink'))
    .outputs(metaitem('wafer.nor_memory_chip') * 3)
    .EUt(480)
    .duration(900)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.wakfu') * 1)
    .notConsumable(ore('craftingLensBrown'))
    .outputs(metaitem('wafer.power_integrated_circuit') * 3)
    .EUt(480)
    .duration(900)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.wakfu') * 1)
    .notConsumable(ore('craftingLensBrown'))
    .outputs(metaitem('wafer.power_integrated_circuit') * 3)
    .EUt(480)
    .duration(900)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.wakfu') * 1)
    .notConsumable(ore('craftingLensLime'))
    .outputs(metaitem('wafer.high_power_integrated_circuit') * 1)
    .EUt(480)
    .duration(900)
    .buildAndRegister();


//Stasis

blast_furnace.recipeBuilder()
    .inputs(
        item('gregtech:meta_block_compressed_6', 3) * 16,
        ore('ingotStasis') * 4
    )
    .fluidInputs(fluid('wakfu') * 2000)
    .outputs(metaitem('boule.stasis') * 1)
    .property('temperature', 5800)
    .EUt(30720)
    .duration(6000)
    .buildAndRegister();

cutter.recipeBuilder()
    .inputs(metaitem('boule.stasis') * 1)
    .outputs(metaitem('wafer.stasis') * 64)
    .EUt(1920)
    .duration(6000)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.stasis') * 1)
    .notConsumable(ore('craftingLensLightBlue'))
    .outputs(metaitem('wafer.central_processing_unit') * 12)
    .EUt(1920)
    .duration(100)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.stasis') * 1)
    .notConsumable(ore('craftingLensGreen'))
    .outputs(metaitem('wafer.random_access_memory') * 12)
    .EUt(1920)
    .duration(100)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.stasis') * 1)
    .notConsumable(ore('craftingLensRed'))
    .outputs(metaitem('wafer.integrated_logic_circuit') * 12)
    .EUt(1920)
    .duration(100)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.stasis') * 1)
    .notConsumable(ore('craftingLensMagenta'))
    .outputs(metaitem('wafer.nano_central_processing_unit') * 4)
    .EUt(7680)
    .duration(100)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.stasis') * 1)
    .notConsumable(ore('craftingLensWhite'))
    .outputs(metaitem('wafer.qbit_central_processing_unit') * 4)
    .EUt(30720)
    .duration(100)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.stasis') * 1)
    .notConsumable(ore('craftingLensCyan'))
    .outputs(metaitem('wafer.simple_system_on_chip') * 12)
    .EUt(1920)
    .duration(100)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.stasis') * 1)
    .notConsumable(ore('craftingLensBlue'))
    .outputs(metaitem('wafer.ultra_low_power_integrated_circuit') * 12)
    .EUt(1920)
    .duration(100)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.stasis') * 1)
    .notConsumable(ore('craftingLensOrange'))
    .outputs(metaitem('wafer.low_power_integrated_circuit') * 12)
    .EUt(1920)
    .duration(100)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.stasis') * 1)
    .notConsumable(ore('craftingLensYellow'))
    .outputs(metaitem('wafer.system_on_chip') * 6)
    .EUt(1920)
    .duration(300)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.stasis') * 1)
    .notConsumable(ore('craftingLensPurple'))
    .outputs(metaitem('wafer.advanced_system_on_chip') * 2)
    .EUt(1920)
    .duration(300)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.stasis') * 1)
    .notConsumable(ore('craftingLensGray'))
    .outputs(metaitem('wafer.nand_memory_chip') * 6)
    .EUt(1920)
    .duration(300)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.stasis') * 1)
    .notConsumable(ore('craftingLensPink'))
    .outputs(metaitem('wafer.nor_memory_chip') * 6)
    .EUt(1920)
    .duration(300)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.stasis') * 1)
    .notConsumable(ore('craftingLensBrown'))
    .outputs(metaitem('wafer.power_integrated_circuit') * 6)
    .EUt(1920)
    .duration(300)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.stasis') * 1)
    .notConsumable(ore('craftingLensBrown'))
    .outputs(metaitem('wafer.power_integrated_circuit') * 6)
    .EUt(1920)
    .duration(300)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.stasis') * 1)
    .notConsumable(ore('craftingLensLime'))
    .outputs(metaitem('wafer.high_power_integrated_circuit') * 2)
    .EUt(1920)
    .duration(300)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.stasis') * 1)
    .notConsumable(ore('craftingLensLightGray'))
    .outputs(metaitem('wafer.ultra_high_power_integrated_circuit') * 2)
    .EUt(30720)
    .duration(300)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.stasis') * 1)
    .notConsumable(item('astralsorcery:itemcoloredlens', 3))
    .outputs(metaitem('wafer.extreme_high_power_integrated_circuit') * 4)
    .EUt(122880)
    .duration(300)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.stasis') * 1)
    .notConsumable(item('astralsorcery:itemcoloredlens'))
    .outputs(metaitem('wafer.ultimate_high_power_integrated_circuit') * 1)
    .EUt(491520)
    .duration(300)
    .buildAndRegister();


//Krosmoz

blast_furnace.recipeBuilder()
    .inputs(
        item('gregtech:meta_block_compressed_6', 3) * 64,
        ore('ingotWakfustasis') * 4
    )
    .fluidInputs(fluid('neutronium') * 2000)
    .outputs(metaitem('boule.krosmoz') * 1)
    .property('temperature', 15000)
    .EUt(1966080)
    .duration(6000)
    .buildAndRegister();

cutter.recipeBuilder()
    .inputs(metaitem('boule.krosmoz') * 1)
    .outputs(
        metaitem('wafer.krosmoz') * 64,
        metaitem('wafer.krosmoz') * 64
    )
    .EUt(1966080)
    .duration(6000)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.krosmoz') * 1)
    .notConsumable(ore('craftingLensLightBlue'))
    .outputs(metaitem('wafer.central_processing_unit') * 64)
    .EUt(1966080)
    .duration(100)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.krosmoz') * 1)
    .notConsumable(ore('craftingLensGreen'))
    .outputs(metaitem('wafer.random_access_memory') * 64)
    .EUt(1966080)
    .duration(100)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.krosmoz') * 1)
    .notConsumable(ore('craftingLensRed'))
    .outputs(metaitem('wafer.integrated_logic_circuit') * 64)
    .EUt(1966080)
    .duration(100)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.krosmoz') * 1)
    .notConsumable(ore('craftingLensMagenta'))
    .outputs(metaitem('wafer.nano_central_processing_unit') * 64)
    .EUt(1966080)
    .duration(100)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.krosmoz') * 1)
    .notConsumable(ore('craftingLensWhite'))
    .outputs(metaitem('wafer.qbit_central_processing_unit') * 64)
    .EUt(1966080)
    .duration(100)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.krosmoz') * 1)
    .notConsumable(ore('craftingLensCyan'))
    .outputs(metaitem('wafer.simple_system_on_chip') * 64)
    .EUt(1966080)
    .duration(100)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.krosmoz') * 1)
    .notConsumable(ore('craftingLensBlue'))
    .outputs(metaitem('wafer.ultra_low_power_integrated_circuit') * 64)
    .EUt(1966080)
    .duration(100)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.krosmoz') * 1)
    .notConsumable(ore('craftingLensOrange'))
    .outputs(metaitem('wafer.low_power_integrated_circuit') * 64)
    .EUt(1966080)
    .duration(100)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.krosmoz') * 1)
    .notConsumable(ore('craftingLensYellow'))
    .outputs(metaitem('wafer.system_on_chip') * 64)
    .EUt(1966080)
    .duration(300)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.krosmoz') * 1)
    .notConsumable(ore('craftingLensPurple'))
    .outputs(metaitem('wafer.advanced_system_on_chip') * 64)
    .EUt(1966080)
    .duration(300)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.krosmoz') * 1)
    .notConsumable(ore('craftingLensBlack'))
    .outputs(metaitem('wafer.highly_advanced_system_on_chip') * 64)
    .EUt(1966080)
    .duration(300)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.krosmoz') * 1)
    .notConsumable(ore('craftingLensGray'))
    .outputs(metaitem('wafer.nand_memory_chip') * 64)
    .EUt(1966080)
    .duration(300)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.krosmoz') * 1)
    .notConsumable(ore('craftingLensPink'))
    .outputs(metaitem('wafer.nor_memory_chip') * 64)
    .EUt(1966080)
    .duration(300)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.krosmoz') * 1)
    .notConsumable(ore('craftingLensBrown'))
    .outputs(metaitem('wafer.power_integrated_circuit') * 64)
    .EUt(1966080)
    .duration(300)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.krosmoz') * 1)
    .notConsumable(ore('craftingLensBrown'))
    .outputs(metaitem('wafer.power_integrated_circuit') * 64)
    .EUt(1966080)
    .duration(300)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.krosmoz') * 1)
    .notConsumable(ore('craftingLensLime'))
    .outputs(metaitem('wafer.high_power_integrated_circuit') * 64)
    .EUt(1966080)
    .duration(300)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.krosmoz') * 1)
    .notConsumable(ore('craftingLensLightGray'))
    .outputs(metaitem('wafer.ultra_high_power_integrated_circuit') * 64)
    .EUt(1966080)
    .duration(300)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.krosmoz') * 1)
    .notConsumable(item('astralsorcery:itemcoloredlens', 3))
    .outputs(metaitem('wafer.extreme_high_power_integrated_circuit') * 64)
    .EUt(1966080)
    .duration(300)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.krosmoz') * 1)
    .notConsumable(item('astralsorcery:itemcoloredlens'))
    .outputs(metaitem('wafer.ultimate_high_power_integrated_circuit') * 64)
    .EUt(1966080)
    .duration(300)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(metaitem('wafer.krosmoz') * 1)
    .notConsumable(item('astralsorcery:itemcoloredlens', 6))
    .outputs(metaitem('wafer.infinity_high_power_integrated_circuit') * 64)
    .EUt(1966080)
    .duration(300)
    .buildAndRegister();

cutter.recipeBuilder()
    .inputs(metaitem('wafer.extreme_high_power_integrated_circuit') * 1)
    .outputs(metaitem('plate.extreme_high_power_integrated_circuit') * 16)
    .EUt(122880)
    .duration(6000)
    .buildAndRegister();

cutter.recipeBuilder()
    .inputs(metaitem('wafer.ultimate_high_power_integrated_circuit') * 1)
    .outputs(metaitem('plate.ultimate_high_power_integrated_circuit') * 16)
    .EUt(491520)
    .duration(6000)
    .buildAndRegister();

cutter.recipeBuilder()
    .inputs(metaitem('wafer.infinity_high_power_integrated_circuit') * 1)
    .outputs(metaitem('plate.infinity_high_power_integrated_circuit') * 16)
    .EUt(1966080)
    .duration(6000)
    .buildAndRegister();

