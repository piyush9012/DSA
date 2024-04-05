// Problem Statement: Given a sorted array of N integers and an integer x, find the upper bound of x.

public class Solution {
    public static int upperBound(int arr[], int n, int x){
        int ans = n;
        int low = 0, high = n-1;

        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] > x){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int n = 5, x = 8;
        int ind = upperBound(arr, n, x);
        System.out.println("The upper bound is the index: " + ind);
        System.out.println("The upper bound is the element: " + arr[ind]);
    }
}
