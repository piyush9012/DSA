// Problem Statement: Given an array that contains both negative and positive integers, find the maximum product subarray.

import java.util.*;

public class product {
    public static int maxProduct(int arr[], int n) {
        int pre = 1, suf = 1;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (pre == 0) pre = 1;
            if (suf == 0) suf = 1;
            pre *= arr[i];
            suf *= arr[n - i - 1];
            ans = Math.max(ans, Math.max(pre, suf));
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] =  {1, 2, -3, 0, -4, -5};
        int n = arr.length;
        int ans = maxProduct(arr, n);
        System.out.println("The number of inversions are: " + ans);
    }
}
