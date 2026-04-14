public class yu10 {
    public static void main(String[] args) {

        int[] scores = {70, 85, 62, 90,58};

        int min = scores[0]; // 先假設第一個最小

        // 找最小值
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
        }

        // 輸出
        System.out.println("Minimum score = " + min);
    }
}