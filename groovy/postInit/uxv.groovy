import gregtech.*


def assembler = recipemap('assembler');
def assembly_line = recipemap('assembly_line')
def research_station = recipemap('research_station');


def motor = metaitem('electric.motor.uxv');
def pump = metaitem('electric.pump.uxv');
def conveyor = metaitem('conveyor.module.uxv');
def piston = metaitem('electric.piston.uxv');
def RobotArm = metaitem('robot.arm.uxv');
def Field_Gen = metaitem('field.generator.uxv');
def Emitter = metaitem('emitter.uxv');
def Sensor = metaitem('sensor.uxv');
def circuitZPM = ore('circuitZpm');
def circuitUV = ore('circuitUv'); 
def circuitUHV = ore('circuitUhv'); 
def circuitUEV = ore('circuitUev'); 
def circuitUIV = ore('circuitUiv'); 
def circuitUXV = ore('circuitUxv'); 
def circuitOPV = ore('circuitOpv');
def Plate = metaitem('plateRunicalloy'); //Runic Alloy Alloy Plate
def Rod = metaitem('stickRunicalloy'); //Runic Alloy Alloy Rod
def Lrod = metaitem('stickLongRunicalloy'); //Runic Alloy Alloy Long Rod
def Ring = metaitem('ringRunicalloy'); //Runic Alloy Alloy Ring
def Round = metaitem('roundRunicalloy'); //Runic Alloy Alloy Round
def Spring = metaitem('springRunicalloy'); //Runic Alloy Alloy Sping
def Sspring = metaitem('springSmallRunicalloy'); //Runic Alloy Alloy Small Spring
def Gear = metaitem('gearRunicalloy'); //Runic Alloy Alloy Gear
def Sgear = metaitem('gearSmallRunicalloy'); //Runic Alloy Alloy Small Gear
def Screw = metaitem('screwRunicalloy'); //Runic Alloy Alloy Screw
def FineW = metaitem('wireFineRunicalloy'); //Runic Alloy Alloy Fine Wire
def Rotor = metaitem('rotorRunicalloy'); //Runic Alloy Alloy Rotor
def foil = metaitem('foilRunicalloy'); //Runic Alloy Alloy Foil
def cable = metaitem('cableGtSingleRunicalloy'); //Runic Alloy Alloy Cable
def cable2 = metaitem('wireGtOctalRunicalloy'); //Runic Alloy Alloy Wire 8x
def Buzzsaw = metaitem('toolHeadBuzzSawRunicalloy'); //Runic Alloy Alloy Buzzsaw
def Bolt = metaitem('boltRunicalloy'); //Runic Alloy Bolt
def PBIplate = metaitem('platePolybenzimidazole'); //PBI Plate
def casing = item('gregtech:machine_casing', 12); //UIV Machine Casing
def hull = metaitem('hull.uxv'); //UIV Machine Hull
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
def UHPIC = metaitem('plate.ultimate_high_power_integrated_circuit'); //UHPIC
def SMDT = metaitem('component.smd.transistor.wetware'); //SMD Supra-Causal Transistor
def SMDC = metaitem('component.smd.capacitor.wetware'); //SMD Supra-Causal Capacitor
def SMDR = metaitem('component.smd.resistor.wetware'); //SMD Supra-Causal Resistor
def SMDD = metaitem('component.smd.diode.wetware'); //SMD Supra-Causal Diode

//UXV Machine Casing
crafting.addShaped("UXV Machine Casing", item('gregtech:machine_casing', 12) * 1,
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

//UXV Machine Hull
crafting.addShaped("UXV Machine Hull", metaitem('hull.uxv') * 1,
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

//Epic Electric Furnace IV
crafting.addShaped("Epic Electric Furnace IV", item('gregtech:machine:61') * 1,
    [
        [circuitUXV,NqAlloy,circuitUXV],
        [NqAlloy,hull,NqAlloy],
        [cable,NqAlloy,cable]
    ]);

//Epic Macerator IV
crafting.addShaped("Epic Macerator IV", item('gregtech:machine:76') * 1,
    [
        [piston,motor,Grinder],
        [cable,cable,hull],
        [circuitUXV,circuitUXV,cable]
    ]);

//Epic Alloy Smleter IV
crafting.addShaped("Epic Alloy Smelter IV",item('gregtech:machine:91') * 1,
    [
        [circuitUXV,NqAlloy2,circuitUXV],
        [NqAlloy2,hull,NqAlloy2],
        [cable,NqAlloy2,cable]
    ]);

//Epic Arc Furnace IV
crafting.addShaped("Epic Arc Furnace IV", item('gregtech:machine:106') * 1,
    [
        [cable,metaitem('dustGraphite'),cable],
        [circuitUXV,hull,circuitUXV],
        [Plate,Plate,Plate]
    ]);

//Epic Assembling Machine IV
crafting.addShaped("Epic Assembling Machine IV", item('gregtech:machine:121') * 1,
    [
        [RobotArm,circuitUXV,RobotArm],
        [conveyor,hull,conveyor],
        [cable,circuitUXV,cable]
    ]);

//Epic Autoclave IV
crafting.addShaped("Epic Autoclave IV", item('gregtech:machine:136') * 1,
    [
        [Plate,glass,Plate],
        [Plate,hull,Plate],
        [circuitUXV,pump,circuitUXV]
    ]);

//Epic Metal Bender IV
crafting.addShaped("Epic Metal Bender IV", item('gregtech:machine:151') * 1,
    [
        [piston,conveyor,piston],
        [circuitUXV,hull,circuitUXV],
        [motor,cable,motor]
    ]);

//Epic Brewery IV
crafting.addShaped("Epic Brewery IV", item('gregtech:machine:166') * 1,
    [
        [glass,pump,glass],
        [cable,hull,cable],
        [circuitUXV,blaze,circuitUXV]
    ]);

//Epic Canning Machine IV
crafting.addShaped("Epic Canning Machine IV", item('gregtech:machine:181') * 1,
    [
        [cable,pump,cable],
        [circuitUXV,hull,circuitUXV],
        [glass,glass,glass]
    ]);

//Epic Centrifuge IV
crafting.addShaped("Epic Centrifuge IV", item('gregtech:machine:196') * 1,
    [
        [circuitUXV,motor,circuitUXV],
        [cable,hull,cable],
        [circuitUXV,motor,circuitUXV]
    ]);

//Epic Chemical Bath IV
crafting.addShaped("Epic Chemical Bath IV", item('gregtech:machine:211') * 1,
    [
        [conveyor,glass,cable],
        [pump,glass,conveyor],
        [circuitUXV,hull,circuitUXV]
    ]);

//Epic Chemical Reactor IV
crafting.addShaped("Epic Chemical Reactor IV", item('gregtech:machine:226') * 1,
    [
        [item('gregtech:fluid_pipe_tiny:127'),Rotor,item('gregtech:fluid_pipe_tiny:127')],
        [cable,motor,cable],
        [circuitUXV,hull,circuitUXV]
    ]);

//Epic Compressor IV
crafting.addShaped("Epic Compressor IV", item('gregtech:machine:241') * 1,
    [
        [null,circuitUXV,null],
        [piston,hull,piston],
        [cable,circuitUXV,cable]
    ]);

//Epic Cutting Machine IV
crafting.addShaped("Epic Cutting Machine IV", item('gregtech:machine:256') * 1,
    [
        [cable,circuitUXV,glass],
        [conveyor,hull,Buzzsaw],
        [circuitUXV,cable,motor]
    ]);

//Epic Distillery IV
crafting.addShaped("Epic Distillery IV", item('gregtech:machine:271') * 1,
    [
        [glass,blaze,glass],
        [circuitUXV,hull,circuitUXV],
        [cable,pump,cable]
    ]);

//Epic Electrolyzer IV
crafting.addShaped("Epic Electrolyzer IV", item('gregtech:machine:286') * 1,
    [
        [Os_wire,fus_glass,Os_wire],
        [Os_wire,hull,Os_wire],
        [circuitUXV,cable,circuitUXV]
    ]);

//Epic Electromagnetic Separator IV
crafting.addShaped("Epic Electromagnetic Separator IV", item('gregtech:machine:301') * 1,
    [
        [conveyor,cable,cable2],
        [cable,hull,Lrod],
        [circuitUXV,cable,cable2]
    ]);

//Epic Extractor IV
crafting.addShaped("Epic Extractor IV", item('gregtech:machine:316') * 1,
    [
        [glass,circuitUXV,glass],
        [piston,hull,pump],
        [cable,circuitUXV,cable]
    ]);

//Epic Extruder IV
crafting.addShaped("Epic Extruder IV", item('gregtech:machine:331') * 1,
    [
        [NqAlloy2,NqAlloy2,circuitUXV],
        [piston,hull,item('gregtech:fluid_pipe_tiny:127')],
        [NqAlloy2,NqAlloy2,circuitUXV]
    ]);

//Epic Fermenter IV
crafting.addShaped("Epic Fermenter IV", item('gregtech:machine:346') * 1,
    [
        [cable,pump,cable],
        [glass,hull,glass],
        [cable,circuitUXV,cable]
    ]);

//Epic Fluid Heater IV
crafting.addShaped("Epic Fluid Heater IV", item('gregtech:machine:391') * 1,
    [
        [NqAlloy2,fus_glass,NqAlloy2],
        [pump,hull,pump],
        [cable,circuitUXV,cable]
    ]);

//Epic Fluid Solidifier IV
crafting.addShaped("Epic Fluid Solidifier IV", item('gregtech:machine:406') * 1,
    [
        [pump,glass,pump],
        [cable,hull,cable],
        [circuitUXV,item('minecraft:chest'),circuitUXV]
    ]);

//Epic Forge Hammer IV
crafting.addShaped("Epic Forge Hammer IV", item('gregtech:machine:421') * 1,
    [
        [cable,piston,cable],
        [circuitUXV,hull,circuitUXV],
        [cable,item('minecraft:anvil'),cable]
    ]);

//Epic Forming Press IV
crafting.addShaped("Epic Forming Press IV", item('gregtech:machine:436') * 1,
    [
        [cable,piston,cable],
        [circuitUXV,hull,circuitUXV],
        [cable,piston,cable]
    ]);

//Epic Lathe IV
crafting.addShaped("Epic Lathe IV", item('gregtech:machine:451') * 1,
    [
        [cable,circuitUXV,cable],
        [motor,hull,Grinder],
        [circuitUXV,cable,piston]
    ]);

//Epic Mixer IV
crafting.addShaped("Epic Mixer IV", item('gregtech:machine:481') * 1,
    [
        [fus_glass,Rotor,fus_glass],
        [fus_glass,motor,fus_glass],
        [circuitUXV,hull,circuitUXV]
    ]);

//Epic Ore Washing Plant IV
crafting.addShaped("Epic Ore Washing Plant IV", item('gregtech:machine:496') * 1,
    [
        [Rotor,fus_glass,Rotor],
        [circuitUXV,motor,circuitUXV],
        [cable,hull,cable]
    ]);

//Epic Packager IV
crafting.addShaped("Epic Packager IV", item('gregtech:machine:511') * 1,
    [
        [item('minecraft:chest'),circuitUXV,item('minecraft:chest')],
        [RobotArm,hull,conveyor],
        [cable,circuitUXV,cable]
    ]);
    
//Epic Polarizer IV
crafting.addShaped("Epic Polarizer IV", item('gregtech:machine:556') * 1,
    [
        [NqAlloy2,Lrod,NqAlloy2],
        [cable,hull,cable],
        [NqAlloy2,Lrod,NqAlloy2]
    ]);

//Epic Presision Laser Engraver IV
crafting.addShaped("Epic Precision Laser Engraver IV", item('gregtech:machine:571') * 1,
    [
        [piston,Emitter,piston],
        [circuitUXV,hull,circuitUXV],
        [cable,circuitUXV,cable]
    ]);

//Epic Sifting Machine IV
crafting.addShaped("Epic Sifting Machine IV", item('gregtech:machine:586') * 1,
    [
        [cable,Ifilter,cable],
        [piston,hull,piston],
        [circuitUXV,Ifilter,circuitUXV]
    ]);

//Epic Thermal Centrifuge IV
crafting.addShaped("Epic Thermal Centrifuge IV", item('gregtech:machine:616') * 1,
    [
        [circuitUXV,motor,circuitUXV],
        [NqAlloy2,hull,NqAlloy2],
        [cable,motor,cable]
    ]);

//Epic Wiremill IV
crafting.addShaped("Epic Wiremill IV", item('gregtech:machine:631') * 1,
    [
        [motor,cable,motor],
        [circuitUXV,hull,circuitUXV],
        [motor,cable,motor]
    ]);

//Epic Circuit Assembler IV
crafting.addShaped("Epic Circuit Assembler IV", item('gregtech:machine:646') * 1,
    [
        [RobotArm,hull,Emitter],
        [conveyor,circuitUXV,conveyor],
        [cable,circuitUXV,cable]
    ]);

//Epic Rock Breaker IV
crafting.addShaped("Epic Rock Breaker IV", item('gregtech:machine:676') * 1,
    [
        [piston,motor,Grinder],
        [cable,hull,cable],
        [glass,glass,glass]
    ]);

//Wakfu Reactor MK4
crafting.addShaped("Wakfu Reactor Mk4", item('gregtech:machine:32115') * 1,
    [
        [Emitter,Field_Gen,Emitter],
        [cable,hull,cable],
        [circuitUIV,circuitUXV,circuitUIV]
    ]);

//UXV 4x Battery Buffer
crafting.addShaped("UXV 4x Battery Buffer", item('gregtech:machine:1327') * 1,
    [
        [null,null,null],
        [cable,item('minecraft:chest'),cable],
        [cable,hull,cable]
    ]);

//UXV 8x Battery Buffer
crafting.addShaped("UXV 8x Battery Buffer", item('gregtech:machine:1341') * 1,
    [
        [null,null,null],
        [cable,item('minecraft:chest'),cable],
        [cable2,hull,cable2]
    ]);

//UXV 16x Battery Buffer
crafting.addShaped("UXV 16x Battery Buffer", item('gregtech:machine:1355') * 1,
    [
        [null,null,null],
        [cable2,item('minecraft:chest'),cable2],
        [cable2,hull,cable2]
    ]);

//Runic Stellarite Powered Capacitor
assembly_line.recipeBuilder()
    .inputs(
        metaitem('circuit_board.enigmatic') * 1,
        Plate * 16,
        circuitUXV * 6,
        metaitem('sigma.uiv') * 1,
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
        fluid('stellarite') * 32000
    )
    .outputs(metaitem('phi.uxv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('sigma.uiv')).CWUt(128).EUt(36864000))
    .EUt(12000000)
    .duration(1800)
    .buildAndRegister();

//Laser Target

//256A OpV
assembler.recipeBuilder()
    .inputs(
        metaitem('hull.uxv') * 1,
        metaitem('lensDiamond') * 1,
        metaitem('emitter.uxv') * 1,
        metaitem('electric.pump.uxv') * 1,
        metaitem('cableGtSingleStellarite') * 1
    )
    .circuitMeta(1)
    .outputs(metaitem('laser_hatch.target_256a.uxv') * 1)
    .EUt(125829120)
    .duration(300)
    .buildAndRegister();

//1024A OpV
assembler.recipeBuilder()
    .inputs(
        metaitem('hull.uxv') * 1,
        metaitem('lensDiamond') * 2,
        metaitem('emitter.uxv') * 2,
        metaitem('electric.pump.uxv') * 2,
        metaitem('cableGtDoubleStellarite') * 2
    )
    .circuitMeta(2)
    .outputs(metaitem('laser_hatch.target_1024a.uxv') * 1)
    .EUt(125829120)
    .duration(300)
    .buildAndRegister();

//1024A OpV
assembler.recipeBuilder()
    .inputs(
        metaitem('hull.uxv') * 1,
        metaitem('lensDiamond') * 4,
        metaitem('emitter.uxv') * 4,
        metaitem('electric.pump.uxv') * 4,
        metaitem('cableGtQuadrupleStellarite') * 4
    )
    .circuitMeta(3)
    .outputs(metaitem('laser_hatch.target_4096a.uxv') * 1)
    .EUt(125829120)
    .duration(300)
    .buildAndRegister();

//Laser Source

//256A OpV
assembler.recipeBuilder()
    .inputs(
        metaitem('hull.uxv') * 1,
        metaitem('lensDiamond') * 1,
        metaitem('sensor.uxv') * 1,
        metaitem('electric.pump.uxv') * 1,
        metaitem('cableGtSingleStellarite') * 1
    )
    .circuitMeta(1)
    .outputs(metaitem('laser_hatch.source_256a.uxv') * 1)
    .EUt(125829120)
    .duration(300)
    .buildAndRegister();

//1024A OpV
assembler.recipeBuilder()
    .inputs(
        metaitem('hull.uxv') * 1,
        metaitem('lensDiamond') * 2,
        metaitem('sensor.uxv') * 2,
        metaitem('electric.pump.uxv') * 2,
        metaitem('cableGtDoubleStellarite') * 2
    )
    .circuitMeta(2)
    .outputs(metaitem('laser_hatch.source_1024a.uxv') * 1)
    .EUt(125829120)
    .duration(300)
    .buildAndRegister();

//4096A OpV
assembler.recipeBuilder()
    .inputs(
        metaitem('hull.uxv') * 1,
        metaitem('lensDiamond') * 4,
        metaitem('sensor.uxv') * 4,
        metaitem('electric.pump.uxv') * 4,
        metaitem('cableGtQuadrupleStellarite') * 4
    )
    .circuitMeta(3)
    .outputs(metaitem('laser_hatch.source_4096a.uxv') * 1)
    .EUt(125829120)
    .duration(300)
    .buildAndRegister();

//UXV Transformer
crafting.addShaped('UXV Transformer', metaitem('transformer.uxv') * 1,
    [
        [metaitem('component.smd.transistor.wetware'),metaitem('cableGtSingleStellarite'),metaitem('cableGtSingleStellarite')],
        [metaitem('cableGtSingleRunicalloy'),metaitem('hull.uxv'),null],
        [metaitem('component.smd.capacitor.wetware'),metaitem('cableGtSingleStellarite'),metaitem('cableGtSingleStellarite')]
    ]);

//UXV Transformer Hi-Amp
crafting.addShaped('UXV Transformer Hi-Amp', metaitem('transformer.hi_amp.uxv') * 1,
    [
        [metaitem('sigma.uiv'),metaitem('cableGtQuadrupleStellarite'),metaitem('cableGtQuadrupleStellarite')],
        [metaitem('cableGtQuadrupleRunicalloy'),metaitem('transformer.uxv'),null],
        [ore('circuitUxv'),metaitem('cableGtQuadrupleStellarite'),metaitem('cableGtQuadrupleStellarite')]
    ]);

//UXV Power Transformer
assembler.recipeBuilder()
    .inputs(
        metaitem('transformer.hi_amp.uxv') * 1,
        metaitem('electric.pump.uhv') * 1,
        metaitem('cableGtOctalRunicalloy') * 1,
        metaitem('cableGtHexStellarite') * 4,
        metaitem('springStellarite') * 2,
        metaitem('springSmallRunicalloy') * 1
    )
    .fluidInputs(fluid('sodium_potassium') * 2000)
    .outputs(metaitem('transformer.adjustable.uxv') * 1)
    .EUt(125829120)
    .duration(200)
    .buildAndRegister();

//Energy Hatch
assembly_line.recipeBuilder()
    .inputs(
        metaitem('hull.uxv') * 1,
        metaitem('cableGtSingleStellarite') * 1,
        metaitem('plate.ultimate_high_power_integrated_circuit') * 8,
        ore('circuitUxv') * 1,
        metaitem('sigma.uiv') * 1
    )
    .fluidInputs(
        fluid('sodium_potassium') * 16000,
        fluid('soldering_alloy') * 93456
        )
    .outputs(metaitem('energy_hatch.input.uxv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('energy_hatch.input.uiv')).CWUt(160).EUt(31457280))
    .EUt(125829120)
    .duration(1000)
    .buildAndRegister();

//4A Energy Hatch
assembler.recipeBuilder()
    .inputs(
        metaitem('energy_hatch.input.uxv') * 2,
        metaitem('plate.ultimate_high_power_integrated_circuit') * 8,
        metaitem('cableGtDoubleStellarite') * 1,
        metaitem('sigma.uiv') * 1,
        metaitem('transformer.uxv') * 1
    )
    .outputs(metaitem('energy_hatch.input_4a.uxv') * 1)
    .EUt(31457280)
    .duration(100)
    .buildAndRegister();

//16A Energy Hatch   
assembler.recipeBuilder()
    .inputs(
        metaitem('energy_hatch.input_4a.uxv') * 2,
        metaitem('plate.ultimate_high_power_integrated_circuit') * 8,
        metaitem('cableGtDoubleStellarite') * 1,
        metaitem('sigma.uiv') * 1,
        metaitem('transformer.hi_amp.uxv') * 1
    )
    .outputs(metaitem('energy_hatch.input_16a.uxv') * 1)
    .EUt(31457280)
    .duration(100)
    .buildAndRegister();

//64A Substation Hatch
assembler.recipeBuilder()
    .inputs(
        metaitem('energy_hatch.input_16a.uxv') * 2,
        metaitem('plate.ultimate_high_power_integrated_circuit') * 8,
        metaitem('cableGtDoubleStellarite') * 1,
        metaitem('sigma.uiv') * 1,
        metaitem('transformer.adjustable.uxv') * 1
    )
    .outputs(metaitem('substation_hatch.input_64a.uxv') * 1)
    .EUt(31457280)
    .duration(100)
    .buildAndRegister();

//Dynamo Hatch
assembly_line.recipeBuilder()
    .inputs(
        metaitem('hull.uxv') * 1,
        metaitem('cableGtSingleStellarite') * 1,
        metaitem('plate.ultimate_high_power_integrated_circuit') * 8,
        ore('circuitUxv') * 1,
        metaitem('emitter.uxv') * 1
    )
    .fluidInputs(
        fluid('sodium_potassium') * 16000,
        fluid('soldering_alloy') * 93456
        )
    .outputs(metaitem('energy_hatch.output.uxv') * 1)
    .stationResearch(b -> b.researchStack(metaitem('energy_hatch.output.uiv')).CWUt(160).EUt(31457280))
    .EUt(125829120)
    .duration(1000)
    .buildAndRegister();

//4A Dynamo Hatch
assembler.recipeBuilder()
    .inputs(
        metaitem('energy_hatch.output.uxv') * 2,
        metaitem('plate.ultimate_high_power_integrated_circuit') * 8,
        metaitem('cableGtDoubleStellarite') * 1,
        metaitem('sigma.uiv') * 1,
        metaitem('transformer.uxv') * 1,
        metaitem('emitter.uxv') * 2
    )
    .outputs(metaitem('energy_hatch.output_4a.uxv') * 1)
    .EUt(31457280)
    .duration(100)
    .buildAndRegister();

//16A Dynamo Hatch   
assembler.recipeBuilder()
    .inputs(
        metaitem('energy_hatch.output_4a.uxv') * 2,
        metaitem('plate.ultimate_high_power_integrated_circuit') * 8,
        metaitem('cableGtDoubleStellarite') * 1,
        metaitem('sigma.uiv') * 1,
        metaitem('transformer.hi_amp.uxv') * 1,
        metaitem('emitter.uxv') * 4
    )
    .outputs(metaitem('energy_hatch.output_16a.uxv') * 1)
    .EUt(31457280)
    .duration(100)
    .buildAndRegister();

//64A Substation Dynamo Hatch
assembler.recipeBuilder()
    .inputs(
        metaitem('energy_hatch.output_16a.uxv') * 2,
        metaitem('plate.ultimate_high_power_integrated_circuit') * 8,
        metaitem('cableGtDoubleStellarite') * 1,
        metaitem('sigma.uiv') * 1,
        metaitem('transformer.adjustable.uxv') * 1,
        metaitem('emitter.uxv') * 16
    )
    .outputs(metaitem('substation_hatch.output_64a.uxv') * 1)
    .EUt(31457280)
    .duration(100)
    .buildAndRegister();
