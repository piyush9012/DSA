// Problem Statement: Given an array containing both positive and negative integers, we have to find the length of the longest subarray with the sum of all elements equal to zero.

import java.util.*;

public class longSubarray {
    public static int maxLen(int A[], int n) {
        HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();
        int maxi = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += A[i];
            if (sum == 0)
                maxi = i + 1;
            else {
                if (mpp.get(sum) != null)
                    maxi = Math.max(maxi, i - mpp.get(sum));
                else
                    mpp.put(sum, i);
            }
        }
        return maxi;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2 - 2, 4, -4};
        int n = arr.length;
        int ans = maxLen(arr, n);
        System.out.println("The length of longest subarray with sum 0 is: " + (ans+1));
    }
}
