// Problem Statement: Given an integer array arr of size N, sorted in ascending order (with distinct values) and a target value k. Now the array is rotated at some pivot point unknown to you. Find the index at which k is present and if k is not present return -1.

// public class rotated{
//     public static int rotatedUniqueSearch(int arr[], int n, int target){
//         int low = 0, high = n-1;
//         while(low <= high){
//             int mid = (low + high)/2;
//             if (arr[mid] == target) return mid;

//             if(arr[low] <= arr[mid]){
//                 if(arr[low] <= target && target<= arr[mid])
//                     high = mid - 1;
//                 else
//                     low = mid + 1;
//             }
//             else{
//                 if(arr[mid] <= target && target <= arr[high])
//                     low = mid + 1;
//                 else
//                     high = mid - 1;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int arr[] = {7,8,9,1,2,3,4,5,6};
//         int target = 1;
//         int n = arr.length;
//         int ans = rotatedUniqueSearch(arr, n, target);
//         if (ans == -1)
//             System.out.println("Target is not present.");
//         else
//             System.out.println("The index is: " + ans);
//     }
// }
import java.util.*;

public class rotated {
    public static int rotatedUniqueSearch(ArrayList<Integer> arr, int n, int target) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == target)
                return mid;

            if (arr.get(low) <= arr.get(mid)) {
                if (arr.get(low) <= target && target <= arr.get(mid))
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
                if (arr.get(mid) <= target && target <= arr.get(high))
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(7, 8, 9, 1, 2, 3, 4, 5, 6));
        int target = 1;
        int n = arr.size();
        int ans = rotatedUniqueSearch(arr, n, target);
        if (ans == -1)
            System.out.println("Target is not present.");
        else
            System.out.println("The index is: " + ans);
    }
}
