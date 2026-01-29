package practice_3;

public class University {
    static String universityName = "MGIMO";
    final int studentID;
    String studentName;

    University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public static String changeUniversityName(String newName) {
        return universityName = newName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void printStudentInfo() {
        System.out.println("имя " + studentName + " ID " + studentID + " университет " + universityName);
    }
}
