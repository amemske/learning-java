package com.example;

import java.util.ArrayList;
import java.util.List;

public class AlgorithmFindPairSum {
     public static List<int[]> findPairs(int[] nums, int target) {
        List<int[]> pairs = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target ) {
                    pairs.add(new int[]{nums[i], nums[j]});
                }
            }
        }
        return pairs;
     }
}
