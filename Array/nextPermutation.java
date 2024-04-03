import java.util.*;

public class nextPermutation {
    public static int[] nextGreaterPermutation(int[] A) {
        int n = A.length; // size of the array.

        // Step 1: Find the break point:
        int index = -1; // break point
        for (int i = n - 2; i >= 0; i--) {
            if (A[i] < A[i + 1]) {
                index = i;     // index i is the break point
                break;
            }
        }

        // If break point does not exist:
        if (index == -1) {
            reverse(A, 0, n - 1);   // reverse the whole array:
            return A;
        }

        // Step 2: Find the next greater element and swap it with A[ind]:
        for (int i = n - 1; i > index; i--) {
            if (A[i] > A[index]) {
                int tmp = A[i];    // swap A[i] & A[tmp]
                A[i] = A[index];
                A[index] = tmp;
                break;
            }
        }

        // Step 3: reverse the right half:
        reverse(A, index + 1, n - 1);
        return A;
    }

    // Utility function to reverse an array within a given range
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        int[] A = {2, 1, 5, 4, 3, 0, 0};
        int[] ans = nextGreaterPermutation(A);

        System.out.print("The next permutation is: [");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("]");
    }
}
