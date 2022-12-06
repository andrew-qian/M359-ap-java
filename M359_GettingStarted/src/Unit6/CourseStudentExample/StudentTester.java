package Unit6.CourseStudentExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentTester {
    public static void main(String[] args) throws FileNotFoundException {
//        Course p1 = new Course("Denna", "AP Java", "A+", 1);
//        Course p2 = new Course("Nichols", "AP CSP", "A+", 2);
//        Course p3 = new Course("Moon", "Calc BC", "A+", 3);
//        Course p4 = new Course( "Lunch", 4);
//        Course p5 = new Course("Vlaming", "Adventure Ed", "A", 5);
//        Course p6 = new Course("Billitier", "History", "B", 6);
//        Course p7 = new Course("Zinger", "Chem", "A-", 7);
//        Course p8 = new Course("Eng", "AP Lit", "B+", 8);
//
//        Course[] schedule = {p1, p2, p3, p4, p5, p6, p7, p8};
//
//        Student denna = new Student("Shannon Denna", schedule);
       // System.out.println(denna);

        // Create a File to read ALLL student data and Scanner variable
        File file = new File("studentScheduleData.txt");
        Scanner inF = new Scanner(file);
        int numStudents = inF.nextInt();
        inF.nextLine(); // dummy read to go to next line

        // make our Student array of numStudents size
        Student[] allStudents = new Student[numStudents];
        int currStu = 0;
        // use a while loop to read in data, make a Student
        while (inF.hasNextLine()) {
            // Read in Student Name
            String name = inF.nextLine();
            // Create a Course [] and instantiate it to be of size 8
            Course[] allClasses = new Course[8];

            // use a for loop to read in data for a Course 8 times
            for (int i = 0; i < allClasses.length; i++) {
                // Read in teacher name, Course, grade, period
                String teacherName = inF.nextLine();
                String className = inF.nextLine();  // reads the ENTIRE LINE UNTIL THE END OF LINE CHAR
                String grade = inF.nextLine();
                int per = inF.nextInt();

                if (inF.hasNextLine()) {
                    // dummy read to "consume the EOL character"
                    inF.nextLine();
                }
                // Create a Course var with this data
                Course c = new Course(teacherName, className, grade, per);
                // Save this Course in the Course array
                allClasses[i] = c;
            }

            // Create a Student object with this name and Course []
            Student s = new Student(name, allClasses);
            allStudents[currStu] = s;
            currStu++;
        }
        // and add to Student array

       for (Student s: allStudents) {
           if (s != null)
               System.out.println(s);
       }





    }
}
