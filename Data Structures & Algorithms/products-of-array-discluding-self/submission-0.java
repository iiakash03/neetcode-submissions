class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int [] pre=new int[nums.length+1];
        int [] post=new int[nums.length+1];

        int [] res=new int[nums.length];

        int multiply=1;
        pre[0]=multiply;
        for(int i=1;i<nums.length;i++){
            multiply=multiply*nums[i-1];
            pre[i]=multiply;
        }

        multiply=1;
        post[nums.length]=multiply;
        for(int i=nums.length-1;i>=0;i--){
            post[i]=multiply;
            multiply=multiply*nums[i];
        }

        for(int i=0;i<nums.length;i++){
            res[i]=pre[i]*post[i];
        }

        return res;
    }
}  
