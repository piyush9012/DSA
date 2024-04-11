// Problem Statement: Given a positive integer n, find and return its square root. If 'n' is not a perfect square, then return the floor value of 'sqrt(n)'.

public class squareRoot {
    public static int floorSqrt(int n) {
        int low = 1, high = n;
        int ans = 1;

        while(low <= high){
            int mid = (low+high)/2;
            if((mid*mid) <= n){
                ans = mid;
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 28;
        int ans = floorSqrt(n);
        System.out.println("The floor of square root of " + n + " is: " + ans);
    }
}
