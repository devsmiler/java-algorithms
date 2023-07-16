package inflearn.stack_queue.올바른괄호;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public void solution(String s) {
        Queue<Character> q = new LinkedList<>();
        for (Character c :s.toCharArray()){
            if(c=='('){
                q.add(c);
            } else if (c==')') {
                if(q.size()>0){
                    q.remove();
                } else {
                    System.out.println("NO"); return;
                }

            }
        }
        if (q.size() == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        m.solution(s);
    }
}
