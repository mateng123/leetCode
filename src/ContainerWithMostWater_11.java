public class ContainerWithMostWater_11 {

    public int maxArea(int[] height) {
        int maxArea = 0;
        int left=0,right=height.length-1;

        int step = height.length-1;
        while(step>0){
            if(height[left]>height[right]){
                maxArea = maxArea>(step*height[right]) ? maxArea:(step*height[right]);
                right--;
            }else{
                maxArea = maxArea>(step*height[left]) ? maxArea:(step*height[left]);
                left++;
            }
            step--;
        }
        return maxArea;
    }
}
