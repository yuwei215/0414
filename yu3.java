public class yu3 {

    // 每個分數 +5
    public static void addBonus(int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            scores[i] += 5;
        }
    }

    public static void main(String[] args) {
        int[] scores = {60,70};

        // 呼叫方法
        addBonus(scores);

        // 印出結果
        System.out.print("After bonus: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
    }
}