package Unit2.examples.phoneClass;

public class Phone {
    private String brandName;
    private int storageNum;
    private boolean hasService;

    public Phone(String name, int storage, boolean service){
        brandName = name;
        storageNum = storage;
        hasService = service;
    }

    public Phone(String name, int storage){
        brandName = name;
        storageNum = storage;
        hasService = true;
    }

    public void turnOnService(){
        hasService = true;
    }

    public void turnOffService(){
        hasService = false;
    }

    public void printPhoneDetails(){
        System.out.println("Brand: " + brandName + " Storage: " + storageNum + " HasService: " + hasService);
    }

    //getter methods that allow use to return the value of the
    //private instance vars to the user
    public String getBrandName(){
        return brandName;
    }

    public int getStorageNum(){
        return storageNum;
    }

    public boolean getHasService(){
        return hasService;
    }

    //setter methods allow us to change the value of the
    //private instance vars by the user
    //return type is always void
    //one parameter equal to the data type of the variable
    public void setBrandName(String name){
        brandName = name;
    }

    public void setStorageNum(int storage){
        storageNum = storage;
    }

    public void setHasService(boolean service){
        hasService = service;
    }
}
