public class Lab {
    private String techerName;
    private double avgGrade;
    private Student[] students;
    private int maxSize;
    private int currentSize;
    private String dayOfTheWeek;

    public Lab(String teacherName, String dayOfTheWeek, int maxSize) {
        this.techerName = teacherName;
        this.dayOfTheWeek = dayOfTheWeek;
        this.maxSize = maxSize;
        avgGrade = 0;
        currentSize = 0;
        students = new Student[maxSize];
    }

    public String getTecherName() {
        return techerName;
    }

    public double getAvgGrade() {
        calAvg();
        return avgGrade;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void enrollStudent(Student std) {
        if (currentSize == maxSize) {
            System.out.println("The class is full");
            return;
        }
        students[currentSize] = std;
        currentSize++;
    }

    private void calAvg() {
        double sum = 0;
        for(Student st: students) {
            if (st == null) break;
            sum += st.getGrade();
        }
        avgGrade = sum / currentSize;
    }


}
