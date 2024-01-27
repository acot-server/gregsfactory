import crafttweaker.item.IIngredient;
import mods.gregtech.recipe.RecipeMap;
import crafttweaker.item.IItemStack;

val motor = <gregtech:meta_item_1:138>;
val pump = <gregtech:meta_item_1:153>;
val conveyor = <gregtech:meta_item_1:168>;
val piston = <gregtech:meta_item_1:183>;
val RobotArm = <gregtech:meta_item_1:198>;
val Field_Gen = <gregtech:meta_item_1:213>;
val Emitter = <gregtech:meta_item_1:228>;
val Sensor = <gregtech:meta_item_1:243>;
val circuitZPM = <ore:circuitZpm>; //ZPM Circuit
val circuitUV = <ore:circuitUv>; //UV Circuit
val circuitUHV = <ore:circuitUhv>; //UHV Circuit
val circuitUEV = <ore:circuitUev>; //Enigmatic Resonating Circuit
val circuitUIV = <ore:circuitUiv>; //Matrioska Brain Circuit
val circuitUXV = <ore:circuitUxv>; //Runic Resonating Circuit
val circuitOPV = <ore:circuitOpv>; //Stellarborn Basic Computer
val Plate = <gregtech:meta_plate:32006>; //Runic Alloy Alloy Plate
val Rod = <gregtech:meta_stick:32006>; //Runic Alloy Alloy Rod
val Lrod = <gregtech:meta_stick_long:32006>; //Runic Alloy Alloy Long Rod
val Ring = <gregtech:meta_ring:32006>; //Runic Alloy Alloy Ring
val Round = <gregtech:meta_round:32006>; //Runic Alloy Alloy Round
val Spring = <gregtech:meta_spring:32006>; //Runic Alloy Alloy Sping
val Sspring = <gregtech:meta_spring_small:32006>; //Runic Alloy Alloy Small Spring
val Gear = <gregtech:meta_gear:32006>; //Runic Alloy Alloy Gear
val Sgear = <gregtech:meta_gear_small:32006>; //Runic Alloy Alloy Small Gear
val Screw = <gregtech:meta_screw:32006>; //Runic Alloy Alloy Screw
val FineW = <gregtech:meta_wire_fine:32006>; //Runic Alloy Alloy Fine Wire
val Rotor = <gregtech:meta_rotor:32006>; //Runic Alloy Alloy Rotor
val foil = <gregtech:meta_foil:32006>; //Runic Alloy Alloy Foil
val cable = <gregtech:cable_single:32006>; //Runic Alloy Alloy Cable
val cable2 = <gregtech:wire_octal:32006>; //Runic Alloy Alloy Wire 8x
val Buzzsaw = <gregtech:meta_tool_head_buzz_saw:32006>; //Runic Alloy Alloy Buzzsaw
val Bolt = <gregtech:meta_bolt:32006>; //Runic Alloy Bolt
val PBIplate = <gregtech:meta_plate:1010>; //PBI Plate
val casing = <gregtech:machine_casing:12>; //UIV Machine Casing
val hull = <gregtech:machine:997>; //UIV Machine Hull
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
val SBring = <gregtech:meta_ring:1004>; //Styrene butadiene rubber ring
val gstar = <gregtech:meta_item_1:283>; //Gravi-Star
val frame = <gregtech:meta_block_frame_8>; //Tritanium Frame
val UHPIC = <gregtech:meta_item_1:606>; //UHPIC
val SMDT = <gregtech:meta_item_1:533>; //SMD Transistor
val SMDC = <gregtech:meta_item_1:534>; //SMD Transistor
val SMDR = <gregtech:meta_item_1:535>; //SMD Resistor
val SMDD = <gregtech:meta_item_1:536>; //SMD Diode

//UXV Machine Casing
recipes.addShaped("UXV Machine Casing", <gregtech:machine_casing:12> * 1,
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

//UXV Machine Hull
recipes.addShaped("UXV Machine Hull", <gregtech:machine:997> * 1,
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

//Epic Electric Furnace IV
recipes.addShaped("Epic Electric Furnace IV", <gregtech:machine:61> * 1,
    [
        [circuitUXV,NqAlloy,circuitUXV],
        [NqAlloy,hull,NqAlloy],
        [cable,NqAlloy,cable]
    ]);

//Epic Macerator IV
recipes.addShaped("Epic Macerator IV", <gregtech:machine:76> * 1,
    [
        [piston,motor,Grinder],
        [cable,cable,hull],
        [circuitUXV,circuitUXV,cable]
    ]);

//Epic Alloy Smleter IV
recipes.addShaped("Epic Alloy Smelter IV",<gregtech:machine:91> * 1,
    [
        [circuitUXV,NqAlloy2,circuitUXV],
        [NqAlloy2,hull,NqAlloy2],
        [cable,NqAlloy2,cable]
    ]);

//Epic Arc Furnace IV
recipes.addShaped("Epic Arc Furnace IV", <gregtech:machine:106> * 1,
    [
        [cable,<ore:dustGraphite>,cable],
        [circuitUXV,hull,circuitUXV],
        [Plate,Plate,Plate]
    ]);

//Epic Assembling Machine IV
recipes.addShaped("Epic Assembling Machine IV", <gregtech:machine:121> * 1,
    [
        [RobotArm,circuitUXV,RobotArm],
        [conveyor,hull,conveyor],
        [cable,circuitUXV,cable]
    ]);

//Epic Autoclave IV
recipes.addShaped("Epic Autoclave IV", <gregtech:machine:136> * 1,
    [
        [Plate,glass,Plate],
        [Plate,hull,Plate],
        [circuitUXV,pump,circuitUXV]
    ]);

//Epic Metal Bender IV
recipes.addShaped("Epic Metal Bender IV", <gregtech:machine:151> * 1,
    [
        [piston,conveyor,piston],
        [circuitUXV,hull,circuitUXV],
        [motor,cable,motor]
    ]);

//Epic Brewery IV
recipes.addShaped("Epic Brewery IV", <gregtech:machine:166> * 1,
    [
        [glass,pump,glass],
        [cable,hull,cable],
        [circuitUXV,blaze,circuitUXV]
    ]);

//Epic Canning Machine IV
recipes.addShaped("Epic Canning Machine IV", <gregtech:machine:181> * 1,
    [
        [cable,pump,cable],
        [circuitUXV,hull,circuitUXV],
        [glass,glass,glass]
    ]);

//Epic Centrifuge IV
recipes.addShaped("Epic Centrifuge IV", <gregtech:machine:196> * 1,
    [
        [circuitUXV,motor,circuitUXV],
        [cable,hull,cable],
        [circuitUXV,motor,circuitUXV]
    ]);

//Epic Chemical Bath IV
recipes.addShaped("Epic Chemical Bath IV", <gregtech:machine:211> * 1,
    [
        [conveyor,glass,cable],
        [pump,glass,conveyor],
        [circuitUXV,hull,circuitUXV]
    ]);

//Epic Chemical Reactor IV
recipes.addShaped("Epic Chemical Reactor IV", <gregtech:machine:226> * 1,
    [
        [<gregtech:fluid_pipe_tiny:127>,Rotor,<gregtech:fluid_pipe_tiny:127>],
        [cable,motor,cable],
        [circuitUXV,hull,circuitUXV]
    ]);

//Epic Compressor IV
recipes.addShaped("Epic Compressor IV", <gregtech:machine:241> * 1,
    [
        [null,circuitUXV,null],
        [piston,hull,piston],
        [cable,circuitUXV,cable]
    ]);

//Epic Cutting Machine IV
recipes.addShaped("Epic Cutting Machine IV", <gregtech:machine:256> * 1,
    [
        [cable,circuitUXV,glass],
        [conveyor,hull,Buzzsaw],
        [circuitUXV,cable,motor]
    ]);

//Epic Distillery IV
recipes.addShaped("Epic Distillery IV", <gregtech:machine:271> * 1,
    [
        [glass,blaze,glass],
        [circuitUXV,hull,circuitUXV],
        [cable,pump,cable]
    ]);

//Epic Electrolyzer IV
recipes.addShaped("Epic Electrolyzer IV", <gregtech:machine:286> * 1,
    [
        [Os_wire,fus_glass,Os_wire],
        [Os_wire,hull,Os_wire],
        [circuitUXV,cable,circuitUXV]
    ]);

//Epic Electromagnetic Separator IV
recipes.addShaped("Epic Electromagnetic Separator IV", <gregtech:machine:301> * 1,
    [
        [conveyor,cable,cable2],
        [cable,hull,Lrod],
        [circuitUXV,cable,cable2]
    ]);

//Epic Extractor IV
recipes.addShaped("Epic Extractor IV", <gregtech:machine:316> * 1,
    [
        [glass,circuitUXV,glass],
        [piston,hull,pump],
        [cable,circuitUXV,cable]
    ]);

//Epic Extruder IV
recipes.addShaped("Epic Extruder IV", <gregtech:machine:331> * 1,
    [
        [NqAlloy2,NqAlloy2,circuitUXV],
        [piston,hull,<gregtech:fluid_pipe_tiny:127>],
        [NqAlloy2,NqAlloy2,circuitUXV]
    ]);

//Epic Fermenter IV
recipes.addShaped("Epic Fermenter IV", <gregtech:machine:346> * 1,
    [
        [cable,pump,cable],
        [glass,hull,glass],
        [cable,circuitUXV,cable]
    ]);

//Epic Fluid Heater IV
recipes.addShaped("Epic Fluid Heater IV", <gregtech:machine:391> * 1,
    [
        [NqAlloy2,fus_glass,NqAlloy2],
        [pump,hull,pump],
        [cable,circuitUXV,cable]
    ]);

//Epic Fluid Solidifier IV
recipes.addShaped("Epic Fluid Solidifier IV", <gregtech:machine:406> * 1,
    [
        [pump,glass,pump],
        [cable,hull,cable],
        [circuitUXV,<minecraft:chest>,circuitUXV]
    ]);

//Epic Forge Hammer IV
recipes.addShaped("Epic Forge Hammer IV", <gregtech:machine:421> * 1,
    [
        [cable,piston,cable],
        [circuitUXV,hull,circuitUXV],
        [cable,<minecraft:anvil>,cable]
    ]);

//Epic Forming Press IV
recipes.addShaped("Epic Forming Press IV", <gregtech:machine:436> * 1,
    [
        [cable,piston,cable],
        [circuitUXV,hull,circuitUXV],
        [cable,piston,cable]
    ]);

//Epic Lathe IV
recipes.addShaped("Epic Lathe IV", <gregtech:machine:451> * 1,
    [
        [cable,circuitUXV,cable],
        [motor,hull,Grinder],
        [circuitUXV,cable,piston]
    ]);

//Epic Mixer IV
recipes.addShaped("Epic Mixer IV", <gregtech:machine:481> * 1,
    [
        [fus_glass,Rotor,fus_glass],
        [fus_glass,motor,fus_glass],
        [circuitUXV,hull,circuitUXV]
    ]);

//Epic Ore Washing Plant IV
recipes.addShaped("Epic Ore Washing Plant IV", <gregtech:machine:496> * 1,
    [
        [Rotor,fus_glass,Rotor],
        [circuitUXV,motor,circuitUXV],
        [cable,hull,cable]
    ]);

//Epic Packager IV
recipes.addShaped("Epic Packager IV", <gregtech:machine:511> * 1,
    [
        [<minecraft:chest>,circuitUXV,<minecraft:chest>],
        [RobotArm,hull,conveyor],
        [cable,circuitUXV,cable]
    ]);

//Epic Gas Collector IV
recipes.addShaped("Epic Gas Collector IV", <gregtech:machine:541> * 1,
    [
        [bars,Ffilter,bars],
        [pump,hull,pump],
        [bars,circuitUXV,bars]
    ]);

//Epic Polarizer IV
recipes.addShaped("Epic Polarizer IV", <gregtech:machine:556> * 1,
    [
        [NqAlloy2,Lrod,NqAlloy2],
        [cable,hull,cable],
        [NqAlloy2,Lrod,NqAlloy2]
    ]);

//Epic Presision Laser Engraver IV
recipes.addShaped("Epic Precision Laser Engraver IV", <gregtech:machine:571> * 1,
    [
        [piston,Emitter,piston],
        [circuitUXV,hull,circuitUXV],
        [cable,circuitUXV,cable]
    ]);

//Epic Sifting Machine IV
recipes.addShaped("Epic Sifting Machine IV", <gregtech:machine:586> * 1,
    [
        [cable,Ifilter,cable],
        [piston,hull,piston],
        [circuitUXV,Ifilter,circuitUXV]
    ]);

//Epic Thermal Centrifuge IV
recipes.addShaped("Epic Thermal Centrifuge IV", <gregtech:machine:616> * 1,
    [
        [circuitUXV,motor,circuitUXV],
        [NqAlloy2,hull,NqAlloy2],
        [cable,motor,cable]
    ]);

//Epic Wiremill IV
recipes.addShaped("Epic Wiremill IV", <gregtech:machine:631> * 1,
    [
        [motor,cable,motor],
        [circuitUXV,hull,circuitUXV],
        [motor,cable,motor]
    ]);

//Epic Circuit Assembler IV
recipes.addShaped("Epic Circuit Assembler IV", <gregtech:machine:646> * 1,
    [
        [RobotArm,hull,Emitter],
        [conveyor,circuitUXV,conveyor],
        [cable,circuitUXV,cable]
    ]);

//Epic Rock Breaker IV
recipes.addShaped("Epic Rock Breaker IV", <gregtech:machine:676> * 1,
    [
        [piston,motor,Grinder],
        [cable,hull,cable],
        [glass,glass,glass]
    ]);

//Wakfu Reactor MK4
recipes.addShaped("Wakfu Reactor Mk4", <gregtech:machine:32115> * 1,
    [
        [Emitter,Field_Gen,Emitter],
        [cable,hull,cable],
        [circuitUIV,circuitUXV,circuitUIV]
    ]);

//UXV Transformer
recipes.addShaped("UXV transformer", <gregtech:machine:1281> * 1,
    [
        [UHPIC,<gregtech:cable_single:32005>,<gregtech:cable_single:32005>],
        [cable,hull,null],
        [UHPIC,<gregtech:cable_single:32005>,<gregtech:cable_single:32005>]
    ]);

//UXV Adj Transformer
assembler.recipeBuilder()
    .inputs([
        <gregtech:machine:1281> * 1,
        pump * 1,
        cable * 1,
        cable2 * 1,
        Spring * 1,
        Sspring * 1
    ])
    .fluidInputs(liquid4 * 2000)
    .outputs(<gregtech:machine:1296> * 1)
    .EUt(200000)
    .duration(300)
    .buildAndRegister();

//UXV 4x Battery Buffer
recipes.addShaped("UXV 4x Battery Buffer", <gregtech:machine:1327> * 1,
    [
        [null,null,null],
        [cable,<minecraft:chest>,cable],
        [cable,hull,cable]
    ]);

//UXV 8x Battery Buffer
recipes.addShaped("UXV 8x Battery Buffer", <gregtech:machine:1341> * 1,
    [
        [null,null,null],
        [cable,<minecraft:chest>,cable],
        [cable2,hull,cable2]
    ]);

//UXV 16x Battery Buffer
recipes.addShaped("UXV 16x Battery Buffer", <gregtech:machine:1355> * 1,
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
    .outputs(<gregtech:machine:1222> * 1)
    .EUt(2000000)
    .duration(1000)
    .buildAndRegister();

//UEV Dynamo Hatch
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
    .outputs(<gregtech:machine:1237> * 1)
    .EUt(2000000)
    .duration(1000)
    .buildAndRegister();

//Dark Matter Capacitor
assembly_line.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:407> * 1,
        Plate * 16,
        circuitUXV * 6,
        <gregtech:meta_item_1:756> * 1,
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
    .outputs(<gregtech:meta_item_1:757> * 1)
    .EUt(12000000)
    .duration(3500)
    .buildAndRegister();
