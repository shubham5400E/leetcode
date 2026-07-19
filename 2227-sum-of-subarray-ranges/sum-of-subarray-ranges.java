class Solution {
    public long subArrayRanges(int[] arr) {
          int n = arr.length;

        // Variable to store the final sum
        long sum = 0;

        // Traverse each starting index of subarrays
        for (int i = 0; i < n; i++) {

            // Initialize smallest and largest for current subarray
            int smallest = arr[i];
            int largest = arr[i];

            // Traverse subarrays starting from i
            for (int j = i; j < n; j++) {
                // Update smallest element seen so far
                smallest = Math.min(smallest, arr[j]);

                // Update largest element seen so far
                largest = Math.max(largest, arr[j]);

                // Add the current range (max - min) to the total sum
                sum += (largest - smallest);
            }
        }

        // Return the computed total sum
        return sum;
    }
}