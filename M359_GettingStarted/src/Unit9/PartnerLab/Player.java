package Unit9.PartnerLab;

public class Player {
    private String name;
    private double salary;
    private int speed;
    private int strength;

    public Player(){
        salary = 207000;
        speed = 50;
        strength = 50;
    }

    public Player(String name, double salary, int speed, int strength) {
        this.name = name;
        this.salary = salary;
        this.speed = speed;
        this.strength = strength;
    }

    public String toString(){
        String output = "";
        output += "The player is named: " + name + "\n";
        output += "He is paid: $" + salary + " and has " + speed + " speed and " + strength + " strength.";
        return output;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
