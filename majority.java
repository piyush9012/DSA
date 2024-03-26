// Better Solution using Hashmap

import java.util.*;

public class majority {
    public static List<Integer> majorityElement(int arr[]){
        int n = arr.length;
        int mini = (int) n/3 + 1;
        List<Integer> ls = new ArrayList<>();
        HashMap<Integer, Integer> mpp = new HashMap<>();
        
        for(int i=0; i<n; i++){
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value+1);

            if(mpp.get(arr[i]) == mini){
                ls.add(arr[i]);
            }

            if(ls.size() == 2) break;
        }
        return ls;
    }
    public static void main(String[] args) {
        int[] arr = {11, 33, 33, 11, 33, 11};
        List<Integer> ans = majorityElement(arr);
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}

// Optimal Solution using Extended Boyer Moore’s Voting Algorithm

import java.util.*;

public class majority {
    public static List<Integer> majorityElement(int arr[]){
        int n = arr.length;

        int cnt1 = 0, cnt2 = 0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            if(cnt1 == 0 && el2 != arr[i]){
                cnt1 = 1;
                el1 = arr[i];
            }
            else if(cnt2 == 0 && el1 != arr[i]){
                cnt2 = 1;
                el2 = arr[i];
            }
            else if(arr[i] == el1) cnt1++;
            else if(arr[i] == el2) cnt2++;
            else {
                cnt1--; cnt2--;
            }
        }
        
        List<Integer> ls = new ArrayList<>();
      
        cnt1 = 0; cnt2 = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == el1) cnt1++;
            if(arr[i] == el2) cnt2++;
        }

        int mini = (int)(n/3) + 1;
        if(cnt1 >= mini) ls.add(el1);
        if(cnt2 >= mini) ls.add(el2);
        return ls;
    }
  
    public static void main(String args[]) {
        int[] arr = {11, 33, 33, 11, 33, 11};
        List<Integer> ans = majorityElement(arr);
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}
