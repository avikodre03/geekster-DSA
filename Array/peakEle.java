import java.util.*;
public class peakEle {
    

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
    
    public static int countPeakEle(int[] arr){
      if(arr.length<3)
      return 0;
      int n= arr.length;
      for(int i=1; i<n-1; i++){
     if(arr[i-1]<arr[i] && arr[i]> arr[i+1]){
      System.out.print(arr[i] +" ");
      }
      }
        return arr.length;
        // System.out.print(arr[i]+" ");
    }

        public static void main(String[] args){
        int n = scn.nextInt();
        int[] arr = new int[n];
       input1D(arr);
            countPeakEle(arr);

    }
}
6
4 5 3 8 6 1
5 8 
