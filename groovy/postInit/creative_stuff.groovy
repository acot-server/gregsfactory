import gregtech.*

def assembler = recipemap('assembler');
def assembly_line = recipemap('assembly_line');
def research_station = recipemap('research_station');

//Creatif quantum tank
assembly_line.recipeBuilder()
    .inputs(
        metaitem('quantum_tank.uhv') * 64,
        metaitem('gravistar') * 32,
        metaitem('electric.pump.opv') * 64,
        item('contenttweaker:omega_universal_mainframe') * 2
    )
    .fluidInputs(
        fluid('wakfustasis') * 64000
    )
    .outputs(metaitem('creative_tank') * 1)
    .stationResearch(b -> b.researchStack(metaitem('quantum_tank.uhv')).CWUt(256,102400000).EUt(900000000))
    .EUt(2000000000)
    .duration(400)
    .buildAndRegister();

//Creatif quantum chest
assembly_line.recipeBuilder()
    .inputs(
        metaitem('quantum_chest.uhv') * 64,
        metaitem('quantum_chest.uhv') * 64,
        item('nae2:material', 4) * 64,
        item('nae2:material', 4) * 64,
        metaitem('conveyor.module.opv') * 64,
        metaitem('conveyor.module.opv') * 64,
        item('avaritiaddons:avaritiaddons_chest', 1) * 4,
        metaitem('gravistar') * 64,
        metaitem('robot.arm.opv') * 64,
        metaitem('robot.arm.opv') * 64,
        item('contenttweaker:omega_universal_mainframe') * 64
    )
    .fluidInputs(
        fluid('wakfustasis') * 64000
    )
    .outputs(metaitem('creative_chest') * 1)
    .stationResearch(b -> b.researchStack(metaitem('quantum_chest.uhv')).CWUt(256,102400000).EUt(900000000))
    .EUt(2000000000)
    .duration(400)
    .buildAndRegister();

//Creatif energy emmiter
assembly_line.recipeBuilder()
    .inputs(
        metaitem('devtech:wakfugenerator.max') * 64,
        metaitem('devtech:wakfugenerator.max') * 64,
        metaitem('field.generator.opv') * 64,
        metaitem('field.generator.opv') * 64,
        metaitem('emitter.opv') * 64,
        metaitem('emitter.opv') * 64,
        metaitem('sensor.opv') * 64,
        metaitem('sensor.opv') * 64,
        metaitem('gravistar') * 64,
        metaitem('max.battery') * 64,
        metaitem('max.battery') * 64,
        item('contenttweaker:omega_universal_mainframe') * 4
    )
    .fluidInputs(
        fluid('wakfustasis') * 64000
    )
    .outputs(metaitem('infinite_energy') * 1)
    .stationResearch(b -> b.researchStack(metaitem('max.battery')).CWUt(256,102400000).EUt(900000000))
    .EUt(2000000000)
    .duration(400)
    .buildAndRegister();