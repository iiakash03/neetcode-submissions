class Solution {
    public int longestConsecutive(int[] nums) {
        
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],1);
        }

        int count=0;
        int max=0;

        for(int i=0;i<nums.length;i++){

            int val=nums[i];
            count=0;
            while(map.containsKey(val)){
                count++;
                val++;
            }
            max=Math.max(count,max);
        }
        return max;
    }
}
