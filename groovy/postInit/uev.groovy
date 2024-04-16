import gregtech.*;


def assembler = recipemap('assembler');
def assembly_line = recipemap('assembly_line');
def research_station = recipemap('research_station');
    

def motor = metaitem('electric.motor.uev');
def pump = metaitem('electric.pump.uev');
def conveyor = metaitem('conveyor.module.uev');
def piston = metaitem('electric.piston.uev');
def RobotArm = metaitem('robot.arm.uev');
def Field_Gen = metaitem('field.generator.uev');
def Emitter = metaitem('emitter.uev');
def Sensor = metaitem('sensor.uev');
def circuitZPM = ore('circuitZpm'); //ZPM Circuit
def circuitUV = ore('circuitUv'); //UV Circuit
def circuitUHV = ore('circuitUhv'); //UHV Circuit
def circuitUEV = ore('circuitUev'); //Enigmatic Resonating Circuit
def circuitUIV = ore('circuitUiv'); //Matrioska Brain Circuit
def circuitUXV = ore('circuitUxv'); //Runic Resonating Circuit
def circuitOPV = ore('circuitOpv'); //Stellarborn Basic Computer
def Plate = metaitem('plateStasis'); //Runic Alloy Alloy Plate
def Rod = metaitem('stickStasis'); //Runic Alloy Alloy Rod
def Lrod = metaitem('stickLongStasis'); //Runic Alloy Alloy Long Rod
def Ring = metaitem('ringStasis'); //Runic Alloy Alloy Ring
def Round = metaitem('roundStasis'); //Runic Alloy Alloy Round
def Spring = metaitem('springStasis'); //Runic Alloy Alloy Sping
def Sspring = metaitem('springSmallStasis'); //Runic Alloy Alloy Small Spring
def Gear = metaitem('gearStasis'); //Runic Alloy Alloy Gear
def Sgear = metaitem('gearSmallStasis'); //Runic Alloy Alloy Small Gear
def Screw = metaitem('screwStasis'); //Runic Alloy Alloy Screw
def FineW = metaitem('wireFineStasis'); //Runic Alloy Alloy Fine Wire
def Rotor = metaitem('rotorStasis'); //Runic Alloy Alloy Rotor
def foil = metaitem('foilStasis'); //Runic Alloy Alloy Foil
def cable = metaitem('cableGtSingleStasis'); //Runic Alloy Alloy Cable
def cable2 = metaitem('wireGtOctalStasis'); //Runic Alloy Alloy Wire 8x
def Buzzsaw = metaitem('toolHeadBuzzSawStasis'); //Runic Alloy Alloy Buzzsaw
def Bolt = metaitem('boltStasis'); //Runic Alloy Bolt
def PBIplate = metaitem('platePolybenzimidazole'); //PBI Plate
def casing = item('gregtech:machine_casing', 10); //UIV Machine Casing
def hull = metaitem('hull.uev'); //UIV Machine Hull
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
def frame = metaitem('frameStasis'); //Tritanium Frame
def UHPIC = metaitem('plate.ultra_high_power_integrated_circuit'); //UHPIC
def SMDT = metaitem('component.smd.transistor.wetware'); //SMD Wetware Transistor
def SMDC = metaitem('component.smd.capacitor.wetware'); //SMD Wetware Capacitor
def SMDR = metaitem('component.smd.resistor.wetware'); //SMD Wetware Resistor
def SMDD = metaitem('component.smd.diode.wetware'); //SMD Wetware Diode

//UEV Machine Casing
crafting.addShaped('UEV Machine Casing', item('gregtech:machine_casing', 10) * 1,
    [
        [Plate,Plate,Plate],
        [Plate,ore('craftingToolWrench'),Plate],
        [Plate,Plate,Plate]
    ]);

assembler.recipeBuilder()
    .inputs(Plate * 8)
    .circuitMeta(8)
    .outputs(casing * 1)
    .duration(20)
    .EUt(8)
    .buildAndRegister();

//UEV Machine Hull
crafting.addShaped('UEV Machine Hull', item('gregtech:machine', 995) * 1,
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

//Epic Electric Furnace II
crafting.addShaped('Epic Electric Furnace II', item('gregtech:machine', 59) * 1,
    [
        [circuitUEV,NqAlloy,circuitUEV],
        [NqAlloy,hull,NqAlloy],
        [cable,NqAlloy,cable]
    ]);

//Epic Macerator II
crafting.addShaped('Epic Macerator II', item('gregtech:machine', 74) * 1,
    [
        [piston,motor,Grinder],
        [cable,cable,hull],
        [circuitUEV,circuitUEV,cable]
    ]);

//Epic Alloy Smleter II
crafting.addShaped('Epic Alloy Smelter II',item('gregtech:machine', 89) * 1,
    [
        [circuitUEV,NqAlloy2,circuitUEV],
        [NqAlloy2,hull,NqAlloy2],
        [cable,NqAlloy2,cable]
    ]);

//Epic Arc Furnace II
crafting.addShaped('Epic Arc Furnace II', item('gregtech:machine', 104) * 1,
    [
        [cable,ore('dustGraphite'),cable],
        [circuitUEV,hull,circuitUEV],
        [Plate,Plate,Plate]
    ]);

//Epic Assembling Machine II
crafting.addShaped('Epic Assembling Machine II', item('gregtech:machine', 119) * 1,
    [
        [RobotArm,circuitUEV,RobotArm],
        [conveyor,hull,conveyor],
        [cable,circuitUEV,cable]
    ]);

//Epic Autoclave II
crafting.addShaped('Epic Autoclave II', item('gregtech:machine', 134) * 1,
    [
        [Plate,glass,Plate],
        [Plate,hull,Plate],
        [circuitUEV,pump,circuitUEV]
    ]);

//Epic Metal Bender II
crafting.addShaped('Epic Metal Bender II', item('gregtech:machine', 149) * 1,
    [
        [piston,conveyor,piston],
        [circuitUEV,hull,circuitUEV],
        [motor,cable,motor]
    ]);

//Epic Brewery II
crafting.addShaped('Epic Brewery II', item('gregtech:machine', 164) * 1,
    [
        [glass,pump,glass],
        [cable,hull,cable],
        [circuitUEV,blaze,circuitUEV]
    ]);

//Epic Canning Machine II
crafting.addShaped('Epic Canning Machine II', item('gregtech:machine', 179) * 1,
    [
        [cable,pump,cable],
        [circuitUEV,hull,circuitUEV],
        [glass,glass,glass]
    ]);

//Epic Centrifuge II
crafting.addShaped('Epic Centrifuge II', item('gregtech:machine', 194) * 1,
    [
        [circuitUEV,motor,circuitUEV],
        [cable,hull,cable],
        [circuitUEV,motor,circuitUEV]
    ]);

//Epic Chemical Bath II
crafting.addShaped('Epic Chemical Bath II', item('gregtech:machine', 209) * 1,
    [
        [conveyor,glass,cable],
        [pump,glass,conveyor],
        [circuitUEV,hull,circuitUEV]
    ]);

//Epic Chemical Reactor II
crafting.addShaped('Epic Chemical Reactor II', item('gregtech:machine', 224) * 1,
    [
        [item('gregtech:fluid_pipe_tiny', 127),Rotor,item('gregtech:fluid_pipe_tiny', 127)],
        [cable,motor,cable],
        [circuitUEV,hull,circuitUEV]
    ]);

//Epic Compressor II
crafting.addShaped('Epic Compressor II', item('gregtech:machine', 239) * 1,
    [
        [null,circuitUEV,null],
        [piston,hull,piston],
        [cable,circuitUEV,cable]
    ]);

//Epic Cutting Machine II
crafting.addShaped('Epic Cutting Machine II', item('gregtech:machine', 254) * 1,
    [
        [cable,circuitUEV,glass],
        [conveyor,hull,Buzzsaw],
        [circuitUEV,cable,motor]
    ]);

//Epic Distillery II
crafting.addShaped('Epic Distillery II', item('gregtech:machine', 269) * 1,
    [
        [glass,blaze,glass],
        [circuitUEV,hull,circuitUEV],
        [cable,pump,cable]
    ]);

//Epic Electrolyzer II
crafting.addShaped('Epic Electrolyzer II', item('gregtech:machine', 284) * 1,
    [
        [Os_wire,fus_glass,Os_wire],
        [Os_wire,hull,Os_wire],
        [circuitUEV,cable,circuitUEV]
    ]);

//Epic Electromagnetic Separator II
crafting.addShaped('Epic Electromagnetic Separator II', item('gregtech:machine', 299) * 1,
    [
        [conveyor,cable,cable2],
        [cable,hull,Lrod],
        [circuitUEV,cable,cable2]
    ]);

//Epic Extractor II
crafting.addShaped('Epic Extractor II', item('gregtech:machine', 314) * 1,
    [
        [glass,circuitUEV,glass],
        [piston,hull,pump],
        [cable,circuitUEV,cable]
    ]);

//Epic Extruder II
crafting.addShaped('Epic Extruder II', item('gregtech:machine', 329) * 1,
    [
        [NqAlloy2,NqAlloy2,circuitUEV],
        [piston,hull,item('gregtech:fluid_pipe_tiny', 127)],
        [NqAlloy2,NqAlloy2,circuitUEV]
    ]);

//Epic Fermenter II
crafting.addShaped('Epic Fermenter II', item('gregtech:machine', 344) * 1,
    [
        [cable,pump,cable],
        [glass,hull,glass],
        [cable,circuitUEV,cable]
    ]);

//Epic Fluid Heater II
crafting.addShaped('Epic Fluid Heater II', item('gregtech:machine', 389) * 1,
    [
        [NqAlloy2,fus_glass,NqAlloy2],
        [pump,hull,pump],
        [cable,circuitUEV,cable]
    ]);

//Epic Fluid Solidifier II
crafting.addShaped('Epic Fluid Solidifier II', item('gregtech:machine', 404) * 1,
    [
        [pump,glass,pump],
        [cable,hull,cable],
        [circuitUEV,item('minecraft:chest'),circuitUEV]
    ]);

//Epic Forge Hammer II
crafting.addShaped('Epic Forge Hammer II', item('gregtech:machine', 419) * 1,
    [
        [cable,piston,cable],
        [circuitUEV,hull,circuitUEV],
        [cable,item('minecraft:anvil'),cable]
    ]);

//Epic Forming Press II
crafting.addShaped('Epic Forming Press II', item('gregtech:machine', 434) * 1,
    [
        [cable,piston,cable],
        [circuitUEV,hull,circuitUEV],
        [cable,piston,cable]
    ]);

//Epic Lathe II
crafting.addShaped('Epic Lathe II', item('gregtech:machine', 449) * 1,
    [
        [cable,circuitUEV,cable],
        [motor,hull,Grinder],
        [circuitUEV,cable,piston]
    ]);

//Epic Mixer II
crafting.addShaped('Epic Mixer II', item('gregtech:machine', 479) * 1,
    [
        [fus_glass,Rotor,fus_glass],
        [fus_glass,motor,fus_glass],
        [circuitUEV,hull,circuitUEV]
    ]);

//Epic Ore Washing Plant II
crafting.addShaped('Epic Ore Washing Plant II', item('gregtech:machine', 494) * 1,
    [
        [Rotor,fus_glass,Rotor],
        [circuitUEV,motor,circuitUEV],
        [cable,hull,cable]
    ]);

//Epic Packager II
crafting.addShaped('Epic Packager II', item('gregtech:machine', 509) * 1,
    [
        [item('minecraft:chest'),circuitUEV,item('minecraft:chest')],
        [RobotArm,hull,conveyor],
        [cable,circuitUEV,cable]
    ]);

//Epic Polarizer II
crafting.addShaped('Epic Polarizer II', item('gregtech:machine', 554) * 1,
    [
        [NqAlloy2,Lrod,NqAlloy2],
        [cable,hull,cable],
        [NqAlloy2,Lrod,NqAlloy2]
    ]);

//Epic Presision Laser Engraver II
crafting.addShaped('Epic Precision Laser Engraver II', item('gregtech:machine', 569) * 1,
    [
        [piston,Emitter,piston],
        [circuitUEV,hull,circuitUEV],
        [cable,circuitUEV,cable]
    ]);

//Epic Sifting Machine II
crafting.addShaped('Epic Sifting Machine II', item('gregtech:machine', 584) * 1,
    [
        [cable,Ifilter,cable],
        [piston,hull,piston],
        [circuitUEV,Ifilter,circuitUEV]
    ]);

//Epic Thermal Centrifuge II
crafting.addShaped('Epic Thermal Centrifuge II', item('gregtech:machine', 614) * 1,
    [
        [circuitUEV,motor,circuitUEV],
        [NqAlloy2,hull,NqAlloy2],
        [cable,motor,cable]
    ]);

//Epic Wiremill II
crafting.addShaped('Epic Wiremill II', item('gregtech:machine', 629) * 1,
    [
        [motor,cable,motor],
        [circuitUEV,hull,circuitUEV],
        [motor,cable,motor]
    ]);

//Epic Circuit Assembler II
crafting.addShaped('Epic Circuit Assembler II', item('gregtech:machine', 644) * 1,
    [
        [RobotArm,hull,Emitter],
        [conveyor,circuitUEV,conveyor],
        [cable,circuitUEV,cable]
    ]);

//Epic Rock Breaker II
crafting.addShaped('Epic Rock Breaker II', item('gregtech:machine', 674) * 1,
    [
        [piston,motor,Grinder],
        [cable,hull,cable],
        [glass,glass,glass]
    ]);


//Wakfu Reactor MK2
crafting.addShaped('Wakfu Reactor Mk2', item('gregtech:machine', 32113) * 1,
    [
        [Emitter,Field_Gen,Emitter],
        [cable,hull,cable],
        [circuitUHV,circuitUEV,circuitUHV]
    ]);

//UEV 4x Battery Buffer
crafting.addShaped('UEV 4x Battery Buffer', item('gregtech:machine', 1325) * 1,
    [
        [null,null,null],
        [cable,item('minecraft:chest'),cable],
        [cable,hull,cable]
    ]);

//UEV 8x Battery Buffer
crafting.addShaped('UEV 8x Battery Buffer', item('gregtech:machine', 1339) * 1,
    [
        [null,null,null],
        [cable,item('minecraft:chest'),cable],
        [cable2,hull,cable2]
    ]);

//UEV 16x Battery Buffer
crafting.addShaped('UEV 16x Battery Buffer', item('gregtech:machine', 1353) * 1,
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
        circuitUEV * 4,
        metaitem('delta.uhv') * 1,
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
        fluid('polybenzimidazole') * 576,
        fluid('stasis') * 32000
    )
    .outputs(metaitem('alpha.uev') * 1)
    .stationResearch(b -> b.researchStack(metaitem('delta.uhv')).CWUt(64).EUt(2304000))
    .EUt(4000000)
    .duration(1600)
    .buildAndRegister();

//Laser Target

//256A OpV
assembler.recipeBuilder()
    .inputs(
        metaitem('hull.uev') * 1,
        metaitem('lensDiamond') * 1,
        metaitem('emitter.uev') * 1,
        metaitem('electric.pump.uev') * 1,
        metaitem('cableGtDoubleStasis') * 1
    )
    .circuitMeta(1)
    .outputs(metaitem('laser_hatch.target_256a.uev') * 1)
    .EUt(7864320)
    .duration(300)
    .buildAndRegister();

//1024A OpV
assembler.recipeBuilder()
    .inputs(
        metaitem('hull.uev') * 1,
        metaitem('lensDiamond') * 2,
        metaitem('emitter.uev') * 2,
        metaitem('electric.pump.uev') * 2,
        metaitem('cableGtDoubleStasis') * 2
    )
    .circuitMeta(2)
    .outputs(metaitem('laser_hatch.target_1024a.uev') * 1)
    .EUt(7864320)
    .duration(300)
    .buildAndRegister();

//1024A OpV
assembler.recipeBuilder()
    .inputs(
        metaitem('hull.uev') * 1,
        metaitem('lensDiamond') * 4,
        metaitem('emitter.uev') * 4,
        metaitem('electric.pump.uev') * 4,
        metaitem('cableGtDoubleStasis') * 4
    )
    .circuitMeta(3)
    .outputs(metaitem('laser_hatch.target_4096a.uev') * 1)
    .EUt(7864320)
    .duration(300)
    .buildAndRegister();

//Laser Source

//256A OpV
assembler.recipeBuilder()
    .inputs(
        metaitem('hull.uev') * 1,
        metaitem('lensDiamond') * 1,
        metaitem('sensor.uev') * 1,
        metaitem('electric.pump.uev') * 1,
        metaitem('cableGtDoubleStasis') * 1
    )
    .circuitMeta(1)
    .outputs(metaitem('laser_hatch.source_256a.uev') * 1)
    .EUt(7864320)
    .duration(300)
    .buildAndRegister();

//1024A OpV
assembler.recipeBuilder()
    .inputs(
        metaitem('hull.uev') * 1,
        metaitem('lensDiamond') * 2,
        metaitem('sensor.uev') * 2,
        metaitem('electric.pump.uev') * 2,
        metaitem('cableGtDoubleStasis') * 2
    )
    .circuitMeta(2)
    .outputs(metaitem('laser_hatch.source_1024a.uev') * 1)
    .EUt(7864320)
    .duration(300)
    .buildAndRegister();

//4096A OpV
assembler.recipeBuilder()
    .inputs(
        metaitem('hull.uev') * 1,
        metaitem('lensDiamond') * 4,
        metaitem('sensor.uev') * 4,
        metaitem('electric.pump.uev') * 4,
        metaitem('cableGtDoubleStasis') * 4
    )
    .circuitMeta(3)
    .outputs(metaitem('laser_hatch.source_4096a.uev') * 1)
    .EUt(7864320)
    .duration(300)
    .buildAndRegister();

//UEV Transformer
crafting.addShaped('UEV Transformer', metaitem('transformer.uev') * 1,
    [
        [metaitem('component.smd.transistor.quantum'),metaitem('cableGtSingleStasis'),metaitem('cableGtSingleStasis')],
        [metaitem('cableGtSingleDarkenergyalloy'),metaitem('hull.uev'),null],
        [metaitem('component.smd.capacitor.quantum'),metaitem('cableGtSingleStasis'),metaitem('cableGtSingleStasis')]
    ]);

//UEV Transformer Hi-Amp
crafting.addShaped('UEV Transformer Hi-Amp', metaitem('transformer.hi_amp.uev') * 1,
    [
        [metaitem('alpha.uev'),metaitem('cableGtQuadrupleStasis'),metaitem('cableGtQuadrupleStasis')],
        [metaitem('cableGtQuadrupleDarkenergyalloy'),metaitem('transformer.uev'),null],
        [ore('circuitUiv'),metaitem('cableGtQuadrupleStasis'),metaitem('cableGtQuadrupleStasis')]
    ]);

//UEV Power Transformer
assembler.recipeBuilder()
    .inputs(
        metaitem('transformer.hi_amp.uev') * 1,
        metaitem('electric.pump.zpm') * 1,
        metaitem('cableGtOctalDarkenergyalloy') * 1,
        metaitem('cableGtHexStasis') * 4,
        metaitem('springStasis') * 2,
        metaitem('springSmallWakfu') * 1
    )
    .fluidInputs(fluid('sodium_potassium') * 2000)
    .outputs(metaitem('transformer.adjustable.uev') * 1)
    .EUt(1966080)
    .duration(200)
    .buildAndRegister();

//Energy Hatch
assembly_line.recipeBuilder()
    .inputs(
        metaitem('hull.uev') * 1,
        metaitem('cableGtSingleStasis') * 1,
        metaitem('plate.ultra_high_power_integrated_circuit') * 8,
        ore('circuitUev') * 1,
        metaitem('delta.uhv') * 1
    )
    .fluidInputs(
        fluid('sodium_potassium') * 16000,
        fluid('soldering_alloy') * 55296
        )
    .outputs(metaitem('energy_hatch.input.uev') * 1)
    .stationResearch(b -> b.researchStack(metaitem('energy_hatch.input.uhv')).CWUt(128).EUt(1966080))
    .EUt(7864320)
    .duration(1000)
    .buildAndRegister();

//4A Energy Hatch
assembler.recipeBuilder()
    .inputs(
        metaitem('energy_hatch.input.uev') * 2,
        metaitem('plate.ultra_high_power_integrated_circuit') * 8,
        metaitem('cableGtDoubleStasis') * 1,
        metaitem('delta.uhv') * 1,
        metaitem('transformer.uev') * 1
    )
    .outputs(metaitem('energy_hatch.input_4a.uev') * 1)
    .EUt(1966080)
    .duration(100)
    .buildAndRegister();

//16A Energy Hatch   
assembler.recipeBuilder()
    .inputs(
        metaitem('energy_hatch.input_4a.uev') * 2,
        metaitem('plate.ultra_high_power_integrated_circuit') * 8,
        metaitem('cableGtDoubleStasis') * 1,
        metaitem('delta.uhv') * 1,
        metaitem('transformer.hi_amp.uev') * 1
    )
    .outputs(metaitem('energy_hatch.input_16a.uev') * 1)
    .EUt(1966080)
    .duration(100)
    .buildAndRegister();

//64A Substation Hatch
assembler.recipeBuilder()
    .inputs(
        metaitem('energy_hatch.input_16a.uev') * 2,
        metaitem('plate.ultra_high_power_integrated_circuit') * 8,
        metaitem('cableGtDoubleStasis') * 1,
        metaitem('delta.uhv') * 1,
        metaitem('transformer.adjustable.uev') * 1
    )
    .outputs(metaitem('substation_hatch.input_64a.uev') * 1)
    .EUt(1966080)
    .duration(100)
    .buildAndRegister();

//Dynamo Hatch
assembly_line.recipeBuilder()
    .inputs(
        metaitem('hull.uev') * 1,
        metaitem('cableGtSingleStasis') * 1,
        metaitem('plate.ultra_high_power_integrated_circuit') * 8,
        ore('circuitUev') * 1,
        metaitem('emitter.uev') * 1
    )
    .fluidInputs(
        fluid('sodium_potassium') * 16000,
        fluid('soldering_alloy') * 55296
        )
    .outputs(metaitem('energy_hatch.output.uev') * 1)
    .stationResearch(b -> b.researchStack(metaitem('energy_hatch.output.uhv')).CWUt(128).EUt(1966080))
    .EUt(7864320)
    .duration(1000)
    .buildAndRegister();

//4A Dynamo Hatch
assembler.recipeBuilder()
    .inputs(
        metaitem('energy_hatch.output.uev') * 2,
        metaitem('plate.ultra_high_power_integrated_circuit') * 8,
        metaitem('cableGtDoubleStasis') * 1,
        metaitem('delta.uhv') * 1,
        metaitem('transformer.uev') * 1,
        metaitem('emitter.uev') * 2
    )
    .outputs(metaitem('energy_hatch.output_4a.uev') * 1)
    .EUt(1966080)
    .duration(100)
    .buildAndRegister();

//16A Dynamo Hatch   
assembler.recipeBuilder()
    .inputs(
        metaitem('energy_hatch.output_4a.uev') * 2,
        metaitem('plate.ultra_high_power_integrated_circuit') * 8,
        metaitem('cableGtDoubleStasis') * 1,
        metaitem('delta.uhv') * 1,
        metaitem('transformer.hi_amp.uev') * 1,
        metaitem('emitter.uev') * 4
    )
    .outputs(metaitem('energy_hatch.output_16a.uev') * 1)
    .EUt(1966080)
    .duration(100)
    .buildAndRegister();

//64A Substation Dynamo Hatch
assembler.recipeBuilder()
    .inputs(
        metaitem('energy_hatch.output_16a.uev') * 2,
        metaitem('plate.ultra_high_power_integrated_circuit') * 8,
        metaitem('cableGtDoubleStasis') * 1,
        metaitem('delta.uhv') * 1,
        metaitem('transformer.adjustable.uev') * 1,
        metaitem('emitter.uev') * 16
    )
    .outputs(metaitem('substation_hatch.output_64a.uev') * 1)
    .EUt(1966080)
    .duration(100)
    .buildAndRegister();