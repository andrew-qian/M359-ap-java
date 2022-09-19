package Unit2.homework;

public class Fruit {
    private String name;
    private boolean ripe;
    private int servingSize;

    public Fruit(String n, boolean r){
        name = n;
        ripe = r;
        servingSize = 1;
    }

    public Fruit(String n, boolean r, int s) {
        name = n;
        ripe = r;
        servingSize = s;
    }

    Fruit mango = new Fruit("mango", false);
    Fruit pineapple = new Fruit("pineapple", true, 4);

}
