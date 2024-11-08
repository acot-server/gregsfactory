import gregtech.*;


def assembler = recipemap('assembler');
def assembly_line = recipemap('assembly_line')
def research_station = recipemap('research_station');


def motor = metaitem('electric.motor.opv');
def pump = metaitem('electric.pump.opv');
def conveyor = metaitem('conveyor.module.opv');
def piston = metaitem('electric.piston.opv');
def RobotArm = metaitem('robot.arm.opv');
def Field_Gen = metaitem('field.generator.opv');
def Emitter = metaitem('emitter.opv');
def Sensor = metaitem('sensor.opv');
def circuitZPM = ore('circuitZpm'); //ZPM Circuit
def circuitUV = ore('circuitUv'); //UV Circuit
def circuitUHV = ore('circuitUhv'); //UHV Circuit
def circuitUEV = ore('circuitUev'); //Enigmatic Resonating Circuit
def circuitUIV = ore('circuitUiv'); //Matrioska Brain Circuit
def circuitUXV = ore('circuitUxv'); //Runic Resonating Circuit
def circuitOPV = ore('circuitOpv'); //Stellarborn Basic Computer
def Plate = metaitem('plateWakfustasis'); //Wakfu Stasis Alloy Plate
def Rod = metaitem('stickWakfustasis'); //Wakfu Stasis Alloy Rod
def Lrod = metaitem('stickLongWakfustasis'); //Wakfu Stasis Alloy Long Rod
def Ring = metaitem('ringWakfustasis'); //Wakfu Stasis Alloy Ring
def Round = metaitem('roundWakfustasis'); //Wakfu Stasis Alloy Round
def Spring = metaitem('springWakfustasis'); //Wakfu Stasis Alloy Sping
def Sspring = metaitem('springSmallWakfustasis'); //Wakfu Stasis Alloy Small Spring
def Gear = metaitem('gearWakfustasis'); //Wakfu Stasis Alloy Gear
def Sgear = metaitem('gearSmallWakfustasis'); //Wakfu Stasis Alloy Small Gear
def Screw = metaitem('screwWakfustasis'); //Wakfu Stasis Alloy Screw
def FineW = metaitem('wireFineWakfustasis'); //Wakfu Stasis Alloy Fine Wire
def Rotor = metaitem('rotorWakfustasis'); //Wakfu Stasis Alloy Rotor
def foil = metaitem('foilWakfustasis'); //Wakfu Stasis Alloy Foil
def cable = metaitem('cableGtSingleWakfustasis'); //Wakfu Stasis Alloy Cable
def cable2 = metaitem('wireGtOctalWakfustasis'); //Wakfu Stasis Alloy Wire 8x
def Buzzsaw = metaitem('toolHeadBuzzSawWakfustasis'); //Wakfu Stasis Alloy Buzzsaw
def Bolt = metaitem('boltWakfustasis'); //Wakfu Stasis Alloy Bolt
def PBIplate = metaitem('platePolybenzimidazole'); //PBI Plate
def casing = item('gregtech:machine_casing', 13) //OpV Machine Casing
def hull = metaitem('hull.opv'); //UIV Machine Hull
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
def liquid2 = fluid('soldering_alloy'); //Soldering Alloy
def liquid3 = fluid('styrene_butadiene_rubber'); //Styrene Butadiene Rubber
def Liquid1 = fluid('ruthenium_trinium_americium_neutronate'); //Ruthenium Trinium Americium Neutronate
def liquid4 = fluid('lubricant'); //Lubricant
def LNtFpipe = metaitem('pipeLargeFluidNeutronium'); //Large Neutronium Fluid Pipe
def SBring = metaitem('ringStyreneButadieneRubber'); //Styrene butadiene rubber ring
def gstar = metaitem('gravistar'); //Gravi-Star
def frame = metaitem('frameTritanium'); //Tritanium Frame
def UHPIC = metaitem('plate.infinity_high_power_integrated_circuit'); //UHPIC
def SMDT = metaitem('smd.capacitor.supracausal'); 
def SMDC = metaitem('smd.transistor.supracausal');
def SMDR = metaitem('smd.diode.supracausal');
def SMDD = metaitem('smd.resistor.supracausal');

//OpV Machine Casing
crafting.addShaped('OpV_Machine_Casing', item('gregtech:machine_casing:13') * 1,
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

//OpV Machine Hull
crafting.addShaped('OpV Machine Hull', item('gregtech:machine:998') * 1,
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

//Epic Electric Furnace V
crafting.addShaped('Epic Electric Furnace V', item('gregtech:machine:62') * 1,
    [
        [circuitOPV,NqAlloy,circuitOPV],
        [NqAlloy,hull,NqAlloy],
        [cable,NqAlloy,cable]
    ]);

//Epic Macerator V
crafting.addShaped('Epic Macerator V', item('gregtech:machine:77') * 1,
    [
        [piston,motor,Grinder],
        [cable,cable,hull],
        [circuitOPV,circuitOPV,cable]
    ]);

//Epic Alloy Smleter V
crafting.addShaped('Epic Alloy Smelter V',item('gregtech:machine:92') * 1,
    [
        [circuitOPV,NqAlloy2,circuitOPV],
        [NqAlloy2,hull,NqAlloy2],
        [cable,NqAlloy2,cable]
    ]);

//Epic Arc Furnace V
crafting.addShaped('Epic Arc Furnace V', item('gregtech:machine:107') * 1,
    [
        [cable,ore('dustGraphite'),cable],
        [circuitOPV,hull,circuitOPV],
        [Plate,Plate,Plate]
    ]);

//Epic Assembling Machine V
crafting.addShaped('Epic Assembling Machine V', item('gregtech:machine:122') * 1,
    [
        [RobotArm,circuitOPV,RobotArm],
        [conveyor,hull,conveyor],
        [cable,circuitOPV,cable]
    ]);

//Epic Autoclave V
crafting.addShaped('Epic Autoclave V', item('gregtech:machine:137') * 1,
    [
        [Plate,item('gregtech:transparent_casing', 1),Plate],
        [Plate,hull,Plate],
        [circuitOPV,pump,circuitOPV]
    ]);

//Epic Metal Bender V
crafting.addShaped('Epic Metal Bender V', item('gregtech:machine:152') * 1,
    [
        [piston,conveyor,piston],
        [circuitOPV,hull,circuitOPV],
        [motor,cable,motor]
    ]);

//Epic Brewery V
crafting.addShaped('Epic Brewery V', item('gregtech:machine:167') * 1,
    [
        [glass,pump,glass],
        [cable,hull,cable],
        [circuitOPV,blaze,circuitOPV]
    ]);

//Epic Canning Machine V
crafting.addShaped('Epic Canning Machine V', item('gregtech:machine:182') * 1,
    [
        [cable,pump,cable],
        [circuitOPV,hull,circuitOPV],
        [glass,glass,glass]
    ]);

//Epic Centrifuge V
crafting.addShaped('Epic Centrifuge V', item('gregtech:machine:197') * 1,
    [
        [circuitOPV,motor,circuitOPV],
        [cable,hull,cable],
        [circuitOPV,motor,circuitOPV]
    ]);

//Epic Chemical Bath V
crafting.addShaped('Epic Chemical Bath V', item('gregtech:machine:212') * 1,
    [
        [conveyor,glass,cable],
        [pump,glass,conveyor],
        [circuitOPV,hull,circuitOPV]
    ]);

//Epic Chemical Reactor V
crafting.addShaped('Epic Chemical Reactor V', item('gregtech:machine:227') * 1,
    [
        [item('gregtech:fluid_pipe_tiny:127'),Rotor,item('gregtech:fluid_pipe_tiny:127')],
        [cable,motor,cable],
        [circuitOPV,hull,circuitOPV]
    ]);

//Epic Compressor V
crafting.addShaped('Epic Compressor V', item('gregtech:machine:242') * 1,
    [
        [null,circuitOPV,null],
        [piston,hull,piston],
        [cable,circuitOPV,cable]
    ]);

//Epic Cutting Machine V
crafting.addShaped('Epic Cutting Machine V', item('gregtech:machine:257') * 1,
    [
        [cable,circuitOPV,glass],
        [conveyor,hull,Buzzsaw],
        [circuitOPV,cable,motor]
    ]);

//Epic Distillery V
crafting.addShaped('Epic Distillery V', item('gregtech:machine:272') * 1,
    [
        [glass,blaze,glass],
        [circuitOPV,hull,circuitOPV],
        [cable,pump,cable]
    ]);

//Epic Electrolyzer V
crafting.addShaped('Epic Electrolyzer V', item('gregtech:machine:287') * 1,
    [
        [Os_wire,fus_glass,Os_wire],
        [Os_wire,hull,Os_wire],
        [circuitOPV,cable,circuitOPV]
    ]);

//Epic Electromagnetic Separator V
crafting.addShaped('Epic Electromagnetic Separator V', item('gregtech:machine:302') * 1,
    [
        [conveyor,cable,cable2],
        [cable,hull,Lrod],
        [circuitOPV,cable,cable2]
    ]);

//Epic Extractor V
crafting.addShaped('Epic Extractor V', item('gregtech:machine:317') * 1,
    [
        [glass,circuitOPV,glass],
        [piston,hull,pump],
        [cable,circuitOPV,cable]
    ]);

//Epic Extruder V
crafting.addShaped('Epic Extruder V', item('gregtech:machine:332') * 1,
    [
        [NqAlloy2,NqAlloy2,circuitOPV],
        [piston,hull,item('gregtech:fluid_pipe_tiny:127')],
        [NqAlloy2,NqAlloy2,circuitOPV]
    ]);

//Epic Fermenter V
crafting.addShaped('Epic Fermenter V', item('gregtech:machine:347') * 1,
    [
        [cable,pump,cable],
        [glass,hull,glass],
        [cable,circuitOPV,cable]
    ]);

//Epic Fluid Heater V
crafting.addShaped('Epic Fluid Heater V', item('gregtech:machine:392') * 1,
    [
        [NqAlloy2,fus_glass,NqAlloy2],
        [pump,hull,pump],
        [cable,circuitOPV,cable]
    ]);

//Epic Fluid Solidifier V
crafting.addShaped('Epic Fluid Solidifier V', item('gregtech:machine:407') * 1,
    [
        [pump,glass,pump],
        [cable,hull,cable],
        [circuitOPV,item('minecraft:chest'),circuitOPV]
    ]);

//Epic Forge Hammer V
crafting.addShaped('Epic Forge Hammer V', item('gregtech:machine:422') * 1,
    [
        [cable,piston,cable],
        [circuitOPV,hull,circuitOPV],
        [cable,item('minecraft:anvil'),cable]
    ]);

//Epic Forming Press V
crafting.addShaped('Epic Forming Press V', item('gregtech:machine:437') * 1,
    [
        [cable,piston,cable],
        [circuitOPV,hull,circuitOPV],
        [cable,piston,cable]
    ]);

//Epic Lathe V
crafting.addShaped('Epic Lathe V', item('gregtech:machine:452') * 1,
    [
        [cable,circuitOPV,cable],
        [motor,hull,Grinder],
        [circuitOPV,cable,piston]
    ]);

//Epic Mixer V
crafting.addShaped('Epic Mixer V', item('gregtech:machine:487') * 1,
    [
        [fus_glass,Rotor,fus_glass],
        [fus_glass,motor,fus_glass],
        [circuitOPV,hull,circuitOPV]
    ]);

//Epic Ore Washing Plant V
crafting.addShaped('Epic Ore Washing Plant V', item('gregtech:machine:497') * 1,
    [
        [Rotor,fus_glass,Rotor],
        [circuitOPV,motor,circuitOPV],
        [cable,hull,cable]
    ]);

//Epic Packager V
crafting.addShaped('Epic Packager V', item('gregtech:machine:512') * 1,
    [
        [item('minecraft:chest'),circuitOPV,item('minecraft:chest')],
        [RobotArm,hull,conveyor],
        [cable,circuitOPV,cable]
    ]);

//Epic Polarizer V
crafting.addShaped('Epic Polarizer V', item('gregtech:machine:557') * 1,
    [
        [NqAlloy2,Lrod,NqAlloy2],
        [cable,hull,cable],
        [NqAlloy2,Lrod,NqAlloy2]
    ]);

//Epic Presision Laser Engraver V
crafting.addShaped('Epic Precision Laser Engraver V', item('gregtech:machine:572') * 1,
    [
        [piston,Emitter,piston],
        [circuitOPV,hull,circuitOPV],
        [cable,circuitOPV,cable]
    ]);

//Epic Sifting Machine V
crafting.addShaped('Epic Sifting Machine V', item('gregtech:machine:587') * 1,
    [
        [cable,Ifilter,cable],
        [piston,hull,piston],
        [circuitOPV,Ifilter,circuitOPV]
    ]);

//Epic Thermal Centrifuge V
crafting.addShaped('Epic Thermal Centrifuge V', item('gregtech:machine:617') * 1,
    [
        [circuitOPV,motor,circuitOPV],
        [NqAlloy2,hull,NqAlloy2],
        [cable,motor,cable]
    ]);

//Epic Wiremill V
crafting.addShaped('Epic Wiremill V', item('gregtech:machine:632') * 1,
    [
        [motor,cable,motor],
        [circuitOPV,hull,circuitOPV],
        [motor,cable,motor]
    ]);

//Epic Circuit Assembler V
crafting.addShaped('Epic Circuit Assembler V', item('gregtech:machine:647') * 1,
    [
        [RobotArm,hull,Emitter],
        [conveyor,circuitOPV,conveyor],
        [cable,circuitOPV,cable]
    ]);

//Epic Rock Breaker V
crafting.addShaped('Epic Rock Breaker V', item('gregtech:machine:677') * 1,
    [
        [piston,motor,Grinder],
        [cable,hull,cable],
        [glass,glass,glass]
    ]);

//Wakfu Reactor MK5
crafting.addShaped('Wakfu Reactor Mk5', item('gregtech:machine:32116') * 1,
    [
        [Emitter,Field_Gen,Emitter],
        [cable,hull,cable],
        [circuitUXV,circuitOPV,circuitUXV]
    ]);

//OpV 4x Battery Buffer
crafting.addShaped('OpV 4x Battery Buffer', item('gregtech:machine:1328') * 1,
    [
        [null,null,null],
        [cable,item('minecraft:chest'),cable],
        [cable,hull,cable]
    ]);

//OpV 8x Battery Buffer
crafting.addShaped('OpV 8x Battery Buffer', item('gregtech:machine:1342') * 1,
    [
        [null,null,null],
        [cable,item('minecraft:chest'),cable],
        [cable2,hull,cable2]
    ]);

//OpV 16x Battery Buffer
crafting.addShaped('OpV 16x Battery Buffer', item('gregtech:machine:1356') * 1,
    [
        [null,null,null],
        [cable2,item('minecraft:chest'),cable2],
        [cable2,hull,cable2]
    ]);

// Data Module * 1
mods.gregtech.research_station.removeByInput(1966080, [metaitem('tool.datamodule'), metaitem('energy.cluster')], null)
// Data Module * 1
mods.gregtech.research_station.removeByInput(122880, [metaitem('tool.datamodule'), metaitem('energy.module')], null)

// Pure Lightmatter transciver * 1
mods.gregtech.assembly_line.removeByInput(300000, [metaitem('plateDoubleDarmstadtium') * 16, metaitem('circuit.wetware_mainframe') * 4, metaitem('energy.cluster') * 16, metaitem('field.generator.uv') * 4, metaitem('wafer.ultra_high_power_integrated_circuit') * 64, metaitem('wafer.ultra_high_power_integrated_circuit') * 64, metaitem('component.advanced_smd.diode') * 64, metaitem('component.advanced_smd.capacitor') * 64, metaitem('component.advanced_smd.resistor') * 64, metaitem('component.advanced_smd.transistor') * 64, metaitem('component.advanced_smd.inductor') * 64, metaitem('wireGtSingleEnrichedNaquadahTriniumEuropiumDuranide') * 64, metaitem('boltNeutronium') * 64], [fluid('soldering_alloy') * 5760, fluid('polybenzimidazole') * 2304, fluid('naquadria') * 2592])


//Lightmatter extremly small capacitor
assembly_line.recipeBuilder()
    .inputs(
        metaitem('circuit_board.enigmatic') * 1,
        Plate * 16,
        circuitOPV * 4,
        metaitem('phi.uxv') * 1,
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
        fluid('runicalloy') * 16000
    )
    .outputs(metaitem('omega.opv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('phi.uxv')).CWUt(144).EUt(147456000))
    .EUt(20000000)
    .duration(1900)
    .buildAndRegister();

//Primal Doifus
assembly_line.recipeBuilder()
    .inputs(
        metaitem('circuit_board.enigmatic') * 1,
        Plate * 16,
        circuitOPV * 8,
        item('gregtech:meta_item_1:758') * 1,
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
        fluid('runicalloy') * 32000
    )
    .outputs(metaitem('elia.opv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('omega.opv')).CWUt(160).EUt(147456000))
    .EUt(30000000)
    .duration(2000)
    .buildAndRegister();

//Pure Light Matter Transciver
assembly_line.recipeBuilder()
    .inputs(
        metaitem('circuit_board.enigmatic') * 1,
        Plate * 16,
        circuitOPV * 16,
        metaitem('elia.opv') * 16,
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
        fluid('runicalloy') * 64000
    )
    .outputs(metaitem('max.battery') * 1)
    .stationResearch(b -> b.researchStack(metaitem('elia.opv')).CWUt(176).EUt(147456000))
    .EUt(500000000)
    .duration(2200)
    .buildAndRegister();

//Laser Target

//256A OpV
assembler.recipeBuilder()
    .inputs(
        metaitem('hull.opv') * 1,
        metaitem('lensDiamond') * 1,
        metaitem('emitter.opv') * 1,
        metaitem('electric.pump.opv') * 1,
        metaitem('cableGtSingleWakfustasis') * 1
    )
    .circuitMeta(1)
    .outputs(metaitem('laser_hatch.target_256a.opv') * 1)
    .EUt(503316480)
    .duration(300)
    .buildAndRegister();

//1024A OpV
assembler.recipeBuilder()
    .inputs(
        metaitem('hull.opv') * 1,
        metaitem('lensDiamond') * 2,
        metaitem('emitter.opv') * 2,
        metaitem('electric.pump.opv') * 2,
        metaitem('cableGtDoubleWakfustasis') * 2
    )
    .circuitMeta(2)
    .outputs(metaitem('laser_hatch.target_1024a.opv') * 1)
    .EUt(503316480)
    .duration(300)
    .buildAndRegister();

//1024A OpV
assembler.recipeBuilder()
    .inputs(
        metaitem('hull.opv') * 1,
        metaitem('lensDiamond') * 4,
        metaitem('emitter.opv') * 4,
        metaitem('electric.pump.opv') * 4,
        metaitem('cableGtQuadrupleWakfustasis') * 4
    )
    .circuitMeta(3)
    .outputs(metaitem('laser_hatch.target_4096a.opv') * 1)
    .EUt(503316480)
    .duration(300)
    .buildAndRegister();

//Laser Source

//256A OpV
assembler.recipeBuilder()
    .inputs(
        metaitem('hull.opv') * 1,
        metaitem('lensDiamond') * 1,
        metaitem('sensor.opv') * 1,
        metaitem('electric.pump.opv') * 1,
        metaitem('cableGtSingleWakfustasis') * 1
    )
    .circuitMeta(1)
    .outputs(metaitem('laser_hatch.source_256a.opv') * 1)
    .EUt(503316480)
    .duration(300)
    .buildAndRegister();

//1024A OpV
assembler.recipeBuilder()
    .inputs(
        metaitem('hull.opv') * 1,
        metaitem('lensDiamond') * 2,
        metaitem('sensor.opv') * 2,
        metaitem('electric.pump.opv') * 2,
        metaitem('cableGtDoubleWakfustasis') * 2
    )
    .circuitMeta(2)
    .outputs(metaitem('laser_hatch.source_1024a.opv') * 1)
    .EUt(503316480)
    .duration(300)
    .buildAndRegister();

//4096A OpV
assembler.recipeBuilder()
    .inputs(
        metaitem('hull.opv') * 1,
        metaitem('lensDiamond') * 4,
        metaitem('sensor.opv') * 4,
        metaitem('electric.pump.opv') * 4,
        metaitem('cableGtQuadrupleWakfustasis') * 4
    )
    .circuitMeta(3)
    .outputs(metaitem('laser_hatch.source_4096a.opv') * 1)
    .EUt(503316480)
    .duration(300)
    .buildAndRegister();

//OpV Transformer
crafting.addShaped('OpV Transformer', metaitem('transformer.opv') * 1,
    [
        [metaitem('smd.capacitor.supracausal'),metaitem('cableGtSingleRunicalloy'),metaitem('cableGtSingleRunicalloy')],
        [metaitem('cableGtSingleWakfustasis'),metaitem('hull.opv'),null],
        [metaitem('smd.transistor.supracausal'),metaitem('cableGtSingleRunicalloy'),metaitem('cableGtSingleRunicalloy')]
    ]);

//OpV Transformer Hi-Amp
crafting.addShaped('OpV Transformer Hi-Amp', metaitem('transformer.hi_amp.opv') * 1,
    [
        [metaitem('phi.uxv'),metaitem('cableGtQuadrupleRunicalloy'),metaitem('cableGtQuadrupleRunicalloy')],
        [metaitem('cableGtQuadrupleWakfustasis'),metaitem('transformer.opv'),null],
        [ore('circuitOpv'),metaitem('cableGtQuadrupleRunicalloy'),metaitem('cableGtQuadrupleRunicalloy')]
    ]);

//OpV Power Transformer
assembler.recipeBuilder()
    .inputs(
        metaitem('transformer.hi_amp.opv') * 1,
        metaitem('electric.pump.uev') * 1,
        metaitem('cableGtOctalWakfustasis') * 1,
        metaitem('cableGtHexRunicalloy') * 4,
        metaitem('springRunicalloy') * 2,
        metaitem('springSmallWakfustasis') * 1
    )
    .fluidInputs(fluid('sodium_potassium') * 2000)
    .outputs(metaitem('transformer.adjustable.opv') * 1)
    .EUt(503316480)
    .duration(200)
    .buildAndRegister();

//Energy Hatch
assembly_line.recipeBuilder()
    .inputs(
        metaitem('hull.opv') * 1,
        metaitem('cableGtSingleRunicalloy') * 1,
        metaitem('plate.infinity_high_power_integrated_circuit') * 8,
        ore('circuitOpv') * 1,
        metaitem('phi.uxv') * 1
    )
    .fluidInputs(
        fluid('sodium_potassium') * 16000,
        fluid('soldering_alloy') * 93456
        )
    .outputs(metaitem('energy_hatch.input.opv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('energy_hatch.input.uxv')).CWUt(160).EUt(125829120))
    .EUt(503316480)
    .duration(1000)
    .buildAndRegister();

//4A Energy Hatch
assembler.recipeBuilder()
    .inputs(
        metaitem('energy_hatch.input.opv') * 2,
        metaitem('plate.infinity_high_power_integrated_circuit') * 8,
        metaitem('cableGtDoubleRunicalloy') * 1,
        metaitem('phi.uxv') * 1,
        metaitem('transformer.opv') * 1
    )
    .outputs(metaitem('energy_hatch.input_4a.opv') * 1)
    .EUt(125829120)
    .duration(100)
    .buildAndRegister();

//16A Energy Hatch   
assembler.recipeBuilder()
    .inputs(
        metaitem('energy_hatch.input_4a.opv') * 2,
        metaitem('plate.infinity_high_power_integrated_circuit') * 8,
        metaitem('cableGtDoubleRunicalloy') * 1,
        metaitem('phi.uxv') * 1,
        metaitem('transformer.hi_amp.opv') * 1
    )
    .outputs(metaitem('energy_hatch.input_16a.opv') * 1)
    .EUt(125829120)
    .duration(100)
    .buildAndRegister();

//64A Substation Hatch
assembler.recipeBuilder()
    .inputs(
        metaitem('energy_hatch.input_16a.opv') * 2,
        metaitem('plate.infinity_high_power_integrated_circuit') * 8,
        metaitem('cableGtDoubleRunicalloy') * 1,
        metaitem('phi.uxv') * 1,
        metaitem('transformer.adjustable.opv') * 1
    )
    .outputs(metaitem('substation_hatch.input_64a.opv') * 1)
    .EUt(125829120)
    .duration(100)
    .buildAndRegister();

//Dynamo Hatch
assembly_line.recipeBuilder()
    .inputs(
        metaitem('hull.opv') * 1,
        metaitem('cableGtSingleRunicalloy') * 1,
        metaitem('plate.infinity_high_power_integrated_circuit') * 8,
        ore('circuitOpv') * 1,
        metaitem('emitter.opv') * 1
    )
    .fluidInputs(
        fluid('sodium_potassium') * 16000,
        fluid('soldering_alloy') * 93456
        )
    .outputs(metaitem('energy_hatch.output.opv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('energy_hatch.output.uxv')).CWUt(160).EUt(125829120))
    .EUt(503316480)
    .duration(1000)
    .buildAndRegister();

//4A Dynamo Hatch
assembler.recipeBuilder()
    .inputs(
        metaitem('energy_hatch.output.opv') * 2,
        metaitem('plate.infinity_high_power_integrated_circuit') * 8,
        metaitem('cableGtDoubleRunicalloy') * 1,
        metaitem('phi.uxv') * 1,
        metaitem('transformer.opv') * 1,
        metaitem('emitter.opv') * 2
    )
    .outputs(metaitem('energy_hatch.output_4a.opv') * 1)
    .EUt(125829120)
    .duration(100)
    .buildAndRegister();

//16A Dynamo Hatch   
assembler.recipeBuilder()
    .inputs(
        metaitem('energy_hatch.output_4a.opv') * 2,
        metaitem('plate.infinity_high_power_integrated_circuit') * 8,
        metaitem('cableGtDoubleRunicalloy') * 1,
        metaitem('phi.uxv') * 1,
        metaitem('transformer.hi_amp.opv') * 1,
        metaitem('emitter.opv') * 4
    )
    .outputs(metaitem('energy_hatch.output_16a.opv') * 1)
    .EUt(125829120)
    .duration(100)
    .buildAndRegister();

//64A Substation Dynamo Hatch
assembler.recipeBuilder()
    .inputs(
        metaitem('energy_hatch.output_16a.opv') * 2,
        metaitem('plate.infinity_high_power_integrated_circuit') * 8,
        metaitem('cableGtDoubleRunicalloy') * 1,
        metaitem('phi.uxv') * 1,
        metaitem('transformer.adjustable.opv') * 1,
        metaitem('emitter.opv') * 16
    )
    .outputs(metaitem('substation_hatch.output_64a.opv') * 1)
    .EUt(125829120)
    .duration(100)
    .buildAndRegister();
