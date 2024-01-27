#loader gregtech
#priority 10000

import mods.gregtech.material.MaterialBuilder;
import mods.gregtech.material.MaterialRegistry;
import mods.gregtech.material.Material;
import mods.gregtech.material.Elements;

var Wk = Elements.add(500,500, -1, null, "Wakfu", "Wk", false);
var Sts = Elements.add(500,500, -1, null, "Stasis", "Wk-", false);
var WkSts = Elements.add(1000,1000, -1, null, "Wksts", "Stellar", false);
var DMal = Elements.add(200,200, -1, null, "Dma", "NtTrXm", false);
var DEal = Elements.add(200,200, -1, null, "Dea", "Nt₂TrXm", false);
var Stll = Elements.add(300,300, -1, null, "Stl", "Stellaris", false);
var RaSl = Elements.add(500,500, -1, null, "Rual", "Rune", false);
var MixAlloy = Elements.add(420,420, -1, null, "MxAll", "FeCuSnAuPbAgNiZnMnCr", false);
var MixAlloy1 = Elements.add(820,820, -1, null, "MxmAll", "MbMixe", false);
var MixAlloy2 = Elements.add(1671,1671, -1, null, "MxDns", "MixDens", false);



MaterialBuilder(32000, "wakfu")
    .ingot(10)
    .fluid("fluid", true)
    .fluidTemp(320000)
    .color(0x00FFFF).iconSet("SHINY")
        .flags([
        "generate_plate",
        "generate_rod",
        "generate_gear",
        "generate_long_rod",
        "generate_foil",
        "generate_bolt_screw",
        "generate_ring",
        "generate_spring",
        "generate_spring_small",
        "generate_small_gear",
        "generate_fine_wire",
        "generate_rotor",
        "generate_round"
    ])
    .toolStats(150, 3000, 100000000, 20)
    .cableProperties(2097152, 64, 0, false)
    .itemPipeProperties(16,256)
    .element("Wakfu")
    .build();

MaterialBuilder(32001, "stasis")
    .ingot(10)
    .fluid("fluid", true)
    .fluidTemp(100000)
    .color(0xA02CBA).iconSet("SHINY")
    .flags([
        "generate_plate",
        "generate_rod",
        "generate_gear",
        "generate_long_rod",
        "generate_foil",
        "generate_bolt_screw",
        "generate_ring",
        "generate_spring",
        "generate_spring_small",
        "generate_small_gear",
        "generate_fine_wire",
        "generate_rotor",
        "generate_round"
    ])
    .toolStats(150, 3000, 100000000, 20)
    .cableProperties(33554432, 64, 0, false)
    .fluidPipeProperties(5000000, 500000, true, true, true, true)
    .element("Stasis")
    .build();

MaterialBuilder(32007, "wakfustasis")
    .ingot(10)
    .fluid("fluid", true)
    .fluidTemp(100000)
    .color(0xA0B1E4).iconSet("SHINY")
    .flags([
        "generate_plate",
        "generate_rod",
        "generate_gear",
        "generate_long_rod",
        "generate_foil",
        "generate_bolt_screw",
        "generate_ring",
        "generate_spring",
        "generate_spring_small",
        "generate_small_gear",
        "generate_fine_wire",
        "generate_rotor",
        "generate_round"
    ])
    .toolStats(300, 10000, 100000000, 20)
    .cableProperties(2147483647, 128, 0, false)
    .element("Wksts")
    .build();

MaterialBuilder(32003, "darkmatteralloy")
    .ingot(10)
    .fluid("fluid", true)
    .fluidTemp(100000)
    .color(0x2B242A).iconSet("SHINY")
    .flags([
        "generate_plate",
        "generate_rod",
        "generate_gear",
        "generate_long_rod",
        "generate_foil",
        "generate_bolt_screw",
        "generate_ring",
        "generate_spring",
        "generate_spring_small",
        "generate_small_gear",
        "generate_fine_wire",
        "generate_rotor",
        "generate_round"
    ])
    .toolStats(25, 100, 100000, 20)
    .cableProperties(8388608, 8, 0, false)
    .element("Dma")
    .build();

MaterialBuilder(32004, "darkenergyalloy")
    .ingot(10)
    .fluid("fluid", true)
    .fluidTemp(100000)
    .color(0x4D5B68).iconSet("SHINY")
    .flags([
        "generate_plate",
        "generate_rod",
        "generate_gear",
        "generate_long_rod",
        "generate_foil",
        "generate_bolt_screw",
        "generate_ring",
        "generate_spring",
        "generate_spring_small",
        "generate_small_gear",
        "generate_fine_wire",
        "generate_rotor",
        "generate_round"
    ])
    .toolStats(40, 175, 200000, 20)
    .cableProperties(33554432, 8, 0, false)
    .element("Dea")
    .build();

MaterialBuilder(32005, "stellarite")
    .ingot(10)
    .fluid("fluid", true)
    .fluidTemp(100000)
    .color(0xC79024).iconSet("SHINY")
    .flags([
        "generate_plate",
        "generate_rod",
        "generate_gear",
        "generate_long_rod",
        "generate_foil",
        "generate_bolt_screw",
        "generate_ring",
        "generate_spring",
        "generate_spring_small",
        "generate_small_gear",
        "generate_fine_wire",
        "generate_rotor",
        "generate_round"
    ])
    .toolStats(60, 300, 500000, 20)
    .cableProperties(134217728, 8, 0, false)
    .element("Stl")
    .build();

MaterialBuilder(32006, "runicalloy")
    .ingot(10)
    .fluid("fluid", true)
    .fluidTemp(100000)
    .color(0xD11A1A).iconSet("SHINY")
    .flags([
        "generate_plate",
        "generate_rod",
        "generate_gear",
        "generate_long_rod",
        "generate_foil",
        "generate_bolt_screw",
        "generate_ring",
        "generate_spring",
        "generate_spring_small",
        "generate_small_gear",
        "generate_fine_wire",
        "generate_rotor",
        "generate_round"
    ])
    .toolStats(130, 700, 1000000, 20)
    .cableProperties(536870912, 8, 0, false)
    .element("Rual")
    .build();

MaterialBuilder(32008, "basicmixedalloy")
    .ingot(10)
    .fluid("fluid", true)
    .fluidTemp(784)
    .color(0x9482b2).iconSet("DULL")
    .element("MxAll")
    .build();

MaterialBuilder(32009, "moderatemixedalloy")
    .ingot(10)
    .fluid("fluid", true)
    .fluidTemp(1354)
    .color(0x6e519c).iconSet("DULL")
    .element("MxmAll")
    .build();

MaterialBuilder(32010, "densemetalalloy")
    .ingot(10)
    .fluid("fluid", true)
    .fluidTemp(14000)
    .color(0x6e519c).iconSet("DULL")
    .element("MxDns")
    .build();


