package Unit5.Examples.HeroVillianExample;

public class Villian {
    private String villianName;
    private Power villianPower;

    public Villian(String villianName, Power villianPower) {
        this.villianName = villianName;
        this.villianPower = villianPower;
    }

    public Villian(String villianName, String powerName, int powerStrength) {
        this.villianName = villianName;
        this.villianPower = new Power(powerName, powerStrength);
    }

    public void updateStrengthAfterBattle(double percent) {
        villianPower.setStrength((int)(percent * villianPower.getStrength()));
    }

    public String toString() {
        String str = "This Villian is named: " + villianName + "\n";
        if (villianPower != null) {
            str += villianPower.toString();    // this calls the toString and adds the returned
            // String from Power class to this string we are
            // building up here inside Villian class
        }
        return str;
    }


    public String getVillianName() {
        return villianName;
    }

    public void setVillianName(String villianName) {
        this.villianName = villianName;
    }

    public Power getVillianPower() {
        return villianPower;
    }

    public void setVillianPower(Power villianPower) {
        this.villianPower = villianPower;
    }
}