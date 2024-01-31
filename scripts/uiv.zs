import crafttweaker.item.IIngredient;
import mods.gregtech.recipe.RecipeMap;
import crafttweaker.item.IItemStack;

val motor = <gregtech:meta_item_1:137>;
val pump = <gregtech:meta_item_1:152>;
val conveyor = <gregtech:meta_item_1:167>;
val piston = <gregtech:meta_item_1:182>;
val RobotArm = <gregtech:meta_item_1:197>;
val Field_Gen = <gregtech:meta_item_1:212>;
val Emitter = <gregtech:meta_item_1:227>;
val Sensor = <gregtech:meta_item_1:242>;
val circuitZPM = <ore:circuitZpm>; //ZPM Circuit
val circuitUV = <ore:circuitUv>; //UV Circuit
val circuitUHV = <ore:circuitUhv>; //UHV Circuit
val circuitUEV = <ore:circuitUev>; //Enigmatic Resonating Circuit
val circuitUIV = <ore:circuitUiv>; //Matrioska Brain Circuit
val circuitUXV = <ore:circuitUxv>; //Runic Resonating Circuit
val circuitOPV = <ore:circuitOpv>; //Stellarborn Basic Computer
val Plate = <gregtech:meta_plate:32005>; //Stellarite Alloy Plate
val Rod = <gregtech:meta_stick:32005>; //Stellarite Alloy Rod
val Lrod = <gregtech:meta_stick_long:32005>; //Stellarite Alloy Long Rod
val Ring = <gregtech:meta_ring:32005>; //Stellarite Alloy Ring
val Round = <gregtech:meta_round:32005>; //Stellarite Alloy Round
val Spring = <gregtech:meta_spring:32005>; //Stellarite Alloy Sping
val Sspring = <gregtech:meta_spring_small:32005>; //Stellarite Alloy Small Spring
val Gear = <gregtech:meta_gear:32005>; //Stellarite Alloy Gear
val Sgear = <gregtech:meta_gear_small:32005>; //Stellarite Alloy Small Gear
val Screw = <gregtech:meta_screw:32005>; //Stellarite Alloy Screw
val FineW = <gregtech:meta_wire_fine:32005>; //Stellarite Alloy Fine Wire
val Rotor = <gregtech:meta_rotor:32005>; //Stellarite Alloy Rotor
val foil = <gregtech:meta_foil:32005>; //Stellarite Alloy Foil
val cable = <gregtech:cable_single:32005>; //Stellarite Alloy Cable
val cable2 = <gregtech:wire_octal:32005>; //Stellarite Alloy Wire 8x
val Buzzsaw = <gregtech:meta_tool_head_buzz_saw:32005>; //Stellarite Alloy Buzzsaw
val Bolt = <gregtech:meta_bolt:32005>; //Stellarite Alloy Bolt
val PBIplate = <gregtech:meta_plate:1010>; //PBI Plate
val casing = <gregtech:machine_casing:11>; //UIV Machine Casing
val hull = <gregtech:machine:996>; //UIV Machine Hull
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

//UIV Machine Casing
recipes.addShaped("UIV Machine Casing", <gregtech:machine_casing:11> * 1,
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

//UIV Machine Hull
recipes.addShaped("UIV Machine Hull", <gregtech:machine:996> * 1,
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

//Epic Electric Furnace III
recipes.addShaped("Epic Electric Furnace III", <gregtech:machine:60> * 1,
    [
        [circuitUIV,NqAlloy,circuitUIV],
        [NqAlloy,hull,NqAlloy],
        [cable,NqAlloy,cable]
    ]);

//Epic Macerator III
recipes.addShaped("Epic Macerator III", <gregtech:machine:75> * 1,
    [
        [piston,motor,Grinder],
        [cable,cable,hull],
        [circuitUIV,circuitUIV,cable]
    ]);

//Epic Alloy Smleter III
recipes.addShaped("Epic Alloy Smelter III",<gregtech:machine:90> * 1,
    [
        [circuitUIV,NqAlloy2,circuitUIV],
        [NqAlloy2,hull,NqAlloy2],
        [cable,NqAlloy2,cable]
    ]);

//Epic Arc Furnace III
recipes.addShaped("Epic Arc Furnace III", <gregtech:machine:105> * 1,
    [
        [cable,<ore:dustGraphite>,cable],
        [circuitUIV,hull,circuitUIV],
        [Plate,Plate,Plate]
    ]);

//Epic Assembling Machine III
recipes.addShaped("Epic Assembling Machine III", <gregtech:machine:120> * 1,
    [
        [RobotArm,circuitUIV,RobotArm],
        [conveyor,hull,conveyor],
        [cable,circuitUIV,cable]
    ]);

//Epic Autoclave III
recipes.addShaped("Epic Autoclave III", <gregtech:machine:135> * 1,
    [
        [Plate,glass,Plate],
        [Plate,hull,Plate],
        [circuitUIV,pump,circuitUIV]
    ]);

//Epic Metal Bender III
recipes.addShaped("Epic Metal Bender III", <gregtech:machine:150> * 1,
    [
        [piston,conveyor,piston],
        [circuitUIV,hull,circuitUIV],
        [motor,cable,motor]
    ]);

//Epic Brewery III
recipes.addShaped("Epic Brewery III", <gregtech:machine:165> * 1,
    [
        [glass,pump,glass],
        [cable,hull,cable],
        [circuitUIV,blaze,circuitUIV]
    ]);

//Epic Canning Machine III
recipes.addShaped("Epic Canning Machine III", <gregtech:machine:180> * 1,
    [
        [cable,pump,cable],
        [circuitUIV,hull,circuitUIV],
        [glass,glass,glass]
    ]);

//Epic Centrifuge III
recipes.addShaped("Epic Centrifuge III", <gregtech:machine:195> * 1,
    [
        [circuitUIV,motor,circuitUIV],
        [cable,hull,cable],
        [circuitUIV,motor,circuitUIV]
    ]);

//Epic Chemical Bath III
recipes.addShaped("Epic Chemical Bath III", <gregtech:machine:210> * 1,
    [
        [conveyor,glass,cable],
        [pump,glass,conveyor],
        [circuitUIV,hull,circuitUIV]
    ]);

//Epic Chemical Reactor III
recipes.addShaped("Epic Chemical Reactor III", <gregtech:machine:225> * 1,
    [
        [<gregtech:fluid_pipe_tiny:127>,Rotor,<gregtech:fluid_pipe_tiny:127>],
        [cable,motor,cable],
        [circuitUIV,hull,circuitUIV]
    ]);

//Epic Compressor III
recipes.addShaped("Epic Compressor III", <gregtech:machine:240> * 1,
    [
        [null,circuitUIV,null],
        [piston,hull,piston],
        [cable,circuitUIV,cable]
    ]);

//Epic Cutting Machine III
recipes.addShaped("Epic Cutting Machine III", <gregtech:machine:255> * 1,
    [
        [cable,circuitUIV,glass],
        [conveyor,hull,Buzzsaw],
        [circuitUIV,cable,motor]
    ]);

//Epic Distillery III
recipes.addShaped("Epic Distillery III", <gregtech:machine:270> * 1,
    [
        [glass,blaze,glass],
        [circuitUIV,hull,circuitUIV],
        [cable,pump,cable]
    ]);

//Epic Electrolyzer III
recipes.addShaped("Epic Electrolyzer III", <gregtech:machine:285> * 1,
    [
        [Os_wire,fus_glass,Os_wire],
        [Os_wire,hull,Os_wire],
        [circuitUIV,cable,circuitUIV]
    ]);

//Epic Electromagnetic Separator III
recipes.addShaped("Epic Electromagnetic Separator III", <gregtech:machine:300> * 1,
    [
        [conveyor,cable,cable2],
        [cable,hull,Lrod],
        [circuitUIV,cable,cable2]
    ]);

//Epic Extractor III
recipes.addShaped("Epic Extractor III", <gregtech:machine:315> * 1,
    [
        [glass,circuitUIV,glass],
        [piston,hull,pump],
        [cable,circuitUIV,cable]
    ]);

//Epic Extruder III
recipes.addShaped("Epic Extruder III", <gregtech:machine:330> * 1,
    [
        [NqAlloy2,NqAlloy2,circuitUIV],
        [piston,hull,<gregtech:fluid_pipe_tiny:127>],
        [NqAlloy2,NqAlloy2,circuitUIV]
    ]);

//Epic Fermenter III
recipes.addShaped("Epic Fermenter III", <gregtech:machine:345> * 1,
    [
        [cable,pump,cable],
        [glass,hull,glass],
        [cable,circuitUIV,cable]
    ]);

//Epic Fluid Heater III
recipes.addShaped("Epic Fluid Heater III", <gregtech:machine:390> * 1,
    [
        [NqAlloy2,fus_glass,NqAlloy2],
        [pump,hull,pump],
        [cable,circuitUIV,cable]
    ]);

//Epic Fluid Solidifier III
recipes.addShaped("Epic Fluid Solidifier III", <gregtech:machine:405> * 1,
    [
        [pump,glass,pump],
        [cable,hull,cable],
        [circuitUIV,<minecraft:chest>,circuitUIV]
    ]);

//Epic Forge Hammer III
recipes.addShaped("Epic Forge Hammer III", <gregtech:machine:420> * 1,
    [
        [cable,piston,cable],
        [circuitUIV,hull,circuitUIV],
        [cable,<minecraft:anvil>,cable]
    ]);

//Epic Forming Press III
recipes.addShaped("Epic Forming Press III", <gregtech:machine:435> * 1,
    [
        [cable,piston,cable],
        [circuitUIV,hull,circuitUIV],
        [cable,piston,cable]
    ]);

//Epic Lathe III
recipes.addShaped("Epic Lathe III", <gregtech:machine:450> * 1,
    [
        [cable,circuitUIV,cable],
        [motor,hull,Grinder],
        [circuitUIV,cable,piston]
    ]);

//Epic Mixer III
recipes.addShaped("Epic Mixer III", <gregtech:machine:480> * 1,
    [
        [fus_glass,Rotor,fus_glass],
        [fus_glass,motor,fus_glass],
        [circuitUIV,hull,circuitUIV]
    ]);

//Epic Ore Washing Plant III
recipes.addShaped("Epic Ore Washing Plant III", <gregtech:machine:495> * 1,
    [
        [Rotor,fus_glass,Rotor],
        [circuitUIV,motor,circuitUIV],
        [cable,hull,cable]
    ]);

//Epic Packager III
recipes.addShaped("Epic Packager III", <gregtech:machine:510> * 1,
    [
        [<minecraft:chest>,circuitUIV,<minecraft:chest>],
        [RobotArm,hull,conveyor],
        [cable,circuitUIV,cable]
    ]);

//Epic Gas Collector III
recipes.addShaped("Epic Gas Collector III", <gregtech:machine:540> * 1,
    [
        [bars,Ffilter,bars],
        [pump,hull,pump],
        [bars,circuitUIV,bars]
    ]);

//Epic Polarizer III
recipes.addShaped("Epic Polarizer III", <gregtech:machine:555> * 1,
    [
        [NqAlloy2,Lrod,NqAlloy2],
        [cable,hull,cable],
        [NqAlloy2,Lrod,NqAlloy2]
    ]);

//Epic Presision Laser Engraver III
recipes.addShaped("Epic Precision Laser Engraver III", <gregtech:machine:570> * 1,
    [
        [piston,Emitter,piston],
        [circuitUIV,hull,circuitUIV],
        [cable,circuitUIV,cable]
    ]);

//Epic Sifting Machine III
recipes.addShaped("Epic Sifting Machine III", <gregtech:machine:585> * 1,
    [
        [cable,Ifilter,cable],
        [piston,hull,piston],
        [circuitUIV,Ifilter,circuitUIV]
    ]);

//Epic Thermal Centrifuge III
recipes.addShaped("Epic Thermal Centrifuge III", <gregtech:machine:615> * 1,
    [
        [circuitUIV,motor,circuitUIV],
        [NqAlloy2,hull,NqAlloy2],
        [cable,motor,cable]
    ]);

//Epic Wiremill III
recipes.addShaped("Epic Wiremill III", <gregtech:machine:630> * 1,
    [
        [motor,cable,motor],
        [circuitUIV,hull,circuitUIV],
        [motor,cable,motor]
    ]);

//Epic Circuit Assembler III
recipes.addShaped("Epic Circuit Assembler III", <gregtech:machine:645> * 1,
    [
        [RobotArm,hull,Emitter],
        [conveyor,circuitUIV,conveyor],
        [cable,circuitUIV,cable]
    ]);

//Epic Rock Breaker III
recipes.addShaped("Epic Rock Breaker III", <gregtech:machine:675> * 1,
    [
        [piston,motor,Grinder],
        [cable,hull,cable],
        [glass,glass,glass]
    ]);

//Wakfu Reactor MK3
recipes.addShaped("Wakfu Reactor Mk3", <gregtech:machine:32114> * 1,
    [
        [Emitter,Field_Gen,Emitter],
        [cable,hull,cable],
        [circuitUEV,circuitUIV,circuitUEV]
    ]);

//UIV Transformer
recipes.addShaped("UIV transformer", <gregtech:machine:1280> * 1,
    [
        [UHPIC,<gregtech:cable_single:32004>,<gregtech:cable_single:32004>],
        [cable,hull,null],
        [UHPIC,<gregtech:cable_single:32004>,<gregtech:cable_single:32004>]
    ]);

//UIV Adj Transformer
assembler.recipeBuilder()
    .inputs([
        <gregtech:machine:1280> * 1,
        pump * 1,
        cable * 1,
        cable2 * 1,
        Spring * 1,
        Sspring * 1
    ])
    .fluidInputs(liquid4 * 2000)
    .outputs(<gregtech:machine:1295> * 1)
    .EUt(200000)
    .duration(300)
    .buildAndRegister();

//UIV 4x Battery Buffer
recipes.addShaped("UIV 4x Battery Buffer", <gregtech:machine:1326> * 1,
    [
        [null,null,null],
        [cable,<minecraft:chest>,cable],
        [cable,hull,cable]
    ]);

//UIV 8x Battery Buffer
recipes.addShaped("UIV 8x Battery Buffer", <gregtech:machine:1340> * 1,
    [
        [null,null,null],
        [cable,<minecraft:chest>,cable],
        [cable2,hull,cable2]
    ]);

//UIV 16x Battery Buffer
recipes.addShaped("UIV 16x Battery Buffer", <gregtech:machine:1354> * 1,
    [
        [null,null,null],
        [cable2,<minecraft:chest>,cable2],
        [cable2,hull,cable2]
    ]);

//UEV Energy Hatch
assembly_line.recipeBuilder()
    .inputs([
        hull,
        cable * 4,
        UHPIC * 2,
        circuitUIV * 1,
        Spring * 2
    ])
    .fluidInputs(liquid2 * 2880)
    .outputs(<gregtech:machine:1221> * 1)
    .EUt(2000000)
    .duration(1000)
    .buildAndRegister();

//UEV Energy Hatch
assembly_line.recipeBuilder()
    .inputs([
        hull,
        cable * 4,
        UHPIC * 2,
        circuitUIV * 1,
        Spring * 1,
        Sspring * 4
    ])
    .fluidInputs(liquid2 * 2880)
    .outputs(<gregtech:machine:1236> * 1)
    .EUt(2000000)
    .duration(1000)
    .buildAndRegister();

//Dark Matter Capacitor
assembly_line.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:407> * 1,
        Plate * 16,
        circuitUIV * 4,
        <gregtech:meta_item_1:755> * 1,
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
    .outputs(<gregtech:meta_item_1:756> * 1)
    .EUt(8000000)
    .duration(3000)
    .buildAndRegister();
