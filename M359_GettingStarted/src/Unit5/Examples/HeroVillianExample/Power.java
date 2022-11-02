package Unit5.Examples.HeroVillianExample;

public class Power {
    private String name;
    private int strength;

    public Power(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }

    public String toString() {
        return "The power is: " + name + " with a strength of: " + strength;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}