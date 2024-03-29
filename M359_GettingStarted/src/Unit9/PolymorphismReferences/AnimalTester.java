package Unit9.PolymorphismReferences;

/**
* Lesson 9-5: Polymorphism
 * The purpose of this tester class is to see what happens when an array
 * of Animal references is assigned objects of type Animal, Pig, and Cow
 * 
 * @author   Mrs. Denna 
 */
public class AnimalTester
{
   public static void main(String[] args)
   {
       Animal[] barn = new Animal[6];
       // 1. What data type does this array hold?

       //Animal


       barn[0] = new Animal("Murphy");
       barn[1] = new Cow("Daisy", "Dairy");
       barn[2] = new Pig("Wilbur", false);
       barn[3] = new Cow("Billy", "Beef");
       barn[4] = new Animal("Maggie");
       barn[5] = new Pig("Max", true);

       Cow dairyCow = new Cow("Milk Cow", "Dairy");
       Cow beefCow =  new Cow("Beef Cow", "Beef");
       Animal someCow = new Cow("Random Cow", "Dairy");

       dairyCow.milkCow();
       beefCow.milkCow();
//       someCow.milkCow(); //superclasses cannot access subclasses
       // we can cast it as a cow then Java will let us call methods that are only defined for Cow objects
       ((Cow)someCow).milkCow();
       // must put the class we are casting it to in parentheses (Cow)
       // We must fully wrap the ref var that is being casted in parentheses before the dot so java
       // will think of it as a cow
       //someCow is still an animal reference

       Cow newCow = (Cow)someCow;

       newCow.milkCow();


       // 2. Did I ONLY store Animal objects in this array?  If not, why do you
       //    think this was allowed?

       //I think this was allowed because both Pig and Cow are subclasses of the Animal class
   
       for (Animal a: barn)
            a.speak();
            // 3. What method is getting called here?  The speak method of the Animal class?

            //It calls whatever speak is the closest, does not always have to be the super speak()

            //it is the constructor call that tells us what kind object it is, not the reference variable

       // 4. Try to summarize in 2-3 sentences WHAT you observed in this code.

       // You can use arrays of different types if they have the same superclass, and you can call overloaded methods for the specific subclasses.
   }
   
}
