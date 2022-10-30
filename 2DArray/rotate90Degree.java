import java.util.*;

public class rotate90Degree {
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

    public static void transpose(int [][] matrix) {
        int n= matrix.length, m=n;
        for(int i=0; i<n; i++){
            for(int j=i; j<m; j++){
                swap2D(matrix,i,j,j,i);
            }
        }
    }
      
    public static void swapColumn(int[][] arr, int c1, int c2) {
        for (int i = 0; i < arr.length; i++)
            swap2D(arr, i, c1, i, c2);
    }

    public static void swapRow(int[][] arr, int r1, int r2) {
        int [] temp = arr[r1];
        arr[r1] = arr[r2];
        arr[r2] = temp;
       }

    public static void reverseColumnMatrix(int[][] matrix) {
          int n= matrix.length , m = matrix[0].length;
          int i =0 , j =m-1;
          while(i<j){
            swapColumn(matrix,i++,j--);
          }  
    }
    public static void reverseRowMatrix(int[][] matrix) {
        int n= matrix.length , m = matrix[0].length;
          int i =0 , j =n-1;
          while(i<j){
            swapRow(matrix,i++,j--);
          }  
    }
        public static void clockwiseRotate90Degree(int [][] matrix) {
            transpose(matrix);
            reverseColumnMatrix(matrix);
            
        }
        public static void antiClockwiseRotate90Degree(int [][] matrix){
            transpose(matrix);
            reverseRowMatrix(matrix);
        }

        public static void main(String[] args) {
            int [][] arr = input2d();

            // clockwiseRotate90Degree(arr);
            antiClockwiseRotate90Degree(arr);
            // System.out.println("clockwise  90° ");
            System.out.println("anticlockwise  90° ");
            print2D(arr);
        }
}

3 3
1 2 3
1 2 3
1 2 3
clockwise  90°
3 2 1 
3 2 1
3 2 1 

4 4
4 3 2 1                             
4 3 2 1
4 3 2 1
4 3 2 1
anticlockwise  90° 
1 1 1 1 
2 2 2 2
3 3 3 3
4 4 4 4
