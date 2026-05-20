class Solution {
    public boolean isPalindrome(String s) {


       String str=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();

        String sb=new StringBuilder(str).reverse().toString();

        return str.equals(sb);
        
    }
}
