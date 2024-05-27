import gregtech.*

def assembler = recipemap('assembler');
def assembly_line = recipemap('assembly_line');
def research_station = recipemap('research_station');

//Creatif quantum tank
assembly_line.recipeBuilder()
    .inputs(
        metaitem('quantum_tank.uhv') * 16,
        metaitem('gravistar') * 64,
        metaitem('electric.pump.opv') * 16,
        item('nae2:material', 8) * 16,
        metaitem('circuit.omega_universal_supercomputer') * 4
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
        metaitem('infinite_energy') * 16,
        metaitem('creative_tank') * 16,
        metaitem('quantum_chest.uhv') * 16,
        item('nae2:material', 4) * 16,
        metaitem('conveyor.module.opv') * 16,
        item('avaritiaddons:avaritiaddons_chest', 1) * 4,
        metaitem('gravistar') * 64,
        metaitem('robot.arm.opv') * 16,
        metaitem('circuit.omega_universal_supercomputer') * 64
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
        metaitem('wakfu_reactor.max') * 16,
        metaitem('field.generator.opv') * 16,
        metaitem('emitter.opv') * 16,
        metaitem('sensor.opv') * 16,
        metaitem('gravistar') * 64,
        metaitem('max.battery') * 8,
        metaitem('circuit.omega_universal_supercomputer') * 4
    )
    .fluidInputs(
        fluid('wakfustasis') * 64000
    )
    .outputs(metaitem('infinite_energy') * 1)
    .stationResearch(b -> b.researchStack(metaitem('max.battery')).CWUt(256,102400000).EUt(900000000))
    .EUt(2000000000)
    .duration(400)
    .buildAndRegister();