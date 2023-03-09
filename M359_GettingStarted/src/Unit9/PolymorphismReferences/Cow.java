package Unit9.PolymorphismReferences;

public class Cow extends Animal
{
    private String cowType;                     // Dairy or Beef
    
    public Cow(String name, String cowType)
    {
        super(name);
        this.cowType = cowType;
    }

    public void milkCow(){
        if (cowType.equals("Dairy")){
            System.out.println("Milked.");
        }

        else{
            System.out.println("You can't milk a beef cow.");
        }
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
