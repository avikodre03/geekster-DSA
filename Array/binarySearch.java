import java.util.*;
public class binarySearch {
    private static Scanner scn = new Scanner(System.in);
   
   // Time: O(log(n))
    public static int binarySearch(int [] arr, int data) {

        int n = arr.length, si=0, ei=n-1;

        while (si<=ei) {
            int mid = (si+ei)/2;
            if(arr[mid]==data){
                return mid;

            }else if (arr[mid]<data){
                si = mid+1;

            }else {
                ei = mid-1;
            }

        }
        return -1;
    }

      // Time: O(n)
      public static int linearSearch(int[] arr, int data) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data)
                return i;
        }

        return -1;
    }
    
   ///////////////////////

      public static int pairSum (int [] arr, int target ){
      int si=0, ei=arr.length;
      while(si<=ei){
        int sum = arr[si] + arr[ei];
        if(sum==target){
            System.out.println(arr[si] +", "+arr[ei]);
            si++;
            ei--;
        }
        else if(sum<target){
            si++;
        }
        else{
            ei--;
        }
          } 
          return -1;
         
      }
      

    public static void main(String[] args) {
        System.out.println("enter size of array");
        int n = scn.nextInt();
        int arr []  = new int[n];
       

         System.out.println("enter element");
        for (int i=0; i<n; i++){
            arr[i] = scn.nextInt();   //write
          }
         
        //   System.out.println("input");
        //   int ans = binarySearch(arr, scn.nextInt());
        //      int ans = linearSearch(arr, scn.nextInt());
        // int ans = pairSum (arr, scn.nextInt());
       
     
          System.out.println("ans");
        //   System.out.println(ans);
        
    }
    
}