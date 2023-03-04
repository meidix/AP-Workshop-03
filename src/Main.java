public class Main {
    public static void main(String[] args) {
        Student std1 = new Student("James", "Hassani", "40192837");
        System.out.println(std1.getFullName());
        std1.printStudentInfo();

        std1.setGrade(20);
        std1.printStudentInfo();

        Lab myLab = new Lab("Doctor ZeinAli", "Shanbe", 20);

        System.out.println("Adding a new student to the lab");
        myLab.enrollStudent(std1);
        System.out.println(myLab.getCurrentSize());
        System.out.println(myLab.getMaxSize());
        Student std2 = new Student("James", "Hoffman", "401298347");
        std2.setGrade(17);
        myLab.enrollStudent(std2);
        System.out.println(myLab.getCurrentSize());
        System.out.println(myLab.getAvgGrade());

    }
}