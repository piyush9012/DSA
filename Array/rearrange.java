// Variety 1
// Problem Statement: There is an array of size N with an equal number of positive and negative elements. Without altering the relative order of positive and negative elements, you must return an array of alternately positive and negative values.

import java.util.Arrays;

public class rearrange {
    public static void main(String[] args) {
        int[] arr = {1, 2, -4, -5};
        int[] ans = RearrangebySign(arr);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] RearrangebySign(int[] arr) {
        int[] ans = new int[arr.length];
        int posIndex = 0, negIndex = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                ans[negIndex] = arr[i];
                negIndex += 2;
            }
            else {
                ans[posIndex] = arr[i];
                posIndex += 2;
            }
        }
        return ans;
    }
}

// Variety-2
// Problem Statement: There’s an array ‘A’ of size ‘N’ with positive and negative elements (not necessarily equal). Without altering the relative order of positive and negative elements, you must return an array of alternately positive and negative values. The leftover elements should be placed at the very end in the same order as in array A.

public class rearrange {
    public static void main(String[] args) { 
        int n = 6;
        int[] arr = {1, 2, -4, -5, 3, 4};
        int[] ans = RearrangebySign(arr, n);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] RearrangebySign(int[] arr, int n) {
        // Define arrays to store positive and negative elements
        int[] pos = new int[n];
        int[] neg = new int[n];

        // Variables to track the counts of positive and negative elements
        int posCount = 0, negCount = 0;

        // Segregate the array into positives and negatives.
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0)
                pos[posCount++] = arr[i];
            else
                neg[negCount++] = arr[i];
        }

        // If positives are lesser than the negatives.
        if (posCount < negCount) {

            // First, fill array alternatively till the point where positives and negatives are equal in number.
            for (int i = 0; i < posCount; i++) {
                arr[2 * i] = pos[i];
                arr[2 * i + 1] = neg[i];
            }

            // Fill the remaining negatives at the end of the array.
            int index = posCount * 2;
            for (int i = posCount; i < negCount; i++) {
                arr[index++] = neg[i];
            }
        }

        // If negatives are lesser than the positives.
        else {
            // First, fill array alternatively till the point where positives and negatives are equal in number.
            for (int i = 0; i < negCount; i++) {
                arr[2 * i] = pos[i];
                arr[2 * i + 1] = neg[i];
            }

            // Fill the remaining positives at the end of the array.
            int index = negCount * 2;
            for (int i = negCount; i < posCount; i++) {
                arr[index++] = pos[i];
            }
        }
        return arr;
    }
}
