class Solution {
    public int maxArea(int[] heights) {

        int left=0;
        int right=heights.length-1;

        int minh=0;
        int area=0;
        int maxArea=0;

        while(left<right){

            minh=Math.min(heights[left],heights[right]);
            
            maxArea=Math.max(maxArea,(right-left)*minh);

            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
        
    }
}
