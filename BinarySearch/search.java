// Problem Statement: Given a sorted array of distinct values and a target value x. Search for the index of the target value in the array.

public class search {
    public static int searchInsert(int arr[], int n, int x){
        int ans = n;
        int low = 0, high = n-1;

        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] >= x){
                ans = mid;
                high = mid - 1;   //look for smaller index on the left
            }
            else{
                low = mid + 1;   // look on the right
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int n = 5, x = 9;
        int ind = searchInsert(arr, n, x);
        System.out.println("The index is: " + ind);
    }
}
