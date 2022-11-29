package Unit6.CourseStudentExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class StudentTester {
    public static void main(String[] args) throws FileNotFoundException {
        Course[] Courses = new Course[8];
        Courses[0] = new Course("Carlson", "Chemistry", "A", 1);
        Courses[1] = new Course("Corcoran", "APUSH", "A", 2);
        Courses[2] = new Course("Denna", "AP Computer Science A", "A", 3);
        Courses[3] = new Course("Mantra", "AP Calc BC", "A", 4);
        Courses[4] = new Course("Lunch", 5);
        Courses[5] = new Course("Sponsel", "Gym", "A", 6);
        Courses[6] = new Course("Wang", "Chinese", "A", 7);
        Courses[7] = new Course("O'Donnell", "English", "A", 8);

        Student andrew = new Student("Andrew Qian", Courses);
        //System.out.println(andrew);


        // Create a new file var to open the file
        File oneCourse = new File("oneCourse.txt");

        // Create a Scanner to read data from the file
        // select the option to tadd the throws FileNotFoundException to the main method header
        Scanner inf = new Scanner(oneCourse);

        // now we can call methods on the Scanner object ing to read data
        // .next()  .nextLine() .nextInt()  .hasNextLine()  etc.

        String teacherName = inf.nextLine();
        String className = inf.nextLine(); // reads the ENTIRE LINE UNTIL THE END OF LINE CHAR
        String grade = inf.nextLine();
        int period = inf.nextInt();

        Course c = new Course(teacherName, className, grade, period);
        System.out.println(c);
    }
}
