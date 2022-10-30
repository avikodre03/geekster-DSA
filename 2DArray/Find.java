import java.util.*;
public class Find {

    public static Scanner scn =new Scanner(System.in);

    public static void input2D(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        for(int i =0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        } 
    }     
    
    public static boolean find(int[][] arr, int data) {
        int n = arr.length, m = arr[0].length;
        for(int i =0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j] == data)
                return true;
            }
        } 
        return false;
    }

    public static void main(String[] args) {
        int n = scn.nextInt(), m = scn.nextInt();
        int[][] arr = new int [n][m];
        input2D(arr);
        System.out.println(find(arr , scn.nextInt()));
    }
}
