class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){return 0;}
        HashSet<Integer> set = new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        Integer[] arr = set.toArray(new Integer[set.size()]);
        Arrays.sort(arr);
        int max = 0;
        int count = 1;
        for(int i = 0;i < arr.length - 1 ; i++){
            if( arr[i] +1 == arr[i+1]){
                count ++;
            }else{
            if(count > max){
                max = count;
            }
            count = 1;
            }
        }
        return (max > count)?max:count; 
    }
}
