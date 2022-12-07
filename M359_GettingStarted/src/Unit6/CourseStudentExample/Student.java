package Unit6.CourseStudentExample;

public class Student {
    private String name;
    private Course[] myClasses;

    public Student(String name) {
        this.name = name;
        myClasses = new Course[8];
    }

    public Student(String name, Course[] myClasses) {
        this.name = name;
        this.myClasses = myClasses;
    }

    public String toString() {
        String str = "";
        str = "Student Name: " + name + "\n";
        for (Course c: myClasses) {
            if (c != null)
                str += c + "\n";
        }
        return str;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course[] getMyClasses() {
        return myClasses;
    }

    public void setMyClasses(Course[] myClasses) {
        this.myClasses = myClasses;
    }
}
