// Problem statement: You are given a read-only array of N integers with values also in the range [1, N] both inclusive. Each integer appears exactly once except A which appears twice and B which is missing. The task is to find the repeating and missing numbers A and B where A repeats twice and B is missing.


// Better Solution using Hash Array

// import java.util.*;

// public class repeatmiss {
//     public static int[] findMissingRepeatingNumbers(int[] arr) {
//         int n = arr.length;
//         int hash[] = new int[n+1];    // hash array

//         for(int i=0; i<n; i++){
//             hash[arr[i]]++;
//         }

//         int repeating = -1, missing = -1;
//         for(int i=0; i<n; i++){
//             if(hash[i] == 2) repeating = i;
//             else if(hash[i] == 0) missing = i;

//             if(repeating != -1 && missing != -1)
//                 break;
//         }

//         int ans[] = {repeating, missing};
//         return ans;
//     }
//     public static void main(String[] args) {
//         int[] arr = {3, 1, 2, 5, 4, 6, 7, 5};
//         int[] ans = findMissingRepeatingNumbers(arr);
//         System.out.println("Repeating number is: "+ ans[0]);
//         System.out.println("Missing number is: " + ans[1]);
//     }
// }

// Optimal: Using Two equations of mathematics concept

import java.util.*;

public class repeatmiss {
    public static int[] findMissingRepeatingNumbers(int[] arr) {
        long n = arr.length;
        
        long SN = (n * (n+1))/2;
        long S2N = (n * (n+1) * (2*n+1))/6;

        long S = 0, S2 = 0;
        for(int i=0; i<n; i++){
            S += arr[i];
            S2 += (long)arr[i] * (long)arr[i];
        }

        long val1 = S - SN; 
        long val2 = S2 - S2N;
        val2 = val2 / val1;

        long x = (val1 + val2)/2;
        long y = x - val1;

        int ans[] = {(int)x, (int)y};
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5, 4, 6, 7, 5};
        int[] ans = findMissingRepeatingNumbers(arr);
        System.out.println("Repeating number is: "+ ans[0]);
        System.out.println("Missing number is: " + ans[1]);
    }
}
