// Problem Statement: Given an array/list of length ‘N’, where the array/list represents the boards and each element of the given array/list represents the length of each board. Some ‘K’ numbers of painters are available to paint these boards. Consider that each unit of a board takes 1 unit of time to paint. You are supposed to return the area of the minimum time to get this job done of painting all the ‘N’ boards under the constraint that any painter will only paint the continuous sections of boards.

public class Solution {
    public static int countPainters(int boards, int time) {
        int n = boards.length;
        int painters = 1;
        long boardsPainter = 0;
        for (int i = 0; i < n; i++) {
            if (boardsPainter + boards[i] <= time) {
                boardsPainter += boards[i];
            } else {
                painters++;
                boardsPainter = boards[i];
            }
        }
        return painters;
    }

    public static int findLargestMinDistance(int boards, int k) {
        int low = boards[0];
        int high = 0;

        for (int i = 0; i < a.length; i++) {
            low = Math.max(low, a[i]);
            high += a[i];
        }

        while (low <= high) {
            int mid = (low + high) / 2;
            int painters = countPainters(boards, mid);
            if (painters > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int boards[] = {10, 20, 30, 40};
        int k = 2;
        int ans = findLargestMinDistance(boards, k);
        System.out.println("The answer is: " + ans);
    }
}
