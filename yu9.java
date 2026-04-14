class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    void printInfo() {
        System.out.println(name + ": " + score);
    }
}

public class yu9 {

    // 更新分數方法
    public static void updateScore(Student s, int newScore) {
        s.score = newScore;
    }

    public static void main(String[] args) {

        Student s1 = new Student("Tom", 85);

        // 更新前
        System.out.print("Before: ");
        s1.printInfo();

        // 更新分數
        updateScore(s1, 95);

        // 更新後
        System.out.print("After: ");
        s1.printInfo();
    }
}