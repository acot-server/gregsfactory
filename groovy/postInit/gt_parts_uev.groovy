import gregtech.*;


def assembler = recipemap('assembler');
def assembly_line = recipemap('assembly_line');
def research_station = recipemap('research_station');
    

assembly_line.recipeBuilder()
    .inputs(
        metaitem('stickLongSamariumMagnetic') * 1,
        metaitem('stickLongDarkenergyalloy') * 2,
        metaitem('ringDarkenergyalloy') * 4,
        metaitem('roundDarkenergyalloy') * 8,
        metaitem('wireFineDarkenergyalloy') * 64,
        metaitem('wireFineDarkenergyalloy') * 64,
        metaitem('cableGtDoubleDarkenergyalloy') * 1
    )
    .fluidInputs(
        fluid('soldering_alloy') * 3000,
        fluid('lubricant') * 2000,
        fluid('darkmatteralloy') * 16000
    )
    .outputs(metaitem('electric.motor.uev') * 2)
    .stationResearch(b -> b.researchStack(metaitem('electric.motor.uhv')).CWUt(64).EUt(2048000))
    .EUt(2500000)
    .duration(1000)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs(
        metaitem('electric.motor.uev') * 1,
        metaitem('rotorDarkenergyalloy') * 1,
        metaitem('ringStyreneButadieneRubber') * 32,
        metaitem('screwDarkenergyalloy') * 4,
        metaitem('pipeLargeFluidNeutronium') * 2,
        metaitem('cableGtDoubleDarkenergyalloy') * 1
    )
    .fluidInputs(
        fluid('soldering_alloy') * 3000,
        fluid('lubricant') * 2000,
        fluid('darkmatteralloy') * 16000,
        fluid('styrene_butadiene_rubber') * 2500
    )
    .outputs(metaitem('electric.pump.uev') * 1)
    .stationResearch(b -> b.researchStack(metaitem('electric.pump.uhv')).CWUt(64).EUt(2048000))
    .EUt(2500000)
    .duration(1000)
    .buildAndRegister();

//OPV Conveyor
assembly_line.recipeBuilder()
    .inputs(
        metaitem('electric.motor.uev') * 1,
        metaitem('plateStyreneButadieneRubber') * 2,
        metaitem('gearSmallDarkenergyalloy') * 4,
        metaitem('roundDarkenergyalloy') * 16,
        metaitem('screwDarkenergyalloy') * 4,
        metaitem('cableGtDoubleDarkenergyalloy') * 1
    )
    .fluidInputs(
        fluid('soldering_alloy') * 3000,
        fluid('lubricant') * 2000,
        fluid('darkmatteralloy') * 16000,
        fluid('styrene_butadiene_rubber') * 2500
    )
    .outputs(metaitem('conveyor.module.uev') * 1)
    .stationResearch(b -> b.researchStack(metaitem('conveyor.module.uhv')).CWUt(64).EUt(2048000))
    .EUt(2500000)
    .duration(1000)
    .buildAndRegister();

//OPV Piston
assembly_line.recipeBuilder()
    .inputs(
        metaitem('electric.motor.uev') * 1,
        metaitem('plateDarkenergyalloy') * 4,
        metaitem('ringDarkenergyalloy') * 4,
        metaitem('roundDarkenergyalloy') * 16,
        metaitem('stickDarkenergyalloy') * 4,
        metaitem('gearDarkenergyalloy') * 1,
        metaitem('gearSmallDarkenergyalloy') * 2,
        metaitem('cableGtSingleDarkenergyalloy') * 2
    )
    .fluidInputs(
        fluid('lubricant') * 1000,
        fluid('soldering_alloy') * 576,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('darkenergyalloy') * 32000
    )
    .outputs(metaitem('electric.piston.uev') * 1)
    .stationResearch(b -> b.researchStack(metaitem('electric.piston.uhv')).CWUt(64).EUt(2048000))
    .EUt(2500000)
    .duration(1000)
    .buildAndRegister();

//OPV Robot Arm
assembly_line.recipeBuilder()
    .inputs(
        metaitem('stickLongDarkenergyalloy') * 4,
        metaitem('gearDarkenergyalloy') * 1,
        metaitem('gearSmallDarkenergyalloy') * 3,
        metaitem('electric.motor.uev') * 2,
        metaitem('electric.piston.uev') * 1,
        ore('circuitUev') * 1,
        ore('circuitUhv') * 2,
        ore('circuitUv') * 4,
        metaitem('cableGtSingleDarkenergyalloy') * 4
    )
    .fluidInputs(
        fluid('lubricant') * 1000,
        fluid('soldering_alloy') * 1728,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('darkenergyalloy') * 16000
    )
    .outputs(metaitem('robot.arm.uev') * 1)
    .stationResearch(b -> b.researchStack(metaitem('robot.arm.uhv')).CWUt(64).EUt(2048000))
    .EUt(2500000)
    .duration(1000)
    .buildAndRegister();

//OPV Field Generator
assembly_line.recipeBuilder()
    .inputs(
        metaitem('frameTritanium') * 1,
        metaitem('plateDarkenergyalloy') * 6,
        metaitem('gravistar') * 1,
        metaitem('emitter.uev') * 2,
        ore('circuitUev') * 2,
        metaitem('wireFineDarkenergyalloy') * 64,
        metaitem('wireFineDarkenergyalloy') * 64,
        metaitem('cableGtSingleDarkenergyalloy') * 4
    )
    .fluidInputs(
        fluid('soldering_alloy') * 1728,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('darkenergyalloy') * 16000
    )
    .outputs(metaitem('field.generator.uev') * 1)
    .stationResearch(b -> b.researchStack(metaitem('field.generator.uhv')).CWUt(64).EUt(2048000))
    .EUt(2500000)
    .duration(1000)
    .buildAndRegister();
    
//OPV Emitter
assembly_line.recipeBuilder()
    .inputs(
        metaitem('frameTritanium') * 1,
        metaitem('electric.motor.uev') * 1,
        metaitem('stickLongDarkenergyalloy') * 4,
        metaitem('gravistar') * 1,
        ore('circuitUev') * 2,
        metaitem('foilDarkenergyalloy') * 64,
        metaitem('foilDarkenergyalloy') * 32,
        metaitem('cableGtSingleDarkenergyalloy') * 4
    )
    .fluidInputs(
        fluid('soldering_alloy') * 1152,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('darkenergyalloy') * 16000
    )
    .outputs(metaitem('emitter.uev') * 1)
    .stationResearch(b -> b.researchStack(metaitem('emitter.uev')).CWUt(64).EUt(2048000))
    .EUt(2500000)
    .duration(1000)
    .buildAndRegister();

//OPV Sensor
assembly_line.recipeBuilder()
    .inputs(
        metaitem('frameTritanium') * 1,
        metaitem('electric.motor.uev') * 1,
        metaitem('plateStellarite') * 4,
        metaitem('gravistar') * 1,
        ore('circuitUev') * 2,
        metaitem('foilDarkenergyalloy') * 64,
        metaitem('foilDarkenergyalloy') * 32,
        metaitem('cableGtSingleDarkenergyalloy') * 4
    )
    .fluidInputs(
        fluid('soldering_alloy') * 1152,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('darkenergyalloy') * 16000
    )
    .outputs(metaitem('sensor.uev') * 1)
    .stationResearch(b -> b.researchStack(metaitem('sensor.uev')).CWUt(64).EUt(2048000))
    .EUt(2500000)
    .duration(1000)
    .buildAndRegister();