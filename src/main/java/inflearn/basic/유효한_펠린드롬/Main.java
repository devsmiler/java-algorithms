package inflearn.basic.유효한_펠린드롬;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public String solution(String str) {
        String frontString = "";
        String secondString = "";
        String s = str.replaceAll("[^A-Za-z]", "");
        s = s.toLowerCase();
        if (s.length() % 2 != 0) {
            frontString = s.substring(0, s.length() / 2);
            secondString = s.substring(s.length() / 2 + 1);
        } else {
            frontString = s.substring(0, s.length() / 2);
            secondString = s.substring(s.length() / 2);
        }

        StringBuilder reverseSecond = new StringBuilder(secondString).reverse();
        if (reverseSecond.toString().equals(frontString)) {
            return "YES";
        }
        return "NO";
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String string ="Tae,aba;e#%a*T";
        //TaeabaeaT
        string=in.nextLine();
        Main main = new Main();

        System.out.println(main.solution(string));
    }
}
