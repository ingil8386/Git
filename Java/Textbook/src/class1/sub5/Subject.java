package class1.sub5;

public class Subject {

    private String subName;
    private Student[] students;
    private int studentCount;

    public Subject(String subName) {
        this.subName = subName;
        this.students = new Student[10];
        this.studentCount = 0;
    }

    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
        } else {
            System.out.println("더 이상 학생을 추가할 수 없습니다.");
        }
    }

    public void printSubjectInfo() {
        System.out.println("과목 이름: " + subName);
        System.out.println("수강 학생 목록");

        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i].getName());
        }
    }

    public String getSubName() {
        return subName;
    }
}