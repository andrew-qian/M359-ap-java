package Unit9.Notes_9_2;

public class MenuItem {
    private String name;
    // default constructor
    // if a subclass doesn't call super, this no-argument constructor
    // will be called implicitly for us

    public MenuItem() {
        name = "none given";
        System.out.println("Created a MenuItem without a name?!?!?");
    }
    public MenuItem(String name) {
        this.name = name;
        System.out.println("Created a MenuItem called " + name);
    }


    public String getName(){
        return name;
    }
}
