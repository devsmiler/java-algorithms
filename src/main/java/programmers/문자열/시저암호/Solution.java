package programmers.문자열.시저암호;
// https://school.programmers.co.kr/learn/courses/30/lessons/12926
class Solution {
    public char push(char c, int n) {
        if (!Character.isAlphabetic(c)) {
            return c;
        } else {
            int offset = Character.isUpperCase(c) ? 'A' : 'a';
            int position = c - offset;
            position = (position + n) % ('z' - 'a' + 1);
            return (char) (offset + position);
        }
    }
    public String solution(String s, int n) {

        StringBuilder builder = new StringBuilder();
        for (char c : s.toCharArray()) {
            builder.append(push(c, n));
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("aBz",4));

    }
}