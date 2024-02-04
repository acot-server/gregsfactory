import gregtech.*;


def assembler = recipemap('assembler');
def assembly_line = recipemap('assembly_line');
def research_station = recipemap('research_station');
    

assembly_line.recipeBuilder()
    .inputs(
        metaitem('stickLongSamariumMagnetic') * 1,
        metaitem('stickLongWakfustasis') * 2,
        metaitem('ringWakfustasis') * 4,
        metaitem('roundWakfustasis') * 8,
        metaitem('wireFineWakfustasis') * 64,
        metaitem('wireFineWakfustasis') * 64,
        metaitem('cableGtDoubleWakfustasis') * 1
    )
    .fluidInputs(
        fluid('soldering_alloy') * 3000,
        fluid('lubricant') * 2000,
        fluid('stellarite') * 16000
    )
    .outputs(metaitem('electric.motor.opv') * 2)
    .stationResearch(b -> b.researchStack(metaitem('electric.motor.uxv')).CWUt(144).EUt(131072000))
    .EUt(160000000)
    .duration(1000)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs(
        metaitem('electric.motor.opv') * 1,
        metaitem('rotorWakfustasis') * 1,
        metaitem('ringStyreneButadieneRubber') * 32,
        metaitem('screwWakfustasis') * 4,
        metaitem('pipeLargeFluidNeutronium') * 2,
        metaitem('cableGtDoubleWakfustasis') * 1
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
    .duration(1000)
    .buildAndRegister();

//OPV Conveyor
assembly_line.recipeBuilder()
    .inputs(
        metaitem('electric.motor.opv') * 1,
        metaitem('plateStyreneButadieneRubber') * 2,
        metaitem('gearSmallWakfustasis') * 4,
        metaitem('roundWakfustasis') * 16,
        metaitem('screwWakfustasis') * 4,
        metaitem('cableGtDoubleWakfustasis') * 1
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
    .duration(1000)
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
        metaitem('cableGtSingleWakfustasis') * 2
    )
    .fluidInputs(
        fluid('lubricant') * 1000,
        fluid('soldering_alloy') * 576,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('runicalloy') * 16000
    )
    .outputs(metaitem('electric.piston.opv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('electric.piston.uxv')).CWUt(144).EUt(131072000))
    .EUt(160000000)
    .duration(1000)
    .buildAndRegister();

//OPV Robot Arm
assembly_line.recipeBuilder()
    .inputs(
        metaitem('stickLongWakfustasis') * 4,
        metaitem('gearWakfustasis') * 1,
        metaitem('gearSmallWakfustasis') * 3,
        metaitem('electric.motor.opv') * 2,
        metaitem('electric.piston.opv') * 1,
        ore('circuitOpv') * 1,
        ore('circuitUxv') * 2,
        ore('circuitUiv') * 4,
        metaitem('cableGtSingleWakfustasis') * 4
    )
    .fluidInputs(
        fluid('lubricant') * 1000,
        fluid('soldering_alloy') * 1728,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('runicalloy') * 16000
    )
    .outputs(metaitem('robot.arm.opv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('robot.arm.uxv')).CWUt(144).EUt(131072000))
    .EUt(160000000)
    .duration(1000)
    .buildAndRegister();

//OPV Field Generator
assembly_line.recipeBuilder()
    .inputs(
        metaitem('frameTritanium') * 1,
        metaitem('plateWakfustasis') * 6,
        metaitem('gravistar') * 1,
        metaitem('emitter.opv') * 2,
        ore('circuitOpv') * 2,
        metaitem('wireFineWakfustasis') * 64,
        metaitem('wireFineWakfustasis') * 64,
        metaitem('cableGtSingleWakfustasis') * 4
    )
    .fluidInputs(
        fluid('soldering_alloy') * 1728,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('runicalloy') * 16000
    )
    .outputs(metaitem('field.generator.opv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('field.generator.uxv')).CWUt(144).EUt(131072000))
    .EUt(160000000)
    .duration(1000)
    .buildAndRegister();
    
//OPV Emitter
assembly_line.recipeBuilder()
    .inputs(
        metaitem('frameTritanium') * 1,
        metaitem('electric.motor.opv') * 1,
        metaitem('stickLongWakfustasis') * 4,
        metaitem('gravistar') * 1,
        ore('circuitOpv') * 2,
        metaitem('foilWakfustasis') * 64,
        metaitem('foilWakfustasis') * 32,
        metaitem('cableGtSingleWakfustasis') * 4
    )
    .fluidInputs(
        fluid('soldering_alloy') * 1152,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('runicalloy') * 16000
    )
    .outputs(metaitem('emitter.opv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('emitter.uxv')).CWUt(144).EUt(131072000))
    .EUt(160000000)
    .duration(1000)
    .buildAndRegister();

//OPV Sensor
assembly_line.recipeBuilder()
    .inputs(
        metaitem('frameTritanium') * 1,
        metaitem('electric.motor.opv') * 1,
        metaitem('plateWakfustasis') * 4,
        metaitem('gravistar') * 1,
        ore('circuitOpv') * 2,
        metaitem('foilWakfustasis') * 64,
        metaitem('foilWakfustasis') * 32,
        metaitem('cableGtSingleWakfustasis') * 4
    )
    .fluidInputs(
        fluid('soldering_alloy') * 1152,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('runicalloy') * 16000
    )
    .outputs(metaitem('sensor.opv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('sensor.uxv')).CWUt(144).EUt(131072000))
    .EUt(160000000)
    .duration(1000)
    .buildAndRegister();