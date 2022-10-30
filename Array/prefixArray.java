import java.util.*;
public class prefixArray {
    public static Scanner scn = new Scanner(System.in);

    public static void input(int[]arr){
        for(int i=0; i<arr.length; i++){
            arr[i]=scn.nextInt();

        }
    } 
    public static void prefixArray(int[] arr) {
        int n = arr.length;
        int[] parr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            parr[i + 1] = parr[i] + arr[i];
        }
       System.out.println("Enter no. of query");
       
        int q = scn.nextInt(); // 10
        while (q-- > 0) {
            System.out.println("Enter query lr and rr");
            int lr = scn.nextInt(), rr = scn.nextInt();
            int sum = parr[rr + 1] - parr[lr];
            System.out.println("Your query Ans: " + sum);
        }
    }

   

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
       
     prefixArray(arr);
    }
    
}
// 11
// 4 6 8 9 7 10 12 13 16 17 22
// Enter no. of query
// 3
// Enter query lr and rr
// 0 3
// Your query Ans: 27
// Enter query lr and rr
// 4 7
// Your query Ans: 42
// Enter query lr and rr
// 6 10
// Your query Ans: 80