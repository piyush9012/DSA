public class moveZeroes
{
  // Move zeroes to the end of the array.

    public static int[] moveZeroToEnd(int arr[], int n){
        int j = -1;
        for(int i=0; i<n; i++){     // Find the first 0 present in the array
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        if (j == -1) return arr;

        for(int i = j+1; i<n; i++){
            if(arr[i] != 0){
                int temp = arr[i];     // swap (arr[i], arr[j])
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int n = 7;
        int arr[] = {0,0,1,1,2,0,3};

        moveZeroToEnd(arr, n);
        System.out.print("Array after");
        for(int i=0; i<n; i++)
            System.out.print(arr[i] + " ");   
    }    
}
