// Two Sum : Check if a pair with given sum exists in Array

import java.util.*;

public class twoSum{
    public static String twoSum(int n, int arr[], int target){
        Arrays.sort(arr);
        int left = 0, right = n-1;
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target) return "YES";
            else if(sum < target) left++;
            else right--;
        }
        return "NO";
    }

    public static void main(String[] args) {
        int arr[] = {2, 6, 5, 8, 11};
        int n = arr.length;
        int target = 14;
        String ans = twoSum(n, arr, target);
        System.out.println("The answer for variety 1 is: " + ans);
    }
}
