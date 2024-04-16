import gregtech.*;


def assembler = recipemap('assembler');
def assembly_line = recipemap('assembly_line');
def research_station = recipemap('research_station');
    

assembly_line.recipeBuilder()
    .inputs(
        metaitem('stickLongSamariumMagnetic') * 1,
        metaitem('stickLongNeutronium') * 2,
        metaitem('ringHsse') * 4,
        metaitem('roundTritanium') * 8,
        metaitem('wireFineWakfu') * 64,
        metaitem('wireFineWakfu') * 64,
        metaitem('cableGtSingleEuropium') * 1
    )
    .fluidInputs(
        fluid('soldering_alloy') * 3000,
        fluid('lubricant') * 2000,
        fluid('neutronium') * 8000,
    )
    .outputs(metaitem('electric.motor.uhv') * 2)
    .stationResearch(b -> b.researchStack(metaitem('electric.motor.uv')).CWUt(48).EUt(512000))
    .EUt(400000)
    .duration(600)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs(
        metaitem('electric.motor.uhv') * 1,
        metaitem('rotorHsss') * 1,
        metaitem('ringStyreneButadieneRubber') * 16,
        metaitem('screwNeutronium') * 4,
        metaitem('pipeLargeFluidNeutronium') * 2,
        metaitem('cableGtSingleEuropium') * 1
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
    .duration(600)
    .buildAndRegister();

//OPV Conveyor
assembly_line.recipeBuilder()
    .inputs(
        metaitem('electric.motor.uhv') * 1,
        metaitem('plateStyreneButadieneRubber') * 2,
        metaitem('gearSmallWakfu') * 4,
        metaitem('roundTritanium') * 16,
        metaitem('screwNeutronium') * 4,
        metaitem('cableGtSingleEuropium') * 1
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
    .duration(600)
    .buildAndRegister();

//OPV Piston
assembly_line.recipeBuilder()
    .inputs(
        metaitem('electric.motor.uhv') * 1,
        metaitem('plateWakfu') * 4,
        metaitem('ringHsse') * 4,
        metaitem('roundTritanium') * 16,
        metaitem('stickNeutronium') * 4,
        metaitem('gearNeutronium') * 1,
        metaitem('gearSmallWakfu') * 2,
        metaitem('cableGtSingleEuropium') * 1
    )
    .fluidInputs(
        fluid('lubricant') * 1000,
        fluid('soldering_alloy') * 576,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('wakfu') * 16000
    )
    .outputs(metaitem('electric.piston.uhv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('electric.piston.uv')).CWUt(48).EUt(512000))
    .EUt(500000)
    .duration(600)
    .buildAndRegister();

//OPV Robot Arm
assembly_line.recipeBuilder()
    .inputs(
        metaitem('stickLongNeutronium') * 4,
        metaitem('gearNeutronium') * 1,
        metaitem('gearSmallWakfu') * 3,
        metaitem('electric.motor.uhv') * 2,
        metaitem('electric.piston.uhv') * 1,
        ore('circuitUhv') * 1,
        ore('circuitUv') * 2,
        ore('circuitZpm') * 4,
        metaitem('cableGtSingleEuropium') * 2
    )
    .fluidInputs(
        fluid('lubricant') * 1000,
        fluid('soldering_alloy') * 1728,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('wakfu') * 16000
    )
    .outputs(metaitem('robot.arm.uhv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('robot.arm.uv')).CWUt(48).EUt(512000))
    .EUt(500000)
    .duration(600)
    .buildAndRegister();

//OPV Field Generator
assembly_line.recipeBuilder()
    .inputs(
        metaitem('frameWakfu') * 1,
        metaitem('plateDarmstadtium') * 6,
        metaitem('gravistar') * 1,
        metaitem('emitter.uhv') * 2,
        ore('circuitUhv') * 2,
        metaitem('wireFineWakfu') * 64,
        metaitem('wireFineWakfu') * 64,
        metaitem('cableGtSingleEuropium') * 4
    )
    .fluidInputs(
        fluid('soldering_alloy') * 1728,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('wakfu') * 16000
    )
    .outputs(metaitem('field.generator.uhv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('field.generator.uv')).CWUt(48).EUt(512000))
    .EUt(500000)
    .duration(600)
    .buildAndRegister();
    
//OPV Emitter
assembly_line.recipeBuilder()
    .inputs(
        metaitem('frameWakfu') * 1,
        metaitem('electric.motor.uhv') * 1,
        metaitem('stickLongNeutronium') * 4,
        metaitem('gravistar') * 1,
        ore('circuitUhv') * 2,
        metaitem('foilEnrichedNaquadahTriniumEuropiumDuranide') * 64,
        metaitem('foilEnrichedNaquadahTriniumEuropiumDuranide') * 32,
        metaitem('cableGtSingleEuropium') * 2
    )
    .fluidInputs(
        fluid('soldering_alloy') * 1152,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('wakfu') * 16000
    )
    .outputs(metaitem('emitter.uhv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('emitter.uv')).CWUt(48).EUt(512000))
    .EUt(500000)
    .duration(600)
    .buildAndRegister();

//OPV Sensor
assembly_line.recipeBuilder()
    .inputs(
        metaitem('frameWakfu') * 1,
        metaitem('electric.motor.uhv') * 1,
        metaitem('plateDarmstadtium') * 4,
        metaitem('gravistar') * 1,
        ore('circuitUhv') * 2,
        metaitem('foilEnrichedNaquadahTriniumEuropiumDuranide') * 64,
        metaitem('foilEnrichedNaquadahTriniumEuropiumDuranide') * 32,
        metaitem('cableGtSingleEuropium') * 2
    )
    .fluidInputs(
        fluid('soldering_alloy') * 1152,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('wakfu') * 16000
    )
    .outputs(metaitem('sensor.uhv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('sensor.uv')).CWUt(48).EUt(512000))
    .EUt(500000)
    .duration(600)
    .buildAndRegister();