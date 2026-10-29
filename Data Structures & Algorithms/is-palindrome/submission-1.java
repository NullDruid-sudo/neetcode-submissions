class Solution {
    public boolean isPalindrome(String s) {
        String சோதனை = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        for(int i = 0;i <சோதனை.length() / 2;i++){
            if(சோதனை.charAt(i) != சோதனை.charAt(சோதனை.length()-1 - i)){
                return false;
            }
        }
        return true;
        
    }
}
