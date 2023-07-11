package inflearn.basic.암호;

import java.util.Scanner;

import static java.lang.Integer.parseInt;


public class Main {
    public String solution(String str, int characterNum) {
        String answer = "";
        String s = str.replaceAll("#", "1").replaceAll("\\*", "0");
        char[] chars = new char[characterNum];
        for (int i = 0; i < characterNum; i++ ){
            String s1 = s.substring(i * 7, (i + 1) * 7);
            System.out.print((char) Integer.parseInt(s1, 2));
        }
        return answer;
    }
    public static void main(String[] args) {
        Main m = new Main();
        Scanner in = new Scanner(System.in);
        int characterNum = 4;
        String string = "#****###**#####**#####**##**";
//        string=in.next();
        System.out.println(m.solution(string, characterNum));
    }
}
