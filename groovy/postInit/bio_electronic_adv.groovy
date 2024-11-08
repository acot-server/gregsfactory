import gregtech.*;

def circuit_assembler = recipemap('circuit_assembler')
def laser_engraver = recipemap('laser_engraver')

circuit_assembler.recipeBuilder()
    .inputs(
        metaitem('board.multilayer.fiber_reinforced') * 16,
        metaitem('electric.pump.iv') * 4,
        metaitem('pipeTinyFluidAwaknedDraconium') * 32,
        ore('circuitEv') * 8
    )
    .fluidInputs(fluid('wakfu') * 576)
    .outputs(metaitem('board.psionic') * 16)
    .EUt(1920)
    .duration(200)
    .buildAndRegister();

laser_engraver.recipeBuilder()
    .inputs(
        metaitem('board.psionic') * 1,
        ore('wireFineWakfu') * 16
    )
    .outputs(metaitem('circuit_board_psionic') * 1)
    .EUt(1920)
    .duration(200)
    .buildAndRegister();

circuit_assembler.recipeBuilder()
    .inputs(
        metaitem('circuit_board_psionic') * 4,
        metaitem('plate.integrated_logic_circuit') * 4,
        ore('componentTransistor') * 16,
        ore('componentResistor') * 24,
        ore('componentCapacitor') * 8,
        ore('componentDiode') * 12
    )
    .fluidInputs(fluid('wakfu') * 288)
    .outputs(metaitem('circuit.pregoc_lv') * 16)
    .EUt(120)
    .duration(20)
    .buildAndRegister();

circuit_assembler.recipeBuilder()
    .inputs(
        metaitem('circuit_board_psionic') * 4,
        ore('circuitLv') * 4,
        ore('componentTransistor') * 16,
        ore('componentResistor') * 24,
        ore('componentCapacitor') * 8,
        ore('componentDiode') * 12
    )
    .fluidInputs(fluid('wakfu') * 288)
    .outputs(metaitem('circuit.pregoc_mv') * 16)
    .EUt(480)
    .duration(20)
    .buildAndRegister();

circuit_assembler.recipeBuilder()
    .inputs(
        metaitem('circuit_board_psionic') * 4,
        ore('circuitMv') * 4,
        ore('componentTransistor') * 16,
        ore('componentResistor') * 24,
        ore('componentCapacitor') * 8,
        ore('componentDiode') * 12
    )
    .fluidInputs(fluid('wakfu') * 288)
    .outputs(metaitem('circuit.pregoc_hv') * 16)
    .EUt(1920)
    .duration(20)
    .buildAndRegister();

circuit_assembler.recipeBuilder()
    .inputs(
        metaitem('circuit_board_psionic') * 4,
        ore('circuitHv') * 4,
        ore('componentTransistor') * 16,
        ore('componentResistor') * 24,
        ore('componentCapacitor') * 8,
        ore('componentDiode') * 12
    )
    .fluidInputs(fluid('wakfu') * 288)
    .outputs(metaitem('circuit.pregoc_ev') * 16)
    .EUt(7680)
    .duration(20)
    .buildAndRegister();

circuit_assembler.recipeBuilder()
    .inputs(
        metaitem('circuit_board_psionic') * 4,
        ore('circuitEv') * 4,
        ore('componentTransistor') * 16,
        ore('componentResistor') * 24,
        ore('componentCapacitor') * 8,
        ore('componentDiode') * 12
    )
    .fluidInputs(fluid('wakfu') * 288)
    .outputs(metaitem('circuit.pregoc_iv') * 16)
    .EUt(30720)
    .duration(20)
    .buildAndRegister();

circuit_assembler.recipeBuilder()
    .inputs(
        metaitem('circuit_board_psionic') * 4,
        metaitem('plate.system_on_chip') * 8,
        metaitem('component.advanced_smd.transistor') * 16,
        metaitem('component.advanced_smd.resistor') * 24,
        metaitem('component.advanced_smd.capacitor') * 8,
        metaitem('component.advanced_smd.diode') * 12
    )
    .fluidInputs(fluid('wakfu') * 288)
    .outputs(metaitem('circuit.pregoc_luv') * 24)
    .EUt(122880)
    .duration(20)
    .buildAndRegister();

circuit_assembler.recipeBuilder()
    .inputs(
        metaitem('circuit_board_psionic') * 4,
        ore('circuitLuv') * 8,
        metaitem('component.advanced_smd.transistor') * 16,
        metaitem('component.advanced_smd.resistor') * 24,
        metaitem('component.advanced_smd.capacitor') * 8,
        metaitem('component.advanced_smd.diode') * 12
    )
    .fluidInputs(fluid('wakfu') * 288)
    .outputs(metaitem('circuit.pregoc_zpm') * 24)
    .EUt(491520)
    .duration(20)
    .buildAndRegister();

circuit_assembler.recipeBuilder()
    .inputs(
        metaitem('circuit_board_psionic') * 4,
        ore('circuitZpm') * 8,
        metaitem('component.advanced_smd.transistor') * 16,
        metaitem('component.advanced_smd.resistor') * 24,
        metaitem('component.advanced_smd.capacitor') * 8,
        metaitem('component.advanced_smd.diode') * 12
    )
    .fluidInputs(fluid('wakfu') * 288)
    .outputs(metaitem('circuit.pregoc_uv') * 24)
    .EUt(1966080)
    .duration(20)
    .buildAndRegister();

circuit_assembler.recipeBuilder()
    .inputs(
        metaitem('circuit_board_psionic') * 4,
        ore('circuitUv') * 4,
        metaitem('plate.advanced_system_on_chip') * 12,
        metaitem('plate.extreme_high_power_integrated_circuit') * 32
    )
    .fluidInputs(fluid('wakfu') * 288)
    .outputs(metaitem('circuit.pregoc_uhv') * 32)
    .EUt(7864320)
    .duration(20)
    .buildAndRegister();

circuit_assembler.recipeBuilder()
    .inputs(
        metaitem('circuit_board_psionic') * 4,
        ore('circuitUhv') * 4,
        metaitem('plate.advanced_system_on_chip') * 12,
        metaitem('plate.extreme_high_power_integrated_circuit') * 32
    )
    .fluidInputs(fluid('wakfu') * 288)
    .outputs(metaitem('circuit.pregoc_uev') * 32)
    .EUt(31457280)
    .duration(20)
    .buildAndRegister();

circuit_assembler.recipeBuilder()
    .inputs(
        metaitem('circuit_board_psionic') * 4,
        ore('circuitUev') * 4,
        metaitem('plate.highly_advanced_system_on_chip') * 8,
        metaitem('plate.extreme_high_power_integrated_circuit') * 16,
        metaitem('plate.ultimate_high_power_integrated_circuit') * 8
    )
    .fluidInputs(fluid('wakfu') * 288)
    .outputs(metaitem('circuit.pregoc_uiv') * 40)
    .EUt(125829120)
    .duration(20)
    .buildAndRegister();

circuit_assembler.recipeBuilder()
    .inputs(
        metaitem('circuit_board_psionic') * 4,
        ore('circuitUiv') * 4,
        metaitem('plate.highly_advanced_system_on_chip') * 8,
        metaitem('plate.extreme_high_power_integrated_circuit') * 16,
        metaitem('plate.ultimate_high_power_integrated_circuit') * 8
    )
    .fluidInputs(fluid('wakfu') * 288)
    .outputs(metaitem('circuit.pregoc_uxv') * 40)
    .EUt(503316480)
    .duration(20)
    .buildAndRegister();

circuit_assembler.recipeBuilder()
    .inputs(
        metaitem('circuit_board_psionic') * 4,
        ore('circuitUxv') * 4,
        metaitem('plate.highly_advanced_system_on_chip') * 8,
        metaitem('plate.extreme_high_power_integrated_circuit') * 16,
        metaitem('plate.ultimate_high_power_integrated_circuit') * 8,
        metaitem('plate.infinity_high_power_integrated_circuit') * 4
    )
    .fluidInputs(fluid('wakfu') * 288)
    .outputs(metaitem('circuit.pregoc_opv') * 64)
    .EUt(2013265920)
    .duration(20)
    .buildAndRegister();