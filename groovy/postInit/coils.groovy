import grergtech.*

def assembler = recipemap('assembler');


//Dark Matter Coil
assembler.recipeBuilder()
    .inputs(
        metaitem('wireGtDoubleDarkmatteralloy') * 8,
        metaitem('foilTritanium') * 8,

    )
    .fluidInputs(fluid('neutronium') * 144)
    .outputs(item('gregtech:wire_coil_additional') * 1)
    .EUt(1966080)
    .duration(1000)
    .buildAndRegister();

//Enigmatic Coil
assembler.recipeBuilder()
    .inputs(
        metaitem('wireGtDoubleDarkenergyalloy') * 8,
        metaitem('foilDuranium') * 8,

    )
    .fluidInputs(fluid('enriched_naquadah_trinium_europium_duranide') * 144)
    .outputs(item('gregtech:wire_coil_additional', 1) * 1)
    .EUt(7864080)
    .duration(1100)
    .buildAndRegister();

//Stellarite Coil
assembler.recipeBuilder()
    .inputs(
        metaitem('wireGtDoubleStellarite') * 8,
        metaitem('foilDarkmatteralloy') * 8,

    )
    .fluidInputs(fluid('ruthenium_trinium_americium_neutronate') * 144)
    .outputs(item('gregtech:wire_coil_additional', 2) * 1)
    .EUt(31456080)
    .duration(1200)
    .buildAndRegister();

//Runic Coil
assembler.recipeBuilder()
    .inputs(
        metaitem('wireGtDoubleRunicalloy') * 8,
        metaitem('foilDarkenergyalloy') * 8,

    )
    .fluidInputs(fluid('darkmatteralloy') * 144)
    .outputs(item('gregtech:wire_coil_additional', 3) * 1)
    .EUt(125824080)
    .duration(1300)
    .buildAndRegister();

//Stasis Coil
assembler.recipeBuilder()
    .inputs(
        metaitem('wireGtDoubleStasis') * 8,
        metaitem('foilCobalt') * 8,

    )
    .fluidInputs(fluid('wakfu') * 144)
    .outputs(item('gregtech:wire_coil_additional', 4) * 1)
    .EUt(1920)
    .duration(1400)
    .buildAndRegister();

//Krosmoz Coil
assembler.recipeBuilder()
    .inputs(
        metaitem('wireGtDoubleWakfustasis') * 8,
        metaitem('foilRunicalloy') * 8,

    )
    .fluidInputs(fluid('stasis') * 144)
    .outputs(item('gregtech:wire_coil_additional', 5) * 1)
    .EUt(503296080)
    .duration(1500)
    .buildAndRegister();