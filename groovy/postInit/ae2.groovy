import mods.appliedenergistics2.*
import gregtech.*

// GT Recipemaps
def assembler = recipemap('assembler')
def wiremill = recipemap('wiremill')
def alloy_smelter = recipemap('alloy_smelter')
def research_station = recipemap('research_station')
def assembly_line = recipemap('assembly_line')
def macerator = recipemap('macerator')
def autoclave = recipemap('autoclave')
def rock_breaker = recipemap('rock_breaker')

// Common items
def emitter = metaitem('emitter.mv')
def sensor = metaitem('sensor.mv')
def plate = ore('plateAluminium')
def plate_f = ore('plateLapis')
def screw = ore('screwAluminium')

def ram = metaitem('plate.random_access_memory')
def ic = metaitem('plate.integrated_logic_circuit')
def cpu = metaitem('plate.central_processing_unit')

// Add oredict to AE2 fluix dust
ore('dustFluix').add(item('appliedenergistics2:material', 8))

// remove inscriber (because removing the recipes themselves causes Java to have a stroke)
crafting.remove('appliedenergistics2:network/blocks/inscribers')

// the magnet card for wireless terminals
assembler.recipeBuilder()
    .inputs(
        ore('stickNeodymiumMagnetic') * 2,
        metaitem('circuit_board.plastic')
    )
    .fluidInputs(fluid('plastic') * 144)
    .outputs(item('appliedenergistics2:material', 60))
    .EUt(120)
    .duration(600)
    .buildAndRegister()

// ME Drive
crafting.removeByOutput(item('appliedenergistics2:drive'))
crafting.addShaped(item('appliedenergistics2:drive'),
    [[plate, emitter, plate],
     [ore('circuitLv'), item('appliedenergistics2:chest'), ore('circuitLv')],
     [plate, sensor, plate]]
)

// Blank Pattern
crafting.removeByOutput(item('appliedenergistics2:material', 52))
crafting.addShaped(item('appliedenergistics2:material', 52) * 8,
    [[ore('wireFineSilver'), ore('wireFineSilver'), ore('wireFineSilver')],
     [ore('platePlastic'), ore('circuitHv'), ore('platePlastic')],
     [ore('platePlastic'), ore('platePlastic'), ore('platePlastic')]]
)

// Crafting Unit
crafting.removeByOutput(item('appliedenergistics2:crafting_unit'))
crafting.addShaped(item('appliedenergistics2:crafting_unit'),
    [[plate, cpu, plate],
     [item('appliedenergistics2:part', 16), ram, item('appliedenergistics2:part', 16)],
     [plate, cpu, plate]]
)

// Molecular Assembler
crafting.removeByOutput(item('appliedenergistics2:molecular_assembler'))
crafting.addShaped(item('appliedenergistics2:molecular_assembler'),
    [[plate, item('appliedenergistics2:quartz_glass'), plate],
    [sensor, item('logisticspipes:crafting_table'), emitter],
    [plate, item('appliedenergistics2:quartz_glass'), plate]]
)

// Quartz Fiber
crafting.removeByOutput(item('appliedenergistics2:part', 140))
wiremill.recipeBuilder()
    .inputs(ore('crystalPureNetherQuartz'))
    .outputs(item('appliedenergistics2:part', 140))
    .EUt(16)
    .duration(100)
    .buildAndRegister()

// Glass Cable
crafting.removeByOutput(item('appliedenergistics2:part', 16))
alloy_smelter.recipeBuilder()
    .inputs([ore('dustFluix'), item('appliedenergistics2:part', 140)])
    .outputs(item('appliedenergistics2:part', 16) * 2)
    .EUt(16)
    .duration(50)
    .buildAndRegister()

// Covered Cable
assembler.recipeBuilder()
    .inputs(item('appliedenergistics2:part', 16) * 1)
    .fluidInputs(fluid('rubber') * 144)
    .outputs(item('appliedenergistics2:part', 36) * 1)
    .EUt(7)
    .duration(100)
    .buildAndRegister()
assembler.recipeBuilder()
    .inputs(item('appliedenergistics2:part', 16) * 1)
    .fluidInputs(fluid('silicone_rubber') * 72)
    .outputs(item('appliedenergistics2:part', 36) * 1)
    .EUt(7)
    .duration(100)
    .buildAndRegister()
assembler.recipeBuilder()
    .inputs(item('appliedenergistics2:part', 16) * 1)
    .fluidInputs(fluid('styrene_butadiene_rubber') * 36)
    .outputs(item('appliedenergistics2:part', 36) * 1)
    .EUt(7)
    .duration(100)
    .buildAndRegister()

// EnderIO: ME Conduit
crafting.removeByOutput(item('enderio:item_me_conduit'))
crafting.addShaped(item('enderio:item_me_conduit') * 3,
    [[screw, ore('craftingToolWrench'), screw],
     [item('appliedenergistics2:part', 16),item('appliedenergistics2:part', 16),item('appliedenergistics2:part', 16)],
     [screw, ore('craftingToolScrewdriver'), screw]]
)
assembler.recipeBuilder()
    .inputs([item('appliedenergistics2:part', 16) * 3, screw * 4])
    .outputs(item('enderio:item_me_conduit') * 12)
    .EUt(40)
    .duration(300)
    .buildAndRegister()

// Vibrant Quartz Glass
crafting.removeByOutput(item('appliedenergistics2:quartz_vibrant_glass'))
alloy_smelter.recipeBuilder()
    .inputs([item('appliedenergistics2:quartz_glass'), ore('ingotVibrantAlloy')])
    .outputs(item('appliedenergistics2:quartz_vibrant_glass'))
    .EUt(16)
    .duration(80)
    .buildAndRegister()

// Meteorite Compass
crafting.removeByOutput(item('appliedenergistics2:sky_compass'));
crafting.addShaped(item('appliedenergistics2:sky_compass'),
    [[null, ore('plateWroughtIron'), null],
    [ore('plateWroughtIron'), item('appliedenergistics2:material', 1), ore('plateWroughtIron')],
    [null, ore('plateWroughtIron'), null]]
)

// Formation Plane
crafting.removeByOutput(item('appliedenergistics2:part', 320))
crafting.addShaped(item('appliedenergistics2:part', 320),
    [[ore('crystalFluix'), ore('circuitMv'), ore('crystalFluix')],
     [plate, emitter, plate]]
)

// Fluid Formation Plane
crafting.removeByOutput(item('appliedenergistics2:part', 321))
crafting.addShaped(item('appliedenergistics2:part', 321),
    [[ore('crystalFluix'), ore('circuitMv'), ore('crystalFluix')],
     [plate_f, emitter, plate_f]]
)

// Anihilation Plane
crafting.removeByOutput(item('appliedenergistics2:part', 300))
crafting.addShaped(item('appliedenergistics2:part', 300),
    [[ore('crystalFluix'), ore('circuitMv'), ore('crystalFluix')],
     [plate, sensor, plate]]
)

// Fluid Anihilation Plane
crafting.removeByOutput(item('appliedenergistics2:part', 302))
crafting.addShaped(item('appliedenergistics2:part', 302),
    [[ore('crystalFluix'), ore('circuitMv'), ore('crystalFluix')],
     [plate_f, sensor, plate_f]]
)

// Fluid Terminal
crafting.removeByOutput(item('appliedenergistics2:part', 520))
crafting.addShaped(item('appliedenergistics2:part', 520),
    [[item('appliedenergistics2:part', 380), plate_f, ram]]
)

// Export Bus
crafting.removeByOutput(item('appliedenergistics2:part', 260))
crafting.addShaped(item('appliedenergistics2:part', 260),
    [[plate, emitter, plate],
     [null, metaitem('conveyor.module.mv'), null]]
)

// Fluid Export Bus
crafting.removeByOutput(item('appliedenergistics2:part', 261))
crafting.addShaped(item('appliedenergistics2:part', 261),
    [[plate_f, emitter, plate_f],
     [null, metaitem('electric.pump.mv'), null]]
)
// Import Bus
crafting.removeByOutput(item('appliedenergistics2:part', 240))
crafting.addShaped(item('appliedenergistics2:part', 240),
    [[plate, sensor, plate],
     [null, metaitem('conveyor.module.mv'), null]]
)

// Fluid Import Bus
crafting.removeByOutput(item('appliedenergistics2:part', 241))
crafting.addShaped(item('appliedenergistics2:part', 241),
    [[plate_f, sensor, plate_f],
     [null, metaitem('electric.pump.mv'), null]]
)

// Storage Bus
crafting.removeByOutput(item('appliedenergistics2:part', 220))
crafting.addShapeless(item('appliedenergistics2:part', 220), [metaitem('conveyor.module.mv'), item('appliedenergistics2:interface')])

// Fluid Storage Bus
crafting.removeByOutput(item('appliedenergistics2:part', 221))
crafting.addShapeless(item('appliedenergistics2:part', 221), [metaitem('electric.pump.mv'), item('appliedenergistics2:fluid_interface')])

// Interface
crafting.remove("appliedenergistics2:network/blocks/interfaces_interface")
crafting.addShaped(item('appliedenergistics2:interface'),
    [[plate, metaitem('item_bus.import.mv'), plate],
    [sensor, null, emitter],
    [plate, metaitem('item_bus.export.mv'), plate]]
)

// Interface
crafting.remove("appliedenergistics2:network/blocks/fluid_interfaces_interface")
crafting.addShaped(item('appliedenergistics2:fluid_interface'),
    [[plate_f, metaitem('fluid_hatch.import.mv'), plate_f],
    [sensor, null, emitter],
    [plate_f, metaitem('fluid_hatch.export.mv'), plate_f]]
)

// P2P Tunnel
crafting.removeByOutput(item('appliedenergistics2:part', 460))
crafting.addShaped(item('appliedenergistics2:part', 460),
    [[null, ore('plateStainlessSteel'), null],
     [ore('plateStainlessSteel'), ic, ore('plateStainlessSteel')],
     [ore('crystalFluix'), ore('circuitMv'), ore('crystalFluix')]]
)

// Card bio
crafting.removeByOutput(item('appliedenergistics2:biometric_card'))
crafting.addShapeless(item('appliedenergistics2:biometric_card'),
    [metaitem('circuit_board.plastic'), metaitem('sensor.hv')])

// Memory card
crafting.removeByOutput(item('appliedenergistics2:memory_card'))
crafting.addShapeless(item('appliedenergistics2:memory_card'),
    [metaitem('circuit_board.plastic'), ram])

// Basic card
crafting.removeByOutput(item('appliedenergistics2:material', 25))
crafting.addShapeless(item('appliedenergistics2:material', 25), [metaitem('circuit_board.plastic')])

// Advanced card
crafting.removeByOutput(item('appliedenergistics2:material', 28))
crafting.addShapeless(item('appliedenergistics2:material', 28), [metaitem('circuit_board.advanced')])

// Matter Condenser
crafting.removeByOutput(item('appliedenergistics2:condenser'))
crafting.addShaped(item('appliedenergistics2:condenser'),
    [[ore('plateTitanium'), ore('plateTitanium'), ore('plateTitanium')],
     [ore('plateTitanium'), metaitem('quantumstar'), ore('plateTitanium')],
     [ore('plateTitanium'), ore('plateTitanium'), ore('plateTitanium')]])

// Wireless Part
crafting.removeByOutput(item('appliedenergistics2:material', 41))
crafting.addShaped(item('appliedenergistics2:material', 41),
    [[null, metaitem('emitter.hv'), null],
     [ore('plateTitanium'), item('appliedenergistics2:material', 9), ore('plateTitanium')],
     [null, ore('plateTitanium'), null]]
)

// Level Emitters
crafting.removeByOutput(item('appliedenergistics2:part', 280))
crafting.addShapeless(item('appliedenergistics2:part', 280),
    [item('minecraft:redstone_torch'), cpu, plate])
crafting.removeByOutput(item('appliedenergistics2:part', 281))
crafting.addShapeless(item('appliedenergistics2:part', 281),
    [item('minecraft:redstone_torch'), cpu, plate_f])

// Energy Acceptor
crafting.removeByOutput(item('appliedenergistics2:energy_acceptor'))
crafting.addShaped(item('appliedenergistics2:energy_acceptor'),
    [[plate, ore('circuitMv'), plate],
    [ore('crystalFluix'), metaitem('hull.mv'), ore('crystalFluix')],
    [plate, ore('batteryMv'), plate]])

// Storage Housing
crafting.removeByOutput(item('appliedenergistics2:material', 39))
crafting.addShaped(item('appliedenergistics2:material', 39),
    [[ore('wireFineRedAlloy'), plate, ore('wireFineRedAlloy')],
     [plate, null, plate],
     [ore('wireFineRedAlloy'), plate, ore('wireFineRedAlloy')]])

// Illuminated Panel
crafting.remove("appliedenergistics2:network/parts/panels_semi_dark_monitor")
crafting.addShaped(item('appliedenergistics2:part', 180),
    [[item('appliedenergistics2:quartz_glass'), item('appliedenergistics2:quartz_glass'), item('appliedenergistics2:quartz_glass')],
    [ore('crystalFluix'), ore('crystalFluix'), ore('crystalFluix')],
    [plate, ore('circuitMv'), plate]])

// Charger
crafting.removeByOutput(item('appliedenergistics2:charger'))
crafting.addShaped(item('appliedenergistics2:charger'),
    [[plate, ore('crystalCertusQuartz'), plate],
    [ore('circuitMv'), null, null],
    [plate, ore('crystalCertusQuartz'), plate]])

// ME Chest
crafting.removeByOutput(item('appliedenergistics2:chest'))
crafting.addShaped(item('appliedenergistics2:chest'),
    [[plate, item('appliedenergistics2:part', 380), plate],
    [ore('crystalFluix'), null, ore('crystalFluix')],
    [plate, ore('circuitMv'), plate]])

// Pattern Terminal
crafting.removeByOutput(item('appliedenergistics2:part', 340))
crafting.addShapeless(item('appliedenergistics2:part', 340), [ic, item('appliedenergistics2:part', 360)])

// Crafting Terminal
crafting.removeByOutput(item('appliedenergistics2:part', 360))
crafting.addShapeless(item('appliedenergistics2:part', 360), [cpu, item('appliedenergistics2:part', 380), metaitem('workbench')])

// ME Terminal
crafting.removeByOutput(item('appliedenergistics2:part', 380))
crafting.addShapeless(item('appliedenergistics2:part', 380), [ram, sensor, emitter, item('appliedenergistics2:part', 180)])

// Extended Pattern Terminal
crafting.removeByOutput(item('appliedenergistics2:part', 341))
crafting.addShaped(item('appliedenergistics2:part', 341),
    [[cpu, null, cpu],
    [item('appliedenergistics2:part',340),ore('crystalFluix'),item('appliedenergistics2:part',340)],
    [cpu,null,cpu]])

// Interface Terminal
crafting.remove('appliedenergistics2:network/parts/terminals_interface')
crafting.addShapeless(item('appliedenergistics2:part', 480),
    [item('appliedenergistics2:part', 180),ic,item('appliedenergistics2:interface')])

// Quantum Ring
crafting.removeByOutput(item('appliedenergistics2:quantum_ring'))
crafting.addShaped(item('appliedenergistics2:quantum_ring'),
    [[ore('plateStainlessSteel'), cpu, ore('plateStainlessSteel')],
    [ic, metaitem('quantumstar'), ic],
    [ore('plateStainlessSteel'), cpu, ore('plateStainlessSteel')]])


// Crystal Growth Accelerator
crafting.removeByOutput(item('appliedenergistics2:quartz_growth_accelerator'))
crafting.addShaped(item('appliedenergistics2:quartz_growth_accelerator'),
    [[plate, item('appliedenergistics2:part', 16), plate],
    [item('appliedenergistics2:quartz_glass'), item('appliedenergistics2:fluix_block'),item('appliedenergistics2:quartz_glass')],
    [plate, item('appliedenergistics2:part', 16), plate]])

// Network Tool
crafting.removeByOutput(item('appliedenergistics2:network_tool'))
crafting.addShapeless(item('appliedenergistics2:network_tool'),
    [item('appliedenergistics2:part', 180), ore('chest'), ore('itemQuartzWrench'), cpu])

// Dense Energy Cell
crafting.removeByOutput(item('appliedenergistics2:dense_energy_cell'))
crafting.addShaped(item('appliedenergistics2:dense_energy_cell'),
    [[item('appliedenergistics2:energy_cell'), item('appliedenergistics2:energy_cell'), item('appliedenergistics2:energy_cell')],
    [item('appliedenergistics2:energy_cell'), cpu, item('appliedenergistics2:energy_cell')],
    [item('appliedenergistics2:energy_cell'), item('appliedenergistics2:energy_cell'),item('appliedenergistics2:energy_cell') ]])

// Cell Workbench
crafting.removeByOutput(item('appliedenergistics2:cell_workbench'))
crafting.addShaped(item('appliedenergistics2:cell_workbench'),
    [[ore('wool'), cpu, ore('wool')],
    [plate, ore('chest'), plate],
    [plate, plate, plate]])

// Pattern Encoder
crafting.removeByOutput(item('ae2stuff:encoder'))
crafting.addShapeless(item('ae2stuff:encoder'), [ore('workbench'), ore('itemIlluminatedPanel'), cpu])

// Wireless Access Point
crafting.removeByOutput(item('appliedenergistics2:wireless_access_point'))
crafting.addShaped(item('appliedenergistics2:wireless_access_point'),
    [[item('appliedenergistics2:material', 41)],
    [cpu],
    [item('appliedenergistics2:part', 16)]])

// ME Beam former
crafting.removeByOutput(item('nae2:part', 0))
crafting.addShaped(item('nae2:part', 0) * 2,
    [[ore('dustGlowstone'), item('appliedenergistics2:material', 41), ore('dustGlowstone')],
    [item('appliedenergistics2:quartz_glass'),cpu,item('appliedenergistics2:quartz_glass')],
    [null, item('appliedenergistics2:part', 16), null]])

// Hyper-Acceleration Card
crafting.removeByOutput(item('nae2:upgrade'))
crafting.addShaped(item('nae2:upgrade'),
    [[ore('platePlastic'),cpu,ore('platePlastic')],
    [item('appliedenergistics2:material', 30),item('appliedenergistics2:material', 47),item('appliedenergistics2:material', 30)],
    [ore('platePlastic'),item('appliedenergistics2:material', 30), ore('platePlastic')]])

// 4x Co-Processor
crafting.removeByOutput(item('nae2:coprocessor_4x'))
crafting.addShaped(item('nae2:coprocessor_4x'),
    [[ore('dustFluix'), cpu, ore('dustFluix')],
    [item('appliedenergistics2:crafting_accelerator'), item('appliedenergistics2:material', 36), item('appliedenergistics2:crafting_accelerator')],
    [ore('dustFluix'), item('appliedenergistics2:crafting_accelerator'), ore('dustFluix')]])

// 16x Co-Processor
crafting.removeByOutput(item('nae2:coprocessor_16x'))
crafting.addShaped(item('nae2:coprocessor_16x'),
    [[ore('dustFluix'), cpu, ore('dustFluix')],
    [item('nae2:coprocessor_4x'), item('appliedenergistics2:material', 37), item('nae2:coprocessor_4x')],
    [ore('dustFluix'), item('nae2:coprocessor_4x'), ore('dustFluix')]])

// 64x Co-Processor
crafting.removeByOutput(item('nae2:coprocessor_64x'))
crafting.addShaped(item('nae2:coprocessor_64x'),
    [[ore('dustFluix'), cpu, ore('dustFluix')],
    [item('nae2:coprocessor_16x'), item('appliedenergistics2:material', 38), item('nae2:coprocessor_16x')],
    [ore('dustFluix'), item('nae2:coprocessor_16x'), ore('dustFluix')]])

// ME IO Port
crafting.removeByOutput(item('appliedenergistics2:io_port'))
crafting.addShaped(item('appliedenergistics2:io_port'),
    [[ore('blockGlass'), ore('blockGlass'), ore('blockGlass')],
    [item('appliedenergistics2:drive'), item('appliedenergistics2:part', 16), item('appliedenergistics2:drive')],
    [plate, ram, plate]])

// Entropy Manipulator
crafting.removeByOutput(item('appliedenergistics2:entropy_manipulator'))
crafting.addShaped(item('appliedenergistics2:entropy_manipulator'),
    [[ore('crystalFluix'), item('appliedenergistics2:energy_cell'), null],
    [ic, ore('stickAluminium'),null],
    [null, null, ore('stickAluminium')]])

// Crafting Co-Processor
crafting.removeByOutput(item('appliedenergistics2:crafting_accelerator'))
crafting.addShapeless(item('appliedenergistics2:crafting_accelerator'),
    [ic, item('appliedenergistics2:crafting_unit')])
    
// ME Controller
crafting.removeByOutput(item('appliedenergistics2:controller'))
assembler.recipeBuilder()
    .inputs(
        metaitem('hull.hv'),
        ore('crystalPureFluix') * 4,
        ic * 4,
        ore('circuitHv') * 2
    )
    .outputs(item('appliedenergistics2:controller'))
    .EUt(480)
    .duration(300)
    .buildAndRegister()

// Spatial IO-Port
crafting.removeByOutput(item('appliedenergistics2:spatial_io_port'))
crafting.addShaped(item('appliedenergistics2:spatial_io_port'),
    [[ore('blockGlass'), ore('blockGlass'), ore('blockGlass')],
    [item('appliedenergistics2:part', 16), item('appliedenergistics2:io_port'), item('appliedenergistics2:part', 16)],
    [plate, ic, plate]])

// Security Terminal
crafting.removeByOutput(item('appliedenergistics2:security_station'))
crafting.addShaped(item('appliedenergistics2:security_station'),
    [[plate, item('appliedenergistics2:chest'), plate],
    [item('appliedenergistics2:part', 16), item('appliedenergistics2:material', 37), item('appliedenergistics2:part', 16)],
    [plate,  ic, plate]])

// AE2S: Network Visualisation Tool
crafting.removeByOutput(item('ae2stuff:visualiser'))
crafting.addShaped(item('ae2stuff:visualiser'),
    [[item('appliedenergistics2:material', 41), null, item('appliedenergistics2:material', 41)],
    [ic, ore('itemIlluminatedPanel'), ic],
    [ore('crystalPureFluix'), ore('crystalPureFluix'), ore('crystalPureFluix')]])

// AE2S: Wireless Setup Kit
crafting.removeByOutput(item('ae2stuff:wireless_kit'))
crafting.addShapeless(item('ae2stuff:wireless_kit'),
    [ic, item('appliedenergistics2:material', 41), item('appliedenergistics2:network_tool')])

// AE2S: Wireless connector
crafting.removeByOutput(item('ae2stuff:wireless'))
crafting.addShaped(
    item('ae2stuff:wireless'),
    [[ore('crystalPureFluix'), ic, ore('crystalPureFluix')],
     [plate, item('appliedenergistics2:material', 41), plate],
     [ore('crystalPureFluix'), ore('circuitHv'), ore('crystalPureFluix')]])

// NAE2: Pattern Multitool
crafting.removeByOutput(item('nae2:pattern_multiplier'))
crafting.addShapeless(item('nae2:pattern_multiplier'),
    [ic, ore('itemIlluminatedPanel'), item('appliedenergistics2:material', 52)])

// NAE2: Reconstruction Chamber
crafting.removeByOutput(item('nae2:reconstruction_chamber'))
crafting.addShaped(
    item('nae2:reconstruction_chamber'),
    [[plate, item('appliedenergistics2:quartz_glass'), plate],
     [item('appliedenergistics2:quartz_glass'), item('actuallyadditions:block_misc', 9), item('appliedenergistics2:quartz_glass')],
     [plate, item('appliedenergistics2:quartz_glass'), plate]]
)

// AE2S: Adv. Inscriber
crafting.removeByOutput(item('ae2stuff:inscriber'))

// Conversion monitor
crafting.removeByOutput(item('appliedenergistics2:part', 420))
crafting.addShapeless(item('appliedenergistics2:part', 420),
    [emitter, item('appliedenergistics2:part', 400), sensor])

// Matter Cannon
crafting.removeByOutput(item('appliedenergistics2:matter_cannon'))
crafting.addShaped(item('appliedenergistics2:matter_cannon'),
    [[plate, plate, emitter],
    [item('appliedenergistics2:material', 36), item('appliedenergistics2:energy_cell'), null],
    [plate, null, null]])

// Colour applicator
crafting.removeByOutput(item('appliedenergistics2:color_applicator'))
crafting.addShaped(item('appliedenergistics2:color_applicator'),
    [[emitter, ore('stickAluminium'), null],
    [ore('stickAluminium'), item('appliedenergistics2:material', 36), null],
    [null, null, item('appliedenergistics2:energy_cell')]])

// Void Storage Component
crafting.removeByOutput(item('nae2:material', 0))
crafting.addShaped(item('nae2:material', 0),
    [[sensor, item('appliedenergistics2:material', 35), sensor]])

// Remove formation and anihilation cores
crafting.removeByOutput(item('appliedenergistics2:material', 43))
crafting.removeByOutput(item('appliedenergistics2:material', 44))

///// Storage componants:
// Remove crafting the housing around the component
crafting.remove('appliedenergistics2:network/cells/storage_cell_1k')
crafting.remove('appliedenergistics2:network/cells/storage_cell_4k')
crafting.remove('appliedenergistics2:network/cells/storage_cell_16k')
crafting.remove('appliedenergistics2:network/cells/storage_cell_64k')
crafting.remove('appliedenergistics2:network/cells/fluid_storage_cell_1k')
crafting.remove('appliedenergistics2:network/cells/fluid_storage_cell_4k')
crafting.remove('appliedenergistics2:network/cells/fluid_storage_cell_16k')
crafting.remove('appliedenergistics2:network/cells/fluid_storage_cell_64k')
crafting.remove('appliedenergistics2:network/cells/spatial_storage_cell_2_cubed')
crafting.remove('appliedenergistics2:network/cells/spatial_storage_cell_16_cubed')
crafting.remove('appliedenergistics2:network/cells/spatial_storage_cell_128_cubed')
crafting.remove('appliedenergistics2:network/cells/view_cell')

def circuit_assembler_changes = [
    // Items
    35: [120,  [ore('wireFineRedAlloy') * 4, ram * 4, ore('circuitMv'), metaitem('super_chest.lv') ]],
    36: [480,  [ore('wireFineSilver') * 4, item('appliedenergistics2:material', 35) * 3, ore('circuitHv'), ram * 4]],
    37: [1920, [ore('wireFineCopper') * 4, item('appliedenergistics2:material', 36) * 3, ore('circuitEv'), metaitem('tool.datastick') * 4]], 
    38: [7680, [ore('wireFineElectrum') * 4, item('appliedenergistics2:material', 37) * 3, ore('circuitIv'), metaitem('tool.datastick') * 4]],
    // Fluids
    54: [120,  [ore('wireFineRedAlloy') * 4, ram * 4, ore('circuitMv'), metaitem('super_tank.lv')]],
    55: [480,  [ore('wireFineSilver') * 4, item('appliedenergistics2:material', 54) * 3, ore('circuitHv'), ram * 4]],
    56: [1920, [ore('wireFineCopper') * 4, item('appliedenergistics2:material', 55) * 3, ore('circuitEv'), metaitem('tool.datastick') * 4]], 
    57: [7680, [ore('wireFineElectrum') * 4, item('appliedenergistics2:material', 56) * 3, ore('circuitIv'), metaitem('tool.datastick') * 4]],
    // Spacial
    32: [120, [ore('wireFineRedAlloy') * 4, ram * 4, ore('circuitMv'), metaitem('field.generator.mv')]],
    33: [480, [ore('wireFineSilver') * 4, item('appliedenergistics2:material', 32) * 3, ore('circuitHv'), metaitem('tool.datastick') * 4]],
    34: [1920, [ore('wireFineCopper') * 4, item('appliedenergistics2:material', 33) * 3, ore('circuitEv'), metaitem('tool.datastick') * 4]]
]

circuit_assembler_changes.each { metaid, inputs ->
    crafting.removeByOutput(item('appliedenergistics2:material', metaid))
    recipemap('circuit_assembler').recipeBuilder()
        .inputs(inputs[1])
        .fluidInputs(fluid('tin') * 288)
        .outputs(item('appliedenergistics2:material', metaid))
        .EUt(inputs[0])
        .duration(300)
        .buildAndRegister()
    recipemap('circuit_assembler').recipeBuilder()
        .inputs(inputs[1])
        .fluidInputs(fluid('soldering_alloy') * 144)
        .outputs(item('appliedenergistics2:material', metaid))
        .EUt(inputs[0])
        .duration(300)
        .buildAndRegister()
}

// Advanced item storage
crafting.removeByOutput(item('nae2:material', 1))
assembly_line.recipeBuilder()
    .inputs(
        ore('wireFineNiobiumTitanium') * 8,
        item('appliedenergistics2:material', 38) * 3,
        ore('circuitLuv') * 2,
        metaitem('tool.dataorb') * 4
    )
    .fluidInputs(fluid('soldering_alloy') * 288)
    .outputs(item('nae2:material', 1))
    .stationResearch(b ->
        b.researchStack(item('appliedenergistics2:material', 38))
            .CWUt(4, 64000)
            .EUt(24000)
    )
    .duration(300)
    .EUt(24000)
    .buildAndRegister()

crafting.removeByOutput(item('nae2:material', 2))
assembly_line.recipeBuilder()
    .inputs(
        ore('wireFineYttriumBariumCuprate') * 8,
        item('nae2:material', 1) * 3,
        ore('circuitZpm') * 2,
        metaitem('tool.dataorb') * 4
    )
    .fluidInputs(fluid('soldering_alloy') * 288)
    .outputs(item('nae2:material', 2))
    .stationResearch(b ->
        b.researchStack(item('nae2:material', 1))
            .CWUt(16, 256000)
            .EUt(96000)
    )
    .duration(300)
    .EUt(96000)
    .buildAndRegister()

crafting.removeByOutput(item('nae2:material', 3))
assembly_line.recipeBuilder()
    .inputs(
        ore('wireFineDarkmatteralloy') * 8,
        item('nae2:material', 2) * 3,
        ore('circuitUv') * 2,
        metaitem('tool.datamodule') * 4
    )
    .fluidInputs(fluid('americium') * 288)
    .outputs(item('nae2:material', 3))
    .stationResearch(b ->
        b.researchStack(item('nae2:material', 2))
            .CWUt(64, 1024000)
            .EUt(384000)
    )
    .duration(300)
    .EUt(384000)
    .buildAndRegister()

crafting.removeByOutput(item('nae2:material', 4))
assembly_line.recipeBuilder()
    .inputs(
        ore('wireFineEuropium') * 8,
        item('nae2:material', 3) * 3,
        ore('circuitUhv') * 2,
        metaitem('circuit.sophia_data_base') * 4
    )
    .fluidInputs(fluid('wakfu') * 288)
    .outputs(item('nae2:material', 4))
    .stationResearch(b ->
        b.researchStack(item('nae2:material', 3))
            .CWUt(256, 4096000)
            .EUt(1536000)
    )
    .duration(300)
    .EUt(1536000)
    .buildAndRegister()


// Advanced fluid storage
crafting.removeByOutput(item('nae2:material', 5))
assembly_line.recipeBuilder()
    .inputs(
        ore('wireFineNiobiumTitanium') * 8,
        item('appliedenergistics2:material', 57) * 3,
        ore('circuitLuv') * 2,
        metaitem('tool.dataorb') * 4
    )
    .fluidInputs(fluid('soldering_alloy') * 288)
    .outputs(item('nae2:material', 5))
    .stationResearch(b ->
        b.researchStack(item('appliedenergistics2:material', 57))
            .CWUt(4, 64000)
            .EUt(24000)
    )
    .duration(300)
    .EUt(24000)
    .buildAndRegister()

crafting.removeByOutput(item('nae2:material', 6))
assembly_line.recipeBuilder()
    .inputs(
        ore('wireFineYttriumBariumCuprate') * 8,
        item('nae2:material', 5) * 3,
        ore('circuitZpm') * 2,
        metaitem('tool.dataorb') * 4
    )
    .fluidInputs(fluid('soldering_alloy') * 288)
    .outputs(item('nae2:material', 6))
    .stationResearch(b ->
        b.researchStack(item('nae2:material', 5))
            .CWUt(16, 256000)
            .EUt(96000)
    )
    .duration(300)
    .EUt(96000)
    .buildAndRegister()

crafting.removeByOutput(item('nae2:material', 7))
assembly_line.recipeBuilder()
    .inputs(
        ore('wireFineDarkmatteralloy') * 8,
        item('nae2:material', 6) * 3,
        ore('circuitUv') * 2,
        metaitem('tool.datamodule') * 4
    )
    .fluidInputs(fluid('americium') * 288)
    .outputs(item('nae2:material', 7))
    .stationResearch(b ->
        b.researchStack(item('nae2:material', 6))
            .CWUt(64, 1024000)
            .EUt(384000)
    )
    .duration(300)
    .EUt(384000)
    .buildAndRegister()

crafting.removeByOutput(item('nae2:material', 8))
assembly_line.recipeBuilder()
    .inputs(
        ore('wireFineEuropium') * 8,
        item('nae2:material', 7) * 3,
        ore('circuitUhv') * 2,
        metaitem('circuit.sophia_data_base') * 4
    )
    .fluidInputs(fluid('wakfu') * 288)
    .outputs(item('nae2:material', 8))
    .stationResearch(b ->
        b.researchStack(item('nae2:material', 7))
            .CWUt(256, 4096000)
            .EUt(1536000)
    )
    .duration(300)
    .EUt(1536000)
    .buildAndRegister()

// Gregify Fluix Pearl
crafting.removeByOutput(item('appliedenergistics2:material', 9))
alloy_smelter.recipeBuilder()
    .inputs(
        metaitem('quantumeye') * 1,
        ore('dustFluix') * 8
    )
    .outputs(item('appliedenergistics2:material', 9))
    .EUt(120)
    .duration(300)
    .buildAndRegister()

// Add a way to mass-produce
macerator.recipeBuilder()
    .inputs(ore('crystalFluix'))
    .outputs(item('appliedenergistics2:material', 8))
    .EUt(2)
    .duration(20)
    .buildAndRegister()

// Add a way to autoclave pure crystals
autoclave.recipeBuilder()
    .inputs(item('appliedenergistics2:crystal_seed', 0))
    .fluidInputs(fluid('water') * 1000)
    .outputs(item('appliedenergistics2:material', 10))
    .EUt(120)
    .duration(900)
    .buildAndRegister()

autoclave.recipeBuilder()
    .inputs(item('appliedenergistics2:crystal_seed', 600))
    .fluidInputs(fluid('water') * 1000)
    .outputs(item('appliedenergistics2:material', 11))
    .EUt(120)
    .duration(900)
    .buildAndRegister()

autoclave.recipeBuilder()
    .inputs(item('appliedenergistics2:crystal_seed', 1200))
    .fluidInputs(fluid('water') * 1000)
    .outputs(item('appliedenergistics2:material', 12))
    .EUt(120)
    .duration(900)
    .buildAndRegister()

autoclave.recipeBuilder()
    .inputs(ore('gemNetherQuartz') * 2, ore('dustRedstone'))
    .fluidInputs(fluid('water') * 1000)
    .outputs(item('appliedenergistics2:material', 7) * 2)
    .EUt(30)
    .duration(600)
    .buildAndRegister()

// Make Silicon craftable with GT dust
furnace.add(metaitem('dustNetherQuartz'), item('appliedenergistics2:material', 5))
furnace.add(metaitem('dustCertusQuartz'), item('appliedenergistics2:material', 5))

// Sky Stone
rock_breaker.recipeBuilder()
    .notConsumable(item('appliedenergistics2:sky_stone_block'))
    .outputs(item('appliedenergistics2:sky_stone_block'))
    .EUt(12)
    .duration(16)
    .buildAndRegister()

// Wireless booster
crafting.removeByOutput(item('appliedenergistics2:material', 42))
crafting.addShaped(
    item('appliedenergistics2:material', 42) * 2,
    [[ore('dustFluix'), ore('crystalCertusQuartz'), ore('dustEnderPearl')],
     [plate, plate, plate]])

// Ordict storage bus
crafting.removeByOutput(item('appliedenergistics2:part', 222))
crafting.addShapeless(
    item('appliedenergistics2:part', 222),
    [item('appliedenergistics2:part', 220), metaitem('ore_dictionary_filter')])

