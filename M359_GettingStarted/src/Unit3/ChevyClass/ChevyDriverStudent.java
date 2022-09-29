package Unit3.ChevyClass;

public class ChevyDriverStudent {
    public static void main(String[] args) {
        // Create objects
        Chevy traxBase = new Chevy();
        Chevy traxLux = new Chevy();

        // Set traxBase mileage to 15
        traxBase.setMiles(15);
        // Set traxLux mileage to 175 with both a luxury and 4WD package
        traxLux.setMiles(175);
        traxLux.setHasLuxuryPkg(true);
        traxLux.setHas4WDPkg(true);
        // Printouts
        System.out.println("*** VEHICLE PRINTOUTS ***");
        System.out.println(traxBase);
        System.out.println("After giving the base car a luxury pkg, 4WD package, \nand updating" +
                "miles to 175, its data prints out as:");
        System.out.println(traxLux);

        // Create two Chevy Corvettes to test compareTo and Equals

        Chevy corvetteClassic = new Chevy(1963, 123500, 13.5, 61500, "Corvette (Classic)",
                "Fire Red", true, false, false);
        Chevy corvetteSport = new Chevy(2020, 1500, 18.5, 58900, "Corvette (Sport)",
                "Fire Red", true, false, true);
        Chevy moonTesla = new Chevy(2021, 2000, 0, 69420, "Not a Chevy", "Silver", true, true, true);
        System.out.println(corvetteClassic);
        System.out.println(corvetteSport);
        System.out.println(moonTesla);

        // Display mileage comparison
        System.out.println("*** COMPARE BY MILEAGE ***");
        System.out.println("\tClassic Corvette vs. Sport Corvette");
        System.out.print("\tWhich car has the least miles?\t");

        // *** COMPLETE THE FOLLOWING DECISION STATEMENTS ***


        if (corvetteClassic.compareTo(corvetteSport) < 0)
            System.out.println("Classic Corvette has less miles than Sport Corvette");
        else if (corvetteClassic.compareTo(corvetteSport) > 0)
            System.out.println("Sport Corvette has less miles than Classic Corvette");
        else
            System.out.println("Tie, both have " + corvetteClassic.getMiles() + " miles");



        // Display equality


        System.out.println("\n*** CHECK EQUALITY ***");
        System.out.println("\tBase Trax vs. Luxury Trax");
        System.out.print("\tStatus:\t");

        // *** COMPLETE THE FOLLOWING DECISION STATEMENTS ***
        if (traxBase.equals(traxLux))
            System.out.println("Same car");
        else
            System.out.println("Not same car");



    }
}
