import gregtech.*;


def assembler = recipemap('assembler');
def assembly_line = recipemap('assembly_line');
def research_station = recipemap('research_station');

def motor = metaitem('electric.motor.uhv');
def pump = metaitem('electric.pump.uhv');
def conveyor = metaitem('conveyor.module.uhv');
def piston = metaitem('electric.piston.uhv');
def RobotArm = metaitem('robot.arm.uhv');
def Field_Gen = metaitem('field.generator.uhv');
def Emitter = metaitem('emitter.uhv');
def Sensor = metaitem('sensor.uhv');
def circuitZPM = ore('circuitZpm'); //ZPM Circuit
def circuitUV = ore('circuitUv'); //UV Circuit
def circuitUHV = ore('circuitUhv'); //UHV Circuit
def circuitUEV = ore('circuitUev'); //Enigmatic Resonating Circuit
def circuitUIV = ore('circuitUiv'); //Matrioska Brain Circuit
def circuitUXV = ore('circuitUxv'); //Runic Resonating Circuit
def circuitOPV = ore('circuitOpv'); //Stellarborn Basic Computer
def Plate = metaitem('plateDarkmatteralloy'); //Runic Alloy Alloy Plate
def Rod = metaitem('stickDarkmatteralloy'); //Runic Alloy Alloy Rod
def Lrod = metaitem('stickLongDarkmatteralloy'); //Runic Alloy Alloy Long Rod
def Ring = metaitem('ringDarkmatteralloy'); //Runic Alloy Alloy Ring
def Round = metaitem('roundDarkmatteralloy'); //Runic Alloy Alloy Round
def Spring = metaitem('springDarkmatteralloy'); //Runic Alloy Alloy Sping
def Sspring = metaitem('springSmallDarkmatteralloy'); //Runic Alloy Alloy Small Spring
def Gear = metaitem('gearDarkmatteralloy'); //Runic Alloy Alloy Gear
def Sgear = metaitem('gearSmallDarkmatteralloy'); //Runic Alloy Alloy Small Gear
def Screw = metaitem('screwDarkmatteralloy'); //Runic Alloy Alloy Screw
def FineW = metaitem('wireFineDarkmatteralloy'); //Runic Alloy Alloy Fine Wire
def Rotor = metaitem('rotorWakfu'); //Wakfu Rotor
def foil = metaitem('foilDarkmatteralloy'); //Runic Alloy Alloy Foil
def cable = metaitem('cableGtSingleWakfu'); //Wakfu Cable 1x
def cable2 = metaitem('wireGtOctalWakfu'); //Wakfu Wire 8x
def Buzzsaw = metaitem('toolHeadBuzzSawDarkmatteralloy'); //Runic Alloy Alloy Buzzsaw
def Bolt = metaitem('boltDarkmatteralloy'); //Runic Alloy Bolt
def PBIplate = metaitem('platePolybenzimidazole'); //PBI Plate
def casing = item('gregtech:machine_casing', 10); //UHV Machine Casing
def hull = metaitem('hull.uhv'); //UHV Machine Hull
def NqAlloy = metaitem('wireGtQuadrupleNaquadahAlloy'); //Naquadah Alloy Wire 4x
def Grinder = metaitem('component.grinder.tungsten'); //Tungsten Grinding Head
def NqAlloy2 = metaitem('wireGtOctalNaquadahAlloy'); //Naquadah Alloy Wire 8x
def glass = item('minecraft:glass');
def blaze = item('minecraft:blaze_rod');
def Os_wire = metaitem('wireGtSingleOsmium'); //Osmium Wire 1x
def fus_glass = item('gregtech:transparent_casing', 1); //Fusion Casing
def bars = item('minecraft:iron_bars');
def Ffilter = metaitem('fluid_filter'); //Fluid Filter
def Ifilter = metaitem('item_filter'); //Item Filter
def LMSmRod = metaitem('stickLongSamariumMagnetic'); //Long Magnetic Samarium Rod
def Liquid1 = fluid('ruthenium_trinium_americium_neutronate'); //Ruthenium Trinium Americium Neutronate
def liquid2 = fluid('soldering_alloy'); //Soldering Alloy
def liquid3 = fluid('styrene_butadiene_rubber'); //Styrene Butadiene Rubber
def liquid4 = fluid('lubricant'); //Lubricant
def LNtFpipe = metaitem('pipeLargeFluidNeutronium'); //Large Neutronium Fluid Pipe
def SBring = metaitem('ringStyreneButadieneRubber'); //Styrene butadiene rubber ring
def gstar = metaitem('gravistar'); //Gravi-Star
def frame = metaitem('frameWakfu'); //Tritanium Frame
def SMDT = metaitem('component.smd.transistor.quantum'); //SMD quantum Transistor
def SMDC = metaitem('component.smd.capacitor.quantum'); //SMD quantum Capacitor
def SMDR = metaitem('component.smd.resistor.quantum'); //SMD quantum Resistor
def SMDD = metaitem('component.smd.diode.quantum'); //SMD quantum Diode


//Epic Electric Furnace I
crafting.addShaped('Epic Electric Furnace I', item('gregtech:machine', 58) * 1,
    [
        [circuitUHV,NqAlloy,circuitUHV],
        [NqAlloy,hull,NqAlloy],
        [cable,NqAlloy,cable]
    ]);


//Epic Alloy Smleter I
crafting.addShaped('Epic Alloy Smelter I',item('gregtech:machine', 88) * 1,
    [
        [circuitUHV,NqAlloy2,circuitUHV],
        [NqAlloy2,hull,NqAlloy2],
        [cable,NqAlloy2,cable]
    ]);



//Epic Chemical Reactor I
crafting.addShaped('Epic Chemical Reactor I', item('gregtech:machine', 223) * 1,
    [
        [item('gregtech:fluid_pipe_tiny', 127),Rotor,item('gregtech:fluid_pipe_tiny', 127)],
        [cable,motor,cable],
        [circuitUHV,hull,circuitUHV]
    ]);


//Epic Electrolyzer I
crafting.addShaped('Epic Electrolyzer I', item('gregtech:machine', 283) * 1,
    [
        [Os_wire,fus_glass,Os_wire],
        [Os_wire,hull,Os_wire],
        [circuitUHV,cable,circuitUHV]
    ]);

//Epic Electromagnetic Separator I
crafting.addShaped('Epic Electromagnetic Separator I', item('gregtech:machine', 298) * 1,
    [
        [conveyor,cable,cable2],
        [cable,hull,Lrod],
        [circuitUHV,cable,cable2]
    ]);

//Epic Extruder I
crafting.addShaped('Epic Extruder I', item('gregtech:machine', 328) * 1,
    [
        [NqAlloy2,NqAlloy2,circuitUHV],
        [piston,hull,item('gregtech:fluid_pipe_tiny', 127)],
        [NqAlloy2,NqAlloy2,circuitUHV]
    ]);

//Epic Fluid Heater I
crafting.addShaped('Epic Fluid Heater I', item('gregtech:machine', 388) * 1,
    [
        [NqAlloy2,fus_glass,NqAlloy2],
        [pump,hull,pump],
        [cable,circuitUHV,cable]
    ]);

//Epic Mixer I
crafting.addShaped('Epic Mixer I', item('gregtech:machine', 478) * 1,
    [
        [fus_glass,Rotor,fus_glass],
        [fus_glass,motor,fus_glass],
        [circuitUHV,hull,circuitUHV]
    ]);

//Epic Ore Washing Plant I
crafting.addShaped('Epic Ore Washing Plant I', item('gregtech:machine', 493) * 1,
    [
        [Rotor,fus_glass,Rotor],
        [circuitUHV,motor,circuitUHV],
        [cable,hull,cable]
    ]);

//Epic Polarizer I
crafting.addShaped('Epic Polarizer I', item('gregtech:machine', 553) * 1,
    [
        [NqAlloy2,Lrod,NqAlloy2],
        [cable,hull,cable],
        [NqAlloy2,Lrod,NqAlloy2]
    ]);

//Epic Thermal Centrifuge I
crafting.addShaped('Epic Thermal Centrifuge I', item('gregtech:machine', 613) * 1,
    [
        [circuitUHV,motor,circuitUHV],
        [NqAlloy2,hull,NqAlloy2],
        [cable,motor,cable]
    ]);

//Wakfu Reactor MK1
crafting.addShaped('Wakfu Reactor Mk1', item('gregtech:machine', 32112) * 1,
    [
        [Emitter,Field_Gen,Emitter],
        [cable,hull,cable],
        [circuitUV,circuitUHV,circuitUV]
    ]);

//UHV 4x Battery Buffer
crafting.addShaped('UHV 4x Battery Buffer', item('gregtech:machine', 1324) * 1,
    [
        [null,null,null],
        [cable,item('minecraft:chest'),cable],
        [cable,hull,cable]
    ]);

//UHV 8x Battery Buffer
crafting.addShaped('UHV 8x Battery Buffer', item('gregtech:machine', 1338) * 1,
    [
        [null,null,null],
        [cable,item('minecraft:chest'),cable],
        [cable2,hull,cable2]
    ]);

//UHV 16x Battery Buffer
crafting.addShaped('UHV 16x Battery Buffer', item('gregtech:machine', 1352) * 1,
    [
        [null,null,null],
        [cable2,item('minecraft:chest'),cable2],
        [cable2,hull,cable2]
    ]);

//Dark Matter Capacitor
assembly_line.recipeBuilder()
    .inputs(
        metaitem('circuit_board.wetware') * 1,
        Plate * 16,
        circuitUHV * 4,
        metaitem('energy.cluster') * 1,
        metaitem('plate.extreme_high_power_integrated_circuit') * 8,
        SMDD * 16,
        SMDC * 16,
        SMDR * 16,
        SMDT * 16,
        FineW * 64,
        Bolt * 16
    )
    .fluidInputs(
        liquid2 * 2880,
        fluid('polybenzimidazole') * 576
    )
    .outputs(metaitem('delta.uhv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('energy.cluster')).CWUt(48).EUt(576000))
    .EUt(1000000)
    .duration(1500)
    .buildAndRegister();

// Energy Cluster * 1
mods.gregtech.assembly_line.removeByInput(200000, [metaitem('circuit_board.wetware'), metaitem('plateAmericium') * 16, metaitem('circuit.wetware_computer') * 4, metaitem('energy.module'), metaitem('field.generator.zpm'), metaitem('plate.ultra_high_power_integrated_circuit') * 32, metaitem('component.advanced_smd.diode') * 16, metaitem('component.advanced_smd.capacitor') * 16, metaitem('component.advanced_smd.resistor') * 16, metaitem('component.advanced_smd.transistor') * 16, metaitem('component.advanced_smd.inductor') * 16, metaitem('wireFineOsmiridium') * 64, metaitem('boltNaquadria') * 16], [fluid('soldering_alloy') * 2880, fluid('polybenzimidazole') * 576])


assembly_line.recipeBuilder()
    .inputs(
        metaitem('circuit_board.enigmatic') * 1,
        metaitem('plateAmericium') * 16,
        ore('circuitUv') * 4,
        metaitem('energy.module') * 1,
        metaitem('field.generator.zpm') * 1,
        metaitem('plate.ultra_high_power_integrated_circuit') * 8,
        SMDD * 16, 
        SMDC * 16, 
        SMDR * 16, 
        SMDT * 16, 
        metaitem('wireFineOsmiridium') * 64, 
        metaitem('boltNaquadria') * 16
    )
    .fluidInputs(
        fluid('soldering_alloy') * 2880, 
        fluid('polybenzimidazole') * 576  
    )
    .outputs(metaitem('energy.cluster') * 1)
    .stationResearch(b -> b.researchStack(metaitem('energy.module')).CWUt(32).EUt(144000))
    .EUt(200000)
    .duration(1400)
    .buildAndRegister();

//Laser Target

//256A OpV
assembler.recipeBuilder()
    .inputs(
        metaitem('hull.uhv') * 1,
        metaitem('lensDiamond') * 1,
        metaitem('emitter.uhv') * 1,
        metaitem('electric.pump.uhv') * 1,
        metaitem('wireGtSingleRutheniumTriniumAmericiumNeutronate') * 1
    )
    .circuitMeta(1)
    .outputs(metaitem('laser_hatch.target_256a.uhv') * 1)
    .EUt(1966080)
    .duration(300)
    .buildAndRegister();

//1024A OpV
assembler.recipeBuilder()
    .inputs(
        metaitem('hull.uhv') * 1,
        metaitem('lensDiamond') * 2,
        metaitem('emitter.uhv') * 2,
        metaitem('electric.pump.uhv') * 2,
        metaitem('wireGtDoubleRutheniumTriniumAmericiumNeutronate') * 2
    )
    .circuitMeta(2)
    .outputs(metaitem('laser_hatch.target_1024a.uhv') * 1)
    .EUt(1966080)
    .duration(300)
    .buildAndRegister();

//1024A OpV
assembler.recipeBuilder()
    .inputs(
        metaitem('hull.uhv') * 1,
        metaitem('lensDiamond') * 4,
        metaitem('emitter.uhv') * 4,
        metaitem('electric.pump.uhv') * 4,
        metaitem('wireGtQuadrupleRutheniumTriniumAmericiumNeutronate') * 4
    )
    .circuitMeta(3)
    .outputs(metaitem('laser_hatch.target_4096a.uhv') * 1)
    .EUt(1966080)
    .duration(300)
    .buildAndRegister();

//Laser Source

//256A OpV
assembler.recipeBuilder()
    .inputs(
        metaitem('hull.uhv') * 1,
        metaitem('lensDiamond') * 1,
        metaitem('sensor.uhv') * 1,
        metaitem('electric.pump.uhv') * 1,
        metaitem('wireGtSingleRutheniumTriniumAmericiumNeutronate') * 1
    )
    .circuitMeta(1)
    .outputs(metaitem('laser_hatch.source_256a.uhv') * 1)
    .EUt(1966080)
    .duration(300)
    .buildAndRegister();

//1024A OpV
assembler.recipeBuilder()
    .inputs(
        metaitem('hull.uhv') * 1,
        metaitem('lensDiamond') * 2,
        metaitem('sensor.uhv') * 2,
        metaitem('electric.pump.uhv') * 2,
        metaitem('wireGtDoubleRutheniumTriniumAmericiumNeutronate') * 2
    )
    .circuitMeta(2)
    .outputs(metaitem('laser_hatch.source_1024a.uhv') * 1)
    .EUt(1966080)
    .duration(300)
    .buildAndRegister();

//4096A OpV
assembler.recipeBuilder()
    .inputs(
        metaitem('hull.uhv') * 1,
        metaitem('lensDiamond') * 4,
        metaitem('sensor.uhv') * 4,
        metaitem('electric.pump.uhv') * 4,
        metaitem('wireGtQuadrupleRutheniumTriniumAmericiumNeutronate') * 4
    )
    .circuitMeta(3)
    .outputs(metaitem('laser_hatch.source_4096a.uhv') * 1)
    .EUt(1966080)
    .duration(300)
    .buildAndRegister();

//UEV Transformer
crafting.addShaped('UHV Transformer', metaitem('transformer.uhv') * 1,
    [
        [metaitem('component.smd.transistor.quantum'),metaitem('cableGtSingleWakfu'),metaitem('cableGtSingleWakfu')],
        [metaitem('cableGtSingleStasis'),metaitem('hull.uhv'),null],
        [metaitem('component.smd.capacitor.quantum'),metaitem('cableGtSingleWakfu'),metaitem('cableGtSingleWakfu')]
    ]);

//UEV Transformer Hi-Amp
crafting.addShaped('UHV Transformer Hi-Amp', metaitem('transformer.hi_amp.uhv') * 1,
    [
        [metaitem('delta.uhv'),metaitem('cableGtQuadrupleWakfu'),metaitem('cableGtQuadrupleWakfu')],
        [metaitem('cableGtQuadrupleStasis'),metaitem('transformer.uhv'),null],
        [ore('circuitUiv'),metaitem('cableGtQuadrupleWakfu'),metaitem('cableGtQuadrupleWakfu')]
    ]);

//UHV Power Transformer
assembler.recipeBuilder()
    .inputs(
        metaitem('transformer.hi_amp.uhv') * 1,
        metaitem('electric.pump.luv') * 1,
        metaitem('cableGtOctalStasis') * 1,
        metaitem('cableGtHexWakfu') * 4,
        metaitem('springWakfu') * 2,
        metaitem('springSmallStasis') * 1
    )
    .fluidInputs(fluid('sodium_potassium') * 2000)
    .outputs(metaitem('transformer.adjustable.uhv') * 1)
    .EUt(491520)
    .duration(200)
    .buildAndRegister();

//Energy Hatch
assembly_line.recipeBuilder()
    .inputs(
        metaitem('hull.uhv') * 1,
        metaitem('cableGtSingleWakfu') * 1,
        metaitem('plate.extreme_high_power_integrated_circuit') * 8,
        ore('circuitUhv') * 1,
        metaitem('delta.uhv') * 1
    )
    .fluidInputs(
        fluid('sodium_potassium') * 16000,
        fluid('soldering_alloy') * 55296
        )
    .outputs(metaitem('energy_hatch.input.uhv') * 1)
    .EUt(1966080)
    .duration(1000)
    .buildAndRegister();

//4A Energy Hatch
assembler.recipeBuilder()
    .inputs(
        metaitem('energy_hatch.input.uhv') * 2,
        metaitem('plate.extreme_high_power_integrated_circuit') * 8,
        metaitem('cableGtDoubleWakfu') * 1,
        metaitem('energy.cluster') * 1,
        metaitem('transformer.uhv') * 1
    )
    .outputs(metaitem('energy_hatch.input_4a.uhv') * 1)
    .EUt(491520)
    .duration(100)
    .buildAndRegister();

//16A Energy Hatch   
assembler.recipeBuilder()
    .inputs(
        metaitem('energy_hatch.input_4a.uhv') * 2,
        metaitem('plate.extreme_high_power_integrated_circuit') * 8,
        metaitem('cableGtDoubleWakfu') * 1,
        metaitem('energy.cluster') * 1,
        metaitem('transformer.hi_amp.uhv') * 1
    )
    .outputs(metaitem('energy_hatch.input_16a.uhv') * 1)
    .EUt(491520)
    .duration(100)
    .buildAndRegister();

//64A Substation Hatch
assembler.recipeBuilder()
    .inputs(
        metaitem('energy_hatch.input_16a.uhv') * 2,
        metaitem('plate.extreme_high_power_integrated_circuit') * 8,
        metaitem('cableGtDoubleWakfu') * 1,
        metaitem('energy.cluster') * 1,
        metaitem('transformer.adjustable.uhv') * 1
    )
    .outputs(metaitem('substation_hatch.input_64a.uhv') * 1)
    .EUt(491520)
    .duration(100)
    .buildAndRegister();

//Dynamo Hatch
assembly_line.recipeBuilder()
    .inputs(
        metaitem('hull.uhv') * 1,
        metaitem('cableGtSingleWakfu') * 1,
        metaitem('plate.extreme_high_power_integrated_circuit') * 8,
        ore('circuitUev') * 1,
        metaitem('emitter.uhv') * 1
    )
    .fluidInputs(
        fluid('sodium_potassium') * 16000,
        fluid('soldering_alloy') * 55296
        )
    .outputs(metaitem('energy_hatch.output.uhv') * 1)
    .EUt(1966080)
    .duration(1000)
    .buildAndRegister();

//4A Dynamo Hatch
assembler.recipeBuilder()
    .inputs(
        metaitem('energy_hatch.output.uhv') * 2,
        metaitem('plate.extreme_high_power_integrated_circuit') * 8,
        metaitem('cableGtDoubleWakfu') * 1,
        metaitem('energy.cluster') * 1,
        metaitem('transformer.uhv') * 1,
        metaitem('emitter.uhv') * 2
    )
    .outputs(metaitem('energy_hatch.output_4a.uhv') * 1)
    .EUt(491520)
    .duration(100)
    .buildAndRegister();

//16A Dynamo Hatch   
assembler.recipeBuilder()
    .inputs(
        metaitem('energy_hatch.output_4a.uhv') * 2,
        metaitem('plate.extreme_high_power_integrated_circuit') * 8,
        metaitem('cableGtDoubleWakfu') * 1,
        metaitem('energy.cluster') * 1,
        metaitem('transformer.hi_amp.uhv') * 1,
        metaitem('emitter.uhv') * 4
    )
    .outputs(metaitem('energy_hatch.output_16a.uhv') * 1)
    .EUt(491520)
    .duration(100)
    .buildAndRegister();

//64A Substation Dynamo Hatch
assembler.recipeBuilder()
    .inputs(
        metaitem('energy_hatch.output_16a.uhv') * 2,
        metaitem('plate.extreme_high_power_integrated_circuit') * 8,
        metaitem('cableGtDoubleWakfu') * 1,
        metaitem('energy.cluster') * 1,
        metaitem('transformer.adjustable.uhv') * 1,
        metaitem('emitter.uhv') * 16
    )
    .outputs(metaitem('substation_hatch.output_64a.uhv') * 1)
    .EUt(491520)
    .duration(100)
    .buildAndRegister();
