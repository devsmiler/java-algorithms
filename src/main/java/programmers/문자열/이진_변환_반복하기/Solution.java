package programmers.문자열.이진_변환_반복하기;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/70129
public class Solution {
    private int countZeros(String s) {
        int zero = 0;
        for (char c : s.toCharArray()) {
            if(c=='0') zero ++;
        }
        return zero;
    }
    public int[] solution(String s) {
        int loop = 0;
        int removed = 0;

        while (!s.equals("1")) {
            int zero = countZeros(s);
            loop += 1;
            removed += zero;
            int ones = s.length() - zero;
            s = Integer.toString(ones, 2);
        }

        return new int[]{loop, removed};
    }
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution("110010101001")));
    }
}
