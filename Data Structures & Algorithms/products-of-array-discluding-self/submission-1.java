class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] i = new int[nums.length];
        Arrays.fill(i,1);
        int left = 1;
        for(int j = 0; j< nums.length;j++){
            i[j]*= left;
            left *= nums[j];
        }
        int right = 1;
        for(int k = nums.length -1;k>=0;k--){
            i[k] *= right;
            right*= nums[k];
        }

        return i;
    }
}  
