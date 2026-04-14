class Student {
    String name;
    int score;

    // 建構子
    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // 方法：顯示資料
    void printInfo() {
        System.out.println(name + ": " + score);
    }
}

public class yu4 {
    public static void main(String[] args) {

        // 建立物件
        Student s = new Student("Tom", 85);

        // 呼叫方法
        s.printInfo();
    }
}