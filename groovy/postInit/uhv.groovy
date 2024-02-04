import gregtech.*;


def assembler = recipemap('assembler');
def assembly_line = recipemap('assembly_line');
def research_station = recipemap('research_station');
def centrifuge = recipemap('centrifuge');    

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
def Rotor = metaitem('rotorDarkmatteralloy'); //Runic Alloy Alloy Rotor
def foil = metaitem('foilDarkmatteralloy'); //Runic Alloy Alloy Foil
def cable = metaitem('cableGtSingleDarkmatteralloy'); //Runic Alloy Alloy Cable
def cable2 = metaitem('wireGtOctalDarkmatteralloy'); //Runic Alloy Alloy Wire 8x
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
def frame = metaitem('frameTritanium'); //Tritanium Frame
def UHPIC = metaitem('plate.ultra_high_power_integrated_circuit'); //UHPIC
def SMDT = metaitem('component.smd.transistor.wetware'); //SMD Wetware Transistor
def SMDC = metaitem('component.smd.capacitor.wetware'); //SMD Wetware Capacitor
def SMDR = metaitem('component.smd.resistor.wetware'); //SMD Wetware Resistor
def SMDD = metaitem('component.smd.diode.wetware'); //SMD Wetware Diode

//UHV Machine Casing
crafting.addShaped('UHV Machine Casing', item('gregtech:machine_casing', 9) * 1,
    [
        [Plate,Plate,Plate],
        [Plate,cable,Plate],
        [Plate,Plate,Plate]
    ]);

assembler.recipeBuilder()
    .inputs(Plate * 8)
    .circuitMeta(8)
    .outputs(casing * 1)
    .duration(20)
    .EUt(8)
    .buildAndRegister();

//UHV Machine Hull
crafting.addShaped('UHV Machine Hull', item('gregtech:machine', 994) * 1,
    [
        [null,null,null],
        [PBIplate,Plate,PBIplate],
        [cable,casing,cable],
    ]);

assembler.recipeBuilder()
    .inputs(
        casing * 1,
        Plate * 1,
        cable * 1
    )
    .fluidInputs(fluid('polybenzimidazole') * 288)
    .outputs(hull * 1)
    .duration(40)
    .EUt(64)
    .buildAndRegister();

//Epic Electric Furnace I
crafting.addShaped('Epic Electric Furnace I', item('gregtech:machine', 58) * 1,
    [
        [circuitUHV,NqAlloy,circuitUHV],
        [NqAlloy,hull,NqAlloy],
        [cable,NqAlloy,cable]
    ]);

//Epic Macerator I
crafting.addShaped('Epic Macerator I', item('gregtech:machine', 73) * 1,
    [
        [piston,motor,Grinder],
        [cable,cable,hull],
        [circuitUHV,circuitUHV,cable]
    ]);

//Epic Alloy Smleter I
crafting.addShaped('Epic Alloy Smelter I',item('gregtech:machine', 88) * 1,
    [
        [circuitUHV,NqAlloy2,circuitUHV],
        [NqAlloy2,hull,NqAlloy2],
        [cable,NqAlloy2,cable]
    ]);

//Epic Arc Furnace I
crafting.addShaped('Epic Arc Furnace I', item('gregtech:machine', 103) * 1,
    [
        [cable,ore('dustGraphite'),cable],
        [circuitUHV,hull,circuitUHV],
        [Plate,Plate,Plate]
    ]);

//Epic Assembling Machine I
crafting.addShaped('Epic Assembling Machine I', item('gregtech:machine', 118) * 1,
    [
        [RobotArm,circuitUHV,RobotArm],
        [conveyor,hull,conveyor],
        [cable,circuitUHV,cable]
    ]);

//Epic Autoclave I
crafting.addShaped('Epic Autoclave I', item('gregtech:machine', 133) * 1,
    [
        [Plate,glass,Plate],
        [Plate,hull,Plate],
        [circuitUHV,pump,circuitUHV]
    ]);

//Epic Metal Bender I
crafting.addShaped('Epic Metal Bender I', item('gregtech:machine', 148) * 1,
    [
        [piston,conveyor,piston],
        [circuitUHV,hull,circuitUHV],
        [motor,cable,motor]
    ]);

//Epic Brewery I
crafting.addShaped('Epic Brewery I', item('gregtech:machine', 163) * 1,
    [
        [glass,pump,glass],
        [cable,hull,cable],
        [circuitUHV,blaze,circuitUHV]
    ]);

//Epic Canning Machine I
crafting.addShaped('Epic Canning Machine I', item('gregtech:machine', 178) * 1,
    [
        [cable,pump,cable],
        [circuitUHV,hull,circuitUHV],
        [glass,glass,glass]
    ]);

//Epic Centrifuge I
crafting.addShaped('Epic Centrifuge I', item('gregtech:machine', 193) * 1,
    [
        [circuitUHV,motor,circuitUHV],
        [cable,hull,cable],
        [circuitUHV,motor,circuitUHV]
    ]);

//Epic Chemical Bath I
crafting.addShaped('Epic Chemical Bath I', item('gregtech:machine', 208) * 1,
    [
        [conveyor,glass,cable],
        [pump,glass,conveyor],
        [circuitUHV,hull,circuitUHV]
    ]);

//Epic Chemical Reactor I
crafting.addShaped('Epic Chemical Reactor I', item('gregtech:machine', 223) * 1,
    [
        [item('gregtech:fluid_pipe_tiny', 127),Rotor,item('gregtech:fluid_pipe_tiny', 127)],
        [cable,motor,cable],
        [circuitUHV,hull,circuitUHV]
    ]);

//Epic Compressor I
crafting.addShaped('Epic Compressor I', item('gregtech:machine', 238) * 1,
    [
        [null,circuitUHV,null],
        [piston,hull,piston],
        [cable,circuitUHV,cable]
    ]);

//Epic Cutting Machine I
crafting.addShaped('Epic Cutting Machine I', item('gregtech:machine', 253) * 1,
    [
        [cable,circuitUHV,glass],
        [conveyor,hull,Buzzsaw],
        [circuitUHV,cable,motor]
    ]);

//Epic Distillery I
crafting.addShaped('Epic Distillery I', item('gregtech:machine', 268) * 1,
    [
        [glass,blaze,glass],
        [circuitUHV,hull,circuitUHV],
        [cable,pump,cable]
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

//Epic Extractor I
crafting.addShaped('Epic Extractor I', item('gregtech:machine', 313) * 1,
    [
        [glass,circuitUHV,glass],
        [piston,hull,pump],
        [cable,circuitUHV,cable]
    ]);

//Epic Extruder I
crafting.addShaped('Epic Extruder I', item('gregtech:machine', 328) * 1,
    [
        [NqAlloy2,NqAlloy2,circuitUHV],
        [piston,hull,item('gregtech:fluid_pipe_tiny', 127)],
        [NqAlloy2,NqAlloy2,circuitUHV]
    ]);

//Epic Fermenter I
crafting.addShaped('Epic Fermenter I', item('gregtech:machine', 343) * 1,
    [
        [cable,pump,cable],
        [glass,hull,glass],
        [cable,circuitUHV,cable]
    ]);

//Epic Fluid Heater I
crafting.addShaped('Epic Fluid Heater I', item('gregtech:machine', 388) * 1,
    [
        [NqAlloy2,fus_glass,NqAlloy2],
        [pump,hull,pump],
        [cable,circuitUHV,cable]
    ]);

//Epic Fluid Solidifier I
crafting.addShaped('Epic Fluid Solidifier I', item('gregtech:machine', 403) * 1,
    [
        [pump,glass,pump],
        [cable,hull,cable],
        [circuitUHV,item('minecraft:chest'),circuitUHV]
    ]);

//Epic Forge Hammer I
crafting.addShaped('Epic Forge Hammer I', item('gregtech:machine', 418) * 1,
    [
        [cable,piston,cable],
        [circuitUHV,hull,circuitUHV],
        [cable,item('minecraft:anvil'),cable]
    ]);

//Epic Forming Press I
crafting.addShaped('Epic Forming Press I', item('gregtech:machine', 433) * 1,
    [
        [cable,piston,cable],
        [circuitUHV,hull,circuitUHV],
        [cable,piston,cable]
    ]);

//Epic Lathe I
crafting.addShaped('Epic Lathe I', item('gregtech:machine', 448) * 1,
    [
        [cable,circuitUHV,cable],
        [motor,hull,Grinder],
        [circuitUHV,cable,piston]
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

//Epic Packager I
crafting.addShaped('Epic Packager I', item('gregtech:machine', 508) * 1,
    [
        [item('minecraft:chest'),circuitUHV,item('minecraft:chest')],
        [RobotArm,hull,conveyor],
        [cable,circuitUHV,cable]
    ]);

//Epic Gas Collector I
crafting.addShaped('Epic Gas Collector I', item('gregtech:machine', 538) * 1,
    [
        [bars,Ffilter,bars],
        [pump,hull,pump],
        [bars,circuitUHV,bars]
    ]);

//Epic Polarizer I
crafting.addShaped('Epic Polarizer I', item('gregtech:machine', 553) * 1,
    [
        [NqAlloy2,Lrod,NqAlloy2],
        [cable,hull,cable],
        [NqAlloy2,Lrod,NqAlloy2]
    ]);

//Epic Presision Laser Engraver I
crafting.addShaped('Epic Precision Laser Engraver I', item('gregtech:machine', 568) * 1,
    [
        [piston,Emitter,piston],
        [circuitUHV,hull,circuitUHV],
        [cable,circuitUHV,cable]
    ]);

//Epic Sifting Machine I
crafting.addShaped('Epic Sifting Machine I', item('gregtech:machine', 583) * 1,
    [
        [cable,Ifilter,cable],
        [piston,hull,piston],
        [circuitUHV,Ifilter,circuitUHV]
    ]);

//Epic Thermal Centrifuge I
crafting.addShaped('Epic Thermal Centrifuge I', item('gregtech:machine', 613) * 1,
    [
        [circuitUHV,motor,circuitUHV],
        [NqAlloy2,hull,NqAlloy2],
        [cable,motor,cable]
    ]);

//Epic Wiremill I
crafting.addShaped('Epic Wiremill I', item('gregtech:machine', 628) * 1,
    [
        [motor,cable,motor],
        [circuitUHV,hull,circuitUHV],
        [motor,cable,motor]
    ]);

//Epic Circuit Assembler I
crafting.addShaped('Epic Circuit Assembler I', item('gregtech:machine', 643) * 1,
    [
        [RobotArm,hull,Emitter],
        [conveyor,circuitUHV,conveyor],
        [cable,circuitUHV,cable]
    ]);

//Epic Rock Breaker I
crafting.addShaped('Epic Rock Breaker I', item('gregtech:machine', 673) * 1,
    [
        [piston,motor,Grinder],
        [cable,hull,cable],
        [glass,glass,glass]
    ]);

//Wakfu Reactor MK1
crafting.addShaped('Wakfu Reactor Mk1', item('gregtech:machine', 32112) * 1,
    [
        [Emitter,Field_Gen,Emitter],
        [cable,hull,cable],
        [circuitUV,circuitUHV,circuitUV]
    ]);

//Wakfu Production
centrifuge.recipeBuilder()
    .inputs(item('minecraft:dragon_egg') * 1)
    .notConsumable(item('contenttweaker:antimatter_field') * 1)
    .fluidOutputs(fluid('wakfu') * 64000)
    .duration(20000)
    .EUt(800000)
    .buildAndRegister();

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

//UHV Energy Hatch
assembly_line.recipeBuilder()
    .inputs(
        hull,
        cable * 4,
        UHPIC * 2,
        circuitUHV * 1,
        Spring * 2
    )
    .fluidInputs(liquid2 * 2880)
    .outputs(item('gregtech:machine', 1219) * 1)
    .EUt(400000)
    .duration(1000)
    .buildAndRegister();

//UHV Energy Hatch
assembly_line.recipeBuilder()
    .inputs(
        hull,
        cable * 4,
        UHPIC * 2,
        circuitUHV * 1,
        Spring * 1,
        Sspring * 4
    )
    .fluidInputs(liquid2 * 2880)
    .outputs(item('gregtech:machine', 1234) * 1)
    .EUt(400000)
    .duration(1000)
    .buildAndRegister();

//Dark Matter Capacitor
assembly_line.recipeBuilder()
    .inputs(
        metaitem('circuit_board.wetware') * 1,
        Plate * 16,
        circuitUHV * 4,
        metaitem('energy.cluster') * 1,
        UHPIC * 32,
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
    .duration(2000)
    .buildAndRegister();

// Energy Cluster * 1
mods.gregtech.assembly_line.removeByInput(200000, [metaitem('circuit_board.wetware'), metaitem('plateAmericium') * 16, metaitem('circuit.wetware_computer') * 4, metaitem('energy.module'), metaitem('field.generator.zpm'), metaitem('plate.ultra_high_power_integrated_circuit') * 32, metaitem('component.advanced_smd.diode') * 16, metaitem('component.advanced_smd.capacitor') * 16, metaitem('component.advanced_smd.resistor') * 16, metaitem('component.advanced_smd.transistor') * 16, metaitem('component.advanced_smd.inductor') * 16, metaitem('wireFineOsmiridium') * 64, metaitem('boltNaquadria') * 16], [fluid('soldering_alloy') * 2880, fluid('polybenzimidazole') * 576])


assembly_line.recipeBuilder()
    .inputs(
        metaitem('circuit_board.wetware') * 1,
        metaitem('plateAmericium') * 16,
        ore('circuitUv') * 4,
        metaitem('energy.module') * 1,
        metaitem('field.generator.zpm') * 1,
        UHPIC * 32,
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