package inflearn.basic.특정문자뒤집기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    String solution(String strings) {
        String answers = "";
        int startIdx = 0;
        int endIdx = strings.length() - 1;
        char[] chars = strings.toCharArray();

        while (startIdx < endIdx) {
            if (Character.isAlphabetic(chars[startIdx]) && Character.isAlphabetic(chars[endIdx])) {
                char tmp = chars[startIdx];
                chars[startIdx] = chars[endIdx];
                chars[endIdx] = tmp;
                startIdx ++;
                endIdx --;
            } else if (!Character.isAlphabetic(chars[startIdx]) ){
                startIdx ++;
            } else if (!Character.isAlphabetic(chars[endIdx])) {
                endIdx --;
            }

        }
        answers = String.valueOf(chars);
        return answers;
    }
    public static void main(String[] args) {
        Main m = new Main();
        Scanner in = new Scanner(System.in);
        String string ="";
        string=in.next();
        System.out.println(m.solution(string));
        // kdj#@kdjg%$#kdjgk@kd$dk
        // kdj#@kkgj%$#kdgjd@kd$dk
        //kdd#@kkgj%$#dkgjd@kj$dk
    }
}
