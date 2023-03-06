package Unit9.PartnerLab;

public class Player {
    private boolean isAllStar;
    private int salary;
    private String position;
    private int speed;
    private int strength;


    public Player(boolean isAllStar, int salary, String position, int speed, int strength) {
        this.isAllStar = isAllStar;
        this.salary = salary;
        this.position = position;
        this.speed = speed;
        this.strength = strength;
    }

    public boolean isAllStar() {
        return isAllStar;
    }

    public void setAllStar(boolean allStar) {
        isAllStar = allStar;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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
}
