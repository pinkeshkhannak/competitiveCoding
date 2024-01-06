class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        int arr[] = new int[2];
        for(int i = 0;i< nums.length;i++) {
            int ans = target - nums[i];
            if(hs.containsKey(ans)) {
                arr[0] = hs.get(ans);
                arr[1] = i;
                return arr;
            }
            else {
               hs.put(nums[i], i);
            }
        }
        return arr;
    }
}