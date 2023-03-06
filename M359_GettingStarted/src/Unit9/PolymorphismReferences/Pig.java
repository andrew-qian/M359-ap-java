package Unit9.PolymorphismReferences;

public class Pig extends Animal
{
    private boolean isMuddy;
    
    public Pig(String name, boolean isMuddy)
    {
        super(name);
        this.isMuddy = isMuddy;
    }

    /**
     * Makes a sound for a pig
     * 
    */
    public void speak()
    {
        if (isMuddy)
            System.out.println("The Muddy Pig " + getName() + " says OINK OINK.");
        else
            System.out.println("The Pig " + getName() + " says OINK OINK.");
    }
}
