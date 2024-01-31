import crafttweaker.item.IIngredient;
import mods.gregtech.recipe.RecipeMap;
import crafttweaker.item.IItemStack;

val motor = <gregtech:meta_item_1:136>;
val pump = <gregtech:meta_item_1:151>;
val conveyor = <gregtech:meta_item_1:166>;
val piston = <gregtech:meta_item_1:181>;
val RobotArm = <gregtech:meta_item_1:196>;
val Field_Gen = <gregtech:meta_item_1:211>;
val Emitter = <gregtech:meta_item_1:226>;
val Sensor = <gregtech:meta_item_1:241>;
val circuitZPM = <ore:circuitZpm>; //ZPM Circuit
val circuitUV = <ore:circuitUv>; //UV Circuit
val circuitUHV = <ore:circuitUhv>; //UHV Circuit
val circuitUEV = <ore:circuitUev>; //Enigmatic Resonating Circuit
val circuitUIV = <ore:circuitUiv>; //Matrioska Brain Circuit
val circuitUXV = <ore:circuitUxv>; //Runic Resonating Circuit
val circuitOPV = <ore:circuitOpv>; //Stellarborn Basic Computer
val Plate = <gregtech:meta_plate:32004>; //Dark Energy Alloy Plate
val Rod = <gregtech:meta_stick:32004>; //Dark Energy Alloy Rod
val Lrod = <gregtech:meta_stick_long:32004>; //Dark Energy Alloy Long Rod
val Ring = <gregtech:meta_ring:32004>; //Dark Energy Alloy Ring
val Round = <gregtech:meta_round:32004>; //Dark Energy Alloy Round
val Spring = <gregtech:meta_spring:32004>; //Dark Energy Alloy Sping
val Sspring = <gregtech:meta_spring_small:32004>; //Dark Energy Alloy Small Spring
val Gear = <gregtech:meta_gear:32004>; //Dark Energy Alloy Gear
val Sgear = <gregtech:meta_gear_small:32004>; //Dark Energy Alloy Small Gear
val Screw = <gregtech:meta_screw:32004>; //Dark Energy Alloy Screw
val FineW = <gregtech:meta_wire_fine:32004>; //Dark Energy Alloy Fine Wire
val Rotor = <gregtech:meta_rotor:32004>; //Dark Energy Alloy Rotor
val foil = <gregtech:meta_foil:32004>; //Dark Energy Alloy Foil
val cable = <gregtech:cable_single:32004>; //Dark Energy Alloy Cable
val cable2 = <gregtech:wire_octal:32004>; //Dark Energy Alloy Wire 8x
val Buzzsaw = <gregtech:meta_tool_head_buzz_saw:32004>; //Dark Energy Alloy Buzzsaw
val Bolt = <gregtech:meta_bolt:32004>; //Dark Energy Alloy Bolt
val PBIplate = <gregtech:meta_plate:1010>; //PBI Plate
val casing = <gregtech:machine_casing:10>; //UEV Machine Casing
val hull = <gregtech:machine:995>; //UEV Machine Hull
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

//UEV Machine Casing
recipes.addShaped("UEV Machine Casing", <gregtech:machine_casing:10> * 1,
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

//UEV Machine Hull
recipes.addShaped("UEV Machine Hull", <gregtech:machine:995> * 1,
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

//Epic Electric Furnace II
recipes.addShaped("Epic Electric Furnace II", <gregtech:machine:59> * 1,
    [
        [circuitUEV,NqAlloy,circuitUEV],
        [NqAlloy,hull,NqAlloy],
        [cable,NqAlloy,cable]
    ]);

//Epic Macerator II
recipes.addShaped("Epic Macerator II", <gregtech:machine:74> * 1,
    [
        [piston,motor,Grinder],
        [cable,cable,hull],
        [circuitUEV,circuitUEV,cable]
    ]);

//Epic Alloy Smleter II
recipes.addShaped("Epic Alloy Smelter II",<gregtech:machine:89> * 1,
    [
        [circuitUEV,NqAlloy2,circuitUEV],
        [NqAlloy2,hull,NqAlloy2],
        [cable,NqAlloy2,cable]
    ]);

//Epic Arc Furnace II
recipes.addShaped("Epic Arc Furnace II", <gregtech:machine:104> * 1,
    [
        [cable,<ore:dustGraphite>,cable],
        [circuitUEV,hull,circuitUEV],
        [Plate,Plate,Plate]
    ]);

//Epic Assembling Machine II
recipes.addShaped("Epic Assembling Machine II", <gregtech:machine:119> * 1,
    [
        [RobotArm,circuitUEV,RobotArm],
        [conveyor,hull,conveyor],
        [cable,circuitUEV,cable]
    ]);

//Epic Autoclave II
recipes.addShaped("Epic Autoclave II", <gregtech:machine:134> * 1,
    [
        [Plate,glass,Plate],
        [Plate,hull,Plate],
        [circuitUEV,pump,circuitUEV]
    ]);

//Epic Metal Bender II
recipes.addShaped("Epic Metal Bender II", <gregtech:machine:149> * 1,
    [
        [piston,conveyor,piston],
        [circuitUEV,hull,circuitUEV],
        [motor,cable,motor]
    ]);

//Epic Brewery II
recipes.addShaped("Epic Brewery II", <gregtech:machine:164> * 1,
    [
        [glass,pump,glass],
        [cable,hull,cable],
        [circuitUEV,blaze,circuitUEV]
    ]);

//Epic Canning Machine II
recipes.addShaped("Epic Canning Machine II", <gregtech:machine:179> * 1,
    [
        [cable,pump,cable],
        [circuitUEV,hull,circuitUEV],
        [glass,glass,glass]
    ]);

//Epic Centrifuge II
recipes.addShaped("Epic Centrifuge II", <gregtech:machine:194> * 1,
    [
        [circuitUEV,motor,circuitUEV],
        [cable,hull,cable],
        [circuitUEV,motor,circuitUEV]
    ]);

//Epic Chemical Bath II
recipes.addShaped("Epic Chemical Bath II", <gregtech:machine:209> * 1,
    [
        [conveyor,glass,cable],
        [pump,glass,conveyor],
        [circuitUEV,hull,circuitUEV]
    ]);

//Epic Chemical Reactor II
recipes.addShaped("Epic Chemical Reactor II", <gregtech:machine:224> * 1,
    [
        [<gregtech:fluid_pipe_tiny:127>,Rotor,<gregtech:fluid_pipe_tiny:127>],
        [cable,motor,cable],
        [circuitUEV,hull,circuitUEV]
    ]);

//Epic Compressor II
recipes.addShaped("Epic Compressor II", <gregtech:machine:239> * 1,
    [
        [null,circuitUEV,null],
        [piston,hull,piston],
        [cable,circuitUEV,cable]
    ]);

//Epic Cutting Machine II
recipes.addShaped("Epic Cutting Machine II", <gregtech:machine:254> * 1,
    [
        [cable,circuitUEV,glass],
        [conveyor,hull,Buzzsaw],
        [circuitUEV,cable,motor]
    ]);

//Epic Distillery II
recipes.addShaped("Epic Distillery II", <gregtech:machine:269> * 1,
    [
        [glass,blaze,glass],
        [circuitUEV,hull,circuitUEV],
        [cable,pump,cable]
    ]);

//Epic Electrolyzer II
recipes.addShaped("Epic Electrolyzer II", <gregtech:machine:284> * 1,
    [
        [Os_wire,fus_glass,Os_wire],
        [Os_wire,hull,Os_wire],
        [circuitUEV,cable,circuitUEV]
    ]);

//Epic Electromagnetic Separator II
recipes.addShaped("Epic Electromagnetic Separator II", <gregtech:machine:299> * 1,
    [
        [conveyor,cable,cable2],
        [cable,hull,Lrod],
        [circuitUEV,cable,cable2]
    ]);

//Epic Extractor II
recipes.addShaped("Epic Extractor II", <gregtech:machine:314> * 1,
    [
        [glass,circuitUEV,glass],
        [piston,hull,pump],
        [cable,circuitUEV,cable]
    ]);

//Epic Extruder II
recipes.addShaped("Epic Extruder II", <gregtech:machine:329> * 1,
    [
        [NqAlloy2,NqAlloy2,circuitUEV],
        [piston,hull,<gregtech:fluid_pipe_tiny:127>],
        [NqAlloy2,NqAlloy2,circuitUEV]
    ]);

//Epic Fermenter II
recipes.addShaped("Epic Fermenter II", <gregtech:machine:344> * 1,
    [
        [cable,pump,cable],
        [glass,hull,glass],
        [cable,circuitUEV,cable]
    ]);

//Epic Fluid Heater II
recipes.addShaped("Epic Fluid Heater II", <gregtech:machine:389> * 1,
    [
        [NqAlloy2,fus_glass,NqAlloy2],
        [pump,hull,pump],
        [cable,circuitUEV,cable]
    ]);

//Epic Fluid Solidifier II
recipes.addShaped("Epic Fluid Solidifier II", <gregtech:machine:404> * 1,
    [
        [pump,glass,pump],
        [cable,hull,cable],
        [circuitUEV,<minecraft:chest>,circuitUEV]
    ]);

//Epic Forge Hammer II
recipes.addShaped("Epic Forge Hammer II", <gregtech:machine:419> * 1,
    [
        [cable,piston,cable],
        [circuitUEV,hull,circuitUEV],
        [cable,<minecraft:anvil>,cable]
    ]);

//Epic Forming Press II
recipes.addShaped("Epic Forming Press II", <gregtech:machine:434> * 1,
    [
        [cable,piston,cable],
        [circuitUEV,hull,circuitUEV],
        [cable,piston,cable]
    ]);

//Epic Lathe II
recipes.addShaped("Epic Lathe II", <gregtech:machine:449> * 1,
    [
        [cable,circuitUEV,cable],
        [motor,hull,Grinder],
        [circuitUEV,cable,piston]
    ]);

//Epic Mixer II
recipes.addShaped("Epic Mixer II", <gregtech:machine:479> * 1,
    [
        [fus_glass,Rotor,fus_glass],
        [fus_glass,motor,fus_glass],
        [circuitUEV,hull,circuitUEV]
    ]);

//Epic Ore Washing Plant II
recipes.addShaped("Epic Ore Washing Plant II", <gregtech:machine:494> * 1,
    [
        [Rotor,fus_glass,Rotor],
        [circuitUEV,motor,circuitUEV],
        [cable,hull,cable]
    ]);

//Epic Packager II
recipes.addShaped("Epic Packager II", <gregtech:machine:509> * 1,
    [
        [<minecraft:chest>,circuitUEV,<minecraft:chest>],
        [RobotArm,hull,conveyor],
        [cable,circuitUEV,cable]
    ]);

//Epic Gas Collector II
recipes.addShaped("Epic Gas Collector II", <gregtech:machine:539> * 1,
    [
        [bars,Ffilter,bars],
        [pump,hull,pump],
        [bars,circuitUEV,bars]
    ]);

//Epic Polarizer II
recipes.addShaped("Epic Polarizer II", <gregtech:machine:554> * 1,
    [
        [NqAlloy2,Lrod,NqAlloy2],
        [cable,hull,cable],
        [NqAlloy2,Lrod,NqAlloy2]
    ]);

//Epic Presision Laser Engraver II
recipes.addShaped("Epic Precision Laser Engraver II", <gregtech:machine:569> * 1,
    [
        [piston,Emitter,piston],
        [circuitUEV,hull,circuitUEV],
        [cable,circuitUEV,cable]
    ]);

//Epic Sifting Machine II
recipes.addShaped("Epic Sifting Machine II", <gregtech:machine:584> * 1,
    [
        [cable,Ifilter,cable],
        [piston,hull,piston],
        [circuitUEV,Ifilter,circuitUEV]
    ]);

//Epic Thermal Centrifuge II
recipes.addShaped("Epic Thermal Centrifuge II", <gregtech:machine:614> * 1,
    [
        [circuitUEV,motor,circuitUEV],
        [NqAlloy2,hull,NqAlloy2],
        [cable,motor,cable]
    ]);

//Epic Wiremill II
recipes.addShaped("Epic Wiremill II", <gregtech:machine:629> * 1,
    [
        [motor,cable,motor],
        [circuitUEV,hull,circuitUEV],
        [motor,cable,motor]
    ]);

//Epic Circuit Assembler II
recipes.addShaped("Epic Circuit Assembler II", <gregtech:machine:644> * 1,
    [
        [RobotArm,hull,Emitter],
        [conveyor,circuitUEV,conveyor],
        [cable,circuitUEV,cable]
    ]);

//Epic Rock Breaker II
recipes.addShaped("Epic Rock Breaker II", <gregtech:machine:674> * 1,
    [
        [piston,motor,Grinder],
        [cable,hull,cable],
        [glass,glass,glass]
    ]);


//Wakfu Reactor MK2
recipes.addShaped("Wakfu Reactor Mk2", <gregtech:machine:32113> * 1,
    [
        [Emitter,Field_Gen,Emitter],
        [cable,hull,cable],
        [circuitUHV,circuitUEV,circuitUHV]
    ]);

//UEV Transformer
recipes.addShaped("UEV transformer", <gregtech:machine:1279> * 1,
    [
        [UHPIC,<gregtech:cable_single:32003>,<gregtech:cable_single:32003>],
        [cable,hull,null],
        [UHPIC,<gregtech:cable_single:32003>,<gregtech:cable_single:32003>]
    ]);

//UHV Adj Transformer
assembler.recipeBuilder()
    .inputs([
        <gregtech:machine:1279> * 1,
        pump * 1,
        cable * 1,
        cable2 * 1,
        Spring * 1,
        Sspring * 1
    ])
    .fluidInputs(liquid4 * 2000)
    .outputs(<gregtech:machine:1294> * 1)
    .EUt(100000)
    .duration(300)
    .buildAndRegister();

//UEV 4x Battery Buffer
recipes.addShaped("UEV 4x Battery Buffer", <gregtech:machine:1325> * 1,
    [
        [null,null,null],
        [cable,<minecraft:chest>,cable],
        [cable,hull,cable]
    ]);

//UEV 8x Battery Buffer
recipes.addShaped("UEV 8x Battery Buffer", <gregtech:machine:1339> * 1,
    [
        [null,null,null],
        [cable,<minecraft:chest>,cable],
        [cable2,hull,cable2]
    ]);

//UEV 16x Battery Buffer
recipes.addShaped("UEV 16x Battery Buffer", <gregtech:machine:1353> * 1,
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
        circuitUEV * 1,
        Spring * 2
    ])
    .fluidInputs(liquid2 * 2880)
    .outputs(<gregtech:machine:1220> * 1)
    .EUt(1000000)
    .duration(1000)
    .buildAndRegister();

//UEV Energy Hatch
assembly_line.recipeBuilder()
    .inputs([
        hull,
        cable * 4,
        UHPIC * 2,
        circuitUEV * 1,
        Spring * 1,
        Sspring * 4
    ])
    .fluidInputs(liquid2 * 2880)
    .outputs(<gregtech:machine:1235> * 1)
    .EUt(1000000)
    .duration(1000)
    .buildAndRegister();

//Dark Matter Capacitor
assembly_line.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:407> * 1,
        Plate * 16,
        circuitUEV * 4,
        <gregtech:meta_item_1:754> * 1,
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
    .outputs(<gregtech:meta_item_1:755> * 1)
    .EUt(4000000)
    .duration(2500)
    .buildAndRegister();
