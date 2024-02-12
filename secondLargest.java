import java.io.*;

public class seconfLargest{
    //  Second smallest and Second largest

    private static int second_Smallest(int arr[], int n){
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i] < small){
                second_small = small;
                small = arr[i];
            }
            else if(arr[i] <second_small &&  arr[i] != small){
                second_small = arr[i];
            }
        }
        return second_small;
    }

    private static int second_Largest(int arr[], int n){
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i] > largest){
                second_largest = largest;
                largest = arr[i];
            }
            else if(arr[i] > second_largest &&  arr[i] != largest){
                second_largest = arr[i];
            }
        }
        return second_largest;
    }

    public static void main(String[] args) {
        int arr[] = {5,1,6,4,8,7};
        int n = arr.length;
        int sS = second_Smallest(arr, n);
        int sL = second_Largest(arr,n);

        System.out.println("The second largest element is: " + sL);
        System.out.println("The second smallest element is: " + sS);
    }
}
