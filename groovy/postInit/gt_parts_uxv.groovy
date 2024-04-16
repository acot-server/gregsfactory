import gregtech.*;


def assembler = recipemap('assembler');
def assembly_line = recipemap('assembly_line');
def research_station = recipemap('research_station');
    

assembly_line.recipeBuilder()
    .inputs(
        metaitem('stickLongSamariumMagnetic') * 1,
        metaitem('stickLongDarkenergyalloy') * 2,
        metaitem('ringStasis') * 4,
        metaitem('roundDarkenergyalloy') * 8,
        metaitem('wireFineStellarite') * 64,
        metaitem('wireFineStellarite') * 64,
        metaitem('cableGtSingleStellarite') * 1
    )
    .fluidInputs(
        fluid('soldering_alloy') * 3000,
        fluid('lubricant') * 2000,
        fluid('darkenergyalloy') * 16000
    )
    .outputs(metaitem('electric.motor.uxv') * 2)
    .stationResearch(b -> b.researchStack(metaitem('electric.motor.uiv')).CWUt(128).EUt(32768000))
    .EUt(40000000)
    .duration(600)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs(
        metaitem('electric.motor.uxv') * 1,
        metaitem('rotorStasis') * 1,
        metaitem('ringStyreneButadieneRubber') * 32,
        metaitem('screwDarkenergyalloy') * 4,
        metaitem('pipeSmallFluidStasis') * 2,
        metaitem('cableGtSingleStellarite') * 1
    )
    .fluidInputs(
        fluid('soldering_alloy') * 3000,
        fluid('lubricant') * 2000,
        fluid('darkenergyalloy') * 16000,
        fluid('styrene_butadiene_rubber') * 2500
    )
    .outputs(metaitem('electric.pump.uxv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('electric.pump.uiv')).CWUt(128).EUt(32768000))
    .EUt(40000000)
    .duration(600)
    .buildAndRegister();

//OPV Conveyor
assembly_line.recipeBuilder()
    .inputs(
        metaitem('electric.motor.uxv') * 1,
        metaitem('plateStyreneButadieneRubber') * 2,
        metaitem('gearSmallDarkenergyalloy') * 4,
        metaitem('roundStellarite') * 16,
        metaitem('screwDarkmatteralloy') * 4,
        metaitem('cableGtSingleStellarite') * 1
    )
    .fluidInputs(
        fluid('soldering_alloy') * 3000,
        fluid('lubricant') * 2000,
        fluid('darkenergyalloy') * 16000,
        fluid('styrene_butadiene_rubber') * 2500
    )
    .outputs(metaitem('conveyor.module.uxv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('conveyor.module.uiv')).CWUt(128).EUt(32768000))
    .EUt(40000000)
    .duration(600)
    .buildAndRegister();

//OPV Piston
assembly_line.recipeBuilder()
    .inputs(
        metaitem('electric.motor.uxv') * 1,
        metaitem('plateStellarite') * 4,
        metaitem('ringStasis') * 4,
        metaitem('roundStellarite') * 16,
        metaitem('stickDarkenergyalloy') * 4,
        metaitem('gearStellarite') * 1,
        metaitem('gearSmallDarkenergyalloy') * 2,
        metaitem('cableGtSingleStellarite') * 2
    )
    .fluidInputs(
        fluid('lubricant') * 1000,
        fluid('soldering_alloy') * 576,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('darkenergyalloy') * 16000
    )
    .outputs(metaitem('electric.piston.uxv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('electric.piston.uiv')).CWUt(128).EUt(32768000))
    .EUt(40000000)
    .duration(600)
    .buildAndRegister();

//OPV Robot Arm
assembly_line.recipeBuilder()
    .inputs(
        metaitem('stickLongDarkenergyalloy') * 4,
        metaitem('gearStellarite') * 1,
        metaitem('gearSmallDarkenergyalloy') * 3,
        metaitem('electric.motor.uxv') * 2,
        metaitem('electric.piston.uxv') * 1,
        ore('circuitUxv') * 1,
        ore('circuitUiv') * 2,
        ore('circuitUev') * 4,
        metaitem('cableGtSingleStellarite') * 4
    )
    .fluidInputs(
        fluid('lubricant') * 1000,
        fluid('soldering_alloy') * 1728,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('darkenergyalloy') * 16000
    )
    .outputs(metaitem('robot.arm.uxv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('robot.arm.uiv')).CWUt(128).EUt(32768000))
    .EUt(40000000)
    .duration(600)
    .buildAndRegister();

//OPV Field Generator
assembly_line.recipeBuilder()
    .inputs(
        metaitem('frameStellarite') * 1,
        metaitem('stickLongDarkenergyalloy') * 6,
        metaitem('gravistar') * 1,
        metaitem('emitter.uxv') * 2,
        ore('circuitUxv') * 2,
        metaitem('wireFineStellarite') * 64,
        metaitem('wireFineStellarite') * 64,
        metaitem('cableGtSingleStellarite') * 4
    )
    .fluidInputs(
        fluid('soldering_alloy') * 1728,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('darkenergyalloy') * 16000
    )
    .outputs(metaitem('field.generator.uxv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('field.generator.uiv')).CWUt(128).EUt(32768000))
    .EUt(40000000)
    .duration(600)
    .buildAndRegister();
    
//OPV Emitter
assembly_line.recipeBuilder()
    .inputs(
        metaitem('frameStellarite') * 1,
        metaitem('electric.motor.uxv') * 1,
        metaitem('stickLongDarkenergyalloy') * 4,
        metaitem('gravistar') * 1,
        ore('circuitUxv') * 2,
        metaitem('wireFineStellarite') * 64,
        metaitem('wireFineStellarite') * 32,
        metaitem('cableGtSingleStellarite') * 4
    )
    .fluidInputs(
        fluid('soldering_alloy') * 1152,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('darkenergyalloy') * 16000
    )
    .outputs(metaitem('emitter.uxv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('emitter.uiv')).CWUt(128).EUt(32768000))
    .EUt(40000000)
    .duration(600)
    .buildAndRegister();

//OPV Sensor
assembly_line.recipeBuilder()
    .inputs(
        metaitem('frameStellarite') * 1,
        metaitem('electric.motor.uxv') * 1,
        metaitem('plateDoubleDarkenergyalloy') * 4,
        metaitem('gravistar') * 1,
        ore('circuitUxv') * 2,
        metaitem('foilStellarite') * 64,
        metaitem('foilStellarite') * 32,
        metaitem('cableGtSingleStellarite') * 4
    )
    .fluidInputs(
        fluid('soldering_alloy') * 1152,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('darkenergyalloy') * 16000
    )
    .outputs(metaitem('sensor.uxv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('sensor.uiv')).CWUt(128).EUt(32768000))
    .EUt(40000000)
    .duration(600)
    .buildAndRegister();