public class yu {
    public static void main(String[] args) {
        
        int[] scores = {70, 80, 90};
        
        int sum = 0;
        
        // 加總
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        
        // 平均
        double average = (double) sum / scores.length;
        
        // 輸出
        System.out.println("Average score = " + average);
    }
}