package inflearn.basic.문자거리;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public void solution(String s, char ch) {
        char[] chars = s.toCharArray();
        int[] answers = new int[chars.length];
        Arrays.fill(answers, Integer.MAX_VALUE);
        boolean isFoundTarget = false;
        int length =0;

        for (int i = 0; i < chars.length; i++) {
            if(ch == chars[i]){
                isFoundTarget = true;
                length = 0;
                answers[i] = length++;
            } else if (isFoundTarget) {
                answers [i] = length ++;
            }
        }

        isFoundTarget=false;
        length=0;

        for (int i = chars.length-1; i >=0 ; i--) {
            if(ch == chars[i]){
                isFoundTarget = true;
                length = 0;
                answers[i] = length++;

            } else if (isFoundTarget) {
                answers[i] = Math.min(answers[i], length++);

            }
        }
        for(int n : answers) System.out.print(n+" ");
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String string ="teachermode";
//        char c = 'e';
//        TaeabaeaT
        string=in.next();
        char c = in.next().charAt(0);
        Main main = new Main();
        main.solution(string, c);
//        System.out.println();
    }
}
