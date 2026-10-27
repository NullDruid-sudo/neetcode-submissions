class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        int[] a = new int[k];
        int i = 0;
        while(k-- != 0){
            int max = 0;
            int ke = 0;
            for(int s: map.keySet()){
                if(max < map.get(s)){
                    max = map.get(s);
                    ke = s;
                }
            }
            a[i++] = ke;
            map.remove(ke);

        }
        return a;
    }
}
