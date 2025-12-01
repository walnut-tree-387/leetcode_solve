package org.example.Ace75.Medium;

public class ContainerWithMostWater {
    // Shrink the container only to the side with min value, cause that was the reason container area got smaller
    public int maxArea(int[] height) {
        int maxLeft = Integer.MIN_VALUE;
        int maxLeftIndex = -1;
        int maxRight = Integer.MIN_VALUE;
        int  maxRightIndex = -1;
        int maxArea = 0;
        for(int i = 0, j = height.length - 1; i < j;) {
            if(height[i] > maxLeft) {
                maxLeft =  height[i];
                maxLeftIndex = i;
            }
            if(height[j] > maxRight) {
                maxRight = height[j];
                maxRightIndex = j;
            }
            if(maxLeft < maxRight) i++;
            else j--;
            int temp = Math.min(maxLeft, maxRight) * (maxRightIndex - maxLeftIndex);
            if(maxArea < temp) {
                maxArea = temp;
            }
        }
        return maxArea;
    }
}
