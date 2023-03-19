package Unit9.PartnerLab;
// Teacher: Denna Period 3
// Students: Andrew Qian and Rithesh Balusu
// Class: Superclass of the football player lab
public class Player {
    private String name;
    private int speed;
    private int strength;

    public Player(){
        name = "Default Player";
        speed = 50;
        strength = 50;
    }

    public Player(String name, int speed, int strength) {
        this.name = name;
        this.speed = speed;
        this.strength = strength;
    }

    public String toString(){
        String output = "";
        output += "The player is named: " + name + "\n";
        output += "He has " + speed + " speed " +
                "and " + strength + " strength.";
        return output;
    }
    /**
     * Compares players between each other
     * @param player player comparing to
     */
    public void compare(Player player){
        System.out.println("Comparing " + name + " and " + player.name);
        System.out.println("-------------------------------");
        System.out.println("Speed:            " + speed +
                " | " + player.speed);
        System.out.println("Strength:         " + strength +
                " | " + player.strength);
    }
    /**
     * Calculates contract value for player
     * @return contract value for player
     */
    public double contractValue(){
        double average = (double)(speed + strength)/(75*2);
        if ((average * 5 * 1.25) >= 8){
            return 10;
        }
        return (Math.floor((average * 5 * 1.25) * 100)/100);
    }

    /**
     * prints the contract for the player
     */
    public void printContract(){
        System.out.println("The contract for this Player " +
                "(" + name + ") is worth: " + contractValue() + " million dollars");
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

}
