package algorithms.greedy.practice;

/**
 * 원형 루트상에 n개의 주유소가 있다.
 * 각 주유소의 가스 보유량 gas 배열
 * 해당 주유소에서 다음 주유소로 이동 비용은 cost배열에 주어진다.
 *
 * 어떤위치에서 차량이 가스를 채워 출발하면 모든 주유소ㄹ르 방문 하고원래 위치로 돌아올수있는지 계산하는 프로그램
 *
 * gas: 1, 2, 3, 4, 5
 * cost: 3,4,5,1,2
 * output: 3
 */



public class Practice04 {
    public static int solution(int[] gas, int[] cost) {
        if (gas == null || cost == null) {
            return -1;
        }
        if (gas.length != cost.length) {
            return -1;
        }
        int curGas = 0;
        int totGas = 0;
        int startPos = 0;

        for (int i = 0; i < gas.length; i++) {
            curGas += gas[i] - cost[i];
            totGas += gas[i] - cost[i];

            if ( curGas< 0) {
                startPos = i + 1;
                curGas = 0;
            }
        }

        return totGas >= 0 ? startPos : -1;
    }
    public static void main(String[] args) {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        System.out.println(solution(gas,cost));
    }
}
