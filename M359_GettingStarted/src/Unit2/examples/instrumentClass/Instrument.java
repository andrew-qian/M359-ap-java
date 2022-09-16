package Unit2.examples.instrumentClass;

public class Instrument {
    private String instrumentName;
    private double cost;
    private boolean isWorking;

    public Instrument(String name, double aCost, boolean working){
        instrumentName = name;
        cost = aCost;
        isWorking = working;
    }

    public Instrument(String name, double aCost){
        instrumentName = name;
        cost = aCost;
        isWorking = true;
    }

    public void getDiscount(){
        cost = cost * .8;
    }
    public void broken(){
        isWorking = false;
    }

    public String getInstrumentName(){
        return instrumentName;
    }
    public double getCost(){
        return cost;
    }
    public boolean getIsWorking(){
        return isWorking;
    }

    public void setInstrumentName(String newName){
        instrumentName = newName;
    }
    public void setCost(double newCost){
        cost = newCost;
    }
    public void setIsWorking(boolean newIsWorking){
        isWorking = newIsWorking;
    }

    public void printInstrument(){
        System.out.println(instrumentName + ' ' + cost + ' ' + isWorking);
    }
}
