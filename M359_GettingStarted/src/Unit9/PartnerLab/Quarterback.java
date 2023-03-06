package Unit9.PartnerLab;

public class Quarterback extends Player{
    private int throwingAccuracy;
    private int throwingStrength;

    public Quarterback(boolean isAllStar, int salary, String position, int speed, int strength, int throwingAccuracy, int throwingStrength){
        super(isAllStar, salary, position, speed, strength);
        this.throwingAccuracy = throwingAccuracy;
        this.throwingStrength = throwingStrength;
    }

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
