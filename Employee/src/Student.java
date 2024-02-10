public class Student {
    private String student;
    private String course;
    private int year;

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Student(String Student, String Course, int year) {
        this.course = Course;
        this.student = Student;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student='" + student + '\'' +
                ", course='" + course + '\'' +
                ", year=" + year +
                '}';
    }
}
