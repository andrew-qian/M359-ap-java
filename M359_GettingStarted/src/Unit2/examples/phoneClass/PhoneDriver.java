package Unit2.examples.phoneClass;

public class PhoneDriver {
    // shortcut for public static void main(String[] args){} is psvm then enter

    public static void main(String[] args){
        Phone p1 = new Phone("Samsung", 64, false);
        Phone p2 = new Phone("Apple", 8);

        //method call is varName.methodName();
        // shortcut for System.out.println() is sout then enter

        p1.turnOnService();
        p2.turnOffService();

        p1.setStorageNum(128);
        p2.setBrandName("Google");
        p1.setHasService(false);

        p1.printPhoneDetails();
        p2.printPhoneDetails();

    }
}
