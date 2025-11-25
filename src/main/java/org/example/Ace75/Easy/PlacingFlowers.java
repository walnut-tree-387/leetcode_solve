package org.example.Ace75.Easy;

public class PlacingFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int cnt = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (i == 0) {
                if(flowerbed.length == 1){
                    if(flowerbed[0] == 0)cnt++;
                }
                else {
                    if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                        flowerbed[i] = 1;
                        cnt++;
                    }
                }
            } else if (i == flowerbed.length - 1) {
                if (flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
                    cnt++;
                    flowerbed[i] = 1;
                }
            } else {
                if (flowerbed[i] == 0 && flowerbed[i + 1] == 0 && flowerbed[i - 1] == 0) {
                    cnt++;
                    flowerbed[i] = 1;
                }
            }
        }
        return cnt >= n;
    }
}
