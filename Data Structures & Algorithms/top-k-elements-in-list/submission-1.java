class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map=new HashMap<>();
        
        int[] newLi=new int[k];
    

        for(int val:nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }

        List<Map.Entry<Integer,Integer>> li=new ArrayList<>(map.entrySet());
        
        Collections.sort(li,(a,b)->b.getValue()-a.getValue());
        
        Map<Integer,Integer> newMap=new LinkedHashMap<>();
        
        for(Map.Entry<Integer,Integer> entry:li){
            newMap.put(entry.getKey(), entry.getValue());
        }
        int count=0;
        for(int val:newMap.keySet()){
            if(count>=k){
                break;
            }
            newLi[count]=val;
            count++;
        }

        return newLi;
    }
}
