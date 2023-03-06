package Unit9.PolymorphismReferences;

public class Cow extends Animal
{
    private String cowType;                     // Dairy or Beef
    
    public Cow(String name, String cowType)
    {
        super(name);
        this.cowType = cowType;
    }

    /**
     * Makes a sound for a cow
     * 
    */
    public void speak()
    {
        System.out.println("The "+ cowType + " Cow " + getName() + " says MOOOOO.");
    }

}
