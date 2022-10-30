import java.util.*;

public class equalSum {
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

    public static int sumOfEle(int [] arr){
        int sum=0;
        for(int ele:arr)
            sum += ele;
            return sum;
    }

    public static boolean equalSum(int [][] matrix){
        int n =matrix.length;
       if(n==0) return true;

       int sum = sumOfEle(matrix[0]);
        for (int i=1; i<n; i++){
        int temp = sumOfEle(matrix[i]);
        if(temp!=sum){
            return false;
        }
        }
        return true;
    }
    public static void main(String[] args) {
        int [][] arr= input2d();
   
        System.out.println(equalSum(arr));
   }
}  
