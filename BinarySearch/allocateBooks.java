/* Problem Statement: Given an array arr of integer numbers, arr[i] represents the number of pages in the ‘i-th’ book. There are a ‘m’ number of students, and the task is to allocate all the books to the students.

Allocate books in such a way that:
    Each student gets at least one book.
    Each book should be allocated to only one student.
    Book allocation should be in a contiguous manner.
You have to allocate the book to 'm' students such that the maximum number of pages assigned to a student is minimum. If the allocation of books is not possible, return -1
*/
import java.util.*;

public class Solution {
    public static int countStudents(int arr[], int pages) {
        int n = arr.length;
        int students = 1;
        int pagesStudent = 0;
        for (int i = 0; i < n; i++) {
            if (pagesStudent + arr[i] <= pages) {
                pagesStudent += arr[i];
            } else {
                students++;
                pagesStudent = arr[i];
            }
        }
        return students;
    }

    public static int findPages(int arr[], int m, int n) {
        if (m > n) return -1;
        int low = arr[0], high = 0;

        for (int i = 0; i < arr.length; i++) {
            low = Math.max(low, arr[i]);
            high += arr[i];
        }

        while (low <= high) {
            int mid = (low + high) / 2;
            int students = countStudents(arr, mid);
            if (students > m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = { 25, 46, 28, 49, 24 };
        int m = 4;
        int n = 5;
        int ans = findPages(arr, m, n);
        System.out.println("The answer is: " + ans);
    }
}
