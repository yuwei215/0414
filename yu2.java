public class yu2 {

    // 找最大值的方法
    public static int findMax(int[] arr) {
        int max = arr[0];  // 先假設第一個是最大

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  // 更新最大值
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 8, 2, 9, 5};

        int result = findMax(numbers);

        System.out.println("Max value = " + result);
    }
}