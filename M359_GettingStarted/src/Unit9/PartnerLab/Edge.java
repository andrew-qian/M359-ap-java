package Unit9.PartnerLab;

public class Edge extends Player{
    private int blockShedding;
    private int finesseMoves;

    public Edge(String name, double salary, int speed, int strength, int blockShedding, int finesseMoves){
        super(name, salary, speed, strength);
        this.finesseMoves = finesseMoves;
        this.blockShedding = blockShedding;
    }
    public Edge(){
        super();
        blockShedding = 50;
        finesseMoves = 50;
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
