public class Search
{
  // Linear Search in an array.

    public static void linearSearch(int arr[], int x){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x)
                System.out.println("Element " + x + " found at position " + i);
            else System.out.println("-1"); break;
        }
    }
  
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int x =6;
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
            System.out.println();
        System.out.println("Element to search: " + x);
        linearSearch(arr, x);
    }
}
