public class PrefixSum {
    public static void summm(int arr[]) {
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        // Compute the prefix sum array
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Compute max subarray sum using prefix sum
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currsum = (start == 0) ? prefix[end] : (prefix[end] - prefix[start - 1]);
                if (maxSum < currsum) {
                    maxSum = currsum;
                }
            }
        }
        System.out.println("Max sum = " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        summm(arr);
    }
}
