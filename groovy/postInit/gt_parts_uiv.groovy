import gregtech.*;


def assembler = recipemap('assembler');
def assembly_line = recipemap('assembly_line');
def research_station = recipemap('research_station');
    

assembly_line.recipeBuilder()
    .inputs(
        metaitem('stickLongSamariumMagnetic') * 1,
        metaitem('stickLongStellarite') * 2,
        metaitem('ringStellarite') * 4,
        metaitem('roundStellarite') * 8,
        metaitem('wireFineStellarite') * 64,
        metaitem('wireFineStellarite') * 64,
        metaitem('cableGtDoubleStellarite') * 1
    )
    .fluidInputs(
        fluid('soldering_alloy') * 3000,
        fluid('lubricant') * 2000,
        fluid('darkenergyalloy') * 16000
    )
    .outputs(metaitem('electric.motor.uiv') * 2)
    .stationResearch(b -> b.researchStack(metaitem('electric.motor.uev')).CWUt(96).EUt(8192000))
    .EUt(10000000)
    .duration(1000)
    .buildAndRegister();

assembly_line.recipeBuilder()
    .inputs(
        metaitem('electric.motor.uiv') * 1,
        metaitem('rotorStellarite') * 1,
        metaitem('ringStyreneButadieneRubber') * 32,
        metaitem('screwStellarite') * 4,
        metaitem('pipeLargeFluidNeutronium') * 2,
        metaitem('cableGtDoubleStellarite') * 1
    )
    .fluidInputs(
        fluid('soldering_alloy') * 3000,
        fluid('lubricant') * 2000,
        fluid('darkenergyalloy') * 16000,
        fluid('styrene_butadiene_rubber') * 2500
    )
    .outputs(metaitem('electric.pump.uiv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('electric.pump.uev')).CWUt(96).EUt(8192000))
    .EUt(10000000)
    .duration(1000)
    .buildAndRegister();

//OPV Conveyor
assembly_line.recipeBuilder()
    .inputs(
        metaitem('electric.motor.uiv') * 1,
        metaitem('plateStyreneButadieneRubber') * 2,
        metaitem('gearSmallStellarite') * 4,
        metaitem('roundStellarite') * 16,
        metaitem('screwStellarite') * 4,
        metaitem('cableGtDoubleStellarite') * 1
    )
    .fluidInputs(
        fluid('soldering_alloy') * 3000,
        fluid('lubricant') * 2000,
        fluid('darkenergyalloy') * 16000,
        fluid('styrene_butadiene_rubber') * 2500
    )
    .outputs(metaitem('conveyor.module.uiv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('conveyor.module.uev')).CWUt(96).EUt(8192000))
    .EUt(10000000)
    .duration(1000)
    .buildAndRegister();

//OPV Piston
assembly_line.recipeBuilder()
    .inputs(
        metaitem('electric.motor.uiv') * 1,
        metaitem('plateStellarite') * 4,
        metaitem('ringStellarite') * 4,
        metaitem('roundStellarite') * 16,
        metaitem('stickStellarite') * 4,
        metaitem('gearStellarite') * 1,
        metaitem('gearSmallStellarite') * 2,
        metaitem('cableGtSingleStellarite') * 2
    )
    .fluidInputs(
        fluid('lubricant') * 1000,
        fluid('soldering_alloy') * 576,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('stellarite') * 16000
    )
    .outputs(metaitem('electric.piston.uiv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('electric.piston.uev')).CWUt(96).EUt(8192000))
    .EUt(10000000)
    .duration(1000)
    .buildAndRegister();

//OPV Robot Arm
assembly_line.recipeBuilder()
    .inputs(
        metaitem('stickLongStellarite') * 4,
        metaitem('gearStellarite') * 1,
        metaitem('gearSmallStellarite') * 3,
        metaitem('electric.motor.uiv') * 2,
        metaitem('electric.piston.uiv') * 1,
        ore('circuitUiv') * 1,
        ore('circuitUev') * 2,
        ore('circuitUhv') * 4,
        metaitem('cableGtSingleStellarite') * 4
    )
    .fluidInputs(
        fluid('lubricant') * 1000,
        fluid('soldering_alloy') * 1728,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('stellarite') * 16000
    )
    .outputs(metaitem('robot.arm.uiv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('robot.arm.uev')).CWUt(96).EUt(8192000))
    .EUt(10000000)
    .duration(1000)
    .buildAndRegister();

//OPV Field Generator
assembly_line.recipeBuilder()
    .inputs(
        metaitem('frameTritanium') * 1,
        metaitem('plateStellarite') * 6,
        metaitem('gravistar') * 1,
        metaitem('emitter.uiv') * 2,
        ore('circuitUiv') * 2,
        metaitem('wireFineStellarite') * 64,
        metaitem('wireFineStellarite') * 64,
        metaitem('cableGtSingleStellarite') * 4
    )
    .fluidInputs(
        fluid('soldering_alloy') * 1728,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('stellarite') * 16000
    )
    .outputs(metaitem('field.generator.uiv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('field.generator.uev')).CWUt(96).EUt(8192000))
    .EUt(10000000)
    .duration(1000)
    .buildAndRegister();
    
//OPV Emitter
assembly_line.recipeBuilder()
    .inputs(
        metaitem('frameTritanium') * 1,
        metaitem('electric.motor.uiv') * 1,
        metaitem('stickLongStellarite') * 4,
        metaitem('gravistar') * 1,
        ore('circuitUiv') * 2,
        metaitem('foilStellarite') * 64,
        metaitem('foilStellarite') * 32,
        metaitem('cableGtSingleStellarite') * 4
    )
    .fluidInputs(
        fluid('soldering_alloy') * 1152,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('stellarite') * 16000
    )
    .outputs(metaitem('emitter.uiv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('emitter.uiv')).CWUt(96).EUt(8192000))
    .EUt(10000000)
    .duration(1000)
    .buildAndRegister();

//OPV Sensor
assembly_line.recipeBuilder()
    .inputs(
        metaitem('frameTritanium') * 1,
        metaitem('electric.motor.uiv') * 1,
        metaitem('plateRunicalloy') * 4,
        metaitem('gravistar') * 1,
        ore('circuitUiv') * 2,
        metaitem('foilStellarite') * 64,
        metaitem('foilStellarite') * 32,
        metaitem('cableGtSingleStellarite') * 4
    )
    .fluidInputs(
        fluid('soldering_alloy') * 1152,
        fluid('ruthenium_trinium_americium_neutronate') * 576,
        fluid('stellarite') * 16000
    )
    .outputs(metaitem('sensor.uiv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('sensor.uiv')).CWUt(96).EUt(8192000))
    .EUt(10000000)
    .duration(1000)
    .buildAndRegister();