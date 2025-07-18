public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -3, 1};

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (sum == 3) {
                    // Print the subarray from i to j
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();  // move to next line after printing one subarray
                }
            }
        }
    }
}
