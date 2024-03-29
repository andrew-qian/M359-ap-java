package Unit9.PartnerLab;
// Teacher: Denna Period 3
// Students: Andrew Qian and Rithesh Balusu
// Class: Subclass of the player class, this class depicts a Quarterback
public class Quarterback extends Player{
    private int throwingAccuracy;
    private int throwingStrength;

    public Quarterback(String name,int speed, int strength, int throwingAccuracy, int throwingStrength){
        super(name, speed, strength);
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
        str += "This Quarterback has a throwing accuracy of " + throwingAccuracy
                + " and a throwing strength of " + throwingStrength + ".";
        return str;
    }
    /**
     * Compares quarterbacks between each other
     * @param player quarterback comparing to
     */
    public void compare(Quarterback player){
        super.compare(player);
        System.out.println("Throw Accuracy:   " + throwingAccuracy +
                " | " + player.throwingAccuracy);
        System.out.println("Throw Strength:   " + throwingStrength +
                " | " + player.throwingStrength);
    }
    //50 million
    /**
     * Calculates contract value for quarterback
     * @return contract value for quarterback
     */
    public double contractValue(){
        double average = (double)(getSpeed() + getStrength() + throwingStrength + throwingAccuracy)/(75*4);
        if ((average * 30 * 1.25) == 50){
            return 55;
        }
        return (Math.floor((average * 30 * 1.25) * 100)/100);
    }
    /**
     * prints the contract for the player
     */
    public void printContract(){
        System.out.println("The contract for this quarterback " +
                "(" + getName() + ") is worth: " + contractValue() + " million dollars");
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
