import gregtech.*;


def assembler = recipemap('assembler');
def assembly_line = recipemap('assembly_line');
def research_station = recipemap('research_station');
    

def motor = metaitem('electric.motor.uiv');
def pump = metaitem('electric.pump.uiv');
def conveyor = metaitem('conveyor.module.uiv');
def piston = metaitem('electric.piston.uiv');
def RobotArm = metaitem('robot.arm.uiv');
def Field_Gen = metaitem('field.generator.uiv');
def Emitter = metaitem('emitter.uiv');
def Sensor = metaitem('sensor.uiv');
def circuitZPM = ore('circuitZpm'); //ZPM Circuit
def circuitUV = ore('circuitUv'); //UV Circuit
def circuitUHV = ore('circuitUhv'); //UHV Circuit
def circuitUEV = ore('circuitUev'); //Enigmatic Resonating Circuit
def circuitUIV = ore('circuitUiv'); //Matrioska Brain Circuit
def circuitUXV = ore('circuitUxv'); //Runic Resonating Circuit
def circuitOPV = ore('circuitOpv'); //Stellarborn Basic Computer
def Plate = metaitem('plateDarkenergyalloy'); //Runic Alloy Alloy Plate
def Rod = metaitem('stickDarkenergyalloy'); //Runic Alloy Alloy Rod
def Lrod = metaitem('stickLongDarkenergyalloy'); //Runic Alloy Alloy Long Rod
def Ring = metaitem('ringDarkenergyalloy'); //Runic Alloy Alloy Ring
def Round = metaitem('roundDarkenergyalloy'); //Runic Alloy Alloy Round
def Spring = metaitem('springDarkenergyalloy'); //Runic Alloy Alloy Sping
def Sspring = metaitem('springSmallDarkenergyalloy'); //Runic Alloy Alloy Small Spring
def Gear = metaitem('gearDarkenergyalloy'); //Runic Alloy Alloy Gear
def Sgear = metaitem('gearSmallDarkenergyalloy'); //Runic Alloy Alloy Small Gear
def Screw = metaitem('screwDarkenergyalloy'); //Runic Alloy Alloy Screw
def FineW = metaitem('wireFineDarkenergyalloy'); //Runic Alloy Alloy Fine Wire
def Rotor = metaitem('rotorDarkenergyalloy'); //Runic Alloy Alloy Rotor
def foil = metaitem('foilDarkenergyalloy'); //Runic Alloy Alloy Foil
def cable = metaitem('cableGtSingleDarkenergyalloy'); //Runic Alloy Alloy Cable
def cable2 = metaitem('wireGtOctalDarkenergyalloy'); //Runic Alloy Alloy Wire 8x
def Buzzsaw = metaitem('toolHeadBuzzSawDarkenergyalloy'); //Runic Alloy Alloy Buzzsaw
def Bolt = metaitem('boltDarkenergyalloy'); //Runic Alloy Bolt
def PBIplate = metaitem('platePolybenzimidazole'); //PBI Plate
def casing = item('gregtech:machine_casing', 11); //UIV Machine Casing
def hull = metaitem('hull.uiv'); //UIV Machine Hull
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
def frame = metaitem('frameDarkenergyalloy'); //Tritanium Frame
def UHPIC = metaitem('plate.ultimate_high_power_integrated_circuit'); //XHPIC
def SMDT = metaitem('component.smd.transistor.wetware'); //SMD Supra-Causal Transistor
def SMDC = metaitem('component.smd.capacitor.wetware'); //SMD Supra-Causal Capacitor
def SMDR = metaitem('component.smd.resistor.wetware'); //SMD Supra-Causal Resistor
def SMDD = metaitem('component.smd.diode.wetware');

//UIV Machine Casing
crafting.addShaped('UIV Machine Casing', item('gregtech:machine_casing', 11) * 1,
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

//UIV Machine Hull
crafting.addShaped('UIV Machine Hull', item('gregtech:machine', 996) * 1,
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

//Epic Electric Furnace III
crafting.addShaped('Epic Electric Furnace III', item('gregtech:machine', 60) * 1,
    [
        [circuitUIV,NqAlloy,circuitUIV],
        [NqAlloy,hull,NqAlloy],
        [cable,NqAlloy,cable]
    ]);

//Epic Macerator III
crafting.addShaped('Epic Macerator III', item('gregtech:machine', 75) * 1,
    [
        [piston,motor,Grinder],
        [cable,cable,hull],
        [circuitUIV,circuitUIV,cable]
    ]);

//Epic Alloy Smleter III
crafting.addShaped('Epic Alloy Smelter III',item('gregtech:machine', 90) * 1,
    [
        [circuitUIV,NqAlloy2,circuitUIV],
        [NqAlloy2,hull,NqAlloy2],
        [cable,NqAlloy2,cable]
    ]);

//Epic Arc Furnace III
crafting.addShaped('Epic Arc Furnace III', item('gregtech:machine', 105) * 1,
    [
        [cable,ore('dustGraphite'),cable],
        [circuitUIV,hull,circuitUIV],
        [Plate,Plate,Plate]
    ]);

//Epic Assembling Machine III
crafting.addShaped('Epic Assembling Machine III', item('gregtech:machine', 120) * 1,
    [
        [RobotArm,circuitUIV,RobotArm],
        [conveyor,hull,conveyor],
        [cable,circuitUIV,cable]
    ]);

//Epic Autoclave III
crafting.addShaped('Epic Autoclave III', item('gregtech:machine', 135) * 1,
    [
        [Plate,glass,Plate],
        [Plate,hull,Plate],
        [circuitUIV,pump,circuitUIV]
    ]);

//Epic Metal Bender III
crafting.addShaped('Epic Metal Bender III', item('gregtech:machine', 150) * 1,
    [
        [piston,conveyor,piston],
        [circuitUIV,hull,circuitUIV],
        [motor,cable,motor]
    ]);

//Epic Brewery III
crafting.addShaped('Epic Brewery III', item('gregtech:machine', 165) * 1,
    [
        [glass,pump,glass],
        [cable,hull,cable],
        [circuitUIV,blaze,circuitUIV]
    ]);

//Epic Canning Machine III
crafting.addShaped('Epic Canning Machine III', item('gregtech:machine', 180) * 1,
    [
        [cable,pump,cable],
        [circuitUIV,hull,circuitUIV],
        [glass,glass,glass]
    ]);

//Epic Centrifuge III
crafting.addShaped('Epic Centrifuge III', item('gregtech:machine', 195) * 1,
    [
        [circuitUIV,motor,circuitUIV],
        [cable,hull,cable],
        [circuitUIV,motor,circuitUIV]
    ]);

//Epic Chemical Bath III
crafting.addShaped('Epic Chemical Bath III', item('gregtech:machine', 210) * 1,
    [
        [conveyor,glass,cable],
        [pump,glass,conveyor],
        [circuitUIV,hull,circuitUIV]
    ]);

//Epic Chemical Reactor III
crafting.addShaped('Epic Chemical Reactor III', item('gregtech:machine', 225) * 1,
    [
        [item('gregtech:fluid_pipe_tiny', 127),Rotor,item('gregtech:fluid_pipe_tiny', 127)],
        [cable,motor,cable],
        [circuitUIV,hull,circuitUIV]
    ]);

//Epic Compressor III
crafting.addShaped('Epic Compressor III', item('gregtech:machine', 240) * 1,
    [
        [null,circuitUIV,null],
        [piston,hull,piston],
        [cable,circuitUIV,cable]
    ]);

//Epic Cutting Machine III
crafting.addShaped('Epic Cutting Machine III', item('gregtech:machine', 255) * 1,
    [
        [cable,circuitUIV,glass],
        [conveyor,hull,Buzzsaw],
        [circuitUIV,cable,motor]
    ]);

//Epic Distillery III
crafting.addShaped('Epic Distillery III', item('gregtech:machine', 270) * 1,
    [
        [glass,blaze,glass],
        [circuitUIV,hull,circuitUIV],
        [cable,pump,cable]
    ]);

//Epic Electrolyzer III
crafting.addShaped('Epic Electrolyzer III', item('gregtech:machine', 285) * 1,
    [
        [Os_wire,fus_glass,Os_wire],
        [Os_wire,hull,Os_wire],
        [circuitUIV,cable,circuitUIV]
    ]);

//Epic Electromagnetic Separator III
crafting.addShaped('Epic Electromagnetic Separator III', item('gregtech:machine', 300) * 1,
    [
        [conveyor,cable,cable2],
        [cable,hull,Lrod],
        [circuitUIV,cable,cable2]
    ]);

//Epic Extractor III
crafting.addShaped('Epic Extractor III', item('gregtech:machine', 315) * 1,
    [
        [glass,circuitUIV,glass],
        [piston,hull,pump],
        [cable,circuitUIV,cable]
    ]);

//Epic Extruder III
crafting.addShaped('Epic Extruder III', item('gregtech:machine', 330) * 1,
    [
        [NqAlloy2,NqAlloy2,circuitUIV],
        [piston,hull,item('gregtech:fluid_pipe_tiny', 127)],
        [NqAlloy2,NqAlloy2,circuitUIV]
    ]);

//Epic Fermenter III
crafting.addShaped('Epic Fermenter III', item('gregtech:machine', 345) * 1,
    [
        [cable,pump,cable],
        [glass,hull,glass],
        [cable,circuitUIV,cable]
    ]);

//Epic Fluid Heater III
crafting.addShaped('Epic Fluid Heater III', item('gregtech:machine', 390) * 1,
    [
        [NqAlloy2,fus_glass,NqAlloy2],
        [pump,hull,pump],
        [cable,circuitUIV,cable]
    ]);

//Epic Fluid Solidifier III
crafting.addShaped('Epic Fluid Solidifier III', item('gregtech:machine', 405) * 1,
    [
        [pump,glass,pump],
        [cable,hull,cable],
        [circuitUIV,item('minecraft:chest'),circuitUIV]
    ]);

//Epic Forge Hammer III
crafting.addShaped('Epic Forge Hammer III', item('gregtech:machine', 420) * 1,
    [
        [cable,piston,cable],
        [circuitUIV,hull,circuitUIV],
        [cable,item('minecraft:anvil'),cable]
    ]);

//Epic Forming Press III
crafting.addShaped('Epic Forming Press III', item('gregtech:machine', 435) * 1,
    [
        [cable,piston,cable],
        [circuitUIV,hull,circuitUIV],
        [cable,piston,cable]
    ]);

//Epic Lathe III
crafting.addShaped('Epic Lathe III', item('gregtech:machine', 450) * 1,
    [
        [cable,circuitUIV,cable],
        [motor,hull,Grinder],
        [circuitUIV,cable,piston]
    ]);

//Epic Mixer III
crafting.addShaped('Epic Mixer III', item('gregtech:machine', 480) * 1,
    [
        [fus_glass,Rotor,fus_glass],
        [fus_glass,motor,fus_glass],
        [circuitUIV,hull,circuitUIV]
    ]);

//Epic Ore Washing Plant III
crafting.addShaped('Epic Ore Washing Plant III', item('gregtech:machine', 495) * 1,
    [
        [Rotor,fus_glass,Rotor],
        [circuitUIV,motor,circuitUIV],
        [cable,hull,cable]
    ]);

//Epic Packager III
crafting.addShaped('Epic Packager III', item('gregtech:machine', 510) * 1,
    [
        [item('minecraft:chest'),circuitUIV,item('minecraft:chest')],
        [RobotArm,hull,conveyor],
        [cable,circuitUIV,cable]
    ]);

//Epic Polarizer III
crafting.addShaped('Epic Polarizer III', item('gregtech:machine', 555) * 1,
    [
        [NqAlloy2,Lrod,NqAlloy2],
        [cable,hull,cable],
        [NqAlloy2,Lrod,NqAlloy2]
    ]);

//Epic Presision Laser Engraver III
crafting.addShaped('Epic Precision Laser Engraver III', item('gregtech:machine', 570) * 1,
    [
        [piston,Emitter,piston],
        [circuitUIV,hull,circuitUIV],
        [cable,circuitUIV,cable]
    ]);

//Epic Sifting Machine III
crafting.addShaped('Epic Sifting Machine III', item('gregtech:machine', 585) * 1,
    [
        [cable,Ifilter,cable],
        [piston,hull,piston],
        [circuitUIV,Ifilter,circuitUIV]
    ]);

//Epic Thermal Centrifuge III
crafting.addShaped('Epic Thermal Centrifuge III', item('gregtech:machine', 615) * 1,
    [
        [circuitUIV,motor,circuitUIV],
        [NqAlloy2,hull,NqAlloy2],
        [cable,motor,cable]
    ]);

//Epic Wiremill III
crafting.addShaped('Epic Wiremill III', item('gregtech:machine', 630) * 1,
    [
        [motor,cable,motor],
        [circuitUIV,hull,circuitUIV],
        [motor,cable,motor]
    ]);

//Epic Circuit Assembler III
crafting.addShaped('Epic Circuit Assembler III', item('gregtech:machine', 645) * 1,
    [
        [RobotArm,hull,Emitter],
        [conveyor,circuitUIV,conveyor],
        [cable,circuitUIV,cable]
    ]);

//Epic Rock Breaker III
crafting.addShaped('Epic Rock Breaker III', item('gregtech:machine', 675) * 1,
    [
        [piston,motor,Grinder],
        [cable,hull,cable],
        [glass,glass,glass]
    ]);

//Wakfu Reactor MK3
crafting.addShaped('Wakfu Reactor Mk3', item('gregtech:machine', 32114) * 1,
    [
        [Emitter,Field_Gen,Emitter],
        [cable,hull,cable],
        [circuitUEV,circuitUIV,circuitUEV]
    ]);


//UIV 4x Battery Buffer
crafting.addShaped('UIV 4x Battery Buffer', item('gregtech:machine', 1326) * 1,
    [
        [null,null,null],
        [cable,item('minecraft:chest'),cable],
        [cable,hull,cable]
    ]);

//UIV 8x Battery Buffer
crafting.addShaped('UIV 8x Battery Buffer', item('gregtech:machine', 1340) * 1,
    [
        [null,null,null],
        [cable,item('minecraft:chest'),cable],
        [cable2,hull,cable2]
    ]);

//UIV 16x Battery Buffer
crafting.addShaped('UIV 16x Battery Buffer', item('gregtech:machine', 1354) * 1,
    [
        [null,null,null],
        [cable2,item('minecraft:chest'),cable2],
        [cable2,hull,cable2]
    ]);

//Dark Matter Capacitor
assembly_line.recipeBuilder()
    .inputs(
        metaitem('circuit_board.enigmatic') * 1,
        Plate * 16,
        circuitUIV * 4,
        metaitem('alpha.uev') * 1,
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
        fluid('darkenergyalloy') * 32000
    )
    .outputs(metaitem('sigma.uiv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('alpha.uev')).CWUt(96).EUt(9216000))
    .EUt(8000000)
    .duration(1700)
    .buildAndRegister();

//Laser Target

//256A OpV
assembler.recipeBuilder()
    .inputs(
        metaitem('hull.uiv') * 1,
        metaitem('lensDiamond') * 1,
        metaitem('emitter.uiv') * 1,
        metaitem('electric.pump.uiv') * 1,
        metaitem('cableGtSingleDarkenergyalloy') * 1
    )
    .circuitMeta(1)
    .outputs(metaitem('laser_hatch.target_256a.uiv') * 1)
    .EUt(31457280)
    .duration(300)
    .buildAndRegister();

//1024A OpV
assembler.recipeBuilder()
    .inputs(
        metaitem('hull.uiv') * 1,
        metaitem('lensDiamond') * 2,
        metaitem('emitter.uiv') * 2,
        metaitem('electric.pump.uiv') * 2,
        metaitem('cableGtDoubleDarkenergyalloy') * 2
    )
    .circuitMeta(2)
    .outputs(metaitem('laser_hatch.target_1024a.uiv') * 1)
    .EUt(31457280)
    .duration(300)
    .buildAndRegister();

//1024A OpV
assembler.recipeBuilder()
    .inputs(
        metaitem('hull.uiv') * 1,
        metaitem('lensDiamond') * 4,
        metaitem('emitter.uiv') * 4,
        metaitem('electric.pump.uiv') * 4,
        metaitem('cableGtQuadrupleDarkenergyalloy') * 4
    )
    .circuitMeta(3)
    .outputs(metaitem('laser_hatch.target_4096a.uiv') * 1)
    .EUt(31457280)
    .duration(300)
    .buildAndRegister();

//Laser Source

//256A OpV
assembler.recipeBuilder()
    .inputs(
        metaitem('hull.uiv') * 1,
        metaitem('lensDiamond') * 1,
        metaitem('sensor.uiv') * 1,
        metaitem('electric.pump.uiv') * 1,
        metaitem('cableGtSingleDarkenergyalloy') * 1
    )
    .circuitMeta(1)
    .outputs(metaitem('laser_hatch.source_256a.uiv') * 1)
    .EUt(31457280)
    .duration(300)
    .buildAndRegister();

//1024A OpV
assembler.recipeBuilder()
    .inputs(
        metaitem('hull.uiv') * 1,
        metaitem('lensDiamond') * 2,
        metaitem('sensor.uiv') * 2,
        metaitem('electric.pump.uiv') * 2,
        metaitem('cableGtDoubleDarkenergyalloy') * 2
    )
    .circuitMeta(2)
    .outputs(metaitem('laser_hatch.source_1024a.uiv') * 1)
    .EUt(31457280)
    .duration(300)
    .buildAndRegister();

//4096A OpV
assembler.recipeBuilder()
    .inputs(
        metaitem('hull.uiv') * 1,
        metaitem('lensDiamond') * 4,
        metaitem('sensor.uiv') * 4,
        metaitem('electric.pump.uiv') * 4,
        metaitem('cableGtQuadrupleDarkenergyalloy') * 4
    )
    .circuitMeta(3)
    .outputs(metaitem('laser_hatch.source_4096a.uiv') * 1)
    .EUt(31457280)
    .duration(300)
    .buildAndRegister();

//UIV Transformer
crafting.addShaped('UIV Transformer', metaitem('transformer.uiv') * 1,
    [
        [metaitem('component.smd.transistor.wetware'),metaitem('cableGtSingleDarkenergyalloy'),metaitem('cableGtSingleDarkenergyalloy')],
        [metaitem('cableGtSingleStellarite'),metaitem('hull.uiv'),null],
        [metaitem('component.smd.capacitor.wetware'),metaitem('cableGtSingleDarkenergyalloy'),metaitem('cableGtSingleDarkenergyalloy')]
    ]);

//UIV Transformer Hi-Amp
crafting.addShaped('UIV Transformer Hi-Amp', metaitem('transformer.hi_amp.uiv') * 1,
    [
        [metaitem('sigma.uiv'),metaitem('cableGtQuadrupleDarkenergyalloy'),metaitem('cableGtQuadrupleDarkenergyalloy')],
        [metaitem('cableGtQuadrupleStellarite'),metaitem('transformer.uiv'),null],
        [ore('circuitUiv'),metaitem('cableGtQuadrupleDarkenergyalloy'),metaitem('cableGtQuadrupleDarkenergyalloy')]
    ]);

//UIV Power Transformer
assembler.recipeBuilder()
    .inputs(
        metaitem('transformer.hi_amp.uiv') * 1,
        metaitem('electric.pump.uv') * 1,
        metaitem('cableGtOctalStellarite') * 1,
        metaitem('cableGtHexDarkenergyalloy') * 4,
        metaitem('springDarkenergyalloy') * 2,
        metaitem('springSmallStasis') * 1
    )
    .fluidInputs(fluid('sodium_potassium') * 2000)
    .outputs(metaitem('transformer.adjustable.uiv') * 1)
    .EUt(31457280)
    .duration(200)
    .buildAndRegister();

//Energy Hatch
assembly_line.recipeBuilder()
    .inputs(
        metaitem('hull.uiv') * 1,
        metaitem('cableGtSingleDarkenergyalloy') * 1,
        metaitem('plate.ultimate_high_power_integrated_circuit') * 8,
        ore('circuitUiv') * 1,
        metaitem('alpha.uev') * 1
    )
    .fluidInputs(
        fluid('sodium_potassium') * 16000,
        fluid('soldering_alloy') * 73728
        )
    .outputs(metaitem('energy_hatch.input.uiv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('energy_hatch.input.uev')).CWUt(144).EUt(7864320))
    .EUt(31457280)
    .duration(1000)
    .buildAndRegister();

//4A Energy Hatch
assembler.recipeBuilder()
    .inputs(
        metaitem('energy_hatch.input.uiv') * 2,
        metaitem('plate.ultimate_high_power_integrated_circuit') * 8,
        metaitem('cableGtHexDarkenergyalloy') * 1,
        metaitem('alpha.uev') * 1,
        metaitem('transformer.uiv') * 1
    )
    .outputs(metaitem('energy_hatch.input_4a.uiv') * 1)
    .EUt(7864320)
    .duration(100)
    .buildAndRegister();

//16A Energy Hatch   
assembler.recipeBuilder()
    .inputs(
        metaitem('energy_hatch.input_4a.uiv') * 2,
        metaitem('plate.ultimate_high_power_integrated_circuit') * 8,
        metaitem('cableGtDoubleDarkenergyalloy') * 1,
        metaitem('alpha.uev') * 1,
        metaitem('transformer.hi_amp.uiv') * 1
    )
    .outputs(metaitem('energy_hatch.input_16a.uiv') * 1)
    .EUt(7864320)
    .duration(100)
    .buildAndRegister();

//64A Substation Hatch
assembler.recipeBuilder()
    .inputs(
        metaitem('energy_hatch.input_16a.uiv') * 2,
        metaitem('plate.ultimate_high_power_integrated_circuit') * 8,
        metaitem('cableGtDoubleDarkenergyalloy') * 1,
        metaitem('alpha.uev') * 1,
        metaitem('transformer.adjustable.uiv') * 1
    )
    .outputs(metaitem('substation_hatch.input_64a.uiv') * 1)
    .EUt(7864320)
    .duration(100)
    .buildAndRegister();

//Dynamo Hatch
assembly_line.recipeBuilder()
    .inputs(
        metaitem('hull.uiv') * 1,
        metaitem('cableGtSingleDarkenergyalloy') * 1,
        metaitem('plate.ultimate_high_power_integrated_circuit') * 8,
        ore('circuitUiv') * 1,
        metaitem('emitter.uiv') * 1
    )
    .fluidInputs(
        fluid('sodium_potassium') * 16000,
        fluid('soldering_alloy') * 73728
        )
    .outputs(metaitem('energy_hatch.output.uiv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('energy_hatch.output.uev')).CWUt(144).EUt(7864320))
    .EUt(31457280)
    .duration(1000)
    .buildAndRegister();

//4A Dynamo Hatch
assembler.recipeBuilder()
    .inputs(
        metaitem('energy_hatch.output.uiv') * 2,
        metaitem('plate.ultimate_high_power_integrated_circuit') * 8,
        metaitem('cableGtHexDarkenergyalloy') * 1,
        metaitem('alpha.uev') * 1,
        metaitem('transformer.uiv') * 1,
        metaitem('emitter.uiv') * 2
    )
    .outputs(metaitem('energy_hatch.output_4a.uiv') * 1)
    .EUt(7864320)
    .duration(100)
    .buildAndRegister();

//16A Dynamo Hatch   
assembler.recipeBuilder()
    .inputs(
        metaitem('energy_hatch.output_4a.uiv') * 2,
        metaitem('plate.ultimate_high_power_integrated_circuit') * 8,
        metaitem('cableGtDoubleDarkenergyalloy') * 1,
        metaitem('alpha.uev') * 1,
        metaitem('transformer.hi_amp.uiv') * 1,
        metaitem('emitter.uiv') * 4
    )
    .outputs(metaitem('energy_hatch.output_16a.uiv') * 1)
    .EUt(7864320)
    .duration(100)
    .buildAndRegister();

//64A Substation Dynamo Hatch
assembler.recipeBuilder()
    .inputs(
        metaitem('energy_hatch.output_16a.uiv') * 2,
        metaitem('plate.ultimate_high_power_integrated_circuit') * 8,
        metaitem('cableGtDoubleDarkenergyalloy') * 1,
        metaitem('alpha.uev') * 1,
        metaitem('transformer.adjustable.uiv') * 1,
        metaitem('emitter.uiv') * 16
    )
    .outputs(metaitem('substation_hatch.output_64a.uiv') * 1)
    .EUt(7864320)
    .duration(100)
    .buildAndRegister();