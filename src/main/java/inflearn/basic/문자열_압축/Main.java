package inflearn.basic.문자열_압축;

import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String answer = "";
        char beforeChar = '+'; int cnt =1;
        for (char c : str.toCharArray()) {

            if (c != beforeChar) {
                beforeChar = c;
                if (cnt > 1){
                    answer += cnt;
                }
                cnt = 1;
                answer += c;
            }else {
                cnt ++;
            }
        }
        if (cnt > 1){
            answer += cnt;
        }
        return answer;
    }
    public static void main(String[] args) {
        Main m = new Main();
        Scanner in = new Scanner(System.in);
        String string ="KSTTTSEEKFKKKDJJGG";
//        string=in.next();
        System.out.println(m.solution(string));
    }
}
