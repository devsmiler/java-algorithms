package algorithms.dynamicPrograming.practice;
/**
 * 부분 수열 중 증가하는 부분이 가장 긴 길이를 출력하는 프로그램
 *
 * arr: {10, 20, 30, 10, 50, 10}
 * output: 4
 * */
public class Practice02 {
    public static int solution(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n + 1];
        int result = 0;
        for (int i = 0; i <= n; i++) {
            dp[i] = 1;
            for (int j = 1; j < i; j++) {
                if (arr[j - 1] < arr[i - 1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            result = Math.max(result, dp[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 10, 50, 10};
        System.out.println(solution(arr));
    }
}
