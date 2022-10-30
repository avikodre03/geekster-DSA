import java.util.*;
public class maxProduct {
    public static Scanner scn = new Scanner (System.in);

   public static void input(int []arr) {
    for( int i=0; i<arr.length; i++){
     arr[i] = scn.nextInt();
    }
}
  public static void print(int [] arr) {
    for( int ele:arr)
    System.out.println(ele +" ");

    System.out.println();
  }

  public static int maxPairProduct(int [] arr, int lb, int rb) {
    // if(rb-lb+1 <2) return Integer.MIN_VALUE;

    int num1 = arr[rb] * arr[rb-1];
    int num2 = arr[lb] * arr[lb+1];

    return Math.max(num1,num2);
    
  }
  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
     
 }

  public static int maxThreeProduct(int[] arr) {
    int maximumAns = Integer.MIN_VALUE;
    // Arrays.sort(arr);
    int n= arr.length;
    for (int i=0; i<n; i++){
        for(int j=1; j<n-i; j++){
            if(arr[j-1]>arr[j]){
                swap (arr, j-1, j);
            }
        }
    }
    for(int i=n-1; i>1; i--){
        int num = arr[i];
        int maxPair = maxPairProduct(arr,0,i-1);

        maximumAns =Math.max(maximumAns,maxPair*num);
    }
    return maximumAns;

  }

// Leetcode 628
  public static void main(String[] args) {
    int n = scn.nextInt();
    int[] arr = new int[n];
    input(arr);
    System.out.println(maxThreeProduct(arr));
    
  }

    
}
// 8
// o/p
// -70 -30 -10 1 2 10 15 24
// 50400