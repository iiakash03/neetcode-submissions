class Solution {

    public String encode(List<String> strs) {

        StringBuilder sb=new StringBuilder();

        for(String st:strs){
           sb.append(st.length()).append("#").append(st);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> li=new ArrayList<>();

        int j=0;

        for(int i=0;i<str.length();){
            j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int len=Integer.parseInt(str.substring(i,j));

            li.add(str.substring(j+1,j+1+len));
            i=j+1+len;
        }
        return li;
    }
}
