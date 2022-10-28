package Unit5.Examples.HeroVillianExample;

public class Villian {
    private String villianName;
    private Power villianPower;

    public Villian(String villianName, Power villianPower) {
        this.villianName = villianName;
        this.villianPower = villianPower;
    }

    public Villian(String VillianName, String powerName, int powerStrength){
        this.villianName = VillianName;

        this.villianPower = new Power(powerName, powerStrength);
        // here we create a new Power object with the passed in name and strength.
    }

    public String toString(){
        String str = "This villain is named: " + villianName + "\n";
        if (villianPower != null) {
            str += villianPower.toString();
        }   // this calls the toString and adds the returned
        // String from Power class to this string we are
        // building up here inside SuperHero class
        return str;
    }
    public String getVillainName() {
        return villianName;
    }

    public void setVillainName(String VillianName) {
        this.villianName = VillianName;
    }

    public Power getVillianPower() {
        return villianPower;
    }

    public void setVillianPower(Power VillianPower) {
        this.villianPower = VillianPower;
    }
}
