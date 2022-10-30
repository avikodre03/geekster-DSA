import java.util.*;
public class basic2DArray {
    public static Scanner scn =new Scanner(System.in);

//     public static void test() {
//         int[][] arr = new int[4][3];
//         for (int i = 0; i < arr.length; i++) {
//         System.out.println(arr[i][1]);
//         }
//     }

//     int[][] arr1 = { { 10, 11, 12 }, { 13, 15 }, { 32, 23, 45, 45, 65, 8 } };
    
//     for (int r = 0; r <arr1.length; r++) {
//         for (int c = 0; c <arr1[r].length; c++) {
//             System.out.print(arr1[r][c] + " ");
//         }
//         System.out.println();
//     }
// }
   
public static void input2D(int[][] arr) {
    int n = arr.length, m = arr[0].length;
    // n=no.of Rows , m=no. of Column
    // arr[0] this use only symmetric matrix and 
    // arr[0] manje first idx chi array length asel tich all array chi asel.
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            arr[i][j] = scn.nextInt();
        }
    }
}

public static void print1D(int[] arr) {
    for (int ele : arr) {
        System.out.print(ele + " ");
    }
    System.out.println();
}

public static void print2D(int[][] arr) {
    // int n = arr.length, m = arr[0].length;
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < m; j++) {
    // System.out.print(arr[i][j] + " ");
    // }
    // System.out.println();
    // }

    for (int[] ar : arr) {
        print1D(ar);
    }

}

        public static void main(String[] args) {
            int n = scn.nextInt(), m = scn.nextInt();
            int[][] arr = new int [n][m];
            input2D(arr);
            System.out.println();
            print2D(arr);
            // test();
        }
    }
    

