package Unit6.CourseStudentExample;

import java.util.Arrays;

public class StudentTester {
    public static void main(String[] args) {
        Course[] Courses = new Course[8];
        Courses[0] = new Course("Carlson", "Chemistry", "A", 1);
        Courses[1] = new Course("Corcoran", "APUSH", "A", 2);
        Courses[2] = new Course("Denna", "CSA", "A", 3);
        Courses[3] = new Course("Mantra", "AP Calc BC", "A", 4);
        Courses[4] = new Course("Lunch", 5);
        Courses[5] = new Course("Sponsel", "Gym", "A", 6);
        Courses[6] = new Course("Wang", "Chinese", "A", 7);
        Courses[7] = new Course("O'Donnell", "Englis1h", "A", 8);

        Student andrew = new Student("Andrew Qian", Courses);
        System.out.println(andrew);

    }
}
