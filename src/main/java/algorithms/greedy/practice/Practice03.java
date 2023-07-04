package algorithms.greedy.practice;
/**
 * 1. n이 짝수 인경우 2 로 나누기 연산
 * 2. n임 수일때는 1을 더하거나 1을 빼는 연산
 * 최소 연산을 구하라
 * n: 8
 * output: 3
 *
 * n: 7
 * output: 4
 *
 * n: 9
 * output: 4
 *
 * */
public class Practice03 {
    public static int solution(int n) {
        if (n == 0 || n == 2) {
            return 1;
        }
        if (n == 1) {
            return 0;
        }
        int cnt = 0;

        while (n != 1) {

            if (n == 3) {
                cnt += 2;
                break;
            }
            if (n % 2 == 0) {
                n /= 2;
            } else if ((n + 1) % 4 == 0) {
                n = n + 1;
            } else if ((n - 1) % 4 == 0) {
                n = n - 1;
            }
            cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        System.out.println(solution(8));
        System.out.println(solution(7));
        System.out.println(solution(9));
        System.out.println(solution(6));
    }
}
