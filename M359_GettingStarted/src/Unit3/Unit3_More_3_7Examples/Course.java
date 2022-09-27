package Unit3.Unit3_More_3_7Examples;

public class Course {
    private String classTitle;
    private int numStudentsEnrolled;
    private String teacherName;

    public Course(String classTitle, int numStudentsEnrolled, String teacherName) {
        this.classTitle = classTitle;
        this.teacherName = teacherName;
        this.numStudentsEnrolled = numStudentsEnrolled;
    }

    public boolean equals(Course other){
        return this.classTitle.equals(other.classTitle) && this.numStudentsEnrolled == other.numStudentsEnrolled;
    }

    public int compareTo(Course other) {
        //return this.numStudentsEnrolled - other.numStudentsEnrolled;
        int diff = this.classTitle.compareTo(other.classTitle);
        if (diff != 0){
            return diff;
        }
        else {
            return this.numStudentsEnrolled - other.numStudentsEnrolled;
        }
    }


    public String getClassTitle() {
        return classTitle;
    }

    public void setClassTitle(String classTitle) {
        this.classTitle = classTitle;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getNumStudentsEnrolled() {
        return numStudentsEnrolled;
    }

    public void setNumStudentsEnrolled(int numStudentsEnrolled) {
        this.numStudentsEnrolled = numStudentsEnrolled;
    }
}
