package Array;

public class MaximumVolumeContainer {

    public static int maxArea(int[] height) {
        int maxArea = 0;
        int i=0, j=height.length-1;
        while(i<j) {
            int area = Math.min(height[i], height[j]) * (j-i);
            if(area > maxArea) {
                maxArea = area;
            }
            if(height[i]<height[j])
                i++;
            else
                j--;
        }
        return maxArea;
    }

    public static void main(String []args){
        int a[]={1,1};
        System.out.print(MaximumVolumeContainer.maxArea(a));
    }
}
