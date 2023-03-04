/**
 * @author meidix
 * This class is used to store students
 */
public class Student {
    private String firstName;
    private String lastName;
    private double grade;
    private String sID;

    /**
     * This constructor is used to create instances of students
     * @param firstName the first name of the student
     * @param lastName the last name of the student
     * @param sID the unique student id of the student
     */
    /*
    This will no show in the javadoc
     */
    public Student(String firstName, String lastName, String sID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sID = sID;
        this.grade = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGrade() {
        return grade;
    }

    public String getsID() {
        return sID;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getFullName() {
        String temp = firstName.concat(" ");
        return temp.concat(lastName);
    }

    public void printStudentInfo() {
        System.out.println(firstName + " " + lastName + " " + sID + " " + grade);
    }
}
