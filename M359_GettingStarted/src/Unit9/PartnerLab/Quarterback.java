package Unit9.PartnerLab;

public class Quarterback extends Player{
    private int throwingAccuracy;
    private int throwingStrength;

    public Quarterback(String name, double salary,int speed, int strength, int throwingAccuracy, int throwingStrength){
        super(name, salary, speed, strength);
        this.throwingAccuracy = throwingAccuracy;
        this.throwingStrength = throwingStrength;
    }
    public Quarterback(){
        super();
        throwingAccuracy = 50;
        throwingStrength = 50;
    }

    public String toString(){
        String str = super.toString();
        str += "This Quarterback has a throwing accuracy of " + throwingAccuracy + " and a throwing strength of " + throwingStrength + ".";
        return str;
    }

    public void compare(Quarterback player){
        super.compare(player);
        System.out.println("Throw Accuracy:   " + throwingAccuracy + " | " + player.throwingAccuracy);
        System.out.println("Throw Strength:   " + throwingStrength + " | " + player.throwingStrength);
    }
    //50 million

    public int getThrowingAccuracy() {
        return throwingAccuracy;
    }

    public void setThrowingAccuracy(int throwingAccuracy) {
        this.throwingAccuracy = throwingAccuracy;
    }

    public int getThrowingStrength() {
        return throwingStrength;
    }

    public void setThrowingStrength(int throwingStrength) {
        this.throwingStrength = throwingStrength;
    }

}
