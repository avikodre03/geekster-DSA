import java.util.*;
public class threeSum {
    
    private static Scanner scn = new Scanner(System.in);

    
   public static void input(int []arr) {
    for( int i=0; i<arr.length; i++){
     arr[i] = scn.nextInt();
    }
}

    // O(N)
    public static void twoSum(int[] arr, int tar, int lb, int rb, int firstNumber) {
        while (lb < rb) {
            int sum = arr[lb] + arr[rb];
            if (sum == tar) {
                System.out.println(firstNumber + " + " + arr[lb++] + " + " + arr[rb--]);
            } else if (sum < tar) {
                lb++;
            } else {
                rb--;
            }
        }
    }

    // O(N2)
    public static void threeSum(int[] arr, int tar) {
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            twoSum(arr, tar - arr[i], i + 1, n - 1, arr[i]);
        }
    }

    
    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        int tar =scn.nextInt();
       threeSum(arr,tar);
        
    //    hardcode :
    //    int[] arr = { 4, 6, 8, 9, 7, 10, 12, 13, 16, 17, 22 };
    //    int tar =30;
    //    threeSum(arr,tar);
      }

}
// 11
// 4 6 8 9 7 10 12 13 16 17 22
// 30
// 4 + 9 + 17
// 4 + 10 + 16
// 6 + 7 + 17
// 6 + 8 + 16
// 7 + 10 + 13
// 8 + 9 + 13
// 8 + 10 + 12