package org.example.Ace75.Medium;

public class IncreasingTripletSubsequence {
    // Example Test Case to think 3, 10, 9, 4, 8 -- Greedy Solution
    public boolean increasingTriplet(int[] nums) {
        int firstMax =  nums[nums.length - 1];
        int secondMax = Integer.MAX_VALUE;
        int contender = Integer.MIN_VALUE;
        for(int i = nums.length - 2; i >= 0; i--){
            if(secondMax == Integer.MAX_VALUE){
                if(nums[i] <  firstMax){
                    secondMax = nums[i];
                }
                else firstMax = nums[i];
            }
            else{
                if(nums[i] < secondMax){
                    return true;
                }
                else {
                    if(nums[i] <  firstMax){
                        secondMax = nums[i];
                    }
                    else {
                        if(contender == Integer.MIN_VALUE){
                            contender = nums[i];
                        }
                        else {
                            if(nums[i] < contender){
                                firstMax = contender;
                                secondMax = nums[i];
                                contender = Integer.MIN_VALUE;
                            }
                            else contender = nums[i];
                        }
                    }
                }
            }
        }
        return false;
    }
}
