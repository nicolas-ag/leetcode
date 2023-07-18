class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2]; 
        for(int i = 0; i < nums.length; i++){
            for(int y = i+1; y < nums.length; y++){
                if(nums[y] == target - nums[i]){
                    result[0] = i;
                    result[1] = y;
                }
            }
        }
        return result;
    }
}