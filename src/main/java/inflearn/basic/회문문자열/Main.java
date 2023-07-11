package inflearn.basic.회문문자열;

import java.util.Scanner;

public class Main {
    public String solutions(String s) {
        String ans = "";
        String[] chars = s.split("");

        int startIdx = 0;
        int endIdx = s.length() - 1;
        while (startIdx < endIdx) {
            if (!chars[startIdx].equalsIgnoreCase(chars[endIdx])) {
                return "NO";
            }
            startIdx ++;
            endIdx --;
        }
        return "YES";
    }
    public static void main(String[] args) {
        Main m = new Main();
        Scanner in = new Scanner(System.in);
        String string ="";
        string=in.next();
        System.out.println(m.solutions(string));
    }
}
