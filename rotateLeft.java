public class rotateLedft{
  
    public static void rotateLeft(int arr[], int n, int d){
        if(n == 0) return;
        d = d % n;                      // make sure d !> n
        if(d > n) return;
        int temp[] =  new int[d];

        for(int i=0; i<d; i++)          // store in temp array
            temp[i] = arr[i];

        for(int i = 0; i < n-d; i++)    // store remaining elements in order
            arr[i] = arr[i+d];

        for(int i=n-d; i<n; i++)        // store elements from temp to array
            arr[i] = temp[i-(n-d)];
    }
  
    public static void main(String[] args) {
        int n = 7;
        int arr[] = {1,2,3,4,5,6,7};
        int d = 2;
        rotateLeft(arr, n, d);
        System.out.print("Array after rotation: ");
        for(int i=0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
