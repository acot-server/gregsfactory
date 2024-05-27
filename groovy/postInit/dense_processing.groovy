import gregtech.*

def dist_tw = recipemap('distillation_tower')
def centrifuge = recipemap('centrifuge')
def gas_collector = recipemap('gas_collector')

dist_tw.recipeBuilder()
    .fluidInputs(
        fluid('basicmixedalloy') * 1440
    )
    .fluidOutputs(
        fluid('iron') * 144,
        fluid('copper') * 144,
        fluid('tin') * 144,
        fluid('gold') * 144,
        fluid('lead') * 144,
        fluid('silver') * 144,
        fluid('nickel') * 144,
        fluid('zinc') * 144,
        fluid('manganese') * 144,
        fluid('chrome') * 144
    )
    .outputs(item('gregtech:meta_dust_tiny', 113) * 1)
    .EUt(512)
    .duration(400)
    .buildAndRegister();

dist_tw.recipeBuilder()
    .fluidInputs( 
        fluid('moderatemixedalloy')* 5184
        )
    .fluidOutputs(
        fluid('alkalinegroup') * 1152,
        fluid('alkalineearth') * 1152,
        fluid('iron') * 288,
        fluid('copper') * 288,
        fluid('tin') * 288,
        fluid('gold') * 288,
        fluid('lead') * 288,
        fluid('silver') * 288,
        fluid('nickel') * 288,
        fluid('zinc') * 288,
        fluid('manganese') * 288,
        fluid('chrome') * 288
    )
    .outputs(item('gregtech:meta_dust_tiny', 115) * 1)
    .EUt(2048)
    .duration(800)
    .buildAndRegister();

centrifuge.recipeBuilder()
    .fluidInputs(
        fluid('alkalinegroup') * 576
    )
    .outputs(
        item('gregtech:meta_dust', 56) * 1,
        item('gregtech:meta_dust', 101) * 1,
        item('gregtech:meta_dust', 83) * 1,
        item('gregtech:meta_dust', 15) * 1
    )
    .EUt(1024)
    .duration(300)
    .buildAndRegister();

centrifuge.recipeBuilder()
    .fluidInputs(
        fluid('alkalineearth') * 576
        )
    .outputs(
        item('gregtech:meta_dust', 10) * 1,
        item('gregtech:meta_dust', 59) * 1,
        item('gregtech:meta_dust', 16) * 1,
        item('gregtech:meta_dust', 8) * 1
    )
    .EUt(1024)
    .duration(300)
    .buildAndRegister();

dist_tw.recipeBuilder()
    .fluidInputs(
        fluid('tranmetgpone') * 1152
        )
    .fluidOutputs(
        fluid('titanium') * 144,
        fluid('vanadium') * 144,
        fluid('chrome') * 144,
        fluid('manganese') * 144,
        fluid('iron') * 144,
        fluid('cobalt') * 144,
        fluid('nickel') * 144,
        fluid('copper') * 144
    )
    .EUt(2048)
    .duration(300)
    .buildAndRegister();

dist_tw.recipeBuilder()
    .fluidInputs(
        fluid('tranmetgptwo') * 1008
        )
    .fluidOutputs(
        fluid('yttrium') * 144,
        fluid('niobium') * 144,
        fluid('molybdenum') * 144,
        fluid('ruthenium') * 144,
        fluid('rhodium') * 144,
        fluid('palladium') * 144,
        fluid('silver') * 144
    )
    .EUt(2048)
    .duration(300)
    .buildAndRegister();

dist_tw.recipeBuilder()
    .fluidInputs(
        fluid('transmetgthree') * 864
        )
    .fluidOutputs(
        fluid('tantalum') * 144,
        fluid('tungsten') * 144,
        fluid('osmium') * 144,
        fluid('iridium') * 144,
        fluid('platinum') * 144,
        fluid('gold') * 144
    )
    .EUt(2048)
    .duration(300)
    .buildAndRegister();

dist_tw.recipeBuilder()
    .fluidInputs(
        fluid('lanthanide') * 576
        )
    .fluidOutputs(
        fluid('cerium') * 144,
        fluid('neodymium') * 144,
        fluid('samarium') * 144,
        fluid('lutetium') * 144
    )
    .EUt(8192)
    .duration(300)
    .buildAndRegister();

dist_tw.recipeBuilder()
    .fluidInputs(
        fluid('actinide') * 864
        )
    .fluidOutputs(
        fluid('thorium') * 144,
        fluid('uranium') * 144,
        fluid('plutonium') * 144,
        fluid('naquadah') * 144,
        fluid('naquadah_enriched') * 144,
        fluid('trinium') * 144
    )
    .EUt(524288)
    .duration(1200)
    .buildAndRegister();

dist_tw.recipeBuilder()
    .fluidInputs(
        fluid('poormetal') * 1296
        )
    .fluidOutputs(
        fluid('aluminium') * 144,
        fluid('zinc') * 144,
        fluid('gallium') * 144,
        fluid('indium') * 144,
        fluid('tin') * 144,
        fluid('mercury') * 144,
        fluid('lead') * 144,
        fluid('bismuth') * 144
    )
    .outputs(item('gregtech:meta_dust',19) * 1)
    .EUt(2048)
    .duration(450)
    .buildAndRegister();


dist_tw.recipeBuilder()
    .fluidInputs(
        fluid('othmetals') * 720
        )
    .fluidOutputs(
        fluid('carbon') * 144,
        fluid('silicon') * 144,
        fluid('arsenic') * 144,
        fluid('antimony') * 144
    )
    .outputs(item('gregtech:meta_dust',78) * 1)
    .EUt(2048)
    .duration(450)
    .buildAndRegister();

dist_tw.recipeBuilder()
    .fluidInputs(
        fluid('nblgas') * 60000
        )
    .fluidOutputs(
        fluid('helium') * 10000,
        fluid('neon') * 10000,
        fluid('argon') * 10000,
        fluid('krypton') * 10000,
        fluid('xenon') * 10000,
        fluid('radon') * 10000
    )
    .EUt(65536)
    .duration(200)
    .buildAndRegister();

gas_collector.recipeBuilder()
    .circuitMeta(4)
    .property("dimension", 0)
    .fluidOutputs(fluid('nblgas') * 30000)
    .EUt(131072)
    .duration(100)
    .buildAndRegister();

dist_tw.recipeBuilder()
    .fluidInputs(
        fluid('comgas') * 50000
        )
    .fluidOutputs(
        fluid('hydrogen') * 10000,
        fluid('nitrogen') * 10000,
        fluid('oxygen') * 10000,
        fluid('fluorine') * 10000,
        fluid('chlorine') * 10000
        )
    .outputs(item('gregtech:meta_dust',103) * 4)
    .EUt(65536)
    .duration(200)
    .buildAndRegister();

gas_collector.recipeBuilder()
    .circuitMeta(5)
    .property("dimension", 0)
    .fluidOutputs(fluid('comgas') * 25000)
    .EUt(131072)
    .duration(100)
    .buildAndRegister();

dist_tw.recipeBuilder()
    .fluidInputs(
        fluid('densemixedalloy') * 7632
        )
    .fluidOutputs(
        fluid('alkalinegroup') * 576,
        fluid('alkalineearth') * 576,
        fluid('tranmetgpone') * 1152,
        fluid('tranmetgptwo') * 1008,
        fluid('transmetgthree') * 864,
        fluid('lanthanide') * 576,
        fluid('actinide') * 864,
        fluid('poormetal') * 1296,
        fluid('othmetals') * 720
    )
    .outputs(item('gregtech:meta_dust',128) * 2)
    .EUt(524288)
    .duration(1500)
    .buildAndRegister();


