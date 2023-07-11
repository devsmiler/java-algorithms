package inflearn.basic.문자찾기;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int solution(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        char ch = Character.toUpperCase(t);
        for (char c : str.toCharArray()) {
            if (ch == c) {
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        char input2 = in.next().charAt(0);
        System.out.println(input1 + input2);
        System.out.println(solution(input1, input2));
        return ;
    }
}
