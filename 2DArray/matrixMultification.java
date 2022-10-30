import java.util.*;
public class matrixMultification {
     public static Scanner scn = new Scanner(System.in);

     public static int[][] input2D(){
       int[][] arr = new int[scn.nextInt()][scn.nextInt()];
       for(int i=0; i<arr.length; i++){
          for(int j=0; j<arr[0].length; j++){
               arr[i][j] = scn.nextInt();
          }
       }
       return arr;
     }
     public static void print1D(int[] arr) {
          for(int ele:arr){
               System.out.print(ele+" ");
          }
          System.out.println();
     }
     public static void print2D(int[][]arr) {
          for(int[] ar:arr){
               print1D(ar);
          }
          System.out.println();
          
     }
//     time:T(n*m*q) = n cube
     public static int[][] matrixMultification(int[][]A, int[][] B) {
          int n=A.length, m=A[0].length, p=B.length, q=B[0].length;
          if(m!=p){
               return null;
          }
          int[][] ans = new int[n][q];
          for (int i = 0; i < ans.length; i++) {
               for (int j = 0; j < ans[0].length; j++) {
             int  result=0;
               for(int k=0; k<m; k++){
                    result += A[i][k]*B[k][j];
               }
               ans[i][j] = result;
          }
               }
               return ans; 
     }
     public static void matrixMultification() {
          int [][] A = input2D();
          int [][] B = input2D();

          int [][] ans = matrixMultification(A,B);
          if (ans != null)
          print2D(ans);
      else
          System.out.println("Matrix Multiplication is not fesible: " + -1);
  }
          
     public static void main(String[] args) {
          matrixMultification();
     }
     

}
// 3 3
// 1 2 3
// 2 1 3
// 4 1 2
// 3 3
// 1 2 3   
// 2 1 3
// 4 1 2
// 17 7 15 
// 16 8 15
// 14 11 19 
