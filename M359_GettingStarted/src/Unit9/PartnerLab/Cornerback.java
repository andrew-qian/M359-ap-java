package Unit9.PartnerLab;

public class Cornerback extends Player {
    private int manDefense;
    private int zoneDefense;

    public Cornerback(String name,int speed, int strength, int manDefense, int zoneDefense){
        super(name,speed, strength);
        this.manDefense = manDefense;
        this.zoneDefense = zoneDefense;
    }
    public Cornerback(){
        super();
        manDefense = 50;
        zoneDefense = 50;
    }

    public String toString(){
        String str = super.toString();
        str += "This Cornerback has a man defense rating of " + manDefense + " and a zoneDefense rating of " + zoneDefense + ".";
        return str;
    }

    public void compare(Cornerback player){
        super.compare(player);
        System.out.println("Man Defense:      " + manDefense + " | " + player.manDefense);
        System.out.println("Zone Defense:     " + zoneDefense + " | " + player.zoneDefense);
    }
    //21 million
    public double contractValue(){
        double average = (double)(getSpeed() + getStrength() + manDefense + zoneDefense)/(75*4);
        if ((average * 10 * 1.25) >= 16){
            return 21;
        }
        return (Math.floor((average * 10 * 1.25) * 100)/100);
    }
    public void printContract(){
        System.out.println("The contract for this Cornerback (" + getName() + ") is worth: " + contractValue() + " million dollars");
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
