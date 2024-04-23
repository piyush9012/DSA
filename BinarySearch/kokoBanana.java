// Problem Statement: Given two numbers N and M, find the Nth root of M. The nth root of a number M is defined as a number X when raised to the power N equals M. If the 'nth root is not an integer, return -1.

import java.util.*;

public class kokoBanana {
    public static int findMax(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, arr[i]);
        }
        return maxi;
    }

    public static int calculateTotalHours(int arr[], int hour) {
        int total = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            total += Math.ceil((double) arr[i] / (double) hour);
        }
        return total;
    }

    public static int minimumRateToEatBananas(int[] arr, int h) {
        int low = 1, high = findMax(arr);
        while (low <= high) {
            int mid = (low + high) / 2;
            int total = calculateTotalHours(arr, mid);
            if (total <= h)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 15, 6, 3 };
        int h = 8;
        int ans = minimumRateToEatBananas(arr, h);
        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
    }
}
