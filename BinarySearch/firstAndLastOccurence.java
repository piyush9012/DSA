// Problem Statement: Given a sorted array of N integers, write a program to find the index of the first & last occurrence of the target key. If the target is not found then return -1.

// Brute Solution

// public class firstAndLastOccurence {
//     public static int[] firstLastOccurence(int arr[], int n){
//         int first = -1, last = -1;
//         for(int i=0; i< arr.length; i++){
//             if(arr[i] == n){
//                 if(first == -1)
//                     first = i;
//                 else 
//                     last = i;
//             }
//         }
//         int ans[] = {first, last};
//         return ans;
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 4, 4, 7, 8, 10};
//         int n = 4;
//         int ans[] = firstLastOccurence(arr, n);
//         System.out.println("First Occurence is: " + ans[0]);
//         System.out.println("Last Occurence is: " + ans[1]);
//     }
// }

// Optimal Solution

// public class firstAndLastOccurence{
//     public static int lowerBound(int arr[], int target, int n){
//         int low = 0, high = n-1;
//         int ans = n;
//         while (low <= high){
//             int mid = (low + high)/2;
//             if(arr[mid] >= target){
//                 ans = mid;
//                 high = mid-1;
//             }
//             else{
//                 low = mid+1;
//             }
//         }
//         return ans;
//     }

//     public static int upperBound(int arr[], int target, int n){
//         int low = 0, high = n-1;
//         int ans = n;
//         while (low <= high){
//             int mid = (low + high)/2;
//             if(arr[mid] > target){
//                 ans = mid;
//                 high = mid-1;
//             }
//             else{
//                 low = mid+1;
//             }
//         }
//         return ans;
//     }

//     public static int[] firstLastOccurence(int arr[], int target, int n){
//         int lb = lowerBound(arr, target, n);
//         if(lb == n || arr[lb] != target){
//             int ans[] =  {-1, -1};
//             return ans;
//         }
//         else{
//             int ans[] = {lb, upperBound(arr, target, n)-1};
//             return ans;
//         } 
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 4, 4, 7, 8, 10};
//         int n = arr.length;
//         int target = 4;
//         int ans[] = firstLastOccurence(arr, target, n);
//         System.out.println("First Occurence is: " + ans[0]);
//         System.out.println("Last Occurence is: " + ans[1]);
//     }
// }

// Without using upperbound and Lowerbound functions

public class firstAndLastOccurence{
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

    public static int[] firstLastOccurence(int arr[], int target, int n){
        int first = firstOccurence(arr, target, n);
        if(first == -1){
            int ans[] = {-1,-1};
            return ans;
        }
        int last = lastOccurence(arr, target, n);
        int ans[] = {first, last};
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 4, 7, 8, 10};
        int n = arr.length;
        int target = 4;
        int ans[] = firstLastOccurence(arr, target, n);
        System.out.println("First Occurence is: " + ans[0]);
        System.out.println("Last Occurence is: " + ans[1]);
    }
}
