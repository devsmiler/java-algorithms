package inflearn.basic.단어뒤집기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<String> solution(int n, String[] strings) {
        ArrayList<String> answer = new ArrayList<>();
        for (String s : strings) {
            StringBuilder stringBuilder = new StringBuilder(s);
            answer.add(stringBuilder.reverse().toString());
        }
        return answer;
    }
    public static void main(String[] args) {
        Main m = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i]=in.next();
        }
//        for (String x : strings) {
        for (String x : m.solution(n, strings)) {
            System.out.println(x);
        }
    }
}
