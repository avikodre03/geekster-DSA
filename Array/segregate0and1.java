import java.util.*;
public class segregate0and1 {
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
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


// public static int[] segregate0and1(int[] arr, int n) {
public static void segregate0and1(int[] arr) {
    int n=arr.length, pt = -1, itr = 0;
    while (itr < n) {
        if (arr[itr] == 0) {
            swap(arr, itr, ++pt);
        }
        itr++;
    }
    // return arr;                // return only int[] call
}

public static void sortColors(int[] arr) {
    int n = arr.length, pt1 = -1, itr = 0, pt2 = n - 1;
    while (itr <= pt2) {
        if (arr[itr] == 0) {
            swap(arr, itr++, ++pt1);
        } else if (arr[itr] == 1) {
            itr++;
        } else if (arr[itr] == 2) {
            swap(arr, itr, pt2--);
        }
    }
}
public static void sortEvenOdd(int[] arr) {
    int n = arr.length, p = -1, itr = 0;
    while (itr < n) {
        if (arr[itr] % 2 == 0) {
            swap(arr, itr, ++p);
        }
        itr++;
    }
}

public static int pivotIndex(int[]arr, int data) {
    int n=arr.length, pt = -1, itr = 0;
    int idx =n-1;

    for(int i=0;i<n;i++){
        if(arr[i]==data){
            idx=i;
            break;
        }
          }
        swap(arr,idx,n-1);
    
    while (itr < n) {
        if (arr[itr] <=data) {
            swap(arr, itr, ++pt);
        }
        itr++;
    }
    return pt;
    
}

public static void sortRegion(int [] arr, int p, int q){
    int n = arr.length, pt1 = -1, itr = 0, pt2 = n - 1;
    while (itr <= pt2) {
        if (arr[itr] <= p) {
            swap(arr, itr++, ++pt1);
        } else if (arr[itr] >p && arr[itr]<q) {
            itr++;
        } else if (arr[itr] >= q) {
            swap(arr, itr, pt2--);
        }
    }
   System.out.println("(" + (pt1+1) + "," + (itr-1) + ")" );
    }
   


 public static void main(String[] args) {
    int n = scn.nextInt();
        int[] arr = new int[n];
       input1D(arr);
    
    //    print1D(segregate0and1 (arr, n));
    //    segregate0and1 (arr, n);           //int[]  cll
    //    segregate0and1 (arr);                 //void call

    //  sortColors(arr);  

    // sortEvenOdd(arr);

    System.out.println("Enter your data");
    //   data = scn.nextInt();  
    //    pivotIndex(arr,data);     
    

    //    print1D(arr);
    //    System.out.println("Data Index Return");
    //   System.out.println( pivotIndex(arr,data));

    int p=scn.nextInt();
      int q=scn.nextInt();
      
      sortRegion(arr,p,q);  
      System.out.println("Sort Region");   
      print1D(arr);
    
    }
}

// segregate0and1
// 7
// 0 0 1 1 1 0 1
// 0 0 0 1 1 1 1 
// sortcolor
// 6
// 2 0 2 1 1 0
// 0 0 1 1 2 2
// sortEvenOdd
// 8
// 1 2 1 3 5 6 4 8
// 2 6 4 8 5 1 1 3
// pivot_sorted
// <1>
// 11
// 11 2 3 8 8 8 6 3 7 9 10
// Enter your data
// 8
// 2 3 8 8 6 3 7 8 11 9 10 
// Data Index Return
// 7

// <2>
// 9
// 9 3 -10 11 16 4 13 12 7
// Enter your data
// 8 & 7
// 3 -10 4 7 16 9 13 12 11 
// Data Index Return
// 3

// sortRegion
// 15
// 2 10 11 8 8 8 13 2 1 3 5 7 6 6 6
// Enter your data
// 5
// 9
// (5,11)
// Sort Region
// 2 2 1 3 5 8 6 6 6 8 8 7 13 11 10