// Problem Statement: Given an integer array, find the contiguous subarray (containing at least one number) which has the largest sum and returns its sum and prints the subarray.

import java.util.*;

public class Kadane {
    public static int maxSubarraySum(int arr[])
    {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
            
            if(sum > max){
                max = sum;
            }

            if(sum < 0) sum = 0;
        }
        return max;
    }
   public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int ans = maxSubarraySum(arr);
        System.out.println("The maximum subarray sum is: " + ans);
    }
}
