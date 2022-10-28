package Unit5.Examples.HeroVillianExample;

public class Power {
    private String powerName;
    private int powerStrength;

    public Power(String powerName, int powerStrength) {
        this.powerName = powerName;
        this.powerStrength = powerStrength;
    }

    public String toString() {
        return "The power is: " + powerName + " with a strength of: " + powerStrength;
    }



    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName;
    }

    public int getPowerStrength() {
        return powerStrength;
    }

    public void setPowerStrength(int powerStrength) {
        this.powerStrength = powerStrength;
    }
}
