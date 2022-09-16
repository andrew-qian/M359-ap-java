package Unit2.homework.fruitClass;

public class Fruit {
    private String fruitName;
    private boolean isRipe;
    private int servingSize;

    public Fruit(String name, boolean ripeness){
        fruitName = name;
        isRipe = ripeness;
        servingSize = 1;
    }

    public Fruit(String name, boolean ripeness, int servings){
        fruitName = name;
        isRipe = ripeness;
        servingSize = servings;
    }
}
