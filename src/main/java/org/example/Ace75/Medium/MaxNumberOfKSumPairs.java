package org.example.Ace75.Medium;

import java.util.Arrays;

public class MaxNumberOfKSumPairs {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int cnt = 0;
        for(int i = 0, j = nums.length - 1; i < j;) {
            int temp = nums[i] + nums[j];
            if(temp > k) j--;
            else if(temp < k) i++;
            else {
                i++;
                j--;
                cnt++;
            }
        }
        return cnt;
    }
}
