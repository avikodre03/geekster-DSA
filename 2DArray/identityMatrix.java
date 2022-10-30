import java.util.*;
public class identityMatrix {

    public static Scanner scn = new Scanner (System.in);
    
    public static int[][] input2D() {
        int [][] arr = new int[scn.nextInt()][scn.nextInt()];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        return arr;
    }
//    S:(1), T:(n*m)
    public static boolean identityMatrix(int [][] matrix ){
        int n = matrix.length, m=matrix[0].length;
        if(n!=m)
        return false;
        
        for(int i = 0; i<n; i++){
            for(int j=0; j<m; j++){
                if(i==j && matrix[i][j]!=1){
                    return false;
                }else if (i!=j && matrix[i][j]!=0){
                    return false;
                }
            }
        }
        return true;
    }

  
    public static boolean symmetricMatrix(int [][] matrix ){
    int n = matrix.length, m = matrix[0].length;
        if (n != m)
            return false;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
                if (matrix[i][j] != matrix[j][i])
                    return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int [][] arr = input2D();
        // System.out.println(identityMatrix(arr));
        System.out.println(symmetricMatrix(arr));
    }
    
}
// 4 4
// 1 0 0 0
// 0 1 0 0
// 0 0 1 0
// 0 0 0 1
// >>>true

// 3
// 3
// 1 2 3
// 1 1 1
// 1 1 1
// >>>false

// symmetric matrix is a square matrix that is equal to its transpose.
// 3 3
// 1 2 5
// 2 6 4
// 5 4 3
// true