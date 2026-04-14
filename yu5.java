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

public class yu5 {

    // 如果低於60，加10分
    public static void curve(Student s) {
        if (s.score < 60) {
            s.score += 10;
        }
    }

    public static void main(String[] args) {

        Student s1 = new Student("Tom", 55);

        // 加分前
        System.out.print("Before: ");
        s1.printInfo();

        // 呼叫curve
        curve(s1);

        // 加分後
        System.out.print("After: ");
        s1.printInfo();
    }
}