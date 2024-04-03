import java.util.*;

public class longestConsecutive {
    public static int longestSuccessiveElements(int arr[]){
        int n = arr.length;
        if (n==0) return 0;

        int count = 0, last_element = Integer.MIN_VALUE, longest = 1;

        for(int i=0; i<arr.length; i++){
            if(arr[i]-1 == last_element){
                last_element = arr[i];
                count += 1;
            }
            else if( arr[i] != last_element){
                count = 1;
                last_element = arr[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {10, 11, 12, 1, 1, 2, 3, 3, 4, 5};
        int ans = longestSuccessiveElements(arr);
        System.out.println("The longest consecutive sequence is " + ans);
    }
}
