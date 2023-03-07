package Unit9.PartnerLab;

public class WideReceiver extends Player {
    private int routeRunning;
    private int catching;

    public WideReceiver(String name, double salary,int speed, int strength, int routeRunning, int catching){
        super(name, salary, speed, strength);
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
        str += "This Wide Receiver route running attribute is at " + routeRunning + " and a catching attribute of  " + catching;
        return str;
    }

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
