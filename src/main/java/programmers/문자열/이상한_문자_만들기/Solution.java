package programmers.문자열.이상한_문자_만들기;
// https://school.programmers.co.kr/learn/courses/30/lessons/12930
public class Solution {
    public String solution(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean isUpper = true;
        for (char c : s.toCharArray()){
            if(!Character.isAlphabetic(c)) {
                stringBuilder.append(c);
                isUpper = true;
            } else {
                if (isUpper) {
                    stringBuilder.append(Character.toUpperCase(c));

                } else {
                    stringBuilder.append(Character.toLowerCase(c));
                }
                isUpper = !isUpper;
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("try hello world"));

        // "TrY HeLlO WoRlD"
    }
}
