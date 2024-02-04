import gregtech.*;


def assembler = recipemap('assembler');
def assembly_line = recipemap('assembly_line');
def research_station = recipemap('research_station');
    

assembly_line.recipeBuilder()
    .inputs(
        metaitem('stickLongSamariumMagnetic') * 1,
        metaitem('stickLongDarkmatteralloy') * 2,
        metaitem('ringDarkmatteralloy') * 4,
        metaitem('roundDarkmatteralloy') * 8,
        metaitem('wireFineDarkmatteralloy') * 64,
        metaitem('wireFineDarkmatteralloy') * 64,
        metaitem('cableGtDoubleDarkmatteralloy') * 1
    )
    .fluidInputs(
        fluid('soldering_alloy') * 3000,
        fluid('lubricant') * 2000,
        fluid('neutronium') * 8000,
    )
    .outputs(metaitem('electric.motor.uhv') * 2)
    .stationResearch(b -> b.researchStack(metaitem('electric.motor.uv')).CWUt(48).EUt(512000))
    .EUt(500000)
    .duration(1000)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs(
        metaitem('electric.motor.uhv') * 1,
        metaitem('rotorDarkmatteralloy') * 1,
        metaitem('ringStyreneButadieneRubber') * 32,
        metaitem('screwDarkmatteralloy') * 4,
        metaitem('pipeLargeFluidNeutronium') * 2,
        metaitem('cableGtDoubleDarkmatteralloy') * 1
    )
    .fluidInputs(
        fluid('soldering_alloy') * 3000,
        fluid('lubricant') * 2000,
        fluid('neutronium') * 8000,
        fluid('styrene_butadiene_rubber') * 2500
    )
    .outputs(metaitem('electric.pump.uhv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('electric.pump.uv')).CWUt(48).EUt(512000))
    .EUt(500000)
    .duration(1000)
    .buildAndRegister();

//OPV Conveyor
assembly_line.recipeBuilder()
    .inputs(
        metaitem('electric.motor.uhv') * 1,
        metaitem('plateStyreneButadieneRubber') * 2,
        metaitem('gearSmallDarkmatteralloy') * 4,
        metaitem('roundDarkmatteralloy') * 16,
        metaitem('screwDarkmatteralloy') * 4,
        metaitem('cableGtDoubleDarkmatteralloy') * 1
    )
    .fluidInputs(
        fluid('soldering_alloy') * 3000,
        fluid('lubricant') * 2000,
        fluid('neutronium') * 8000,
        fluid('styrene_butadiene_rubber') * 2500
    )
    .outputs(metaitem('conveyor.module.uhv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('conveyor.module.uv')).CWUt(48).EUt(512000))
    .EUt(500000)
    .duration(1000)
    .buildAndRegister();

//OPV Piston
assembly_line.recipeBuilder()
    .inputs(
        metaitem('electric.motor.uhv') * 1,
        metaitem('plateDarkmatteralloy') * 4,
        metaitem('ringDarkmatteralloy') * 4,
        metaitem('roundDarkmatteralloy') * 16,
        metaitem('stickDarkmatteralloy') * 4,
        metaitem('gearDarkmatteralloy') * 1,
        metaitem('gearSmallDarkmatteralloy') * 2,
        metaitem('cableGtSingleDarkmatteralloy') * 2
    )
    .fluidInputs(
        fluid('lubricant') * 1000,
        fluid('soldering_alloy') * 576,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('darkmatteralloy') * 16000
    )
    .outputs(metaitem('electric.piston.uhv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('electric.piston.uv')).CWUt(48).EUt(512000))
    .EUt(500000)
    .duration(1000)
    .buildAndRegister();

//OPV Robot Arm
assembly_line.recipeBuilder()
    .inputs(
        metaitem('stickLongDarkmatteralloy') * 4,
        metaitem('gearDarkmatteralloy') * 1,
        metaitem('gearSmallDarkmatteralloy') * 3,
        metaitem('electric.motor.uhv') * 2,
        metaitem('electric.piston.uhv') * 1,
        ore('circuitUhv') * 1,
        ore('circuitUv') * 2,
        ore('circuitZpm') * 4,
        metaitem('cableGtSingleDarkmatteralloy') * 4
    )
    .fluidInputs(
        fluid('lubricant') * 1000,
        fluid('soldering_alloy') * 1728,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('darkmatteralloy') * 16000
    )
    .outputs(metaitem('robot.arm.uhv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('robot.arm.uv')).CWUt(48).EUt(512000))
    .EUt(500000)
    .duration(1000)
    .buildAndRegister();

//OPV Field Generator
assembly_line.recipeBuilder()
    .inputs(
        metaitem('frameTritanium') * 1,
        metaitem('plateDarkmatteralloy') * 6,
        metaitem('gravistar') * 1,
        metaitem('emitter.uhv') * 2,
        ore('circuitUhv') * 2,
        metaitem('wireFineDarkmatteralloy') * 64,
        metaitem('wireFineDarkmatteralloy') * 64,
        metaitem('cableGtSingleDarkmatteralloy') * 4
    )
    .fluidInputs(
        fluid('soldering_alloy') * 1728,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('darkmatteralloy') * 16000
    )
    .outputs(metaitem('field.generator.uhv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('field.generator.uv')).CWUt(48).EUt(512000))
    .EUt(500000)
    .duration(1000)
    .buildAndRegister();
    
//OPV Emitter
assembly_line.recipeBuilder()
    .inputs(
        metaitem('frameTritanium') * 1,
        metaitem('electric.motor.uhv') * 1,
        metaitem('stickLongDarkmatteralloy') * 4,
        metaitem('gravistar') * 1,
        ore('circuitUhv') * 2,
        metaitem('foilDarkmatteralloy') * 64,
        metaitem('foilDarkmatteralloy') * 32,
        metaitem('cableGtSingleDarkmatteralloy') * 4
    )
    .fluidInputs(
        fluid('soldering_alloy') * 1152,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('darkmatteralloy') * 16000
    )
    .outputs(metaitem('emitter.uhv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('emitter.uv')).CWUt(48).EUt(512000))
    .EUt(500000)
    .duration(1000)
    .buildAndRegister();

//OPV Sensor
assembly_line.recipeBuilder()
    .inputs(
        metaitem('frameTritanium') * 1,
        metaitem('electric.motor.uhv') * 1,
        metaitem('plateDarkenergyalloy') * 4,
        metaitem('gravistar') * 1,
        ore('circuitUhv') * 2,
        metaitem('foilDarkmatteralloy') * 64,
        metaitem('foilDarkmatteralloy') * 32,
        metaitem('cableGtSingleDarkmatteralloy') * 4
    )
    .fluidInputs(
        fluid('soldering_alloy') * 1152,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('darkmatteralloy') * 16000
    )
    .outputs(metaitem('sensor.uhv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('sensor.uv')).CWUt(48).EUt(512000))
    .EUt(500000)
    .duration(1000)
    .buildAndRegister();