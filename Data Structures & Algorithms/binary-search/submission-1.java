class Solution {
    public int search(int[] nums, int target) {
        return binarysearch(nums,0,nums.length -1,target);
    }
    public int binarysearch(int[] nums,int left,int right,int target){
        if(left > right)return -1;
        int middle = left + (right-left)/2;
        if(nums[middle] == target){
            return middle;
        }
        if(nums[middle] > target){return binarysearch(nums,left,middle -1,target);}
        return binarysearch(nums,middle+1,right,target);
    }
}
