public class deleteDuplicate{
  
  // Delete duplicate elements from Sorted Array

    static int duplicate(int arr[]) {
        int i = 0;
        for(int j = 1; j < arr.length; j++) {
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,3,3};
            int k = duplicate(arr);

        System.out.println("Array after removing duplicate elements: ");
        for (int i = 0; i < k; i++)
            System.out.print(arr[i] + " ");
    }
}
