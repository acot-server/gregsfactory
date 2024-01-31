import crafttweaker.item.IIngredient;
import mods.gregtech.recipe.RecipeMap;
import crafttweaker.item.IItemStack;

//Basic Mixed Metal Processing

//Distillery Processing, inefficient
distillery.recipeBuilder()
    .circuit(1)
    .fluidInputs(<liquid:basicmixedalloy> * 1440)
    .fluidOutputs(<liquid:iron> * 144)
    .EUt(32)
    .duration(200)
    .buildAndRegister();

distillery.recipeBuilder()
    .circuit(2)
    .fluidInputs(<liquid:basicmixedalloy> * 1440)
    .fluidOutputs(<liquid:copper> * 144)
    .EUt(32)
    .duration(200)
    .buildAndRegister();

distillery.recipeBuilder()
    .circuit(3)
    .fluidInputs(<liquid:basicmixedalloy> * 1440)
    .fluidOutputs(<liquid:tin> * 144)
    .EUt(32)
    .duration(200)
    .buildAndRegister();

distillery.recipeBuilder()
    .circuit(4)
    .fluidInputs(<liquid:basicmixedalloy> * 1440)
    .fluidOutputs(<liquid:gold> * 144)
    .EUt(32)
    .duration(200)
    .buildAndRegister();

distillery.recipeBuilder()
    .circuit(5)
    .fluidInputs(<liquid:basicmixedalloy> * 1440)
    .fluidOutputs(<liquid:lead> * 144)
    .EUt(32)
    .duration(200)
    .buildAndRegister();

distillery.recipeBuilder()
    .circuit(6)
    .fluidInputs(<liquid:basicmixedalloy> * 1440)
    .fluidOutputs(<liquid:silver> * 144)
    .EUt(32)
    .duration(200)
    .buildAndRegister();

distillery.recipeBuilder()
    .circuit(7)
    .fluidInputs(<liquid:basicmixedalloy> * 1440)
    .fluidOutputs(<liquid:nickel> * 144)
    .EUt(32)
    .duration(200)
    .buildAndRegister();

distillery.recipeBuilder()
    .circuit(8)
    .fluidInputs(<liquid:basicmixedalloy> * 1440)
    .fluidOutputs(<liquid:zinc> * 144)
    .EUt(32)
    .duration(200)
    .buildAndRegister();

distillery.recipeBuilder()
    .circuit(9)
    .fluidInputs(<liquid:basicmixedalloy> * 1440)
    .fluidOutputs(<liquid:manganese> * 144)
    .EUt(32)
    .duration(200)
    .buildAndRegister();

distillery.recipeBuilder()
    .circuit(10)
    .fluidInputs(<liquid:basicmixedalloy> * 1440)
    .fluidOutputs(<liquid:chrome> * 144)
    .EUt(32)
    .duration(200)
    .buildAndRegister();

//Distillation Tower Processing, High efficiency

distillation_tower.recipeBuilder()
    .fluidInputs(<liquid:basicmixedalloy> * 1440)
    .fluidOutputs([
        <liquid:iron> * 144,
        <liquid:copper> * 144,
        <liquid:tin> * 144,
        <liquid:gold> * 144,
        <liquid:lead> * 144,
        <liquid:silver> * 144,
        <liquid:nickel> * 144,
        <liquid:zinc> * 144,
        <liquid:manganese> * 144,
        <liquid:chrome> * 144
    ])
    .outputs(<gregtech:meta_dust_tiny:113> * 1)
    .EUt(512)
    .duration(400)
    .buildAndRegister();

//Medieum

//Distillery Processing, inefficient
distillery.recipeBuilder()
    .circuit(1)
    .fluidInputs(<liquid:moderatemixedalloy> * 1440)
    .fluidOutputs(<liquid:iron> * 288)
    .EUt(128)
    .duration(400)
    .buildAndRegister();

distillery.recipeBuilder()
    .circuit(2)
    .fluidInputs(<liquid:moderatemixedalloy> * 1440)
    .fluidOutputs(<liquid:copper> * 288)
    .EUt(128)
    .duration(400)
    .buildAndRegister();

distillery.recipeBuilder()
    .circuit(3)
    .fluidInputs(<liquid:moderatemixedalloy> * 1440)
    .fluidOutputs(<liquid:tin> * 288)
    .EUt(128)
    .duration(400)
    .buildAndRegister();

distillery.recipeBuilder()
    .circuit(4)
    .fluidInputs(<liquid:moderatemixedalloy> * 1440)
    .fluidOutputs(<liquid:gold> * 288)
    .EUt(128)
    .duration(400)
    .buildAndRegister();

distillery.recipeBuilder()
    .circuit(5)
    .fluidInputs(<liquid:moderatemixedalloy> * 1440)
    .fluidOutputs(<liquid:lead> * 288)
    .EUt(128)
    .duration(400)
    .buildAndRegister();

distillery.recipeBuilder()
    .circuit(6)
    .fluidInputs(<liquid:moderatemixedalloy> * 1440)
    .fluidOutputs(<liquid:silver> * 288)
    .EUt(128)
    .duration(400)
    .buildAndRegister();

distillery.recipeBuilder()
    .circuit(7)
    .fluidInputs(<liquid:moderatemixedalloy> * 1440)
    .fluidOutputs(<liquid:nickel> * 288)
    .EUt(128)
    .duration(400)
    .buildAndRegister();

distillery.recipeBuilder()
    .circuit(8)
    .fluidInputs(<liquid:moderatemixedalloy> * 1440)
    .fluidOutputs(<liquid:zinc> * 288)
    .EUt(128)
    .duration(400)
    .buildAndRegister();

distillery.recipeBuilder()
    .circuit(9)
    .fluidInputs(<liquid:moderatemixedalloy> * 1440)
    .fluidOutputs(<liquid:manganese> * 288)
    .EUt(128)
    .duration(400)
    .buildAndRegister();

distillery.recipeBuilder()
    .circuit(10)
    .fluidInputs(<liquid:moderatemixedalloy> * 1440)
    .fluidOutputs(<liquid:chrome> * 288)
    .EUt(128)
    .duration(400)
    .buildAndRegister();

distillation_tower.recipeBuilder()
    .fluidInputs(<liquid:moderatemixedalloy> * 5184)
    .fluidOutputs([
        <liquid:alkalinegroup> * 1152,
        <liquid:alkalineearth> * 1152,
        <liquid:iron> * 288,
        <liquid:copper> * 288,
        <liquid:tin> * 288,
        <liquid:gold> * 288,
        <liquid:lead> * 288,
        <liquid:silver> * 288,
        <liquid:nickel> * 288,
        <liquid:zinc> * 288,
        <liquid:manganese> * 288,
        <liquid:chrome> * 288
    ])
    .outputs(<gregtech:meta_dust_tiny:115> * 1)
    .EUt(2048)
    .duration(800)
    .buildAndRegister();

//Periodic Table Group

//Alkaline

centrifuge.recipeBuilder()
    .fluidInputs(<liquid:alkalinegroup> * 576)
    .outputs([
        <gregtech:meta_dust:56> * 1,
        <gregtech:meta_dust:101> * 1,
        <gregtech:meta_dust:83> * 1,
        <gregtech:meta_dust:15> * 1
    ])
    .EUt(1024)
    .duration(300)
    .buildAndRegister();

centrifuge.recipeBuilder()
    .fluidInputs(<liquid:alkalineearth> * 576)
    .outputs([
        <gregtech:meta_dust:10> * 1,
        <gregtech:meta_dust:59> * 1,
        <gregtech:meta_dust:16> * 1,
        <gregtech:meta_dust:8> * 1
    ])
    .EUt(1024)
    .duration(300)
    .buildAndRegister();

distillation_tower.recipeBuilder()
    .fluidInputs(<liquid:tranmetgpone> * 1152)
    .fluidOutputs([
        <liquid:titanium> * 144,
        <liquid:vanadium> * 144,
        <liquid:chrome> * 144,
        <liquid:manganese> * 144,
        <liquid:iron> * 144,
        <liquid:cobalt> * 144,
        <liquid:nickel> * 144,
        <liquid:copper> * 144
    ])
    .EUt(2048)
    .duration(300)
    .buildAndRegister();

distillation_tower.recipeBuilder()
    .fluidInputs(<liquid:tranmetgptwo> * 1008)
    .fluidOutputs([
        <liquid:yttrium> * 144,
        <liquid:niobium> * 144,
        <liquid:molybdenum> * 144,
        <liquid:ruthenium> * 144,
        <liquid:rhodium> * 144,
        <liquid:palladium> * 144,
        <liquid:silver> * 144
    ])
    .EUt(2048)
    .duration(300)
    .buildAndRegister();

distillation_tower.recipeBuilder()
    .fluidInputs(<liquid:transmetgthree> * 864)
    .fluidOutputs([
        <liquid:tantalum> * 144,
        <liquid:tungsten> * 144,
        <liquid:osmium> * 144,
        <liquid:iridium> * 144,
        <liquid:platinum> * 144,
        <liquid:gold> * 144
    ])
    .EUt(2048)
    .duration(300)
    .buildAndRegister();

distillation_tower.recipeBuilder()
    .fluidInputs(<liquid:lanthanide> * 576)
    .fluidOutputs([
        <liquid:cerium> * 144,
        <liquid:neodymium> * 144,
        <liquid:samarium> * 144,
        <liquid:lutetium> * 144
    ])
    .EUt(8192)
    .duration(300)
    .buildAndRegister();

distillation_tower.recipeBuilder()
    .fluidInputs(<liquid:actinide> * 864)
    .fluidOutputs([
        <liquid:thorium> * 144,
        <liquid:uranium> * 144,
        <liquid:plutonium> * 144,
        <liquid:naquadah> * 144,
        <liquid:naquadah_enriched> * 144,
        <liquid:trinium> * 144
    ])
    .EUt(524288)
    .duration(1200)
    .buildAndRegister();

distillation_tower.recipeBuilder()
    .fluidInputs(<liquid:poormetal> * 1296)
    .fluidOutputs([
        <liquid:aluminium> * 144,
        <liquid:zinc> * 144,
        <liquid:gallium> * 144,
        <liquid:indium> * 144,
        <liquid:tin> * 144,
        <liquid:mercury> * 144,
        <liquid:lead> * 144,
        <liquid:bismuth> * 144
    ])
    .outputs(<gregtech:meta_dust:19> * 1)
    .EUt(2048)
    .duration(450)
    .buildAndRegister();


distillation_tower.recipeBuilder()
    .fluidInputs(<liquid:othmetals> * 720)
    .fluidOutputs([
        <liquid:carbon> * 144,
        <liquid:silicon> * 144,
        <liquid:arsenic> * 144,
        <liquid:antimony> * 144
    ])
    .outputs(<gregtech:meta_dust:78> * 1)
    .EUt(2048)
    .duration(450)
    .buildAndRegister();

distillation_tower.recipeBuilder()
    .fluidInputs(<liquid:nblgas> * 60000)
    .fluidOutputs([
        <liquid:helium> * 10000,
        <liquid:neon> * 10000,
        <liquid:argon> * 10000,
        <liquid:krypton> * 10000,
        <liquid:xenon> * 10000,
        <liquid:radon> * 10000
    ])
    .EUt(65536)
    .duration(200)
    .buildAndRegister();

gas_collector.recipeBuilder()
    .circuit(4)
    .property("dimension", 0)
    .fluidOutputs(<liquid:nblgas> * 30000)
    .EUt(131072)
    .duration(100)
    .buildAndRegister();

distillation_tower.recipeBuilder()
    .fluidInputs(<liquid:comgas> * 50000)
    .fluidOutputs([
        <liquid:hydrogen> * 10000,
        <liquid:nitrogen> * 10000,
        <liquid:oxygen> * 10000,
        <liquid:fluorine> * 10000,
        <liquid:chlorine> * 10000
        ])
    .outputs(<gregtech:meta_dust:103> * 4)
    .EUt(65536)
    .duration(200)
    .buildAndRegister();

gas_collector.recipeBuilder()
    .circuit(5)
    .property("dimension", 0)
    .fluidOutputs(<liquid:comgas> * 25000)
    .EUt(131072)
    .duration(100)
    .buildAndRegister();

distillation_tower.recipeBuilder()
    .fluidInputs(<liquid:densemetalalloy> * 7632)
    .fluidOutputs([
        <liquid:alkalinegroup> * 576,
        <liquid:alkalineearth> * 576,
        <liquid:tranmetgpone> * 1152,
        <liquid:tranmetgptwo> * 1008,
        <liquid:transmetgthree> * 864,
        <liquid:lanthanide> * 576,
        <liquid:actinide> * 864,
        <liquid:poormetal> * 1296,
        <liquid:othmetals> * 720
    ])
    .outputs(<gregtech:meta_dust_tiny:128> * 2)
    .EUt(524288)
    .duration(1500)
    .buildAndRegister();