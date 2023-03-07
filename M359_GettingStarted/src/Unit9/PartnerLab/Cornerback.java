package Unit9.PartnerLab;

public class Cornerback extends Player {
    private int manDefense;
    private int zoneDefense;

    public Cornerback(String name, double salary, int speed, int strength, int manDefense, int zoneDefense){
        super(name, salary, speed, strength);
        this.manDefense = manDefense;
        this.zoneDefense = zoneDefense;
    }
    public Cornerback(){
        super();
        manDefense = 50;
        zoneDefense = 50;
    }

    public int getManDefense() {
        return manDefense;
    }

    public void setManDefense(int manDefense) {
        this.manDefense = manDefense;
    }

    public int getZoneDefense() {
        return zoneDefense;
    }

    public void setZoneDefense(int zoneDefense) {
        this.zoneDefense = zoneDefense;
    }
}
