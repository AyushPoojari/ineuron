import java.util.*;

// Ayush Poojari FSDS - 2.0
// TC : O (N)
// SC : O (1) ~ No extra space taken

public class move_zeroes {
    public static void main(String[] args) {
        // Test case - 01
        int[] A = { 0, 1, 0, 3, 12 };
        // Test case - 02
        // int[] A = { 0 };
        int n = A.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] != 0) {
                swap(A, j, i);
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }

    public static void swap(int[] A, int a, int b) {
        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }
}
