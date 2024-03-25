// Problem Statement: Given a Matrix, print the given matrix in spiral order.

public class spiral {
    public static int[] printSpiral(int[][] matrix) {
        int n = matrix.length;    // no. of rows
        int m = matrix[0].length; // no. of columns

        int[] ans = new int[n * m];
        int index = 0;
        int top = 0, left = 0, bottom = n-1, right = m-1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++)    // For moving left to right
                ans[index++] = matrix[top][i];
            top++;

            for (int i = top; i <= bottom; i++)    // For moving top to bottom.
                ans[index++] = matrix[i][right];
            right--;

            if (top <= bottom) {                   // For moving right to left.
                for (int i = right; i >= left; i--)
                    ans[index++] = matrix[bottom][i];
                bottom--;
            }

            if (left <= right) {                   // For moving bottom to top.
                for (int i = bottom; i >= top; i--)
                    ans[index++] = matrix[i][left];
                left++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix= {{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}};

        int[] ans = printSpiral(matrix);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}
