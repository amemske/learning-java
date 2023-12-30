package com.example;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
       System.out.println("Hello");


 //-- AlgorithmFindPairSum --//
       int[] nums1 = {8,7,2,5,3,1}; // integer array
       int target1 = 10;

       List<int[]> output1 = AlgorithmFindPairSum.findPairs(nums1, target1); // returns a List of integer arrays [{1, 2}, {4, 5}]

       for(int[] pair: output1){ // enhanced for loop, or foreach loop, so the list of integer arrays is output1 and loop variable is pair
            System.out.println("(" + pair[0] + "," + pair[1] + ")");
       }
//-- end AlgorithmFindPairSum --//


//-- AlgorithmSortBinaryArray --//
int[] numsA = {1,0,1,0,1,0,0,1};
AlgorithmSortBinaryArray.sortArray(numsA);
System.out.println(Arrays.toString(numsA)); ////use Arrays.toString to print the contents of the array and not the memory address

int[] numsB = {1,1};
AlgorithmSortBinaryArray.sortArray(numsB);
System.out.println(Arrays.toString(numsB)); //use Arrays.toString to print the contents of the array and not the memory address

//-- end AlgorithmSortBinaryArray --//


    }
}
