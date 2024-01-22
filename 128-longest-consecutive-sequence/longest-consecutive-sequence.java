class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        
        Set<Integer> hs = new HashSet<>();
        for(int i =0;i<nums.length;i++) {
            hs.add(nums[i]);
        }
        int longest = 1;
        for(int i =0;i< nums.length;i++) {
            if(!hs.contains(nums[i]-1)) {
                int count = 1;
                int num = nums[i];
                while(hs.contains(num+1)) {
                    count++;
                    num++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    } 
}