import java.util.*;

public class addTwomatrix01 {
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
    public static void addTwoMatrix(int[][] m1, int[][] m2) {
        int n = m1.length, m = m1[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                m1[i][j] += m2[i][j];
            }
        }
    }
    

    public static void twoMatrixQuestions() {
        int[][] m1 = input2d();
        int[][] m2 = input2d();

        addTwoMatrix(m1, m2);
        print2D(m1);
    }
    public static void main(String[] args) {
        twoMatrixQuestions();

    }
}
