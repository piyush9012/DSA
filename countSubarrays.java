// Problem Statement: Given an array of integers and an integer k, return the total number of subarrays whose sum equals k.

import java.util.*;

public class countSubarrays {
    public static int findAllSubarraysWithGivenSum(int arr[], int k) {
        int n = arr.length; // size of the given array.
        Map<Integer, Integer> mpp = new HashMap<>();
        int preSum = 0, cnt = 0;

        mpp.put(0, 1); // Setting 0 in the map.
        for (int i = 0; i < n; i++) {
            preSum += arr[i];          // add current element to prefix Sum:
            int remove = preSum - k;   // Calculate x-k:

            // Add the number of subarrays to be removed:
            cnt += mpp.getOrDefault(remove, 0);

            // Update the count of prefix sum in the map.
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
        int k = 3;
        int cnt = findAllSubarraysWithGivenSum(arr, k);
        System.out.println("The number of subarrays is: " + cnt);
    }
}
