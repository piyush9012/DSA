// Two Sum : Check if a pair with given sum exists in Array

import java.util.*;

public class majorityMoore {
    public static int majorityElement(int arr[]) {
        int count = 0;
        int element = 0;

        // Applying the Moore’s Voting Algorithm:
        for(int i=0; i<arr.length; i++){
            if(count == 0){
                count = 1;
                element = arr[i];
            }
            else if(element == arr[i]) count++;
            else count--;
        }

        int count1 = 0;
        for(int i=0; i<arr.length; i++){    // calculate the count of majority element
            if(arr[i] == element) count1++;
        }

        if(count1 > arr.length/2) return element;

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5 };
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);
    }
}
