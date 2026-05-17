class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map=new HashMap<>();
        int [] res=new int[2];

        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            if(map.containsKey(target-val)){
                res[0]=i;
                res[1]=map.get(target-val);
            }else{
                map.put(val,i);
            }
        }
        Arrays.sort(res);
        return res;

        
    }
}
