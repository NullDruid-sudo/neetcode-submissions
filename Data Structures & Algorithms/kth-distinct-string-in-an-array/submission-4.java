
class Solution {
    public String kthDistinct(String[] arr, int k) {
       List<String> array = new ArrayList<>();
       List<String> dup = new ArrayList<>();
       for(int i = 0;i < arr.length ;i++){
            if(array.contains(arr[i])){
                dup.add(arr[i]);
            }else{
                array.add(arr[i]);
            }
       }
       for(String i:dup)
       {
         if(array.contains(i))
         {
            array.remove(i);
         }
       }
       return (k<=array.size())?array.get(k-1):"";     

    }
}