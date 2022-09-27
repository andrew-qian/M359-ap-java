package Unit3.ChevyClass;

public class Chevy {
    private int year;
    private int mileage;
    private double fuelEfficiency;
    private double basePrice;
    private double priceWithUpgrades;
    private double grandTotal;
    private String model;
    private String color;
    private boolean luxuryPackageStatus;
    private boolean fourWDPackageStatus;
    private boolean sportsPackageStatus;

    private static final String VEHICLE_MAKE = "Chevrolet";
    private static final double TAX_RATE = 12.2;
    private static final double LUXURY_PRICE_INCREASE = 1.2;
    private static final int FOUR_WD_PRICE_INCREASE = 3500;
    private static final double SPORTS_PRICE_INCREASE = 1.15;
    private static final double SPORTS_FUEL_DEDUCTION = .8;

    public Chevy(){
        this.year = 2021;
        this.mileage = 0;
        this.fuelEfficiency = 35;
        this.basePrice = 16000;
        this.priceWithUpgrades = 0;
        this.grandTotal = 0;
        this.model = "Trax";
        this.color = "White";
        this.luxuryPackageStatus = false;
        this.fourWDPackageStatus = false;
        this.sportsPackageStatus = false;

    }

    public Chevy(int year, int mileage, double fuelEfficiency,
                 double basePrice, String model, String color,
                 boolean luxuryPackageStatus, boolean fourWDPackageStatus,
                 boolean sportsPackageStatus) {
        this.year = year;
        this.mileage = mileage;
        this.fuelEfficiency = fuelEfficiency;
        this.basePrice = basePrice;
        this.priceWithUpgrades = 0;
        this.grandTotal = 0;
        this.model = model;
        this.color = color;
        this.luxuryPackageStatus = luxuryPackageStatus;
        this.fourWDPackageStatus = fourWDPackageStatus;
        this.sportsPackageStatus = sportsPackageStatus;
    }

    public int compareTo(Chevy other){
        return this.mileage - other.mileage;
    }

    public boolean equals(Chevy other){
        if (this.model.equals(other.model) && this.color.equals(other.color)){
            return (this.mileage >= 200 && other.mileage >= 200)
                    || (this.mileage < 200 && other.mileage < 200);
        }
        return false;
    }
}
