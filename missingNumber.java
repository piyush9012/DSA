public class missingNumber {
    // Find the missing number

    //  Optimum Solution 1 - using Sum
  
    // public static int missing(int arr[], int n){
    //     int sum = (n*(n+1))/2;
    //     int s2 = 0;

    //     for(int i=0; i<n-1; i++){
    //         s2 = s2+arr[i];
    //     }
    //     return sum-s2;
    // }
    // public static void main(String[] args) {
    //     int arr[] = {1,2,3,5};
    //     int n = 5;
    //     int ans = missing(arr, n);
    //     System.out.println(ans);
    // }

    // Optimum Solution 2 - Using XOR

    public static int missing(int arr[], int n) {
        int xor1 = 0, xor2 = 0;
        for (int i = 0; i < n-1; i++) {
            xor2 = xor2 ^ arr[i];
            xor1 = xor1 ^ (i+1);
        }
        xor1 = xor1 ^ n;
        return (xor1 ^ xor2);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,5};
        int n = 5;
        int ans = missing(arr, n);
        System.out.println(ans);
    }
}
