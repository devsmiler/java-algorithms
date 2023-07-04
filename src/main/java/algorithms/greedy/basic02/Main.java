package algorithms.greedy.basic02;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void getChangeCoin(int receivedMoney, int price) {
        final int[] coins = {500, 100, 50, 10, 5, 1};
        HashMap<Integer, Integer> res = new HashMap<>();
        int change = receivedMoney - price;
        int cnt = 0;
        for (int i = 0; i < coins.length; i++) {
            if (change < coins[i]) {
                continue;

            }
            int q = change / coins[i];
            res.put(coins[i], res.getOrDefault(coins[i],0) + q);

            change %= coins[i];
            cnt += q;
        }
        System.out.println("거스름든 동전 갯수" + cnt);
        for (Map.Entry<Integer, Integer> cur : res.entrySet()) {
            System.out.println(cur.getKey() + " " + cur.getValue());
        }
    }
    public static void main(String[] args) {
    getChangeCoin(1000, 100);
    getChangeCoin(1234, 500);
    }
}
