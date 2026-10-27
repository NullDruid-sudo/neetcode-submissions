class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();
        int[] ar = new int[2];
        for(int i = 0 ; i < nums.length;i++){
            if(set.contains(target - nums[i])){
                ar[1] = i;
                for(int j = 0; j < i;j++){
                    if(target-nums[i] == nums[j]){
                        ar[0] = j;break;
                    }
                }
                return ar;
            }
            set.add(nums[i]);
        }
    return new int[]{};
}}
