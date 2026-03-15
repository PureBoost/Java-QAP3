package Problem1;
// Subclass that extends person class

public class Teacher extends Person {
    protected String mySubject;
    protected Double mySalary;

	public Teacher(String name, int age, String gender, String mySubject, Double mySalary) {
		super(name, age, gender);
		this.mySubject = mySubject;
		this.mySalary = mySalary;
	}

	public void setSubject (String subject) {
		this.mySubject = subject;
	}

	public String getSubject() {
		return mySubject;
	}

	public void setSalary(Double salary) {
		this.mySalary = salary;
	}

	public Double getSalary() {
		return mySalary;
	}

	public String toString() {
		return "Teacher: " + super.toString() + ", Subject: " + mySubject + ", Salary: " + mySalary;
	}
}
