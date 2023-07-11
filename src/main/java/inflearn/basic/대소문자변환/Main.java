package inflearn.basic.대소문자변환;


import java.util.Scanner;

public class Main {
    public String solution(String s) {
        String answer = "";
        int maxLength = 0;
        String[] s1 = s.split(" ");

        for (String x : s1) {
            if (x.length() > maxLength) {
                answer=x;
                maxLength = x.length();
            }
        }
        return answer;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        Main m = new Main();

        String input1 = in.nextLine();
        System.out.println(m.solution(input1));
        return ;
    }
}
