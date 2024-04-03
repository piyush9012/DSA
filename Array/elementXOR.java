// Problem Statement: Given an array of integers A and an integer B. Find the total number of subarrays having bitwise XOR of all elements equal to k.a

import java.util.*;

public class elementXOR {
    public static int maxLen(int arr[], int k) {
        int count = 0;
        int xor = 0;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0,1);
        for(int i = 0; i< arr.length; i++){
            xor = xor ^ arr[i];
            int x = xor ^ k;

            if(mpp.containsKey(x)){
                count += mpp.get(x);
            }
            if(mpp.containsKey(xor)){
                mpp.put(xor, mpp.get(xor)+1);
            }
            else{
                mpp.put(xor, 1);
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int[] arr = { 4, 2, 2, 6, 4};
        int k = 6;
        int ans = maxLen(arr, k);
        System.out.println("Total number of subarrays having bitwise XOR of all elements equal to k: " + ans);
    }
}
