package Problem1;
// The student class is derived from the person class and used as a starting point for the college student class.

public class Student extends Person {
    protected String myStudentID; // student ID number
    protected Double myGPA; // student's GPA

    public Student(String name, int age, String gender, String MyIdNum, Double myGPA) {
        super(name, age, gender);
        myStudentID = MyIdNum;
        this.myGPA = myGPA;
    }

    public void setStudentID(String studentID) {
        this.myStudentID = studentID;
    }

    public String getStudentID() {
        return myStudentID;
    }

    public void setGPA(Double GPA) {
        this.myGPA = GPA;
    }

    public Double getGPA() {
        return myGPA;
    }

    public String toString() {
        return "Student: " + super.toString() + ", Student ID: " + myStudentID + ", GPA: " + myGPA;
    }
}
 