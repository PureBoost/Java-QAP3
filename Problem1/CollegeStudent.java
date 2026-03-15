package Problem1;
// Subclass that extends student class

public class CollegeStudent extends Student {
	protected String MyMajor;
	protected int MyYear;

	public CollegeStudent(String name, int age, String gender, String myIdNum, Double myGPA, String MyMajor, int myYear) {
		super(name, age, gender, myIdNum, myGPA);
		this.MyMajor = MyMajor;
		this.MyYear = myYear;
	}

	public void SetMajor(String MyMajor) {
		this.MyMajor = MyMajor;
	}

	public String GetMajor() {
		return MyMajor;
	}

	public void SetYear(int MyYear) {
		this.MyYear = MyYear;
	}
	
	public int GetYear() {
		return MyYear;
	}

	public String toString() {
		return "College Student: " + super.toString() + ", Major: " + MyMajor + ", Year: " + MyYear;
	}

}
