import java.util.*;
public class transposeMatrix {
    public static Scanner scn = new Scanner (System.in);

    public static int[][] input2D() {
        int [][] arr = new int[scn.nextInt()][scn.nextInt()];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
          }
        return arr;
    }

    public static void print(int[]arr){
         for(int ele:arr){
            System.out.print(ele +" ");
         }
    System.out.println();
        
    }
    public static void print2D(int[][] arr) {
        for(int[] ar:arr){
          print(ar);
        }
        System.out.println();
    }

    // public static void swap2D(int[][] arr ,int i , int j) {
    //     int temp = arr[i][j];
    //     arr[i][j] = arr[j][i];
    //     arr[j][i] = temp;
    // }

      // (i_1,j_1) -> cell_1, (i_2,j_2) -> cell_2
      public static void swap2D(int[][] arr, int i_1, int j_1, int i_2, int j_2) {
        int temp = arr[i_2][j_2];
        arr[i_2][j_2] = arr[i_1][j_1];
        arr[i_1][j_1] = temp;
    }

    // matrix always be square matrix
    //T: O(n`2)
    public static void transpose(int [][] matrix) {
        int n= matrix.length, m=n;
        for(int i=0; i<n; i++){
            for(int j=i; j<m; j++){
                swap2D(matrix,i,j,j,i);
            }
        }
    }
    // T: O(N), where N is no of rows
    public static void swapColumn(int[][] arr, int c1, int c2) {
        for (int i = 0; i < arr.length; i++)
            swap2D(arr, i, c1, i, c2);
    }
    //  T:O(N)
    public static void swapRow(int[][] arr,int r1,int r2){
            for(int j=0; j<arr.length; j++){
                swap2D(arr,r1,j,r2,j);
            }
    }
    //  T:O(1) becoz known memory diagram 
    public static void swapRow_01(int[][] arr,int r1,int r2){
        int [] temp = arr[r1];
        arr[r1] = arr[r2];
        arr[r2] = temp;  
    }
    
  
    public static void main(String[] args) {
        int[][] arr = input2D();
    //    int c1 = scn.nextInt();
    //    int c2 = scn.nextInt();
    //    int r1 = scn.nextInt();
    //    int r2 = scn.nextInt();
        // transpose(arr);
        // swapColumn(arr,c1,c2);
        // swapRow_01(arr,r1,r2);
        // print2D(arr);
    }
}
