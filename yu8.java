class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class yu8 {
    public static void main(String[] args) {

        // 建立3個學生
        Student[] students = {
            new Student("Tom", 85),
            new Student("Mary", 90),
            new Student("John", 78)
        };

        // 用迴圈印出
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + ": " + students[i].score);
        }
    }
}