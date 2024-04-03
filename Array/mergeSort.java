// Problem statement: Given two sorted arrays arr1[] and arr2[] of sizes n and m in non-decreasing order. Merge them in sorted order. Modify arr1 so that it contains the first N elements and modify arr2 so that it contains the last M elements.

import java.util.*;

public class mergeSort {
    public static void merge(long arr1[], long arr2[], int n, int m){
        int left = n-1;
        int right = 0;

        while(left >=0 && right < m){
            if(arr1[left] > arr2[right]){
                long temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            }
            else{
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }


    public static void main(String[] args) {
        long[] arr1 = {1, 2, 3, 6, 10};
        long[] arr2 = {0, 4, 7, 8, 9};
        int n = 5, m = 5;
        merge(arr1, arr2, n, m);
        System.out.println("The merged arrays are:");
        System.out.print("arr1[] = ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.print("\narr2[] = ");
        for (int i = 0; i < m; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }

}
