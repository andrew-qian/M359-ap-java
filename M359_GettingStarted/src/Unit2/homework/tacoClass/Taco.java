package Unit2.homework.tacoClass;

public class Taco {
    private String tacoGrain;
    private String tacoMeat;
    private boolean hasCheese;
    private int tacoAmount;

    public Taco(String grain, String meat, boolean cheese, int amount){
        tacoGrain = grain;
        tacoMeat = meat;
        hasCheese = cheese;
        tacoAmount = amount;
    }

    public Taco(String grain, String meat, boolean cheese){
        tacoGrain = grain;
        tacoMeat = meat;
        hasCheese = cheese;
        tacoAmount = 1;
    }

    public String getTacoGrain(){
        return tacoGrain;
    }
    public String getTacoMeat(){
        return tacoMeat;
    }
    public boolean getHasCheese(){
        return hasCheese;
    }
    public int getTacoAmount(){
        return tacoAmount;
    }

    public void setTacoGrain(String grain){
        tacoGrain = grain;
    }
    public void setTacoMeat(String meat){
        tacoMeat = meat;
    }
    public void setHasCheese(boolean cheese){
        hasCheese = cheese;
    }
    public void setTacoAmount(int amount){
        tacoAmount = amount;
    }
}
