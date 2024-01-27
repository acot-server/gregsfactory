import crafttweaker.item.IIngredient;
import mods.gregtech.recipe.RecipeMap;
import crafttweaker.item.IItemStack;


var qeyes = <gregtech:meta_item_1:281>; //Quantum Eyes
var ram = <gregtech:meta_item_1:592>; //RAM
var fluvsupercon = <gregtech:meta_wire_fine:429>; // Fine LuV Superconductor
var lapchip = <gregtech:meta_item_1:492>; //Lapotron Crystal Chip
var engrav = <gregtech:meta_item_1:703>; //Engraced Crystal Chip
var wetboard = <gregtech:meta_item_1:387>; //Wetware Life-support Circuit Board
var crystsoc = <gregtech:meta_item_1:705>; //Crystal SOC
var salloy = <liquid:soldering_alloy>; //Soldering Alloy
var fzpmsupercon = <gregtech:meta_wire_fine:430>; //Fine ZPM Superconductor
var fuvsupercon = <gregtech:meta_wire_fine:431>; //Fine UV Superconductor 
var fdmsupercon = <gregtech:meta_wire_fine:32003>; //Fine Dark Matter wire
var fdesupercon = <gregtech:meta_wire_fine:32004>; //Fine Dark Energy wire
var fstlsupercon = <gregtech:meta_wire_fine:32005>; //Fine Stellarite wire
var frunesupercon = <gregtech:meta_wire_fine:32006>; //Fine Runic Alloy wire
var fstbgsupercon = <gregtech:meta_wire_fine:32007>; //Fine Stellarborn wire
var crystcpu = <gregtech:meta_item_1:704>; //Crystal CPU
var wettrans = <gregtech:meta_item_1:537>; //Wetware Transistor
var sctrans = <gregtech:meta_item_1:544>; //Supercausal Transistor

//Preconition Computer LV
//You have been blessed by the Shroud
circuit_assembler.recipeBuilder()
    .inputs([
        qeyes * 8,
        ram * 64,
        fluvsupercon * 32,
        lapchip * 16,
        wetboard * 4,
        crystcpu * 32
    ])
    .fluidInputs(salloy * 144)
    .outputs(<contenttweaker:lv_computer_pregoc> * 64)
    .EUt(32768)
    .duration(2000)
    .buildAndRegister();

//Preconition Computer MV
//You have been blessed by the Shroud
circuit_assembler.recipeBuilder()
    .inputs([
        qeyes * 8,
        ram * 64,
        fluvsupercon * 32,
        lapchip * 32,
        wetboard * 4,
        crystsoc * 32
    ])
    .fluidInputs(salloy * 144)
    .outputs(<contenttweaker:mv_computer_pregoc> * 64)
    .EUt(32768)
    .duration(2000)
    .buildAndRegister();

//Preconition Computer HV
//You have been blessed by the Shroud
circuit_assembler.recipeBuilder()
    .inputs([
        qeyes * 8,
        ram * 64,
        fzpmsupercon * 32,
        lapchip * 32,
        wetboard * 4,
        crystsoc * 32
    ])
    .fluidInputs(salloy * 288)
    .outputs(<contenttweaker:hv_computer_pregoc> * 64)
    .EUt(131072)
    .duration(2000)
    .buildAndRegister();

//Preconition Computer EV
//You have been blessed by the Shroud
circuit_assembler.recipeBuilder()
    .inputs([
        qeyes * 8,
        ram * 64,
        fuvsupercon * 32,
        lapchip * 32,
        wetboard * 4,
        crystcpu * 32
    ])
    .fluidInputs(salloy * 576)
    .outputs(<contenttweaker:ev_computer_pregoc> * 64)
    .EUt(524288)
    .duration(2000)
    .buildAndRegister();

//Preconition Computer IV
//You have been blessed by the Shroud
circuit_assembler.recipeBuilder()
    .inputs([
        qeyes * 8,
        ram * 64,
        fuvsupercon * 32,
        lapchip * 32,
        wetboard * 4,
        crystsoc * 32
    ])
    .fluidInputs(salloy * 576)
    .outputs(<contenttweaker:iv_computer_pregoc> * 64)
    .EUt(524288)
    .duration(2000)
    .buildAndRegister();

//Preconition Computer LuV
//You have been blessed by the Shroud
circuit_assembler.recipeBuilder()
    .inputs([
        qeyes * 8,
        ram * 64,
        fdmsupercon * 32,
        lapchip * 32,
        wetboard * 4,
        crystcpu * 32
    ])
    .fluidInputs(salloy * 1152)
    .outputs(<contenttweaker:luv_computer_pregoc> * 64)
    .EUt(2097152)
    .duration(2000)
    .buildAndRegister();

//Preconition Computer ZPM
//You have been blessed by the Shroud
circuit_assembler.recipeBuilder()
    .inputs([
        qeyes * 8,
        ram * 64,
        fdmsupercon * 32,
        lapchip * 32,
        wetboard * 4,
        crystsoc * 32
    ])
    .fluidInputs(salloy * 1152)
    .outputs(<contenttweaker:zpm_computer_pregoc> * 64)
    .EUt(2097152)
    .duration(2000)
    .buildAndRegister();

//Preconition Computer UV
//You have been blessed by the Shroud
circuit_assembler.recipeBuilder()
    .inputs([
        qeyes * 8,
        ram * 64,
        fdesupercon * 32,
        lapchip * 32,
        wetboard * 4,
        engrav * 32
    ])
    .fluidInputs(salloy * 2304)
    .outputs(<contenttweaker:uv_computer_pregoc> * 64)
    .EUt(8388608)
    .duration(2000)
    .buildAndRegister();

//Preconition Computer UHV
//You have been blessed by the Shroud
circuit_assembler.recipeBuilder()
    .inputs([
        qeyes * 8,
        ram * 64,
        fdesupercon * 32,
        lapchip * 32,
        wetboard * 4,
        crystcpu * 32
    ])
    .fluidInputs(salloy * 2304)
    .outputs(<contenttweaker:uhv_computer_pregoc> * 64)
    .EUt(8388608)
    .duration(2000)
    .buildAndRegister();

//Preconition Computer UEV
//You have been blessed by the Shroud
circuit_assembler.recipeBuilder()
    .inputs([
        qeyes * 8,
        ram * 64,
        fdesupercon * 32,
        lapchip * 32,
        wetboard * 4,
        wettrans * 64
    ])
    .fluidInputs(salloy * 4608)
    .outputs(<contenttweaker:uev_computer_pregoc> * 64)
    .EUt(33554432)
    .duration(2000)
    .buildAndRegister();

//Preconition Computer UIV
//You have been blessed by the Shroud
circuit_assembler.recipeBuilder()
    .inputs([
        qeyes * 8,
        ram * 64,
        fstlsupercon * 32,
        lapchip * 32,
        wetboard * 4,
        sctrans * 64
    ])
    .fluidInputs(salloy * 9216)
    .outputs(<contenttweaker:uiv_computer_pregoc> * 64)
    .EUt(134217728)
    .duration(2000)
    .buildAndRegister();

//Preconition Computer UXV
//You have been blessed by the Shroud
circuit_assembler.recipeBuilder()
    .inputs([
        qeyes * 8,
        ram * 64,
        frunesupercon * 32,
        lapchip * 32,
        wetboard * 4,
        wettrans * 64
    ])
    .fluidInputs(salloy * 9216)
    .outputs(<contenttweaker:uxv_computer_pregoc> * 64)
    .EUt(536870912)
    .duration(2000)
    .buildAndRegister();

//Preconition Computer OpV
//You have been blessed by the Shroud
circuit_assembler.recipeBuilder()
    .inputs([
        qeyes * 8,
        ram * 64,
        fstbgsupercon * 32,
        lapchip * 32,
        wetboard * 4,
        sctrans * 64
    ])
    .fluidInputs(salloy * 9216)
    .outputs(<contenttweaker:opv_computer_pregoc> * 64)
    .EUt(536870912)
    .duration(2000)
    .buildAndRegister();
