package org.example.DailyStreak;

public class KLengthApart {
    public boolean kLengthApart(int[] nums, int k) {
        int cnt = 0;
        boolean flag = false;
        for (int num : nums) {
            if (num == 1) {
                if (cnt < k && flag) {
                    return false;
                } else cnt = 0;
                flag = true;
            } else cnt++;
        }
        return true;
    }
}
