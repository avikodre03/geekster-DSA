public class binominal {
    public static void binomialPattern(int N) {
        for (int n = 0; n < N; n++) {
            int val = 1;
            for (int r = 0; r <= n; r++) {
                System.out.print(val + " ");
                val = (n - r) * val / (r + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        binomialPattern(5);
    }
}
// 1 
// 1 1
// 1 2 1
// 1 3 3 1
// 1 4 6 4 1
