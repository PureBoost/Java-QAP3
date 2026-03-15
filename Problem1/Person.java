package Problem1;
// The person class, used as a starting point for the teacher class.

public class Person {
    protected String myName; // name of the person
    protected int myAge; // person’s age
    protected String myGender; // "M" for male, "F" for female

    public Person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    public void setName(String name) {
        this.myName = name;
    }

    public String getName() {
        return myName;
    }

    public void setAge(int age) {
        this.myAge = age;
    }

    public int getAge() {
        return myAge;
    }

    public void setGender(String gender) {
        this.myGender = gender;
    }

    public String getGender() {
        return myGender;
    }

    public String toString() {
        return "Name: " + myName + ", Age: " + myAge + ", Gender: " + myGender;
    }
}