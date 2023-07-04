package programmers.문자열.자연수_뒤집어_배열로_만들기;
// https://school.programmers.co.kr/learn/courses/30/lessons/12932?language=java
public class Practice01 {
    public int[] solution(long n) {
        int[] answer = {};


        String str = Long.toString(n);
        String reversed = new StringBuilder(str).reverse().toString();
        char[] chars = reversed.toCharArray();
        int[] result = new int[chars.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = chars[i] - '0';
        }
        return result;
    }

    public static void main(String[] args) {
        Practice01 p = new Practice01();
        p.solution(12345);

    }
}
