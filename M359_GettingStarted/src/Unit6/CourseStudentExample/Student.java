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

    public String toString(){
        String output = "Student Name: " + name + "\n";
        for (int i = 0; i < myClasses.length; i++){
            output += myClasses[i];
        }
        return output;
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
