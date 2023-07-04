package algorithms.greedy.practice;
/**
 * 주식으로 최대 수익을 얻을수 있는 가격으 반환하는 프로그램
 * 각 원소의 의미는 날짜별 주식 가격을 의미한다.
 * 한 번에 한주 이상 살수 없어요
 * price 5, 1, 6, 4, 3, 5
 * 출력 7
 *
 * price 1, 2, 3, 4, 5
 * 출력: 4
 * */
public class Practice02 {
    public static int solution(int[] prices) {
        if (prices == null | prices.length < 2) {
            return 0;
        }

        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;
    }
    public static void main(String[] args) {
        int[] prices = {5, 1, 6, 4, 3, 5};
        System.out.println(solution(prices));
        prices = new int[]{1, 2, 3, 4, 5};
        System.out.println(solution(prices));
        prices = new int[]{5, 4, 3, 2, 1};
        System.out.println(solution(prices));
    }
}
