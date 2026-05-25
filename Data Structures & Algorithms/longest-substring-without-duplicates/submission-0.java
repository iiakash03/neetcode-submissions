class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left=0;
        int maxLen=0;

        Set<Character>set=new HashSet<>();

        for(int i=0;i<s.length();i++){

            char c=s.charAt(i);

            while(left<s.length() && set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);

            maxLen=Math.max(set.size(),maxLen);

        }
        return maxLen;
    }
}
