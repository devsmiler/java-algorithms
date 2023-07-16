package inflearn.stack_queue.괄호문자제거;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public void solution(String s) {
        Queue<Character> q = new LinkedList<>();
        String answer = "";
        for (char c : s.toCharArray()){
            if (Character.isAlphabetic(c) && q.size() == 0) {
                answer += c;
            }else if('('==c){
                q.add(c);
            }else if(')'==c){
                q.remove();
            }
        }
        System.out.println(answer);
    }
    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        m.solution(s);
    }
}
