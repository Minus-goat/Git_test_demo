package mergeQujian;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void merge() {
        Solution solution = new Solution();
        int[][] arr = new int[2][2];
        arr[0][0] = 1;
        arr[0][1] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        int[][] arrdemo = solution.merge(arr);
        for (int[] ints : arrdemo) {
            System.out.println("["+ints[0] +" "+ ints[1]+"]");
        }
    }
}