import java.util.*;
public class traversal {
    
    public static Scanner scn = new Scanner (System.in);

    public static void input2D(int[][] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j]= scn.nextInt();
            }
        }      
    }

    public static void ColumnTraveral(int[][] arr) {
       
    for(int j=0; j<arr[0].length; j++){

        if(j %2 == 0){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }else{
            for(int i=arr.length-1;i>=0; i--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    }

    public static void rowTraveral(int[][] arr) {
        for(int i=0; i<arr.length; i++){
            if(i%2 == 0){
                for(int j=0; j<arr[0].length; j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }else{
                for(int j=arr[0].length-1; j>=0; j--){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }

    public static void spiralTraveral(int[][] arr){
        int n= arr.length, m=arr[0].length;
        int minrow = 0;                      //minr = minimum row
        int mincol = 0;                      //minc = minimum column
        int maxrow = arr.length-1;
        int maxcol = arr[0].length-1;
        int tne = n * m;                  
        int count = 0;
        while (count < tne) {

            //left wall
            if (count < tne) {
              for (int i = minrow; i <= maxrow; i++) {
                System.out.println(arr[i][mincol]);
                count++;
              }
            }
            mincol++;
      
            //bottom wall
            if (count < tne) {
              for (int i = mincol; i <= maxcol; i++) {
                System.out.println(arr[maxrow][i]);
                count++;
              }
            }
            maxrow--;
      
            //right wall
            if (count < tne) {
              for (int i = maxrow; i >= minrow; i--) {
                System.out.println(arr[i][maxcol]);
                count++;
              }
            }
            maxcol--;
      
            //top wall
            if (count < tne) {
              for (int i = maxcol; i >= mincol; i--) {
                System.out.println(arr[minrow][i]);
                count++;
              }
            }
            minrow++;
          }
        }

          public static void main(String[] args) {
            int n = scn.nextInt();
            int m = scn.nextInt();
            int [][] arr = new int[n][m];
            input2D(arr);
            // ColumnTraveral(arr);
            // rowTraveral(arr);
            spiralTraveral(arr);
          }      
        
    
}
// ColumnTraveral:
// 4 4
// 1 8 9 16
// 2 7 10 15
// 3 6 11 14
// 4 5 12 13

// 1 2 3 4 
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16

// rowTraveral:
// 4 4    
// 1 2 3 4
// 8 7 6 5
// 9 10 11 12
// 16 15 14 13

// 1 2 3 4 
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16

// https://youtu.be/SVFXEqn3Ceo
    
// 5 7
// 11 12 13 14 15 16 17
// 21 22 23 24 25 26 27
// 31 32 33 34 35 36 37
// 41 42 43 44 45 46 47
// 51 52 53 54 55 56 57
// 11
// 21
// 31
// 41
// 51
// 52
// 53
// 54
// 55
// 56
// 57
// 47
// 37
// 27
// 17
// 16
// 15
// 14
// 13
// 12
// 22
// 32
// 42
// 43
// 44
// 45
// 46
// 36
// 26
// 25
// 24
// 23
// 33
// 34
// 35