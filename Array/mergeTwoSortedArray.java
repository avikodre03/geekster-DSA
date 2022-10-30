import java.util.*;

import javax.swing.text.DefaultStyledDocument.ElementSpec;
public class mergeTwoSortedArray {
    public static Scanner scn = new Scanner(System.in);
    private static int[] b;

    public static void input(int [] A){
        for (int i=0; i<A.length; i++){
          A[i] = scn.nextInt();   //write
        }
    }

    public static void input1D(int [] B){
        for (int i=0; i<B.length; i++){
          B[i] = scn.nextInt();   //write
        }
    }
    
    
    public static void print1D(int [] arr){
        for (int i=0; i<arr.length; i++){                                                             
          System.out.print( arr[i] + " ");   //read
        }
        System.out.println();
    }

    public static int[] mergeTwoSortedArray(int[] A, int[] B) {
        int n =A.length, m = B.length;
        if(n==0 || m==0)
       return n!=0 ? A:B ;

       int len =n+m ;
       int [] ans = new int[len];
     
      int i=0, j=0, k=0 ;
      while(i<n && j<m){
        if(A[i]<=B[j])
        ans[k++] = A[i++];
        else
        ans[k++] = B[j++];
      }
      while(i<n){
        ans[k++] = A[i++];
      }
      while(j<m){
        ans[k++] = B[j++];
      }
      return ans;
    }
  // o(N+M)
    public static void intersection(int[] A, int[] B) {
      int n =A.length, m = B.length;
      if(n==0 || m==0) {
        return;
      }

     int len =n+m ;
     int [] ans = new int[len];
   
    int i=0, j=0;
    while (i<n && j<m){
      if(A[i]==B[j]){
        System.out.print(A[i] +" ");
        i++;
        j++;
      }
      else if(A[i]<B[j]){
        i++;
      }
      else 
      j++;
       }
    }

    public static void main(String[] args){
      System.out.println("Input first Array");
        int n = scn.nextInt();
        int[] A= new int[n];
        input(A);

        System.out.println("Input second Array");
        int m = scn.nextInt();
        int[] B = new int[m];
       input1D(B);

       System.out.println("Merge Array");
       print1D( mergeTwoSortedArray(A,B));
      //  intersection(A,B);
      //    int [] ans = mergeTwoSortedArray(A,B);
      //  print1D(ans);
    }
}

// Input first Array
// 6
// -4 -2 0 8 10 12
// Input second Array
// 4
// -5 1 8 9 
// Merge Array
// -5 -4 -2 0 1 8 8 9 10 12 