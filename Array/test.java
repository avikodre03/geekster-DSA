import java.util.*;
public class test {
    public static Scanner scn = new Scanner(System.in);

    public static void input1D(int [] arr){
        for (int i=0; i<arr.length; i++){
          arr[i] = scn.nextInt();   //write
        }
    }
     public static void print1D(int [] arr){
       for(int ele:arr)
       System.out.print(ele +" ");

        System.out.println();
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void test_01(int[] arr) {
        int n=arr.length, pt = -1, itr = 0;
        while (itr < n) {
            if (arr[itr] !=0 ) {
                swap(arr, itr, ++pt);
            }
            itr++;
        }
        
    }
    public static void UKG_Method_02(int[] arr) {
        int n = arr.length, itr = 0, p = -1;
        while (itr < n) {
            if (arr[itr] != 0) {
                arr[++p] = arr[itr];
            }
            itr++;
        }

        while (p < n - 1) {
            arr[++p] = 0;
        }
    }
    public static void main(String[] args) {
        int n = scn.nextInt();
            int[] arr = new int[n];
           input1D(arr);
           test_01(arr);
           UKG_Method_02(arr);
           print1D(arr);
    }
}
// 2 1 0 6 0 0 0 8 9 11 12 0
// o/p 
// 2 1 6 8 9 11 12 0 0 0 0 0 