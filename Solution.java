// Problem Statement: Given an array and a sum k, print the length of longest subarray that sums to k.
// Sub array: Contiguous part of an array.
// Longest Subarray with sum K [Postives]

// Brute Force Approach

// import java.util.*;
// public class Solution {
//     public static int getLongestSubarray(int []a, int k) {
//         int n = a.length; // size of the array.

//         int len = 0;
//         for (int i = 0; i < n; i++) { // starting index
//             for (int j = i; j < n; j++) { // ending index
//                 // add all the elements of
//                 // subarray = a[i...j]:
//                 int s = 0;
//                 for (int K = i; K <= j; K++) {
//                     s += a[K];
//                 }

//                 if (s == k)
//                     len = Math.max(len, j - i + 1);
//             }
//         }
//         return len;
//     }

//     public static void main(String[] args) {
//         int[] a = { -1, 1, 1};
//         int k = 1;
//         int len = getLongestSubarray(a, k);
//         System.out.println("The length of the longest subarray is: " + len);
//     }
// }

// Optimal Solution - 2 pointer Technique

import java.util.*;
public class Solution {
    public static int getLongestSubarray(int []a, long k) {
        int n = a.length; // size of the array.

        int left = 0, right = 0; // 2 pointers
        long sum = a[0];
        int maxLen = 0;
        while (right < n) {
            // if sum > k, reduce the subarray from left until sum becomes less or equal to k:
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }

            // if sum = k, update the maxLen i.e. answer:
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move forward thw right pointer:
            right++;
            if (right < n) sum += a[right];
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 10;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}
