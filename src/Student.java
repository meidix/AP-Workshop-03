public class Student {
    private String firstName;
    private String lastName;
    private double grade;
    private String sID;

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
