import java.util.*;
public class printDiagonal {
    
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

    public static void printDiagonal(int [][]arr, int r, int c ) {
        int n = arr.length, m= arr[0].length;
        while(r<n && c<m){
            System.out.print(arr[r][c]+" ");
            r++;
            c++;
        }
        System.out.println();
    }
    public static void printUpperDiagonal(int [][] arr) {
        int n = arr.length, m= arr[0].length;
        for(int j=0; j<m;j++){
            printDiagonal(arr,0,j);
        }
    }
    public static void main(String[] args) {
        int[][] arr = input2D();
        // printUpperDiagonal(arr); 
        printDiagonal(arr,scn.nextInt(),scn.nextInt());
       }
}

// printUpperDiagonal
// 4 4
// 1 2 3 4
// 0 1 2 3
// 0 0 1 2
// 0 0 0 1
// 1 1 1 1 2 2 2 3 3 4 traverse (0,0)> (1,1)> (2,2)> (3,3)> (0,1)> (1,2)> (2,3)> (0,2)> (1,3)> (0,3).

// printDiagonal
// 3 3
// 1 1 1
// 2 2 2
// 3 3 3
// 0 0>(r,c) input
// 1 2 3 