class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] num:matrix){
            if(target > num[num.length - 1]){
                continue;
            }else if(target == num[num.length -1]){
                return true;
            }else{
                return (Arrays.binarySearch(num,target) < 0)?false:true;
            }
        }
        return false;
    }
}