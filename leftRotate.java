public class leftRotate{
      // Rotate the elements of an array to left/right by 1 element. 

    public static void left_rotate(int[] arr, int n){
        int temp = arr[0];
        for(int i = 0; i < n-1; i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
        
        System.out.println("Array after updating: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = 5;
        left_rotate(arr, n);
    }
}
