package com.example;

public class AlgorithmSortBinaryArray {

    public static void sortArray(int[] nums)
	{
		int left = 0;
        int right = nums.length - 1;

        while(left < right){
            
            //Move left pointer to the right until it points to a 1
            while (left < right && nums[left] == 0)
                left++;

            //Move right pointer to the left until it point to a 0
            while(left<right && nums[right] == 0)
                right--;
            
            // Swap nums[left] and nums[right]
            if(left < right){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
	}
}
