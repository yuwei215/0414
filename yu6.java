

class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class yu6 {
    public static void main(String[] args) {

        // 建立學生陣列
        Student[] students = {
            new Student("Tom", 45),
            new Student("Amy", 60),
            new Student("John", 80),
            new Student("Mary", 59),
            new Student("Willy",100)
        };

        int count = 0;

        // 計算及格人數
        for (int i = 0; i < students.length; i++) {
            if (students[i].score >= 60) {
                count++;
            }
        }

        // 輸出結果
        System.out.println("Number of passing students = " + count);
    }
}