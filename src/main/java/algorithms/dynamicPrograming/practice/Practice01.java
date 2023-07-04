package algorithms.dynamicPrograming.practice;

/**
 * 정수 n이 주어졌을 때 아래의 연산을 통해 1로 만들려고 한다.
 *  2로 나누어 떨어지면 2로 나누기
 *  3으로 나누어 떨어지면 3으로 나누기
 *  1 빼기

 *  n = 2 output: 1
 *  n = 9 output: 2
 */

public class Practice01 {
    public static int solution(int n) {
        int[] dp = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + 1;

            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }

            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        System.out.println(solution(2));
        System.out.println(solution(4));
        System.out.println(solution(9));
        System.out.println(solution(10));

    }
}
