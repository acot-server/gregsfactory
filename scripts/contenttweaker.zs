#priority 5000
#loader contenttweaker
import mods.contenttweaker.VanillaFactory;
import mods.contenttweaker.Item;
import mods.contenttweaker.Block;
import mods.contenttweaker.Color;
import mods.contenttweaker.Fluid;

//Antimatter Containment Field
var antimatter_field = VanillaFactory.createItem("antimatter_field");
antimatter_field.register();

//precursor_database
var precursor_database = VanillaFactory.createItem("precursor_database");
precursor_database.register();

//empty nuclear fuel rod
var empty_nuclear_fuel_rod = VanillaFactory.createItem("empty_nuclear_fuel_rod");
empty_nuclear_fuel_rod.register();

//U238 Fuel Rod
var U238_fuel_rod = VanillaFactory.createItem("U238_fuel_rod");
U238_fuel_rod.register();

//U235 Fuel Rod
var U235_fuel_rod = VanillaFactory.createItem("U235_fuel_rod");
U235_fuel_rod.register();

//Pu239 Fuel Rod
var Pu239_fuel_rod = VanillaFactory.createItem("Pu239_fuel_rod");
Pu239_fuel_rod.register();

//Pu41 Fuel Rod
var Pu241_fuel_rod = VanillaFactory.createItem("Pu241_fuel_rod");
Pu241_fuel_rod.register();

//Nq Fuel Rod
var Nq_fuel_rod = VanillaFactory.createItem("Nq_fuel_rod");
Nq_fuel_rod.register();

//U238+Pu239 Fuel Rod
var U238_Pu239_fuel_rod = VanillaFactory.createItem("U238_Pu239_fuel_rod");
U238_Pu239_fuel_rod.register();

//U235+Pu239 Fuel Rod
var U235_Pu239_fuel_rod = VanillaFactory.createItem("U235_Pu239_fuel_rod");
U235_Pu239_fuel_rod.register();

//U238+Pu241 Fuel Rod
var U238_Pu241_fuel_rod = VanillaFactory.createItem("U238_Pu241_fuel_rod");
U238_Pu241_fuel_rod.register();

//U235+Pu241 Fuel Rod
var U235_Pu241_fuel_rod = VanillaFactory.createItem("U235_Pu241_fuel_rod");
U235_Pu241_fuel_rod.register();
