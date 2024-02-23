class Solution {
    public int[] productExceptSelf(int[] nums) {
        int result[] = new int[nums.length];
        int prefix[] = new int[nums.length];
        int suffix[] = new int[nums.length];
        int product = 1;
        for(int i =0;i<nums.length;i++) {
            product = product * nums[i];
            prefix[i] = product;
        }
        product = 1;
        for(int i =nums.length-1;i>=0;i--) {
            product = product * nums[i];
            suffix[i] = product;
        }
        for(int i =0;i<nums.length;i++) {
            if(i == 0) {
                result[i] = suffix[i+1];
            }
            else if(i == nums.length-1) {
                result[i] = prefix[i-1];
            } else {
                result[i] =  prefix[i-1] * suffix[i+1];
            }
        }
        return result;
    }
}