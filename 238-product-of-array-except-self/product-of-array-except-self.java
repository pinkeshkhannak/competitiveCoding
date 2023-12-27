class Solution {
    public int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        int[] output = new int[N];
        output[0] = 1;
        for(int i =1;i<N;i++) {
            output[i] = output[i-1] * nums[i-1];
        }
        int r = 1;
        for(int i =N-1;i>=0;i--) {
            output[i] = output[i] * r;
            r = r * nums[i];
        }
        return output;
    }
}