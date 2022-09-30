package Unit3.ChevyClass;

public class Chevy {
    private int year;
    private int miles;
    private double fuelEfficiency;
    private double Base_price;
    private double priceWithUpgrades;
    private double grandTotal;
    private String model;
    private String color;
    private boolean HasLuxuryPkg;
    private boolean Has4WDPkg;
    private boolean sportsPackageStatus;

    private static final String VEHICLE_MAKE = "Chevrolet";
    private static final double TAX_RATE = 1.122;
    private static final double LUXURY_PRICE_INCREASE = .2;
    private static final int FOUR_WD_PRICE_INCREASE = 3500;
    private static final double SPORTS_PRICE_INCREASE = .15;
    private static final double SPORTS_FUEL_DEDUCTION = .8;

    public Chevy(){
        year = 2021;
        miles = 0;
        fuelEfficiency = 35;
        Base_price = 16000;
        this.priceWithUpgrades = Base_price;
        grandTotal = priceWithUpgrades*TAX_RATE;
        model = "Trax";
        color = "White";
        HasLuxuryPkg = false;
        Has4WDPkg = false;
        sportsPackageStatus = false;

    }

    public Chevy(int year, int miles, double fuelEfficiency, double Base_price, String model, String color,
                 boolean HasLuxuryPkg, boolean Has4WDPkg, boolean sportsPackageStatus) {
        this.year = year;
        this.miles = miles;
        this.fuelEfficiency = fuelEfficiency;
        this.Base_price = Base_price;
        this.priceWithUpgrades = Base_price;
        if (HasLuxuryPkg){
            priceWithUpgrades = priceWithUpgrades + Base_price*LUXURY_PRICE_INCREASE;
        }
        if (Has4WDPkg){
            priceWithUpgrades += FOUR_WD_PRICE_INCREASE;
        }
        if (sportsPackageStatus){
            priceWithUpgrades = priceWithUpgrades + Base_price* SPORTS_PRICE_INCREASE;
        }
        grandTotal = priceWithUpgrades*TAX_RATE;
        this.model = model;
        this.color = color;
        this.HasLuxuryPkg = HasLuxuryPkg;
        this.Has4WDPkg = Has4WDPkg;
        this.sportsPackageStatus = sportsPackageStatus;
    }

    public int compareTo(Chevy other){
        return this.miles - other.miles;
    }

    public boolean equals(Chevy other){
        if (this.model.equals(other.model) && this.color.equals(other.color)){
            return (this.miles >= 200 && other.miles >= 200)
                    || (this.miles < 200 && other.miles < 200);
        }
        return false;
    }

    public String toString(){
        if (sportsPackageStatus){
            fuelEfficiency = fuelEfficiency*SPORTS_FUEL_DEDUCTION;
        }
        String str = "**************************************************\n";
        str += year + " " + VEHICLE_MAKE + " " + model + " (" + color + ")\n";
        str += "\tBASE PRICE:\t\t\t\t\t$" + Base_price + "\n";
        str += "\tMILES: \t\t\t\t\t\t" + miles + "\n";
        str += "\tFUEL EFFICIENCY:\t\t\t" + fuelEfficiency + " mpg\n";
        str += "\tPACKAGES:\n";
        if (HasLuxuryPkg){
            str += "\t\t- Luxury Package\n";
        }
        if (Has4WDPkg){
            str += "\t\t- 4WD Package\n";
        }
        if (sportsPackageStatus){
            str += "\t\t- Sports Package\n";
        }
        if (!sportsPackageStatus && !Has4WDPkg && !HasLuxuryPkg){
            str += "\t\t- None\n";
        }
        priceWithUpgrades = Base_price;
        if (HasLuxuryPkg){
            priceWithUpgrades = priceWithUpgrades + Base_price*LUXURY_PRICE_INCREASE;
        }
        if (Has4WDPkg){
            priceWithUpgrades += FOUR_WD_PRICE_INCREASE;
        }
        if (sportsPackageStatus){
            priceWithUpgrades = priceWithUpgrades + Base_price* SPORTS_PRICE_INCREASE;
        }
        grandTotal = priceWithUpgrades*TAX_RATE;
        str += "\n\tPRICE WITH UPGRADES:\t\t$" + priceWithUpgrades + "\n";
        str += "\tFINAL PRICE WITH TAX:\t\t$" + grandTotal + "\n";
        str += "**************************************************\n";
        return str;
    }

    public void calcPrice(){
        if (HasLuxuryPkg){
            priceWithUpgrades = priceWithUpgrades + Base_price * LUXURY_PRICE_INCREASE;
        }
        if (Has4WDPkg){
            priceWithUpgrades += FOUR_WD_PRICE_INCREASE;
        }
        if (sportsPackageStatus){
            priceWithUpgrades = priceWithUpgrades + Base_price * SPORTS_PRICE_INCREASE;
        }
        grandTotal = priceWithUpgrades * TAX_RATE;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMiles() {
        return miles;
    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public void setFuelEfficiency(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public double getBase_price() {
        return Base_price;
    }

    public void setBase_price(double Base_price) {
        this.Base_price = Base_price;
    }

    public double getPriceWithUpgrades() {
        return priceWithUpgrades;
    }

    public void setPriceWithUpgrades(double priceWithUpgrades) {
        this.priceWithUpgrades = priceWithUpgrades;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHasLuxuryPkg() {
        return HasLuxuryPkg;
    }

    public void setHasLuxuryPkg(boolean HasLuxuryPkg) {
        this.HasLuxuryPkg = HasLuxuryPkg;
    }

    public boolean isHas4WDPkg() {
        return Has4WDPkg;
    }

    public void setHas4WDPkg(boolean Has4WDPkg) {
        this.Has4WDPkg = Has4WDPkg;
    }

    public boolean isSportsPackageStatus() {
        return sportsPackageStatus;
    }

    public void setSportsPackageStatus(boolean sportsPackageStatus) {
        this.sportsPackageStatus = sportsPackageStatus;
    }
}
