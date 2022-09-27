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

    }

    public Chevy(int year, int mileage, double fuelEfficiency, double basePrice, double priceWithUpgrades, double grandTotal, String model, String color,
                 boolean luxuryPackageStatus, boolean fourWDPackageStatus, boolean sportsPackageStatus) {
        this.year = year;
        this.mileage = mileage;
        this.fuelEfficiency = fuelEfficiency;
        this.basePrice = basePrice;
        this.priceWithUpgrades = priceWithUpgrades;
        this.grandTotal = grandTotal;
        this.model = model;
        this.color = color;
        this.luxuryPackageStatus = luxuryPackageStatus;
        this.fourWDPackageStatus = fourWDPackageStatus;
        this.sportsPackageStatus = sportsPackageStatus;
    }
}
