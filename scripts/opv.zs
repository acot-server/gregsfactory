import crafttweaker.item.IIngredient;
import mods.gregtech.recipe.RecipeMap;
import crafttweaker.item.IItemStack;

val motor = <gregtech:meta_item_1:139>;
val pump = <gregtech:meta_item_1:154>;
val conveyor = <gregtech:meta_item_1:169>;
val piston = <gregtech:meta_item_1:184>;
val RobotArm = <gregtech:meta_item_1:199>;
val Field_Gen = <gregtech:meta_item_1:214>;
val Emitter = <gregtech:meta_item_1:229>;
val Sensor = <gregtech:meta_item_1:244>;
val circuitZPM = <ore:circuitZpm>; //ZPM Circuit
val circuitUV = <ore:circuitUv>; //UV Circuit
val circuitUHV = <ore:circuitUhv>; //UHV Circuit
val circuitUEV = <ore:circuitUev>; //Enigmatic Resonating Circuit
val circuitUIV = <ore:circuitUiv>; //Matrioska Brain Circuit
val circuitUXV = <ore:circuitUxv>; //Runic Resonating Circuit
val circuitOPV = <ore:circuitOpv>; //Stellarborn Basic Computer
val Plate = <gregtech:meta_plate:32007>; //Wakfu Stasis Alloy Plate
val Rod = <gregtech:meta_stick:32007>; //Wakfu Stasis Alloy Rod
val Lrod = <gregtech:meta_stick_long:32007>; //Wakfu Stasis Alloy Long Rod
val Ring = <gregtech:meta_ring:32007>; //Wakfu Stasis Alloy Ring
val Round = <gregtech:meta_round:32007>; //Wakfu Stasis Alloy Round
val Spring = <gregtech:meta_spring:32007>; //Wakfu Stasis Alloy Sping
val Sspring = <gregtech:meta_spring_small:32007>; //Wakfu Stasis Alloy Small Spring
val Gear = <gregtech:meta_gear:32007>; //Wakfu Stasis Alloy Gear
val Sgear = <gregtech:meta_gear_small:32007>; //Wakfu Stasis Alloy Small Gear
val Screw = <gregtech:meta_screw:32007>; //Wakfu Stasis Alloy Screw
val FineW = <gregtech:meta_wire_fine:32007>; //Wakfu Stasis Alloy Fine Wire
val Rotor = <gregtech:meta_rotor:32007>; //Wakfu Stasis Alloy Rotor
val foil = <gregtech:meta_foil:32007>; //Wakfu Stasis Alloy Foil
val cable = <gregtech:cable_single:32007>; //Wakfu Stasis Alloy Cable
val cable2 = <gregtech:wire_octal:32007>; //Wakfu Stasis Alloy Wire 8x
val Buzzsaw = <gregtech:meta_tool_head_buzz_saw:32007>; //Wakfu Stasis Alloy Buzzsaw
val Bolt = <gregtech:meta_bolt:32007>; //Wakfu Stasis Alloy Bolt
val PBIplate = <gregtech:meta_plate:1010>; //PBI Plate
val casing = <gregtech:machine_casing:13>; //UIV Machine Casing
val hull = <gregtech:machine:998>; //UIV Machine Hull
val NqAlloy = <gregtech:wire_quadruple:2042>; //Naquadah Alloy Wire 4x
val Grinder = <gregtech:meta_item_1:267>; //Tungsten Grinding Head
val NqAlloy2 = <gregtech:wire_octal:2042>; //Naquadah Alloy Wire 8x
val glass = <minecraft:glass>;
val blaze = <minecraft:blaze_rod>;
val Os_wire = <gregtech:wire_single:75>; //Osmium Wire 1x
val fus_glass = <gregtech:transparent_casing:1>; //Fusion Casing
val bars = <minecraft:iron_bars>;
val Ffilter = <gregtech:meta_item_1:290>; //Fluid Filter
val Ifilter = <gregtech:meta_item_1:291>; //Item Filter
val LMSmRod = <gregtech:meta_stick_long:423>; //Long Magnetic Samarium Rod
val Liquid1 = <liquid:ruthenium_trinium_americium_neutronate>; //Ruthenium Trinium Americium Neutronate
val liquid2 = <liquid:soldering_alloy>; //Soldering Alloy
val liquid3 = <liquid:styrene_butadiene_rubber>; //Styrene Butadiene Rubber
val liquid4 = <liquid:lubricant>; //Lubricant
val LNtFpipe = <gregtech:fluid_pipe_large:127>; //Large Neutronium Fluid Pipe
val SBring = <ore:ringStyreneButadieneRubber>; //Styrene butadiene rubber ring
val gstar = <gregtech:meta_item_1:283>; //Gravi-Star
val frame = <gregtech:meta_block_frame_8>; //Tritanium Frame
val UHPIC = <gregtech:meta_item_1:606>; //UHPIC
val SMDT = <gregtech:meta_item_1:533>; //SMD Transistor
val SMDC = <gregtech:meta_item_1:534>; //SMD Transistor
val SMDR = <gregtech:meta_item_1:535>; //SMD Resistor
val SMDD = <gregtech:meta_item_1:536>; //SMD Diode

//OpV Machine Casing
recipes.addShaped("OpV Machine Casing", <gregtech:machine_casing:13> * 1,
    [
        [Plate,Plate,Plate],
        [Plate,cable,Plate],
        [Plate,Plate,Plate]
    ]);

assembler.recipeBuilder()
    .inputs(Plate * 8)
    .circuit(8)
    .outputs(casing * 1)
    .duration(20)
    .EUt(8)
    .buildAndRegister();

//OpV Machine Hull
recipes.addShaped("OpV Machine Hull", <gregtech:machine:998> * 1,
    [
        [null,null,null],
        [PBIplate,Plate,PBIplate],
        [cable,casing,cable],
    ]);

assembler.recipeBuilder()
    .inputs([
        casing * 1,
        Plate * 1,
        cable * 1
    ])
    .fluidInputs(<liquid:polybenzimidazole> * 288)
    .outputs(hull * 1)
    .duration(40)
    .EUt(64)
    .buildAndRegister();

//Epic Electric Furnace V
recipes.addShaped("Epic Electric Furnace V", <gregtech:machine:62> * 1,
    [
        [circuitOPV,NqAlloy,circuitOPV],
        [NqAlloy,hull,NqAlloy],
        [cable,NqAlloy,cable]
    ]);

//Epic Macerator V
recipes.addShaped("Epic Macerator V", <gregtech:machine:77> * 1,
    [
        [piston,motor,Grinder],
        [cable,cable,hull],
        [circuitOPV,circuitOPV,cable]
    ]);

//Epic Alloy Smleter V
recipes.addShaped("Epic Alloy Smelter V",<gregtech:machine:92> * 1,
    [
        [circuitOPV,NqAlloy2,circuitOPV],
        [NqAlloy2,hull,NqAlloy2],
        [cable,NqAlloy2,cable]
    ]);

//Epic Arc Furnace V
recipes.addShaped("Epic Arc Furnace V", <gregtech:machine:107> * 1,
    [
        [cable,<ore:dustGraphite>,cable],
        [circuitOPV,hull,circuitOPV],
        [Plate,Plate,Plate]
    ]);

//Epic Assembling Machine V
recipes.addShaped("Epic Assembling Machine V", <gregtech:machine:122> * 1,
    [
        [RobotArm,circuitOPV,RobotArm],
        [conveyor,hull,conveyor],
        [cable,circuitOPV,cable]
    ]);

//Epic Autoclave V
recipes.addShaped("Epic Autoclave V", <gregtech:machine:137> * 1,
    [
        [Plate,glass,Plate],
        [Plate,hull,Plate],
        [circuitOPV,pump,circuitOPV]
    ]);

//Epic Metal Bender V
recipes.addShaped("Epic Metal Bender V", <gregtech:machine:152> * 1,
    [
        [piston,conveyor,piston],
        [circuitOPV,hull,circuitOPV],
        [motor,cable,motor]
    ]);

//Epic Brewery V
recipes.addShaped("Epic Brewery V", <gregtech:machine:167> * 1,
    [
        [glass,pump,glass],
        [cable,hull,cable],
        [circuitOPV,blaze,circuitOPV]
    ]);

//Epic Canning Machine V
recipes.addShaped("Epic Canning Machine V", <gregtech:machine:182> * 1,
    [
        [cable,pump,cable],
        [circuitOPV,hull,circuitOPV],
        [glass,glass,glass]
    ]);

//Epic Centrifuge V
recipes.addShaped("Epic Centrifuge V", <gregtech:machine:197> * 1,
    [
        [circuitOPV,motor,circuitOPV],
        [cable,hull,cable],
        [circuitOPV,motor,circuitOPV]
    ]);

//Epic Chemical Bath V
recipes.addShaped("Epic Chemical Bath V", <gregtech:machine:212> * 1,
    [
        [conveyor,glass,cable],
        [pump,glass,conveyor],
        [circuitOPV,hull,circuitOPV]
    ]);

//Epic Chemical Reactor V
recipes.addShaped("Epic Chemical Reactor V", <gregtech:machine:227> * 1,
    [
        [<gregtech:fluid_pipe_tiny:127>,Rotor,<gregtech:fluid_pipe_tiny:127>],
        [cable,motor,cable],
        [circuitOPV,hull,circuitOPV]
    ]);

//Epic Compressor V
recipes.addShaped("Epic Compressor V", <gregtech:machine:242> * 1,
    [
        [null,circuitOPV,null],
        [piston,hull,piston],
        [cable,circuitOPV,cable]
    ]);

//Epic Cutting Machine V
recipes.addShaped("Epic Cutting Machine V", <gregtech:machine:257> * 1,
    [
        [cable,circuitOPV,glass],
        [conveyor,hull,Buzzsaw],
        [circuitOPV,cable,motor]
    ]);

//Epic Distillery V
recipes.addShaped("Epic Distillery V", <gregtech:machine:272> * 1,
    [
        [glass,blaze,glass],
        [circuitOPV,hull,circuitOPV],
        [cable,pump,cable]
    ]);

//Epic Electrolyzer V
recipes.addShaped("Epic Electrolyzer V", <gregtech:machine:287> * 1,
    [
        [Os_wire,fus_glass,Os_wire],
        [Os_wire,hull,Os_wire],
        [circuitOPV,cable,circuitOPV]
    ]);

//Epic Electromagnetic Separator V
recipes.addShaped("Epic Electromagnetic Separator V", <gregtech:machine:302> * 1,
    [
        [conveyor,cable,cable2],
        [cable,hull,Lrod],
        [circuitOPV,cable,cable2]
    ]);

//Epic Extractor V
recipes.addShaped("Epic Extractor V", <gregtech:machine:317> * 1,
    [
        [glass,circuitOPV,glass],
        [piston,hull,pump],
        [cable,circuitOPV,cable]
    ]);

//Epic Extruder V
recipes.addShaped("Epic Extruder V", <gregtech:machine:332> * 1,
    [
        [NqAlloy2,NqAlloy2,circuitOPV],
        [piston,hull,<gregtech:fluid_pipe_tiny:127>],
        [NqAlloy2,NqAlloy2,circuitOPV]
    ]);

//Epic Fermenter V
recipes.addShaped("Epic Fermenter V", <gregtech:machine:347> * 1,
    [
        [cable,pump,cable],
        [glass,hull,glass],
        [cable,circuitOPV,cable]
    ]);

//Epic Fluid Heater V
recipes.addShaped("Epic Fluid Heater V", <gregtech:machine:392> * 1,
    [
        [NqAlloy2,fus_glass,NqAlloy2],
        [pump,hull,pump],
        [cable,circuitOPV,cable]
    ]);

//Epic Fluid Solidifier V
recipes.addShaped("Epic Fluid Solidifier V", <gregtech:machine:407> * 1,
    [
        [pump,glass,pump],
        [cable,hull,cable],
        [circuitOPV,<minecraft:chest>,circuitOPV]
    ]);

//Epic Forge Hammer V
recipes.addShaped("Epic Forge Hammer V", <gregtech:machine:422> * 1,
    [
        [cable,piston,cable],
        [circuitOPV,hull,circuitOPV],
        [cable,<minecraft:anvil>,cable]
    ]);

//Epic Forming Press V
recipes.addShaped("Epic Forming Press V", <gregtech:machine:437> * 1,
    [
        [cable,piston,cable],
        [circuitOPV,hull,circuitOPV],
        [cable,piston,cable]
    ]);

//Epic Lathe V
recipes.addShaped("Epic Lathe V", <gregtech:machine:452> * 1,
    [
        [cable,circuitOPV,cable],
        [motor,hull,Grinder],
        [circuitOPV,cable,piston]
    ]);

//Epic Mixer V
recipes.addShaped("Epic Mixer V", <gregtech:machine:487> * 1,
    [
        [fus_glass,Rotor,fus_glass],
        [fus_glass,motor,fus_glass],
        [circuitOPV,hull,circuitOPV]
    ]);

//Epic Ore Washing Plant V
recipes.addShaped("Epic Ore Washing Plant V", <gregtech:machine:497> * 1,
    [
        [Rotor,fus_glass,Rotor],
        [circuitOPV,motor,circuitOPV],
        [cable,hull,cable]
    ]);

//Epic Packager V
recipes.addShaped("Epic Packager V", <gregtech:machine:512> * 1,
    [
        [<minecraft:chest>,circuitOPV,<minecraft:chest>],
        [RobotArm,hull,conveyor],
        [cable,circuitOPV,cable]
    ]);

//Epic Gas Collector V
recipes.addShaped("Epic Gas Collector V", <gregtech:machine:542> * 1,
    [
        [bars,Ffilter,bars],
        [pump,hull,pump],
        [bars,circuitOPV,bars]
    ]);

//Epic Polarizer V
recipes.addShaped("Epic Polarizer V", <gregtech:machine:557> * 1,
    [
        [NqAlloy2,Lrod,NqAlloy2],
        [cable,hull,cable],
        [NqAlloy2,Lrod,NqAlloy2]
    ]);

//Epic Presision Laser Engraver V
recipes.addShaped("Epic Precision Laser Engraver V", <gregtech:machine:572> * 1,
    [
        [piston,Emitter,piston],
        [circuitOPV,hull,circuitOPV],
        [cable,circuitOPV,cable]
    ]);

//Epic Sifting Machine V
recipes.addShaped("Epic Sifting Machine V", <gregtech:machine:587> * 1,
    [
        [cable,Ifilter,cable],
        [piston,hull,piston],
        [circuitOPV,Ifilter,circuitOPV]
    ]);

//Epic Thermal Centrifuge V
recipes.addShaped("Epic Thermal Centrifuge V", <gregtech:machine:617> * 1,
    [
        [circuitOPV,motor,circuitOPV],
        [NqAlloy2,hull,NqAlloy2],
        [cable,motor,cable]
    ]);

//Epic Wiremill V
recipes.addShaped("Epic Wiremill V", <gregtech:machine:632> * 1,
    [
        [motor,cable,motor],
        [circuitOPV,hull,circuitOPV],
        [motor,cable,motor]
    ]);

//Epic Circuit Assembler V
recipes.addShaped("Epic Circuit Assembler V", <gregtech:machine:647> * 1,
    [
        [RobotArm,hull,Emitter],
        [conveyor,circuitOPV,conveyor],
        [cable,circuitOPV,cable]
    ]);

//Epic Rock Breaker V
recipes.addShaped("Epic Rock Breaker V", <gregtech:machine:677> * 1,
    [
        [piston,motor,Grinder],
        [cable,hull,cable],
        [glass,glass,glass]
    ]);

//Wakfu Reactor MK5
recipes.addShaped("Wakfu Reactor Mk5", <gregtech:machine:32116> * 1,
    [
        [Emitter,Field_Gen,Emitter],
        [cable,hull,cable],
        [circuitUXV,circuitOPV,circuitUXV]
    ]);

//OpV Transformer
recipes.addShaped("OpV transformer", <gregtech:machine:1282> * 1,
    [
        [UHPIC,<gregtech:cable_single:32006>,<gregtech:cable_single:32006>],
        [cable,hull,null],
        [UHPIC,<gregtech:cable_single:32006>,<gregtech:cable_single:32006>]
    ]);

//OpV Adj Transformer
assembler.recipeBuilder()
    .inputs([
        <gregtech:machine:1282> * 1,
        pump * 1,
        cable * 1,
        cable2 * 1,
        Spring * 1,
        Sspring * 1
    ])
    .fluidInputs(liquid4 * 2000)
    .outputs(<gregtech:machine:1297> * 1)
    .EUt(200000)
    .duration(300)
    .buildAndRegister();

//MAX Transformer
recipes.addShaped("MAX transformer", <gregtech:machine:1283> * 1,
    [
        [UHPIC,<gregtech:cable_hex:32007>,<gregtech:cable_hex:32007>],
        [cable,hull,null],
        [UHPIC,<gregtech:cable_hex:32007>,<gregtech:cable_hex:32007>]
    ]);

//OpV Adj Transformer
assembler.recipeBuilder()
    .inputs([
        <gregtech:machine:1283> * 1,
        pump * 1,
        cable * 1,
        <gregtech:cable_hex:32007> * 1,
        Spring * 1,
        Sspring * 1
    ])
    .fluidInputs(liquid4 * 2000)
    .outputs(<gregtech:machine:1298> * 1)
    .EUt(200000)
    .duration(300)
    .buildAndRegister();

//OpV 4x Battery Buffer
recipes.addShaped("OpV 4x Battery Buffer", <gregtech:machine:1328> * 1,
    [
        [null,null,null],
        [cable,<minecraft:chest>,cable],
        [cable,hull,cable]
    ]);

//OpV 8x Battery Buffer
recipes.addShaped("OpV 8x Battery Buffer", <gregtech:machine:1342> * 1,
    [
        [null,null,null],
        [cable,<minecraft:chest>,cable],
        [cable2,hull,cable2]
    ]);

//OpV 16x Battery Buffer
recipes.addShaped("OpV 16x Battery Buffer", <gregtech:machine:1356> * 1,
    [
        [null,null,null],
        [cable2,<minecraft:chest>,cable2],
        [cable2,hull,cable2]
    ]);

//UXV Energy Hatch
assembly_line.recipeBuilder()
    .inputs([
        hull,
        cable * 4,
        UHPIC * 2,
        circuitUXV * 1,
        Spring * 2
    ])
    .fluidInputs(liquid2 * 2880)
    .outputs(<gregtech:machine:1223> * 1)
    .EUt(2000000)
    .duration(1000)
    .buildAndRegister();

//UEV Energy Hatch
assembly_line.recipeBuilder()
    .inputs([
        hull,
        cable * 4,
        UHPIC * 2,
        circuitUXV * 1,
        Spring * 1,
        Sspring * 4
    ])
    .fluidInputs(liquid2 * 2880)
    .outputs(<gregtech:machine:1238> * 1)
    .EUt(2000000)
    .duration(1000)
    .buildAndRegister();

// Pure Lightmatter transciver * 1
<recipemap:assembly_line>.findRecipe(300000, 
    [<metaitem:plateDoubleDarmstadtium> * 16, 
     <metaitem:circuit.wetware_mainframe> * 4, 
     <metaitem:energy.cluster> * 16, 
     <metaitem:field.generator.uv> * 4, 
     <metaitem:wafer.ultra_high_power_integrated_circuit> * 64, 
     <metaitem:wafer.ultra_high_power_integrated_circuit> * 64, 
     <metaitem:component.advanced_smd.diode> * 64, 
     <metaitem:component.advanced_smd.capacitor> * 64, 
     <metaitem:component.advanced_smd.resistor> * 64, 
     <metaitem:component.advanced_smd.transistor> * 64, 
     <metaitem:component.advanced_smd.inductor> * 64, 
     <metaitem:wireGtSingleEnrichedNaquadahTriniumEuropiumDuranide> * 64, 
     <metaitem:boltNeutronium> * 64], 
     [<liquid:soldering_alloy> * 5760, 
      <liquid:polybenzimidazole> * 2304, 
      <liquid:naquadria> * 2592])
    .remove();


//Dark Matter Capacitor
assembly_line.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:407> * 1,
        Plate * 16,
        circuitOPV * 4,
        <gregtech:meta_item_1:757> * 1,
        UHPIC * 32,
        SMDD * 16,
        SMDC * 16,
        SMDR * 16,
        SMDT * 16,
        FineW * 64,
        Bolt * 16
    ])
    .fluidInputs([
        liquid2 * 2880,
        <liquid:polybenzimidazole> * 576
    ])
    .outputs(<gregtech:meta_item_1:758> * 1)
    .EUt(20000000)
    .duration(4000)
    .buildAndRegister();

//Dark Matter Capacitor
assembly_line.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:407> * 1,
        Plate * 16,
        circuitOPV * 8,
        <gregtech:meta_item_1:758> * 1,
        UHPIC * 32,
        SMDD * 16,
        SMDC * 16,
        SMDR * 16,
        SMDT * 16,
        FineW * 64,
        Bolt * 16
    ])
    .fluidInputs([
        liquid2 * 2880,
        <liquid:polybenzimidazole> * 576
    ])
    .outputs(<gregtech:meta_item_1:759> * 1)
    .EUt(30000000)
    .duration(4500)
    .buildAndRegister();

//Dark Matter Capacitor
assembly_line.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:407> * 1,
        Plate * 16,
        circuitOPV * 16,
        <gregtech:meta_item_1:759> * 16,
        UHPIC * 32,
        SMDD * 16,
        SMDC * 16,
        SMDR * 16,
        SMDT * 16,
        FineW * 64,
        Bolt * 16
    ])
    .fluidInputs([
        liquid2 * 2880,
        <liquid:polybenzimidazole> * 576
    ])
    .outputs(<gregtech:meta_item_1:753> * 1)
    .EUt(500000000)
    .duration(10000)
    .buildAndRegister();
