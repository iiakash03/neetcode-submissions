class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        Set<List<Integer>> res=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            int left=i+1;
            int right=nums.length-1;
            

            while(left<right){
                List<Integer>temp=new ArrayList<>();
                if(nums[i]+nums[left]+nums[right]==0){
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    res.add(temp);
                    left++;right--;
                }else if(nums[i]+nums[left]+nums[right]>0){
                    right--;
                }else{
                    left++;
                }
            }

        }
        List<List<Integer>>out=new ArrayList<>(res);
        return out;
    }
}
