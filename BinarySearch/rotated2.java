// Problem Statement: Given an integer array arr of size N, sorted in ascending order (may contain duplicate values) and a target value k. Now the array is rotated at some pivot point unknown to you. Return True if k is present and otherwise, return False. 

import java.util.*;

public class rotated2.java {
    public static boolean searchRotatedSortedArrayII(ArrayList<Integer> arr, int target) {
        int n = arr.size();
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == target)
                return true;

            if (arr.get(low) == arr.get(mid) && arr.get(mid) == arr.get(high)) {
                low = low + 1;
                high = high - 1;
                continue;
            }

            if (arr.get(low) <= arr.get(mid)) {
                if (arr.get(low) <= target && target <= arr.get(mid))
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
                if (arr.get(mid) <= target && target <= arr.get(high))
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3, 1, 2, 3, 3, 3, 3, 3));
        int target = 3;
        boolean ans = searchRotatedSortedArrayII(arr, target);
        if (ans == false)
            System.out.println("Target is not present.");
        else
            System.out.println("Target is present in the array.");
    }
}
