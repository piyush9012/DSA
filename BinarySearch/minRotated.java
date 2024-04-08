// Problem Statement: Given an integer array arr of size N, sorted in ascending order (with distinct values). Now the array is rotated between 1 to N times which is unknown. Find the minimum element in the array. 

public class minRotated {
    public static int findMin(int arr[], int n){
        int ans = Integer.MAX_VALUE;
        int low = 0, high = n-1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[low] <= arr[mid]){
                ans = Math.min(ans, arr[low]);
                low = mid + 1;
            }
            else{
                ans = Math.min(ans, arr[mid]);
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {7, 8, 1, 2, 3, 4, 5, 6};
        int n= arr.length;
        int ans = findMin(arr, n);
        System.out.println("The minimum amongst the array element is: " + ans);
    }
}
