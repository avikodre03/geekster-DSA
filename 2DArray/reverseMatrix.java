import java.util.*;

public class reverseMatrix{

    public static Scanner scn = new Scanner(System.in);

    public static int[][] input2d() {
        int[][] arr = new int[scn.nextInt()][scn.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        return arr;
    }

    public static void print(int[] arr) {
        for (int ele : arr)
            System.out.print(ele + " ");

        System.out.println();
    }

    public static void print2D(int[][] arr) {
        for (int[] ar : arr)
            print(ar);

        System.out.println();
    }

    // (i_1,j_1) -> cell_1, (i_2,j_2) -> cell_2
    public static void swap2D(int[][] arr, int i_1, int j_1, int i_2, int j_2) {
        int temp = arr[i_2][j_2];
        arr[i_2][j_2] = arr[i_1][j_1];
        arr[i_1][j_1] = temp;
    }


    // T: O(N), where N is no of rows
    public static void swapColumn(int[][] arr, int c1, int c2) {
        for (int i = 0; i < arr.length; i++)
            swap2D(arr, i, c1, i, c2);
    }

    // T: O(1)
    public static void swapRow(int[][] arr, int r1, int r2) {
        int[] temp = arr[r1];
        arr[r1] = arr[r2];
        arr[r2] = temp;
    }

    // O(N * M), where N is no of rows and M is no of columns
    public static void reverseColumnMatrix(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int i = 0, j = m - 1;
        while (i < j) {
            swapColumn(matrix, i++, j--);
        }
    }

    public static void reverseRowMatrix(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int i = 0, j = n - 1;
        while (i < j) {
            swapRow(matrix, i++, j--);
        }
    }

   
    public static void main(String[] args) {
        int[][] arr =input2d();
        
        reverseColumnMatrix(arr);
       
        // reverseRowMatrix(arr);
        print2D(arr);
    }
}
// reverseColumnMatrix:
// 3 3
// 1 2 3 
// 4 5 6
// 7 8 9
// 3 2 1 
// 6 5 4
// 9 8 7