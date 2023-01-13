package Unit7;

import java.util.ArrayList;

public class ArrayListNotes {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        // there is no initializer list for ArrayLists
        names.add("Akshat");
        names.add("Ben");
        names.add("Colin");
        names.add("Denna");
        System.out.println(names);
        names.add(1, "Amy");
        System.out.println(names);
        // remove Ben
        String removedName = names.remove(2);
        System.out.println(removedName + " was removed");
        System.out.println(names);
        // update or change Denna to say Mrs. Denna
        // can only use set on an existing object
        names.set(3, "Mrs. Denna");
        System.out.println(names);
        names.add(names.remove(2));
        System.out.println(names);
        names.set(3, "Mrs. Denna");
        System.out.println(names);
        names.add(names.remove(2));
        System.out.println(names);
    }
}
