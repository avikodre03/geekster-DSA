import java.util.*;
public class inverse {
    public static Scanner scn = new Scanner(System.in);

    public static void input1D(int [] arr){
        for (int i=0; i<arr.length; i++){
          arr[i] = scn.nextInt();   //write
        }
    } 
    public static void print1D(int [] arr){
        for (int i=0; i<arr.length; i++){
          System.out.print( arr[i] + " ");   //read
        }
        System.out.println();
    }
    public static int[] inverse(int[] arr){            
        int n =arr.length;
        int[] ans = new int[n];
        for(int i=0; i<n; i++){
        ans[arr[i]] =i ;
        }
        return ans;
      } 
      
      public static void main(String[] args){
        int n = scn.nextInt();
        int[] arr = new int[n];
       input1D(arr);
       int [] ans =inverse(arr);
       print1D(ans);
}

