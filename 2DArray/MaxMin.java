import java.util.*;
public class MaxMin {
    
    public static Scanner scn =new Scanner(System.in);

    public static void input2D(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        for(int i =0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        } 
    } 
    public static int maximum(int[][] arr){
        int maximum = Integer.MIN_VALUE;
      for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[0].length; j++){
            maximum= Math.max(maximum,arr[i][j]);
            // maximum=arr[i][j]>maximum ? arr[i][j] : maximum; 
        }
      }
      return maximum;
    }  
    
    public static int minimum(int[][] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
        //   min = Math.min(arr[i][j] , min);      
          min = arr[i][j]< min ? arr[i][j] : min;
            }
        }      
        return min;  
    }

    public static int sumOfAllElements(int[][] arr){
    int n = arr.length, m = arr[0].length , sum=0;
        for(int i =0; i<n; i++){
            for(int j=0; j<m; j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }    

    public static void printDiagonal(int [][] matrix){
            int n = matrix.length , m = matrix[0].length;
            int i= 0;
            int j= 0;
            while(i<n && j<m){
                System.out.print( matrix[i][j]+" ");
                i++;
                j++;
            }  
        }
        
    public static void main(String[] args) {
        int n= scn.nextInt() , m = scn.nextInt();
        int[][] arr= new int [n][m];
        input2D(arr);
        // System.out.println(maximum(arr));
        // System.out.println(minimum(arr));
        // System.out.println(sumOfAllElements(arr));
        printDiagonal(arr);
    }
}
