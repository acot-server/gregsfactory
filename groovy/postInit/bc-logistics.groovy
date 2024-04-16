def changes = [
    'buildcrafttransport:pipe_structure': [[ore('cobblestone'), item('minecraft:gravel'), ore('cobblestone')]],
    'buildcrafttransport:pipe_wood_item': [[ore('plankWood'), ore('blockGlassColorless'), ore('plankWood')]],
    'buildcrafttransport:pipe_cobble_item': [[ore('cobblestone'), ore('blockGlassColorless'), ore('cobblestone')]],
    'buildcrafttransport:pipe_stone_item': [[ore('stone'), ore('blockGlassColorless'), ore('stone')]],
    'buildcrafttransport:pipe_quartz_item': [[ore('blockQuartz'), ore('blockGlassColorless'), ore('blockQuartz')]],
    'buildcrafttransport:pipe_iron_item': [[ore('ingotIron'), ore('blockGlassColorless'), ore('ingotIron')]],
    'buildcrafttransport:pipe_gold_item': [[ore('ingotGold'), ore('blockGlassColorless'), ore('ingotGold')]],
    'buildcrafttransport:pipe_clay_item': [[ore('blockClay'), ore('blockGlassColorless'), ore('blockClay')]],
    'buildcrafttransport:pipe_sandstone_item': [[ore('sandstone'), ore('blockGlassColorless'), ore('sandstone')]],
    'buildcrafttransport:pipe_void_item': [[ore('dyeBlack'), ore('blockGlassColorless'), ore('dustRedstone')]],
    'buildcrafttransport:pipe_obsidian_item': [[ore('blockObsidian'), ore('blockGlassColorless'), ore('blockObsidian')]],
    'buildcrafttransport:pipe_diamond_item': [[ore('gemDiamond'), ore('blockGlassColorless'), ore('gemDiamond')]],
    'buildcrafttransport:pipe_diamond_wood_item': [[ore('plankWood'), ore('blockGlassColorless'), ore('gemDiamond')]],
    'buildcrafttransport:pipe_lapis_item': [[ore('blockLapis'), ore('blockGlassColorless'), ore('blockLapis')]],
    'buildcrafttransport:pipe_daizuli_item': [[ore('blockLapis'), ore('blockGlassColorless'), ore('gemDiamond')]],
    'buildcrafttransport:pipe_stripes_item': [[ore('gearGold'), ore('blockGlassColorless'), ore('gearGold')]],
    'logisticspipes:pipe_transport_basic': [
        [ore('ingotIron'), ore('dustRedstone'), ore('ingotIron')],
        [ore('blockGlass'), null, ore('blockGlass')],
        [ore('ingotIron'), ore('dustRedstone'), ore('ingotIron')]],
]

changes.each { thing, craft ->
    crafting.removeByOutput(item(thing));
    crafting.addShaped(item(thing) * 32, craft);
}

crafting.removeByOutput(item('buildcraftbuilders:quarry'))
crafting.addShaped(
    item('buildcraftbuilders:quarry'),
    [[ore('gearSteel'), ore('circuitMv'), ore('gearSteel')],
     [ore('gearRoseGold'), ore('gearSteel'), ore('gearRoseGold')],
     [metaitem('electric.motor.mv'), item('gregtech:drill_mv'), metaitem('electric.motor.mv')]])
