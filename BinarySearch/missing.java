// Problem Statement: You are given a strictly increasing array ‘vec’ and a positive integer 'k'. Find the 'kth' positive integer missing from 'vec'.

import java.util.*;

public class missing {
    public static int missingK(int vec[], int k) {
        int n = vec.length;
        int low = 0, high = n-1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int missing = vec[mid] - (mid + 1);
            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high + 1 + k;
    }

    public static void main(String[] args) {
        int[] vec = {2, 3, 4, 7, 11};
        int k = 5;
        int ans = missingK(vec, k);
        System.out.println("The missing number is: " + ans);
    }
}
