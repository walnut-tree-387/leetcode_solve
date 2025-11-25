package org.example.Ace75.Medium;

public class ProductOfArray {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int zeroCount = 0;
        int totalProduct = 1;
        for(int num : nums){
            if(num == 0){
                zeroCount++;
            }
            if(num != 0)totalProduct *= num;
        }
        if(zeroCount == 0){
            int idx = 0;
            for(int num : nums){
                res[idx] = totalProduct / num;
                idx++;
            }
        }
        else if(zeroCount == 1){
            int idx = 0;
            for(int num : nums){
                if(num == 0){
                    res[idx] = totalProduct;
                }
                else res[idx] = 0;
                idx++;
            }
        }
        return res;
    }
}
