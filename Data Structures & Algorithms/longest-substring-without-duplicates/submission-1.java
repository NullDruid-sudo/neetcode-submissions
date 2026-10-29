class Solution {
    public int lengthOfLongestSubstring(String a) {
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int n = 0;
        int left = 0;

        for (char s : a.toCharArray()) {
            while (set.contains(s)) {
                set.remove(a.charAt(left));
                left++;
                n--;
            }

            set.add(s);
            n++;

            if (n > max) {
                max = n;
            }
        }

        return max;
    }
}