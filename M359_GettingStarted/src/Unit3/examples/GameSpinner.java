package Unit3.examples;

public class GameSpinner {
    private int spinnerSectors;
    private int spinnerRun;
    private int spinnerPrevious;

    public GameSpinner(int sectors){
        spinnerSectors = sectors;
        spinnerRun = 0;
        spinnerPrevious = 0;
    }

    public int spin(){
        int n = (int)(Math.random()*spinnerSectors + 1);
        if (spinnerPrevious == n){
            spinnerRun++;
        }
        else{
            spinnerPrevious = n;
            spinnerRun = 1;
        }
        return n;
    }
    public int currentRun(){
        return spinnerRun;
    }
}
