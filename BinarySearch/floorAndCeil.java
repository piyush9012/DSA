// Problem Statement: You're given an sorted array arr of n integers and an integer x. Find the floor and ceiling of x in arr[0..n-1].
// The floor of x is the largest element in the array which is smaller than or equal to x.
// The ceiling of x is the smallest element in the array greater than or equal to x.

public class floorAndCeil {
    public static int getFloor(int arr[], int n, int x){
        int ans = n;
        int low = 0, high = n-1;

        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] <= x){
                ans = arr[mid];
                low = mid + 1;   //look for larger index on the left
            }
            else{
                high = mid - 1;   // look on the right
            }
        }
        return ans;
    }

    public static int getCeil(int arr[], int n, int x){
        int ans = n;
        int low = 0, high = n-1;

        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] >= x){
                ans = arr[mid];
                high = mid - 1;   //look for smaller index on the left
            }
            else{
                low = mid + 1;   // look on the right
            }
        }
        return ans;
    }
    
    public static int[] getFloorAndCeil(int arr[], int n, int x){
        int f = getFloor(arr, n, x);
        int c = getCeil(arr, n, x);
        return new int[] {f, c};
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int n = 6, x = 5;
        int[] ans = getFloorAndCeil(arr, n, x);
        System.out.println("The floor and ceil are: " + ans[0] + " " + ans[1]);
    }
}
