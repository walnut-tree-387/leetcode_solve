package org.example.Ace75.Easy;

import java.util.ArrayList;
import java.util.List;

public class KidsWithHighestCandy {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = -1;
        for (int candy : candies) {
            max = Math.max(candy, max);
        }
        for(int candy : candies) {
            if(candy + extraCandies >= max) result.add(true);
            else result.add(false);
        }
        return result;
    }
}
