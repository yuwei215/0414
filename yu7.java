public class yu7 {

    // 加總方法
    public static int sum(int[] arr) {
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        return total;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};

        int result = sum(numbers);

        System.out.println("Sum = " + result);
    }
}