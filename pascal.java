// Program to generate Pascal’s Triangle

// Problem Statement: This problem has 3 variations. They are stated below:

// Variation 1: Given row number r and column number c. Print the element at position (r, c) in Pascal’s triangle.

import java.util.*;

public class pascal {
    public static long nCr(int n, int r) {
        long res = 1;

        // calculating nCr:
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    public static int pascalTriangle(int r, int c) {
        int element = (int) nCr(r - 1, c - 1);
        return element;
    }

    public static void main(String[] args) {
        int r = 5; // row number
        int c = 3; // col number
        int element = pascalTriangle(r, c);
        System.out.println("The element at position (r,c) is: " + element);
    }
}  

// Variation 2: Given the row number n. Print the n-th row of Pascal’s triangle.

import java.util.*;

public class Main {

    public static long nCr(int n, int r) {
        long res = 1;

        // calculating nCr:
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    public static void pascalTriangle(int n) {
        // printing the entire row n:
        for (int c = 1; c <= n; c++) {
            System.out.print(nCr(n - 1, c - 1) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 5;
        pascalTriangle(n);
    }
}
    
// Variation 3: Given the number of rows n. Print the first n rows of Pascal’s triangle.

import java.util.*;

public class pascal {
    public static List<Integer> generateRow(int row) {
        long ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);

        for(int col = 1; col < row; col++){
            ans = ans*(row-col);
            ans = ans / (col);
            ansRow.add((int)ans);
        }
        return ansRow;
    }

    public static List<List<Integer>> pascalTriangle (int n){
        List<List<Integer>> ans = new ArrayList<>();
        for(int row=1; row<= n; row++){
            ans.add(generateRow(row));
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 6;
        List<List<Integer>> ans = pascalTriangle(n);
        for (List<Integer> it : ans) {
            for (int ele : it) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
