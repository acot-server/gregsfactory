#loader gregtech
#priority 9999

import mods.gregtech.material.MaterialBuilder;
import mods.gregtech.material.MaterialRegistry;
import mods.gregtech.material.Material;
import mods.gregtech.material.Elements;

var alkaline = Elements.add(88,88, -1, null, "Alka", "LiNaKCs", false);
var alkalearth = Elements.add(92,92, -1, null, "Alkert", "BeMgCaBa", false);
var transismetalon = Elements.add(204,204, -1, null, "Transmeto", "TiVCrMnFeCoNiCu", false);
var transismetaltw = Elements.add(304,304, -1, null, "Transmettw", "YNbMoRuRhPdAg", false);
var transismetal3 = Elements.add(457,457, -1, null, "Transmetth", "TaWOsIrPtAu", false);
var lanthan = Elements.add(251,25, -1, null, "Lanth", "CeNdSmLu", false);
var actin = Elements.add(624,624, -1, null, "Acti", "ThUPuNqNq+Ke", false);
var poormet = Elements.add(466,466, -1, null, "Poormtl", "AlZnGaCdInSnHgPbBi", false);
var metaloid = Elements.add(86, 86, -1, null, "Metaloids", "CSiPAsSb", false);
var ngas = Elements.add(206, 206, -1, null, "Raregas", "HeNeArKrXeRn", false);
var cmngas = Elements.add(58, 58, -1, null, "Commogas", "HNOFSCl", false);

MaterialBuilder(32011, "alkalinegroup")
    //.ingot(10)
    .fluid("fluid", true)
    .fluidTemp(689)
    .color(0xb27331).iconSet("DULL")
    .element("Alka")
    .build();

MaterialBuilder(32012, "alkalineearth")
    //.ingot(10)
    .fluid("fluid", true)
    .fluidTemp(895)
    .color(0x7a4916).iconSet("DULL")
    .element("Alkert")
    .build();

MaterialBuilder(32013, "tranmetgpone")
    //.ingot(10)
    .fluid("fluid", true)
    .fluidTemp(1684)
    .color(0xe06666).iconSet("DULL")
    .element("Transmeto")
    .build();

MaterialBuilder(32014, "tranmetgptwo")
    //.ingot(10)
    .fluid("fluid", true)
    .fluidTemp(2359)
    .color(0xb55050).iconSet("DULL")
    .element("Transmettw")
    .build();

MaterialBuilder(32015, "transmetgthree")
    //.ingot(10)
    .fluid("fluid", true)
    .fluidTemp(3789)
    .color(0x9c3737).iconSet("DULL")
    .element("Transmetth")
    .build();

MaterialBuilder(32016, "lanthanide")
    //.ingot(10)
    .fluid("fluid", true)
    .fluidTemp(4869)
    .color(0xd58cb0).iconSet("DULL")
    .element("Lanth")
    .build();

MaterialBuilder(32017, "actinide")
    //.ingot(10)
    .fluid("fluid", true)
    .fluidTemp(12769)
    .color(0xa64d79).iconSet("DULL")
    .element("Acti")
    .build();

MaterialBuilder(32018, "poormetal")
    //.ingot(10)
    .fluid("fluid", true)
    .fluidTemp(3789)
    .color(0x929292).iconSet("DULL")
    .element("Poormtl")
    .build();

MaterialBuilder(32019, "othmetals")
    //.ingot(10)
    .fluid("fluid", true)
    .fluidTemp(1384)
    .color(0x5b5b5b).iconSet("DULL")
    .element("Metaloids")
    .build();

MaterialBuilder(32020, "nblgas")
    //.ingot(10)
    .fluid("gas", true)
    .fluidTemp(273)
    .color(0x93c47d).iconSet("DULL")
    .element("Raregas")
    .build();

MaterialBuilder(32021, "comgas")
    //.ingot(10)
    .fluid("gas", true)
    .fluidTemp(273)
    .color(0x93c47d).iconSet("DULL")
    .element("Commogas")
    .build();