class Solution {
    public boolean isAnagram(String s, String t) {

        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        String snew=new String(arr);

        char[] arr1=t.toCharArray();
        Arrays.sort(arr1);
        String tnew=new String(arr1);

        if(s.length()!=t.length()){
            return false;
        }

        for(int i=0;i<s.length();i++){
            if(snew.charAt(i)!=tnew.charAt(i)){
                return false;
            }
        }

        return true;

    }
}
