import java.util.*;

public class rotateArray {
    private static Scanner scn = new Scanner(System.in);

    public static void input1D(int [] arr){
    for (int i=0; i<arr.length; i++){
    arr[i] = scn.nextInt(); //write
    }
    }

    public static void print1D(int [] arr){
    for (int i=0; i<arr.length; i++){
    System.out.print( arr[i] + " "); //read
    }
    System.out.println();
    }

    public static void rotateArray_basic(int[] arr, int k) {
        int n = arr.length;
        k %= n; // k comes under range of n [0, n - 1]

        int idx = n - k;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[idx % n] = arr[i];
            idx++;
        }

        // copy
        for (int i = 0; i < n; i++)
            arr[i] = ans[i];
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr,i++,j--);
        }
    }

        public static void rotate(int[] arr, int k) {
            int n = arr.length;
            k %= n;
            if (k < 0) 
                 k += arr.length;
            
            reverse(arr, 0, k - 1);
            reverse(arr, k, n - 1);
            reverse(arr, 0, n - 1);
        
    }

    

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input1D(arr);
        int k =scn.nextInt();
        rotate(arr,k);
        // rotateArray_basic(arr,k);
        print1D(arr);
    }
}
