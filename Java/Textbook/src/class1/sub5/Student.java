package class1.sub5;

public class Student {
    private String name;          // 학생 이름
    private String studentId;     // 학생 아이디
    private Subject[] subjects;   // 학생이 수강하는 과목 배열
    private int[] scores;         // 학생의 각 과목 성적 배열
    private int subjectCount;     // 현재 수강 중인 과목 수
	
	public Student(String name, String studentId) {
        this.name = name;                  // 학생 이름 초기화
        this.studentId = studentId;        // 학생 아이디 초기화
        this.subjects = new Subject[10];   // 과목 배열 크기 10으로 초기화
        this.scores = new int[10];         // 점수 배열 크기 10으로 초기화
        this.subjectCount = 0;             // 현재 수강 과목 수 0으로 초기화
	}
	
    public void enrollSubject(Subject subject) {
        // 과목을 수강 신청
        if (subjectCount < subjects.length) {
            subjects[subjectCount] = subject;
            scores[subjectCount] = 0;
            subjectCount++;

            subject.addStudent(this);
        } else {
            System.out.println("더 이상 과목을 신청할 수 없습니다.");
        }
    }
	
    public void setScore(Subject subject, int score) {
        // 특정 과목의 성적 입력
        for (int i = 0; i < subjectCount; i++) {
            if (subjects[i] == subject) {
                scores[i] = score;
                return;
            }
        }

        System.out.println("수강 중인 과목이 아닙니다.");
    }
	
    public void printStudentInfo() {
        // 학생의 이름, ID, 수강 과목 및 성적 출력
        System.out.println("학생 이름: " + name);
        System.out.println("학생 ID: " + studentId);
        System.out.println("수강 과목 및 성적");

        for (int i = 0; i < subjectCount; i++) {
            System.out.println(subjects[i].getSubName() + " : " + scores[i] + "점");
        }
    }
	
	public String getName() {
		return name;
	}
}
