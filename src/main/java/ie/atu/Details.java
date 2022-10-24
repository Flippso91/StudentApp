package ie.atu;

public class Details {
    private String studentName;
    private String studentEmail;
    private String studentCourse;

    public Details() {
        this.studentName = "";
        this.studentEmail = "";
        this.studentCourse = "";
    }

    public Details(String studentName) {
        this.studentName = studentName;
        this.studentEmail = "";
        this.studentCourse = "";
    }

    public Details(String studentName, String studentEmail, String studentCourse) {
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentCourse = studentCourse;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }
}
