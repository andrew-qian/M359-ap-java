package Unit9.PartnerLab;
// Teacher: Denna Period 3
// Students: Andrew Qian and Rithesh Balusu
// Class: Subclass of the player class, this class depicts a wide receiver
public class WideReceiver extends Player {
    private int routeRunning;
    private int catching;

    public WideReceiver(String name,int speed, int strength, int routeRunning, int catching){
        super(name, speed, strength);
        this.routeRunning = routeRunning;
        this.catching = catching;
    }
    public WideReceiver(){
        super();
        routeRunning = 50;
        catching = 50;
    }

    public String toString(){
        String str = super.toString();
        str += "This Wide Receiver's route running attribute is at " + routeRunning +
                " and a catching attribute of  " + catching + ".";
        return str;
    }
    /**
     * Compares wide receivers between each other
     * @param player wide receiver comparing to
     */
    public void compare(WideReceiver player){
        super.compare(player);
        System.out.println("Route Running:    " + routeRunning +
                " | " + player.routeRunning);
        System.out.println("Catching:         " + catching +
                " | " + player.catching);
    }
    /**
     * Calculates contract value for wide receiver
     * @return contract value for wide receiver
     */
    public double contractValue(){
        double average = (double)(getSpeed() + getStrength() + catching + routeRunning)/(75*4);
        if ((average * 15 * 1.25) == 25){
            return 30;
        }
        return (Math.floor((average * 15 * 1.25) * 100)/100);
    }
    /**
     * prints the contract for the player
     */
    public void printContract(){
        System.out.println("The contract for this Wide Receiver " +
                "(" + getName() + ") is worth: " + contractValue() + " million dollars");
    }

    // 30 million
    //public void contractValue(WideReceiver player){
        //if ((routeRunning) > 75) == 20){

      //  }
  // }

    public int getRouteRunning() {
        return routeRunning;
    }

    public void setRouteRunning(int routeRunning) {
        this.routeRunning = routeRunning;
    }

    public int getCatching() {
        return catching;
    }

    public void setCatching(int catching) {
        this.catching = catching;
    }
}
