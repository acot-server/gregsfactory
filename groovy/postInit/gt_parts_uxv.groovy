import gregtech.*;


def assembler = recipemap('assembler');
def assembly_line = recipemap('assembly_line');
def research_station = recipemap('research_station');
    

assembly_line.recipeBuilder()
    .inputs(
        metaitem('stickLongSamariumMagnetic') * 1,
        metaitem('stickLongRunicalloy') * 2,
        metaitem('ringRunicalloy') * 4,
        metaitem('roundRunicalloy') * 8,
        metaitem('wireFineRunicalloy') * 64,
        metaitem('wireFineRunicalloy') * 64,
        metaitem('cableGtDoubleRunicalloy') * 1
    )
    .fluidInputs(
        fluid('soldering_alloy') * 3000,
        fluid('lubricant') * 2000,
        fluid('stellarite') * 16000
    )
    .outputs(metaitem('electric.motor.uxv') * 2)
    .stationResearch(b -> b.researchStack(metaitem('electric.motor.uiv')).CWUt(128).EUt(32768000))
    .EUt(40000000)
    .duration(1000)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs(
        metaitem('electric.motor.uxv') * 1,
        metaitem('rotorRunicalloy') * 1,
        metaitem('ringStyreneButadieneRubber') * 32,
        metaitem('screwRunicalloy') * 4,
        metaitem('pipeLargeFluidNeutronium') * 2,
        metaitem('cableGtDoubleRunicalloy') * 1
    )
    .fluidInputs(
        fluid('soldering_alloy') * 3000,
        fluid('lubricant') * 2000,
        fluid('stellarite') * 16000,
        fluid('styrene_butadiene_rubber') * 2500
    )
    .outputs(metaitem('electric.pump.uxv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('electric.pump.uiv')).CWUt(128).EUt(32768000))
    .EUt(40000000)
    .duration(1000)
    .buildAndRegister();

//OPV Conveyor
assembly_line.recipeBuilder()
    .inputs(
        metaitem('electric.motor.uxv') * 1,
        metaitem('plateStyreneButadieneRubber') * 2,
        metaitem('gearSmallRunicalloy') * 4,
        metaitem('roundRunicalloy') * 16,
        metaitem('screwRunicalloy') * 4,
        metaitem('cableGtDoubleRunicalloy') * 1
    )
    .fluidInputs(
        fluid('soldering_alloy') * 3000,
        fluid('lubricant') * 2000,
        fluid('stellarite') * 16000,
        fluid('styrene_butadiene_rubber') * 2500
    )
    .outputs(metaitem('conveyor.module.uxv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('conveyor.module.uiv')).CWUt(128).EUt(32768000))
    .EUt(40000000)
    .duration(1000)
    .buildAndRegister();

//OPV Piston
assembly_line.recipeBuilder()
    .inputs(
        metaitem('electric.motor.uxv') * 1,
        metaitem('plateRunicalloy') * 4,
        metaitem('ringRunicalloy') * 4,
        metaitem('roundRunicalloy') * 16,
        metaitem('stickRunicalloy') * 4,
        metaitem('gearRunicalloy') * 1,
        metaitem('gearSmallRunicalloy') * 2,
        metaitem('cableGtSingleRunicalloy') * 2
    )
    .fluidInputs(
        fluid('lubricant') * 1000,
        fluid('soldering_alloy') * 576,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('runicalloy') * 16000
    )
    .outputs(metaitem('electric.piston.uxv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('electric.piston.uiv')).CWUt(128).EUt(32768000))
    .EUt(40000000)
    .duration(1000)
    .buildAndRegister();

//OPV Robot Arm
assembly_line.recipeBuilder()
    .inputs(
        metaitem('stickLongRunicalloy') * 4,
        metaitem('gearRunicalloy') * 1,
        metaitem('gearSmallRunicalloy') * 3,
        metaitem('electric.motor.uxv') * 2,
        metaitem('electric.piston.uxv') * 1,
        ore('circuitUxv') * 1,
        ore('circuitUiv') * 2,
        ore('circuitUev') * 4,
        metaitem('cableGtSingleRunicalloy') * 4
    )
    .fluidInputs(
        fluid('lubricant') * 1000,
        fluid('soldering_alloy') * 1728,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('runicalloy') * 16000
    )
    .outputs(metaitem('robot.arm.uxv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('robot.arm.uiv')).CWUt(128).EUt(32768000))
    .EUt(40000000)
    .duration(1000)
    .buildAndRegister();

//OPV Field Generator
assembly_line.recipeBuilder()
    .inputs(
        metaitem('frameTritanium') * 1,
        metaitem('plateRunicalloy') * 6,
        metaitem('gravistar') * 1,
        metaitem('emitter.uxv') * 2,
        ore('circuitUxv') * 2,
        metaitem('wireFineRunicalloy') * 64,
        metaitem('wireFineRunicalloy') * 64,
        metaitem('cableGtSingleRunicalloy') * 4
    )
    .fluidInputs(
        fluid('soldering_alloy') * 1728,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('runicalloy') * 16000
    )
    .outputs(metaitem('field.generator.uxv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('field.generator.uiv')).CWUt(128).EUt(32768000))
    .EUt(40000000)
    .duration(1000)
    .buildAndRegister();
    
//OPV Emitter
assembly_line.recipeBuilder()
    .inputs(
        metaitem('frameTritanium') * 1,
        metaitem('electric.motor.uxv') * 1,
        metaitem('stickLongRunicalloy') * 4,
        metaitem('gravistar') * 1,
        ore('circuitUxv') * 2,
        metaitem('foilRunicalloy') * 64,
        metaitem('foilRunicalloy') * 32,
        metaitem('cableGtSingleRunicalloy') * 4
    )
    .fluidInputs(
        fluid('soldering_alloy') * 1152,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('runicalloy') * 16000
    )
    .outputs(metaitem('emitter.uxv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('emitter.uiv')).CWUt(128).EUt(32768000))
    .EUt(40000000)
    .duration(1000)
    .buildAndRegister();

//OPV Sensor
assembly_line.recipeBuilder()
    .inputs(
        metaitem('frameTritanium') * 1,
        metaitem('electric.motor.uxv') * 1,
        metaitem('plateWakfustasis') * 4,
        metaitem('gravistar') * 1,
        ore('circuitUxv') * 2,
        metaitem('foilRunicalloy') * 64,
        metaitem('foilRunicalloy') * 32,
        metaitem('cableGtSingleRunicalloy') * 4
    )
    .fluidInputs(
        fluid('soldering_alloy') * 1152,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('runicalloy') * 16000
    )
    .outputs(metaitem('sensor.uxv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('sensor.uiv')).CWUt(128).EUt(32768000))
    .EUt(40000000)
    .duration(1000)
    .buildAndRegister();