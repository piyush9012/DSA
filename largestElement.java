import java.util.*;

public class largestElement {
    // Find the Largest Element

   static int largest(int arr[]){
        int max = arr[0];
        for(int i=0; i<arr.length; i++)
            if(arr[i] > max)
                max = arr[i];
        return max;
    }
  
    public static void main(String[] args) {
        int arr[] = {20, 34, 18, 47, 25};
        System.out.println("The largest element in the array is: " + largest(arr));
    }
}
