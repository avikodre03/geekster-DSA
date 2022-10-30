import java.util.*;
public class arrayInput {
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         System.out.println("enter size of array");
        int n = scn.nextInt();
        int arr []  = new int[n];
        
        System.out.println("enter the array elements");
        for (int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();   //write
          }
         System.out.println("print array");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
        
    }
    
}
