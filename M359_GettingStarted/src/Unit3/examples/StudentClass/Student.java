package Unit3.examples.StudentClass;

public class Student {
    private String fName, lName;
    private int idNum;

    public Student(String fName, String lName, int idNum){
        this.fName = fName;
        this.lName = lName;
        this.idNum = idNum;
    }

    public String getfName() {
        return fName;
    }
    public void setfName(String fName) {
        this.fName = fName;
    }
    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }
    public int getIdNum() {
        return idNum;
    }
    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public boolean equals(Student other){
        String student1 = this.getfName() + this.getlName();
        String student2 = other.getfName() + other.getlName();
        return student1.equals(student2);
    }

    public int compareTo(Student other){
        int diff = this.lName.compareTo(other.lName);
        if (diff != 0){
            return diff;
        }
        return this.fName.compareTo(other.lName);
    }
}
