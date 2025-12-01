package org.example;
import org.example.Ace75.Medium.ContainerWithMostWater;
import org.example.Ace75.Medium.MaxNumberOfKSumPairs;

public class Main {
    public static void main(String[] args) {
        MaxNumberOfKSumPairs obj = new MaxNumberOfKSumPairs();
        int[] heights = {1,2,3,4};
        System.out.println(obj.maxOperations(heights, 5));
    }
}