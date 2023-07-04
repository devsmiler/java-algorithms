package algorithms.dynamicPrograming.basic;

public class Main {
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }

    }
    public static int fibDP(int n) { //타뷸레이션
        int[] dp = new int[n < 2 ? 2 : n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    static int[] dp2 = new int[8];
    public static int fibDP2(int n) { //이모지제이션
        if (n <= 2) {
            return 1;
        }
        if (dp2[n] != 0) {
            return dp2[n];
        }
        dp2[n] = fibDP2(n - 1) + fibDP2(n - 2);
        return dp2[n];
    }
    public static void main(String[] args) {
        System.out.println(fib(7));
        System.out.println(fibDP(7));
        System.out.println(fibDP2(7));
    }
}
