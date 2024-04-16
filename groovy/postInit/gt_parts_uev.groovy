import gregtech.*;


def assembler = recipemap('assembler');
def assembly_line = recipemap('assembly_line');
def research_station = recipemap('research_station');
    

assembly_line.recipeBuilder()
    .inputs(
        metaitem('stickLongSamariumMagnetic') * 1,
        metaitem('stickLongWakfu') * 2,
        metaitem('ringDarmstadtium') * 4,
        metaitem('roundDarkmatteralloy') * 8,
        metaitem('wireFineStasis') * 64,
        metaitem('wireFineStasis') * 64,
        metaitem('cableGtSingleStasis') * 1
    )
    .fluidInputs(
        fluid('soldering_alloy') * 3000,
        fluid('lubricant') * 2000,
        fluid('darkmatteralloy') * 16000
    )
    .outputs(metaitem('electric.motor.uev') * 2)
    .stationResearch(b -> b.researchStack(metaitem('electric.motor.uhv')).CWUt(64).EUt(2048000))
    .EUt(2500000)
    .duration(600)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs(
        metaitem('electric.motor.uev') * 1,
        metaitem('rotorDarmstadtium') * 1,
        metaitem('ringStyreneButadieneRubber') * 32,
        metaitem('screwNeutronium') * 4,
        metaitem('pipeSmallFluidStasis') * 2,
        metaitem('cableGtSingleStasis') * 1
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
    .duration(600)
    .buildAndRegister();

//OPV Conveyor
assembly_line.recipeBuilder()
    .inputs(
        metaitem('electric.motor.uev') * 1,
        metaitem('plateStyreneButadieneRubber') * 2,
        metaitem('gearSmallWakfu') * 4,
        metaitem('roundDarkmatteralloy') * 16,
        metaitem('screwWakfu') * 4,
        metaitem('cableGtSingleStasis') * 1
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
    .duration(600)
    .buildAndRegister();

//OPV Piston
assembly_line.recipeBuilder()
    .inputs(
        metaitem('electric.motor.uev') * 1,
        metaitem('plateWakfu') * 4,
        metaitem('ringDarmstadtium') * 4,
        metaitem('roundDarkmatteralloy') * 16,
        metaitem('stickDarkmatteralloy') * 4,
        metaitem('gearDarkmatteralloy') * 1,
        metaitem('gearSmallWakfu') * 2,
        metaitem('cableGtSingleStasis') * 1
    )
    .fluidInputs(
        fluid('lubricant') * 1000,
        fluid('soldering_alloy') * 576,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('darkmatteralloy') * 32000
    )
    .outputs(metaitem('electric.piston.uev') * 1)
    .stationResearch(b -> b.researchStack(metaitem('electric.piston.uhv')).CWUt(64).EUt(2048000))
    .EUt(2500000)
    .duration(600)
    .buildAndRegister();

//OPV Robot Arm
assembly_line.recipeBuilder()
    .inputs(
        metaitem('stickLongWakfu') * 4,
        metaitem('gearDarkmatteralloy') * 1,
        metaitem('gearSmallWakfu') * 3,
        metaitem('electric.motor.uev') * 2,
        metaitem('electric.piston.uev') * 1,
        ore('circuitUev') * 1,
        ore('circuitUhv') * 2,
        ore('circuitUv') * 4,
        metaitem('cableGtSingleStasis') * 2
    )
    .fluidInputs(
        fluid('lubricant') * 1000,
        fluid('soldering_alloy') * 1728,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('darkmatteralloy') * 16000
    )
    .outputs(metaitem('robot.arm.uev') * 1)
    .stationResearch(b -> b.researchStack(metaitem('robot.arm.uhv')).CWUt(64).EUt(2048000))
    .EUt(2500000)
    .duration(600)
    .buildAndRegister();

//OPV Field Generator
assembly_line.recipeBuilder()
    .inputs(
        metaitem('frameDarkmatteralloy') * 1,
        metaitem('plateWakfu') * 6,
        metaitem('gravistar') * 1,
        metaitem('emitter.uev') * 2,
        ore('circuitUev') * 2,
        metaitem('wireFineStasis') * 64,
        metaitem('wireFineStasis') * 64,
        metaitem('cableGtSingleStasis') * 4
    )
    .fluidInputs(
        fluid('soldering_alloy') * 1728,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('darkmatteralloy') * 16000
    )
    .outputs(metaitem('field.generator.uev') * 1)
    .stationResearch(b -> b.researchStack(metaitem('field.generator.uhv')).CWUt(64).EUt(2048000))
    .EUt(2500000)
    .duration(600)
    .buildAndRegister();
    
//OPV Emitter
assembly_line.recipeBuilder()
    .inputs(
        metaitem('frameDarkmatteralloy') * 1,
        metaitem('electric.motor.uev') * 1,
        metaitem('stickLongDarkmatteralloy') * 4,
        metaitem('gravistar') * 1,
        ore('circuitUev') * 2,
        metaitem('foilWakfu') * 64,
        metaitem('foilWakfu') * 32,
        metaitem('cableGtSingleStasis') * 4
    )
    .fluidInputs(
        fluid('soldering_alloy') * 1152,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('darkmatteralloy') * 16000
    )
    .outputs(metaitem('emitter.uev') * 1)
    .stationResearch(b -> b.researchStack(metaitem('emitter.uhv')).CWUt(64).EUt(2048000))
    .EUt(2500000)
    .duration(600)
    .buildAndRegister();

//OPV Sensor
assembly_line.recipeBuilder()
    .inputs(
        metaitem('frameDarkmatteralloy') * 1,
        metaitem('electric.motor.uev') * 1,
        metaitem('plateStasis') * 4,
        metaitem('gravistar') * 1,
        ore('circuitUev') * 2,
        metaitem('foilWakfu') * 64,
        metaitem('foilWakfu') * 32,
        metaitem('cableGtSingleStasis') * 4
    )
    .fluidInputs(
        fluid('soldering_alloy') * 1152,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('darkmatteralloy') * 16000
    )
    .outputs(metaitem('sensor.uev') * 1)
    .stationResearch(b -> b.researchStack(metaitem('sensor.uhv')).CWUt(64).EUt(2048000))
    .EUt(2500000)
    .duration(600)
    .buildAndRegister();