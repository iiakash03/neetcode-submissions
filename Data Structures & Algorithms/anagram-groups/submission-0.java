class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> li=new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();

        for(int i=0;i<strs.length;i++){
            char [] arr=strs[i].toCharArray();
            Arrays.sort(arr);
            String s=new String(arr);
            if(map.containsKey(s)){
                List<String> mapLi=map.get(s);
                mapLi.add(strs[i]);
                map.put(s,mapLi);
            }else{
                List<String> newLi=new ArrayList<>();
                newLi.add(strs[i]);
                map.put(s,newLi);
            }
        }

        for(List<String> val:map.values()){
            li.add(val);
        }
        return li;


    }
}
