public class checkSorted{
  // Check Sorted Array

  static boolean checkArr(int arr[], int n)
  {
      for(int i = 1; i<arr.length; i++){
          if(arr[i] < arr[i-1])
              return false;
      }
       return true;
  }
  
  public static void main(String[] args)
  {
      int n = 5;
      int arr[] = {1,2,3,4,5};
      System.out.println(checkArr(arr, n));
  }
}
