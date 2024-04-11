// Problem Statement: Given a positive integer n, find and return its square root. If 'n' is not a perfect square, then return the floor value of 'sqrt(n)'.

public class squareRoot {
    public static int floorSqrt(int n) {
        int low = 1, high = n;

        while (low <= high) {
            long mid = (low + high) / 2;
            long val = mid * mid;
            if (val <= (long)(n)) {
                low = (int)(mid + 1);    // eliminate the left half
            }
            else {
                high = (int)(mid - 1);   // eliminate the right half
            }
        }
        return high;
    }

    public static void main(String[] args) {
        int n = 28;
        int ans = floorSqrt(n);
        System.out.println("The floor of square root of " + n + " is: " + ans);
    }
}
