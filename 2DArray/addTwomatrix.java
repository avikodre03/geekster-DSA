import java.util.*;
public class addTwomatrix {
    
    public static Scanner scn =new Scanner(System.in);
    public static void input2D(int[][] m1) {
        int n = m1.length, m = m1[0].length;
        for(int i =0; i<n; i++){
            for(int j=0; j<m; j++){
                m1[i][j] = scn.nextInt();
            }
        } 
    }    

    public static void input2D_01(int[][] m2) {
        int p = m2.length, q = m2[0].length;
        for(int i =0; i<p; i++){
            for(int j=0; j<q; j++){
               m2[i][j] = scn.nextInt();
            }
        } 
    }     
    public static void print1D(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void print2D(int[][] m1){
        // int n = arr.length, m = arr[0].length;
        // for(int i =0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //       System.out.print(arr[i][j] +" ");
        //     }
        // } 
        // System.out.println();
        
        for (int[] ar : m1) {
            print1D(ar);
        }
        
        // for (int [] ar : arr) {
        //     for (int ele : arr) {
        //         System.out.print(ele + " ");
        //     }
        //     System.out.println();
        // }
}

public static void addTwomatrix(int[][] m1 , int[][] m2) {
    int n = m1.length , m = m1[0].length;
    for(int i =0; i<n; i++){
        for(int j=0; j<m; j++){
            m1[i][j] += m2[i][j];
        }
    }    
}

public static void subTwomatrix(int[][] m1 , int[][] m2) {
    int n = m1.length , m = m1[0].length;
    for(int i =0; i<n; i++){
        for(int j=0; j<m; j++){
            m1[i][j] -= m2[i][j];
        }
    }    
}

public static void main(String[] args) {
    int n = scn.nextInt(), m = scn.nextInt();
    int [][] m1 = new int [n][m];
    input2D(m1);
    int p= scn.nextInt(), q= scn.nextInt();
    int [][] m2 = new int [p][q];
    input2D_01(m2);

    // addTwomatrix(m1,m2);
    // System.out.println("addition matrix");
    // print2D(m1);

    subTwomatrix(m1,m2);
    System.out.println("subtract matrix");
    print2D(m1);
 }
}
