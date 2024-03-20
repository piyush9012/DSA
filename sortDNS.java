// Problem Statement: Given an array consisting of only 0s, 1s, and 2s
// Write a program to in-place sort the array without using inbuilt sort functions. ( Expected: Single pass- O(N) and constant space)

import java.util.*;

public class sortDNS{
    public static void sortArray(int arr[], int n){
        int low = 0, mid = 0, high = n-1, temp;
        while(mid <= high){
            if(arr[mid] == 0){
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            
            else if(arr[mid] == 1){
                mid++;
            }

            else {
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int n = 6;
        int arr[] = {0, 2, 1, 2, 0, 1};
        System.out.print("Before sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sortArray(arr, n);
        System.out.print("After sorting : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
