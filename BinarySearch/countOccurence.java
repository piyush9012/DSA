// Problem Statement: You are given a sorted array containing N integers and a number X, you have to find the occurrences of X in the given array.

public class countOccurence{
    public static int firstOccurence(int arr[], int target, int n){
        int low = 0, high = n-1;
        int first = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                first = mid;
                high = mid-1;
            }
            else if(arr[mid] < target) low = mid+1;
            else high = mid-1;
        }
        return first;
    }

    public static int lastOccurence(int arr[], int target, int n){
        int low = 0, high = n-1;
        int last = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                last = mid;
                low = mid+1;
            }
            else if(arr[mid] < target) low = mid+1;
            else high = mid-1;
        }
        return last;
    }

    public static int count(int arr[], int target, int n){
        int first = firstOccurence(arr, target, n);
        if(first == -1) return 0;
        int last = lastOccurence(arr, target, n);
        return last - first + 1;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 4, 7, 8, 10};
        int n = arr.length;
        int target = 4;
        int ans = count(arr, target, n);
        System.out.println("Count is: " + ans);
    }
}
