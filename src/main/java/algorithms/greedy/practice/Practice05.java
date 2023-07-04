package algorithms.greedy.practice;

import java.util.Arrays;

public class Practice05 {
    public static int solution(int num) {
        char[] cArr = String.valueOf(num).toCharArray();
        int[] maxArr = new int[cArr.length];

        int maxnum = 0;
        for (int i = cArr.length - 1; i >= 0; i--) {
            System.out.println(maxnum + ", " + cArr[i]);
            maxnum = Math.max(maxnum, cArr[i]-'0');

            System.out.println("max num: " + maxnum);
            maxArr[i] = maxnum;

            System.out.println("maxArr: " + Arrays.toString(maxArr));
        }

        for (int i = 0; i < cArr.length - 1; i++) {
            if (cArr[i] - '0' < maxArr[i+1]){
                for (int j = cArr.length - 1; j >= i + 1; j--) {
                    if (cArr[j] - '0' == maxArr[i + 1]) {
                        char tmp = cArr[j];
                        cArr[j] = cArr[i];
                        cArr[i] = tmp;
                        return Integer.parseInt(String.valueOf(cArr));
                    }
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(solution(2736));
        System.out.println(solution(7116));
        System.out.println(solution(19));
    }
}
