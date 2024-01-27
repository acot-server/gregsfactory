import crafttweaker.item.IIngredient;
import mods.gregtech.recipe.RecipeMap;
import crafttweaker.item.IItemStack;


val motor = <gregtech:meta_item_1:135>;
val pump = <gregtech:meta_item_1:150>;
val conveyor = <gregtech:meta_item_1:165>;
val piston = <gregtech:meta_item_1:180>;
val RobotArm = <gregtech:meta_item_1:195>;
val Field_Gen = <gregtech:meta_item_1:210>;
val Emitter = <gregtech:meta_item_1:225>;
val Sensor = <gregtech:meta_item_1:240>;
val circuitLuV = <ore:circutLuv>; //LuV Circuit
val circuitZPM = <ore:circuitZpm>; //ZPM Circuit
val circuitUV = <ore:circuitUv>; //UV Circuit
val circuitUHV = <ore:circuitUhv>; //UHV Circuit
val Plate = <gregtech:meta_plate:32003>; //Dark Matter Alloy Plate
val Rod = <gregtech:meta_stick:32003>; //Dark Matter Alloy Rod
val Lrod = <gregtech:meta_stick_long:32003>; //Dark Matter Alloy Long Rod
val Ring = <gregtech:meta_ring:32003>; //Dark Matter Alloy Ring
val Round = <gregtech:meta_round:32003>; //Dark Matter Alloy Round
val Spring = <gregtech:meta_spring:32003>; //Dark Matter Alloy Sping
val Sspring = <gregtech:meta_spring_small:32003>; //Dark Matter Alloy Small Spring
val Gear = <gregtech:meta_gear:32003>; //Dark Matter Alloy Gear
val Sgear = <gregtech:meta_gear_small:32003>; //Dark Matter Alloy Small Gear
val Screw = <gregtech:meta_screw:32003>; //Dark Matter Alloy Screw
val FineW = <gregtech:meta_wire_fine:32003>; //Dark Matter Alloy Fine Wire
val Rotor = <gregtech:meta_rotor:32003>; //Dark Matter Alloy Rotor
val foil = <gregtech:meta_foil:32003>; //Dark Matter Alloy Foil
val cable = <gregtech:cable_single:32003>; //Dark Matter Alloy Cable
val cable2 = <gregtech:wire_octal:32003>; //Dark Matter Alloy Wire 8x
val Buzzsaw = <gregtech:meta_tool_head_buzz_saw:32003>; //Dark Matter Alloy Buzzsaw
val Bolt = <gregtech:meta_bolt:32003>; //Dark Matter Bolt
val PBIplate = <gregtech:meta_plate:1010>; //PBI Plate
val casing = <gregtech:machine_casing:9>; //UEV Machine Casing
val hull = <gregtech:machine:994>; //UEV Machine Hull
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

//UHV Machine Casing
recipes.addShaped("UHV Machine Casing", <gregtech:machine_casing:9> * 1,
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

//UHV Machine Hull
recipes.addShaped("UHV Machine Hull", <gregtech:machine:994> * 1,
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

//Epic Electric Furnace I
recipes.addShaped("Epic Electric Furnace I", <gregtech:machine:58> * 1,
    [
        [circuitUHV,NqAlloy,circuitUHV],
        [NqAlloy,hull,NqAlloy],
        [cable,NqAlloy,cable]
    ]);

//Epic Macerator I
recipes.addShaped("Epic Macerator I", <gregtech:machine:73> * 1,
    [
        [piston,motor,Grinder],
        [cable,cable,hull],
        [circuitUHV,circuitUHV,cable]
    ]);

//Epic Alloy Smleter I
recipes.addShaped("Epic Alloy Smelter I",<gregtech:machine:88> * 1,
    [
        [circuitUHV,NqAlloy2,circuitUHV],
        [NqAlloy2,hull,NqAlloy2],
        [cable,NqAlloy2,cable]
    ]);

//Epic Arc Furnace I
recipes.addShaped("Epic Arc Furnace I", <gregtech:machine:103> * 1,
    [
        [cable,<ore:dustGraphite>,cable],
        [circuitUHV,hull,circuitUHV],
        [Plate,Plate,Plate]
    ]);

//Epic Assembling Machine I
recipes.addShaped("Epic Assembling Machine I", <gregtech:machine:118> * 1,
    [
        [RobotArm,circuitUHV,RobotArm],
        [conveyor,hull,conveyor],
        [cable,circuitUHV,cable]
    ]);

//Epic Autoclave I
recipes.addShaped("Epic Autoclave I", <gregtech:machine:133> * 1,
    [
        [Plate,glass,Plate],
        [Plate,hull,Plate],
        [circuitUHV,pump,circuitUHV]
    ]);

//Epic Metal Bender I
recipes.addShaped("Epic Metal Bender I", <gregtech:machine:148> * 1,
    [
        [piston,conveyor,piston],
        [circuitUHV,hull,circuitUHV],
        [motor,cable,motor]
    ]);

//Epic Brewery I
recipes.addShaped("Epic Brewery I", <gregtech:machine:163> * 1,
    [
        [glass,pump,glass],
        [cable,hull,cable],
        [circuitUHV,blaze,circuitUHV]
    ]);

//Epic Canning Machine I
recipes.addShaped("Epic Canning Machine I", <gregtech:machine:178> * 1,
    [
        [cable,pump,cable],
        [circuitUHV,hull,circuitUHV],
        [glass,glass,glass]
    ]);

//Epic Centrifuge I
recipes.addShaped("Epic Centrifuge I", <gregtech:machine:193> * 1,
    [
        [circuitUHV,motor,circuitUHV],
        [cable,hull,cable],
        [circuitUHV,motor,circuitUHV]
    ]);

//Epic Chemical Bath I
recipes.addShaped("Epic Chemical Bath I", <gregtech:machine:208> * 1,
    [
        [conveyor,glass,cable],
        [pump,glass,conveyor],
        [circuitUHV,hull,circuitUHV]
    ]);

//Epic Chemical Reactor I
recipes.addShaped("Epic Chemical Reactor I", <gregtech:machine:223> * 1,
    [
        [<gregtech:fluid_pipe_tiny:127>,Rotor,<gregtech:fluid_pipe_tiny:127>],
        [cable,motor,cable],
        [circuitUHV,hull,circuitUHV]
    ]);

//Epic Compressor I
recipes.addShaped("Epic Compressor I", <gregtech:machine:238> * 1,
    [
        [null,circuitUHV,null],
        [piston,hull,piston],
        [cable,circuitUHV,cable]
    ]);

//Epic Cutting Machine I
recipes.addShaped("Epic Cutting Machine I", <gregtech:machine:253> * 1,
    [
        [cable,circuitUHV,glass],
        [conveyor,hull,Buzzsaw],
        [circuitUHV,cable,motor]
    ]);

//Epic Distillery I
recipes.addShaped("Epic Distillery I", <gregtech:machine:268> * 1,
    [
        [glass,blaze,glass],
        [circuitUHV,hull,circuitUHV],
        [cable,pump,cable]
    ]);

//Epic Electrolyzer I
recipes.addShaped("Epic Electrolyzer I", <gregtech:machine:283> * 1,
    [
        [Os_wire,fus_glass,Os_wire],
        [Os_wire,hull,Os_wire],
        [circuitUHV,cable,circuitUHV]
    ]);

//Epic Electromagnetic Separator I
recipes.addShaped("Epic Electromagnetic Separator I", <gregtech:machine:298> * 1,
    [
        [conveyor,cable,cable2],
        [cable,hull,Lrod],
        [circuitUHV,cable,cable2]
    ]);

//Epic Extractor I
recipes.addShaped("Epic Extractor I", <gregtech:machine:313> * 1,
    [
        [glass,circuitUHV,glass],
        [piston,hull,pump],
        [cable,circuitUHV,cable]
    ]);

//Epic Extruder I
recipes.addShaped("Epic Extruder I", <gregtech:machine:328> * 1,
    [
        [NqAlloy2,NqAlloy2,circuitUHV],
        [piston,hull,<gregtech:fluid_pipe_tiny:127>],
        [NqAlloy2,NqAlloy2,circuitUHV]
    ]);

//Epic Fermenter I
recipes.addShaped("Epic Fermenter I", <gregtech:machine:343> * 1,
    [
        [cable,pump,cable],
        [glass,hull,glass],
        [cable,circuitUHV,cable]
    ]);

//Epic Fluid Heater I
recipes.addShaped("Epic Fluid Heater I", <gregtech:machine:388> * 1,
    [
        [NqAlloy2,fus_glass,NqAlloy2],
        [pump,hull,pump],
        [cable,circuitUHV,cable]
    ]);

//Epic Fluid Solidifier I
recipes.addShaped("Epic Fluid Solidifier I", <gregtech:machine:403> * 1,
    [
        [pump,glass,pump],
        [cable,hull,cable],
        [circuitUHV,<minecraft:chest>,circuitUHV]
    ]);

//Epic Forge Hammer I
recipes.addShaped("Epic Forge Hammer I", <gregtech:machine:418> * 1,
    [
        [cable,piston,cable],
        [circuitUHV,hull,circuitUHV],
        [cable,<minecraft:anvil>,cable]
    ]);

//Epic Forming Press I
recipes.addShaped("Epic Forming Press I", <gregtech:machine:433> * 1,
    [
        [cable,piston,cable],
        [circuitUHV,hull,circuitUHV],
        [cable,piston,cable]
    ]);

//Epic Lathe I
recipes.addShaped("Epic Lathe I", <gregtech:machine:448> * 1,
    [
        [cable,circuitUHV,cable],
        [motor,hull,Grinder],
        [circuitUHV,cable,piston]
    ]);

//Epic Mixer I
recipes.addShaped("Epic Mixer I", <gregtech:machine:478> * 1,
    [
        [fus_glass,Rotor,fus_glass],
        [fus_glass,motor,fus_glass],
        [circuitUHV,hull,circuitUHV]
    ]);

//Epic Ore Washing Plant I
recipes.addShaped("Epic Ore Washing Plant I", <gregtech:machine:493> * 1,
    [
        [Rotor,fus_glass,Rotor],
        [circuitUHV,motor,circuitUHV],
        [cable,hull,cable]
    ]);

//Epic Packager I
recipes.addShaped("Epic Packager I", <gregtech:machine:508> * 1,
    [
        [<minecraft:chest>,circuitUHV,<minecraft:chest>],
        [RobotArm,hull,conveyor],
        [cable,circuitUHV,cable]
    ]);

//Epic Gas Collector I
recipes.addShaped("Epic Gas Collector I", <gregtech:machine:538> * 1,
    [
        [bars,Ffilter,bars],
        [pump,hull,pump],
        [bars,circuitUHV,bars]
    ]);

//Epic Polarizer I
recipes.addShaped("Epic Polarizer I", <gregtech:machine:553> * 1,
    [
        [NqAlloy2,Lrod,NqAlloy2],
        [cable,hull,cable],
        [NqAlloy2,Lrod,NqAlloy2]
    ]);

//Epic Presision Laser Engraver I
recipes.addShaped("Epic Precision Laser Engraver I", <gregtech:machine:568> * 1,
    [
        [piston,Emitter,piston],
        [circuitUHV,hull,circuitUHV],
        [cable,circuitUHV,cable]
    ]);

//Epic Sifting Machine I
recipes.addShaped("Epic Sifting Machine I", <gregtech:machine:583> * 1,
    [
        [cable,Ifilter,cable],
        [piston,hull,piston],
        [circuitUHV,Ifilter,circuitUHV]
    ]);

//Epic Thermal Centrifuge I
recipes.addShaped("Epic Thermal Centrifuge I", <gregtech:machine:613> * 1,
    [
        [circuitUHV,motor,circuitUHV],
        [NqAlloy2,hull,NqAlloy2],
        [cable,motor,cable]
    ]);

//Epic Wiremill I
recipes.addShaped("Epic Wiremill I", <gregtech:machine:628> * 1,
    [
        [motor,cable,motor],
        [circuitUHV,hull,circuitUHV],
        [motor,cable,motor]
    ]);

//Epic Circuit Assembler I
recipes.addShaped("Epic Circuit Assembler I", <gregtech:machine:643> * 1,
    [
        [RobotArm,hull,Emitter],
        [conveyor,circuitUHV,conveyor],
        [cable,circuitUHV,cable]
    ]);

//Epic Rock Breaker I
recipes.addShaped("Epic Rock Breaker I", <gregtech:machine:673> * 1,
    [
        [piston,motor,Grinder],
        [cable,hull,cable],
        [glass,glass,glass]
    ]);

//Wakfu Reactor MK1
recipes.addShaped("Wakfu Reactor Mk1", <gregtech:machine:32112> * 1,
    [
        [Emitter,Field_Gen,Emitter],
        [cable,hull,cable],
        [circuitUV,circuitUHV,circuitUV]
    ]);

//Wakfu Production
centrifuge.recipeBuilder()
    .inputs(<minecraft:dragon_egg> * 1)
    .notConsumable(<contenttweaker:antimatter_field> * 1)
    .fluidOutputs(<liquid:wakfu> * 64000)
    .duration(20000)
    .EUt(800000)
    .buildAndRegister();

//UHV 4x Battery Buffer
recipes.addShaped("UHV 4x Battery Buffer", <gregtech:machine:1324> * 1,
    [
        [null,null,null],
        [cable,<minecraft:chest>,cable],
        [cable,hull,cable]
    ]);

//UHV 8x Battery Buffer
recipes.addShaped("UHV 8x Battery Buffer", <gregtech:machine:1338> * 1,
    [
        [null,null,null],
        [cable,<minecraft:chest>,cable],
        [cable2,hull,cable2]
    ]);

//UHV 16x Battery Buffer
recipes.addShaped("UHV 16x Battery Buffer", <gregtech:machine:1352> * 1,
    [
        [null,null,null],
        [cable2,<minecraft:chest>,cable2],
        [cable2,hull,cable2]
    ]);

//UHV Energy Hatch
assembly_line.recipeBuilder()
    .inputs([
        hull,
        cable * 4,
        UHPIC * 2,
        circuitUHV * 1,
        Spring * 2
    ])
    .fluidInputs(liquid2 * 2880)
    .outputs(<gregtech:machine:1219> * 1)
    .EUt(400000)
    .duration(1000)
    .buildAndRegister();

//UEV Energy Hatch
assembly_line.recipeBuilder()
    .inputs([
        hull,
        cable * 4,
        UHPIC * 2,
        circuitUHV * 1,
        Spring * 1,
        Sspring * 4
    ])
    .fluidInputs(liquid2 * 2880)
    .outputs(<gregtech:machine:1234> * 1)
    .EUt(400000)
    .duration(1000)
    .buildAndRegister();

//Dark Matter Capacitor
assembly_line.recipeBuilder()
    .inputs([
        <gregtech:meta_item_1:407> * 1,
        Plate * 16,
        circuitUHV * 4,
        <gregtech:meta_item_1:751> * 1,
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
    .outputs(<gregtech:meta_item_1:754> * 1)
    .EUt(1000000)
    .duration(2000)
    .buildAndRegister();

// Energy Cluster * 1
<recipemap:assembly_line>.findRecipe(200000,
[<metaitem:circuit_board.wetware>, 
 <metaitem:plateAmericium> * 16, 
 <metaitem:circuit.wetware_computer> * 4, 
 <metaitem:energy.module>, 
 <metaitem:field.generator.zpm>, 
 <metaitem:plate.ultra_high_power_integrated_circuit> * 32, 
 <metaitem:component.advanced_smd.diode> * 16, 
 <metaitem:component.advanced_smd.capacitor> * 16, 
 <metaitem:component.advanced_smd.resistor> * 16, 
 <metaitem:component.advanced_smd.transistor> * 16, 
 <metaitem:component.advanced_smd.inductor> * 16, 
 <metaitem:wireFineOsmiridium> * 64, 
 <metaitem:boltNaquadria> * 16], 
 [<liquid:soldering_alloy> * 2880, 
  <liquid:polybenzimidazole> * 576]).remove();

assembly_line.recipeBuilder()
    .inputs([
        <metaitem:circuit_board.wetware> * 1,
        <metaitem:plateAmericium> * 16,
        <metaitem:plateAmericium> * 16,
        <ore:circuitUv> * 4,
        <metaitem:energy.module> * 1,
        <metaitem:field.generator.zpm> * 1,
        <metaitem:plate.ultra_high_power_integrated_circuit> * 32,
        <metaitem:component.advanced_smd.diode> * 16, 
        <metaitem:component.advanced_smd.capacitor> * 16, 
        <metaitem:component.advanced_smd.resistor> * 16, 
        <metaitem:component.advanced_smd.transistor> * 16, 
        <metaitem:component.advanced_smd.inductor> * 16, 
        <metaitem:wireFineOsmiridium> * 64, 
        <metaitem:boltNaquadria> * 16
    ])
    .fluidInputs([
        <liquid:soldering_alloy> * 2880, 
        <liquid:polybenzimidazole> * 576  
    ])
    .outputs(<gregtech:meta_item_1:751> * 1)
    .EUt(200000)
    .duration(1400)
    .buildAndRegister();