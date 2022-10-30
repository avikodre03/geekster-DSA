import java.util.*;
public class sumOftwoArray {
    public static Scanner scn = new Scanner(System.in);

  public static void input(int []A) {
    for(int i=0; i<A.length; i++){
        A[i] = scn.nextInt();
    }
    
  }

  public static void input1D(int [] B) {
    for(int i=0; i<B.length; i++){
        B[i] = scn.nextInt();
    }
    
  }

  public static void print(int [] arr) {
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] +" ");
    }
    System.out.println();
  }
   public static int[] sumOftwoArray (int [] A ,int [] B) {
    int n=A.length, m=B.length;
    int len= Math.max(m,n) + 1 ;

    int [] ans = new int[len];
    int i=n-1, j=m-1, k=len-1, carry=0;

    while( i>=0 || j>=0 || carry!=0){
      int sum = (i>=0 ?A[i]:0) + (j>=0 ? B[j]:0);
      int digit=sum % 10;
          carry = sum /10;
          ans[k--] = digit;
          i--;
          j--;

    }
    
  //  String res ="";
  //  boolean flag = false;
  //  for(int p =0; p < len; p++){
  //      if(ans[p] == 0 && flag == false)
  //      continue;
  //      flag = true;
  //      res+=ans[p];
  //  }
  //  return res;
  //  }
   String res = "";
   boolean isFirstNonZeroIncountered = false;
   for (int p = 0; p < len; p++) {
       if (ans[p] == 0 && isFirstNonZeroIncountered == false)
           continue;

       isFirstNonZeroIncountered = true;
       res += ans[p];
   }

   return ans;
}

   
   
   public static void main(String[] args){
    int n=scn.nextInt();
    int [] A = new int[n];
    input(A);
    
    int m=scn.nextInt();
    int [] B = new int[m];
    input1D(B);
   int[] ans = sumOftwoArray(A,B);
   print(ans);
  }
}
