class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
         int n = nums.size();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int p = nums.get(i);

            if (p == 2) {
                ans[i] = -1;
                continue;
            }

            int found = -1;

            for (int x = 0; x < p; x++) {
                if ((x | (x + 1)) == p) {
                    found = x;
                    break;
                }
            }

            ans[i] = found;
        }

        return ans;
    }
}