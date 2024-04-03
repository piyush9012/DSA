// Problem statement:

import java.util.*;

public class countInversions {
    private static int merge(int arr[], int low, int mid, int high){
        ArrayList <Integer> temp = new ArrayList<>();
        int left = low; 
        int right = mid + 1;

        int count = 0;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left++]);
            }
            else{
                temp.add(arr[right++]);
                count += mid - left + 1;
            }
        }

        while (left <= mid) {
            temp.add(arr[left++]);
        }

        while (right <= high) {
            temp.add(arr[right++]);
        }

        for(int i = low; i <= high; i++)
            arr[i] = temp.get(i - low);

        return count;
    }

    public static int mergeSort(int arr[], int low, int high){
        int count = 0;
        if(low >= high) return count;
        int mid = (low + high) / 2;
        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid+1, high);
        count += merge(arr, low, mid, high);
        return count;
    }

    public static int numberOfInversions(int[] a, int n) {
        return mergeSort(a, 0, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 3, 1, 2};
        int n = arr.length;
        int cnt = numberOfInversions(arr, n);
        System.out.println("The number of inversions are: " + cnt);
    }
}
