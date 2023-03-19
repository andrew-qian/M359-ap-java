package Unit9.PartnerLab;
// Teacher: Denna Period 3
// Students: Andrew Qian and Rithesh Balusu
// Class: Subclass of the player class, this class depicts a Edge
public class Edge extends Player{
    private int blockShedding;
    private int finesseMoves;

    public Edge(String name, int speed, int strength, int blockShedding, int finesseMoves){
        super(name,speed, strength);
        this.finesseMoves = finesseMoves;
        this.blockShedding = blockShedding;
    }
    public Edge(){
        super();
        blockShedding = 50;
        finesseMoves = 50;
    }

    public String toString(){
        String str = super.toString();
        str += "This Edge has a block shedding rating of " + blockShedding
                + " and a finesse move rating of " + finesseMoves + ".";
        return str;
    }
    /**
     * Compares edges between each other
     * @param player edge comparing to
     */
    public void compare(Edge player){
        super.compare(player);
        System.out.println("Block Shedding:   " + blockShedding +
                " | " + player.blockShedding);
        System.out.println("Finesse Moves:    " + finesseMoves +
                " | " + player.finesseMoves);
    }
    //25 million
    /**
     * Calculates contract value for edge
     * @return contract value for edge
     */
    public double contractValue(){
        double average = (double)(getSpeed() + getStrength() + finesseMoves + blockShedding)/(75*4);
        if ((average * 12 * 1.25) == 20){
            return 25;
        }
        return (Math.floor((average * 12 * 1.25) * 100)/100);
    }
    /**
     * prints the contract for the player
     */
    public void printContract(){
        System.out.println("The contract for this Edge " +
                "(" + getName() + ") is worth: " + contractValue() + " million dollars");
    }

    public int getBlockShedding() {
        return blockShedding;
    }

    public void setBlockShedding(int blockShedding) {
        this.blockShedding = blockShedding;
    }

    public int getFinesseMoves() {
        return finesseMoves;
    }

    public void setFinesseMoves(int finesseMoves) {
        this.finesseMoves = finesseMoves;
    }
}
