class Solution {
    public boolean isPalindrome(String s) {
        String test = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        for(int i = 0;i <test.length() / 2;i++){
            if(test.charAt(i) != test.charAt(test.length()-1 - i)){
                return false;
            }
        }
        return true;
        
    }
}
