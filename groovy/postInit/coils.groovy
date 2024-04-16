import grergtech.*

def assembler = recipemap('assembler');


//Dark Matter Coil
assembler.recipeBuilder()
    .inputs(
        item('gregtech:wire_double', 32003) * 8,
        item('gregtech:meta_foil', 32000) * 8,

    )
    .fluidInputs(fluid('neutronium') * 144)
    .outputs(item('qilby:darkmatter_coil') * 1)
    .EUt(1966080)
    .duration(1000)
    .buildAndRegister();

//Enigmatic Coil
assembler.recipeBuilder()
    .inputs(
        item('gregtech:wire_double', 32004) * 8,
        item('gregtech:meta_foil', 32003) * 8,

    )
    .fluidInputs(fluid('wakfu') * 144)
    .outputs(item('qilby:darkenergyalloy_coil') * 1)
    .EUt(7864080)
    .duration(1100)
    .buildAndRegister();

//Stellarite Coil
assembler.recipeBuilder()
    .inputs(
        item('gregtech:wire_double', 32005) * 8,
        item('gregtech:meta_foil', 32004) * 8,

    )
    .fluidInputs(fluid('darkenergyalloy') * 144)
    .outputs(item('qilby:stellarite_coil') * 1)
    .EUt(31456080)
    .duration(1200)
    .buildAndRegister();

//Runic Coil
assembler.recipeBuilder()
    .inputs(
        item('gregtech:wire_double', 32006) * 8,
        item('gregtech:meta_foil', 32005) * 8,

    )
    .fluidInputs(fluid('stellarite') * 144)
    .outputs(item('qilby:runicalloy_coil') * 1)
    .EUt(125824080)
    .duration(1300)
    .buildAndRegister();

//Stasis Coil
assembler.recipeBuilder()
    .inputs(
        item('gregtech:wire_double', 32001) * 8,
        item('gregtech:meta_foil', 32006) * 8,

    )
    .fluidInputs(fluid('runicalloy') * 144)
    .outputs(item('qilby:stasis_coil') * 1)
    .EUt(503296080)
    .duration(1400)
    .buildAndRegister();

//Krosmoz Coil
assembler.recipeBuilder()
    .inputs(
        item('gregtech:wire_double', 32002) * 8,
        item('gregtech:meta_foil', 32001) * 8,

    )
    .fluidInputs(fluid('stasis') * 144)
    .outputs(item('qilby:wakfustasis_coil') * 1)
    .EUt(503296080)
    .duration(1500)
    .buildAndRegister();