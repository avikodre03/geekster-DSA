import java.util.*;
public class findDifferance {
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
    public static int getMaximum(int[] arr) {
        int max = Integer.MIN_VALUE;          // MIN VALUE= -∞
        // for(int i=0; i<arr.length; i++){
          for(int ele:arr){
            max = Math.max(max , ele);
          // maxEle = Math.max(maxEle , arr[i]);
          // maxEle= arr[i] > maxEle ? arr[i] : maxEle;
        }
        return max;
      }
  
      public static int getMinimum(int[] arr){
        int min = Integer.MAX_VALUE;           // MAX VALUE = ∞
        // for(int i=0; i<arr.length; i++){
        // minEle=Math.min(minEle ,arr[i]);
        for (int ele:arr){
          min = Math.min(min , ele);
        // minEle = arr[i] < minEle ? arr[i] : minEle;
      }
      return min;
    }
// o(2*N) Two travels method....
       public static int findDifferance_01(int[] arr){
         int max = getMaximum(arr);
         int min = getMinimum(arr);
         return max-min;

       }
// o(N) One travels method.....
       public static int findDifferance_02(int[] arr){
        int max =Integer.MIN_VALUE,  min = Integer.MAX_VALUE;
        for(int ele:arr){
        max = Math.max(max,ele);
        min = Math.min(min,ele);

      }
      return max-min;
    }

    public static int countPeakEle(int[] arr){
      if(arr.length<3)
      return 0;
      int n= arr.length,count=0;
      for(int i=1; i<n-1; i++){
        if(arr[i-1]<arr[i] && arr[i]> arr[i+1]){
          count++;
        }
      }
      return count;
    }
    public static boolean checkIncreasing(int[] arr){
      for(int i=1; i<arr.length; i++){
        if(arr[i-1]>arr[i])
        return false;
      }
     return true;
    }

    public static boolean checkDecreasing(int[] arr){
      for(int i=1; i<arr.length; i++){
        if(arr[i-1]<arr[i])
        return false;
      }
      return true;
    }
       public static void main(String[] args){
        int n = scn.nextInt();
        int[] arr = new int[n];
       input1D(arr);
       
      //  System.out.println("differance max and min");
      //  System.out.println( findDifferance_01(arr));
      //  System.out.println( findDifferance_02(arr));
      //  System.out.println( countPeakEle(arr));
       System.out.println( checkIncreasing(arr));

      //  print1D(ans);
       }
       
    }
