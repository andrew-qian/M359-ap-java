package Unit3.examples.StudentClass;

public class StudentDriver {
    public static void main(String[] args) {
        Student a = new Student("Andrew", "Qian", 399064);
        Student b = new Student("Michael", "Qian", 123456);

        a.compareTo(b);
    }
}
