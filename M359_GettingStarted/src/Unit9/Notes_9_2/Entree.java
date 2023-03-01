package Unit9.Notes_9_2;

public class Entree extends MenuItem{
    private int numSides;
    public Entree(String name, int numSides) {
        super();
        //super(name); // this is an explicit call to constructor
        // without the explicit call, Java will call super() implicitly on our behalf.
        this.numSides = numSides;
        System.out.println("Created an Entree with " + numSides + " sides");
    }
}
