package inflearn.basic.숫자만추출;

import java.util.Scanner;

public class Main {
    public void solution(String s) {
        int answer = 0;
        String str = s.replaceAll("[^0-9]", "");
        System.out.println(Integer.parseInt(str));
    }
    public static void main(String[] args) {
//        g0en2T0s8eSoft
        Scanner in = new Scanner(System.in);
        String string ="g0en2T0s8eSoft";
        //TaeabaeaT
        string=in.nextLine();
        Main main = new Main();
        main.solution(string);
//        System.out.println();
    }
}
