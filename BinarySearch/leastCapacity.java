// Problem Statement: You are the owner of a Shipment company. You use conveyor belts to ship packages from one port to another. The packages must be shipped within 'd' days. The weights of the packages are given in an array 'of weights'. The packages are loaded on the conveyor belts every day in the same order as they appear in the array. The loaded weights must not exceed the maximum weight capacity of the ship. Find out the least-weight capacity so that you can ship all the packages within 'd' days.

import java.util.*;

public class leastCapacity {
    public static int findDays(int weight[], int cap) {
        int days = 1, load = 0;
        int n = weight.length;
        for (int i = 0; i < n; i++) {
            if (weight[i] + load > cap) {
                days += 1;
                load = weight[i];
            } else {
                load += weight[i];
            }
        }
        return days;
    }

    public static int leastWeightCapacity(int weight[], int d) {
        int low = Integer.MIN_VALUE, high = 0;
        for (int i = 0; i < weight.length; i++) {
            high += weight[i];
            low = Math.max(low, weight[i]);
        }

        while (low <= high) {
            int mid = (low + high) / 2;
            int noOfDays = findDays(weight, mid);
            if (noOfDays <= d) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] weights = { 5, 4, 5, 2, 3, 4, 5, 6 };
        int d = 5;
        int ans = leastWeightCapacity(weights, d);
        System.out.println("The minimum capacity should be: " + ans);
    }
}
