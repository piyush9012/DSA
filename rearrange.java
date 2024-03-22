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
