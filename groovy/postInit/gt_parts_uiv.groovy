import gregtech.*;


def assembler = recipemap('assembler');
def assembly_line = recipemap('assembly_line');
def research_station = recipemap('research_station');
    

assembly_line.recipeBuilder()
    .inputs(
        metaitem('stickLongSamariumMagnetic') * 1,
        metaitem('stickLongStasis') * 2,
        metaitem('ringWakfu') * 4,
        metaitem('roundDarkmatteralloy') * 8,
        metaitem('wireFineDarkenergyalloy') * 64,
        metaitem('wireFineDarkenergyalloy') * 64,
        metaitem('cableGtSingleDarkenergyalloy') * 1
    )
    .fluidInputs(
        fluid('soldering_alloy') * 3000,
        fluid('lubricant') * 2000,
        fluid('stasis') * 16000
    )
    .outputs(metaitem('electric.motor.uiv') * 2)
    .stationResearch(b -> b.researchStack(metaitem('electric.motor.uev')).CWUt(96).EUt(8192000))
    .EUt(10000000)
    .duration(600)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs(
        metaitem('electric.motor.uiv') * 1,
        metaitem('rotorWakfu') * 1,
        metaitem('ringStyreneButadieneRubber') * 32,
        metaitem('screwDarkmatteralloy') * 4,
        metaitem('pipeSmallFluidStasis') * 2,
        metaitem('cableGtSingleDarkenergyalloy') * 1
    )
    .fluidInputs(
        fluid('soldering_alloy') * 3000,
        fluid('lubricant') * 2000,
        fluid('stasis') * 16000,
        fluid('styrene_butadiene_rubber') * 2500
    )
    .outputs(metaitem('electric.pump.uiv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('electric.pump.uev')).CWUt(96).EUt(8192000))
    .EUt(10000000)
    .duration(600)
    .buildAndRegister();

//OPV Conveyor
assembly_line.recipeBuilder()
    .inputs(
        metaitem('electric.motor.uiv') * 1,
        metaitem('plateStyreneButadieneRubber') * 2,
        metaitem('gearSmallStasis') * 4,
        metaitem('roundDarkenergyalloy') * 16,
        metaitem('screwDarkmatteralloy') * 4,
        metaitem('cableGtSingleDarkenergyalloy') * 1
    )
    .fluidInputs(
        fluid('soldering_alloy') * 3000,
        fluid('lubricant') * 2000,
        fluid('stasis') * 16000,
        fluid('styrene_butadiene_rubber') * 2500
    )
    .outputs(metaitem('conveyor.module.uiv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('conveyor.module.uev')).CWUt(96).EUt(8192000))
    .EUt(10000000)
    .duration(600)
    .buildAndRegister();

//OPV Piston
assembly_line.recipeBuilder()
    .inputs(
        metaitem('electric.motor.uiv') * 1,
        metaitem('plateDarkenergyalloy') * 4,
        metaitem('ringWakfu') * 4,
        metaitem('roundDarkenergyalloy') * 16,
        metaitem('stickStasis') * 4,
        metaitem('gearDarkenergyalloy') * 1,
        metaitem('gearSmallStasis') * 2,
        metaitem('cableGtSingleDarkenergyalloy') * 1
    )
    .fluidInputs(
        fluid('lubricant') * 1000,
        fluid('soldering_alloy') * 576,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('stasis') * 16000
    )
    .outputs(metaitem('electric.piston.uiv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('electric.piston.uev')).CWUt(96).EUt(8192000))
    .EUt(10000000)
    .duration(600)
    .buildAndRegister();

//OPV Robot Arm
assembly_line.recipeBuilder()
    .inputs(
        metaitem('stickLongStasis') * 4,
        metaitem('gearDarkenergyalloy') * 1,
        metaitem('gearSmallStasis') * 3,
        metaitem('electric.motor.uiv') * 2,
        metaitem('electric.piston.uiv') * 1,
        ore('circuitUiv') * 1,
        ore('circuitUev') * 2,
        ore('circuitUhv') * 4,
        metaitem('cableGtSingleDarkenergyalloy') * 2
    )
    .fluidInputs(
        fluid('lubricant') * 1000,
        fluid('soldering_alloy') * 1728,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('stasis') * 16000
    )
    .outputs(metaitem('robot.arm.uiv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('robot.arm.uev')).CWUt(96).EUt(8192000))
    .EUt(10000000)
    .duration(600)
    .buildAndRegister();

//OPV Field Generator
assembly_line.recipeBuilder()
    .inputs(
        metaitem('frameDarkenergyalloy') * 1,
        metaitem('stickLongStasis') * 6,
        metaitem('gravistar') * 1,
        metaitem('emitter.uiv') * 2,
        ore('circuitUiv') * 2,
        metaitem('wireFineDarkenergyalloy') * 64,
        metaitem('wireFineDarkenergyalloy') * 64,
        metaitem('cableGtSingleDarkenergyalloy') * 4
    )
    .fluidInputs(
        fluid('soldering_alloy') * 1728,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('stasis') * 16000
    )
    .outputs(metaitem('field.generator.uiv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('field.generator.uev')).CWUt(96).EUt(8192000))
    .EUt(10000000)
    .duration(600)
    .buildAndRegister();
    
//OPV Emitter
assembly_line.recipeBuilder()
    .inputs(
        metaitem('frameDarkenergyalloy') * 1,
        metaitem('electric.motor.uiv') * 1,
        metaitem('stickLongStasis') * 4,
        metaitem('gravistar') * 1,
        ore('circuitUiv') * 2,
        metaitem('wireFineDarkenergyalloy') * 64,
        metaitem('wireFineDarkenergyalloy') * 32,
        metaitem('cableGtSingleDarkenergyalloy') * 2
    )
    .fluidInputs(
        fluid('soldering_alloy') * 1152,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('stasis') * 16000
    )
    .outputs(metaitem('emitter.uiv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('emitter.uev')).CWUt(96).EUt(8192000))
    .EUt(10000000)
    .duration(600)
    .buildAndRegister();

//OPV Sensor
assembly_line.recipeBuilder()
    .inputs(
        metaitem('frameDarkenergyalloy') * 1,
        metaitem('electric.motor.uiv') * 1,
        metaitem('plateDoubleStasis') * 4,
        metaitem('gravistar') * 1,
        ore('circuitUiv') * 2,
        metaitem('foilDarkenergyalloy') * 64,
        metaitem('foilDarkenergyalloy') * 32,
        metaitem('cableGtSingleDarkenergyalloy') * 2
    )
    .fluidInputs(
        fluid('soldering_alloy') * 1152,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('stasis') * 16000
    )
    .outputs(metaitem('sensor.uiv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('sensor.uev')).CWUt(96).EUt(8192000))
    .EUt(10000000)
    .duration(600)
    .buildAndRegister();