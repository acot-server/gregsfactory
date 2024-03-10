#loader gregtech
#priority 10000

import mods.gregtech.material.MaterialBuilder;
import mods.gregtech.material.MaterialRegistry;
import mods.gregtech.material.Material;
import mods.gregtech.material.Elements;

var MixAlloy = Elements.add(420,420, -1, null, "MxAll", "FeCuSnAuPbAgNiZnMnCr", false);
var MixAlloy1 = Elements.add(820,820, -1, null, "MxmAll", "MbMixe", false);
var MixAlloy2 = Elements.add(1671,1671, -1, null, "MxDns", "MixDens", false);

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


