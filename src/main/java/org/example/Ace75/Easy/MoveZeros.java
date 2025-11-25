package org.example.Ace75.Easy;

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int stIdx = 0, zeroCnt = 0;
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != 0){
                nums[stIdx] = nums[index];
                stIdx++;
            }
            else zeroCnt++;
        }
        for(int i = 0; i < zeroCnt; i++){
            nums[stIdx] = 0;
            stIdx++;
        }
        for(Integer num : nums){
            System.out.print(num + " ");
        }
    }
}
