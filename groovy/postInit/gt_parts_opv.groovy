import gregtech.*;


def assembler = recipemap('assembler');
def assembly_line = recipemap('assembly_line');
def research_station = recipemap('research_station');
    

assembly_line.recipeBuilder()
    .inputs(
        metaitem('stickLongSamariumMagnetic') * 1,
        metaitem('stickLongStellarite') * 2,
        metaitem('ringDarkenergyalloy') * 4,
        metaitem('roundStellarite') * 8,
        metaitem('wireFineRunicalloy') * 64,
        metaitem('wireFineRunicalloy') * 64,
        metaitem('cableGtSingleRunicalloy') * 1
    )
    .fluidInputs(
        fluid('soldering_alloy') * 3000,
        fluid('lubricant') * 2000,
        fluid('stellarite') * 16000
    )
    .outputs(metaitem('electric.motor.opv') * 2)
    .stationResearch(b -> b.researchStack(metaitem('electric.motor.uxv')).CWUt(144).EUt(131072000))
    .EUt(160000000)
    .duration(600)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs(
        metaitem('electric.motor.opv') * 1,
        metaitem('rotorDarkenergyalloy') * 1,
        metaitem('ringStyreneButadieneRubber') * 32,
        metaitem('screwStellarite') * 4,
        metaitem('pipeSmallFluidWakfustasis') * 2,
        metaitem('cableGtSingleRunicalloy') * 1
    )
    .fluidInputs(
        fluid('soldering_alloy') * 3000,
        fluid('lubricant') * 2000,
        fluid('stellarite') * 16000,
        fluid('styrene_butadiene_rubber') * 2500
    )
    .outputs(metaitem('electric.pump.opv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('electric.pump.uxv')).CWUt(144).EUt(131072000))
    .EUt(160000000)
    .duration(600)
    .buildAndRegister();

//OPV Conveyor
assembly_line.recipeBuilder()
    .inputs(
        metaitem('electric.motor.opv') * 1,
        metaitem('plateStyreneButadieneRubber') * 2,
        metaitem('gearSmallStellarite') * 4,
        metaitem('roundRunicalloy') * 16,
        metaitem('screwStellarite') * 4,
        metaitem('cableGtSingleRunicalloy') * 1
    )
    .fluidInputs(
        fluid('soldering_alloy') * 3000,
        fluid('lubricant') * 2000,
        fluid('stellarite') * 16000,
        fluid('styrene_butadiene_rubber') * 2500
    )
    .outputs(metaitem('conveyor.module.opv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('conveyor.module.uxv')).CWUt(144).EUt(131072000))
    .EUt(160000000)
    .duration(600)
    .buildAndRegister();

//OPV Piston
assembly_line.recipeBuilder()
    .inputs(
        metaitem('electric.motor.opv') * 1,
        metaitem('plateWakfustasis') * 4,
        metaitem('ringWakfustasis') * 4,
        metaitem('roundWakfustasis') * 16,
        metaitem('stickWakfustasis') * 4,
        metaitem('gearWakfustasis') * 1,
        metaitem('gearSmallWakfustasis') * 2,
        metaitem('cableGtSingleRunicalloy') * 2
    )
    .fluidInputs(
        fluid('lubricant') * 1000,
        fluid('soldering_alloy') * 576,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('stellarite') * 16000
    )
    .outputs(metaitem('electric.piston.opv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('electric.piston.uxv')).CWUt(144).EUt(131072000))
    .EUt(160000000)
    .duration(600)
    .buildAndRegister();

//OPV Robot Arm
assembly_line.recipeBuilder()
    .inputs(
        metaitem('stickLongWakfustasis') * 4,
        metaitem('plateRunicalloy') * 1,
        metaitem('gearSmallWakfustasis') * 3,
        metaitem('electric.motor.opv') * 2,
        metaitem('electric.piston.opv') * 1,
        ore('circuitOpv') * 1,
        ore('circuitUxv') * 2,
        ore('circuitUiv') * 4,
        metaitem('cableGtSingleRunicalloy') * 4
    )
    .fluidInputs(
        fluid('lubricant') * 1000,
        fluid('soldering_alloy') * 1728,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('stellarite') * 16000
    )
    .outputs(metaitem('robot.arm.opv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('robot.arm.uxv')).CWUt(144).EUt(131072000))
    .EUt(160000000)
    .duration(600)
    .buildAndRegister();

//OPV Field Generator
assembly_line.recipeBuilder()
    .inputs(
        metaitem('frameRunicalloy') * 1,
        metaitem('stickLongStellarite') * 6,
        metaitem('gravistar') * 1,
        metaitem('emitter.opv') * 2,
        ore('circuitOpv') * 2,
        metaitem('wireFineRunicalloy') * 64,
        metaitem('wireFineRunicalloy') * 64,
        metaitem('cableGtSingleRunicalloy') * 4
    )
    .fluidInputs(
        fluid('soldering_alloy') * 1728,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('stellarite') * 16000
    )
    .outputs(metaitem('field.generator.opv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('field.generator.uxv')).CWUt(144).EUt(131072000))
    .EUt(160000000)
    .duration(1000)
    .buildAndRegister();
    
//OPV Emitter
assembly_line.recipeBuilder()
    .inputs(
        metaitem('frameRunicalloy') * 1,
        metaitem('electric.motor.opv') * 1,
        metaitem('stickLongStellarite') * 4,
        metaitem('gravistar') * 1,
        ore('circuitOpv') * 2,
        metaitem('wireFineRunicalloy') * 64,
        metaitem('wireFineRunicalloy') * 32,
        metaitem('cableGtSingleRunicalloy') * 4
    )
    .fluidInputs(
        fluid('soldering_alloy') * 1152,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('stellarite') * 16000
    )
    .outputs(metaitem('emitter.opv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('emitter.uxv')).CWUt(144).EUt(131072000))
    .EUt(160000000)
    .duration(600)
    .buildAndRegister();

//OPV Sensor
assembly_line.recipeBuilder()
    .inputs(
        metaitem('frameRunicalloy') * 1,
        metaitem('electric.motor.opv') * 1,
        metaitem('plateDoubleRunicalloy') * 4,
        metaitem('gravistar') * 1,
        ore('circuitOpv') * 2,
        metaitem('foilRunicalloy') * 64,
        metaitem('foilRunicalloy') * 32,
        metaitem('cableGtSingleRunicalloy') * 4
    )
    .fluidInputs(
        fluid('soldering_alloy') * 1152,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('stellarite') * 16000
    )
    .outputs(metaitem('sensor.opv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('sensor.uxv')).CWUt(144).EUt(131072000))
    .EUt(160000000)
    .duration(600)
    .buildAndRegister();