package Unit2_1.homework;

public class Shoe {
    private String shoeName;
    private double shoeSize;
    private double price;

    public Shoe(String n, double s, double p){
        shoeName = n;
        shoeSize = s;
        price = p;
    }

    Shoe s1 = new Shoe("Strappy Heels", 7, 87.99);
    Shoe s2 = new Shoe("Air Jordan 1", 11.5, 135);

}
