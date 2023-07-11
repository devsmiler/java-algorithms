package inflearn.basic.중복문자제거;

import baekjoon.linkedlist.중복제거.Practice;

import java.util.*;

public class Main {

    public String solutions(String s) {
        String answer = "";
        char[] chars = s.toCharArray();
        Set<Character> charSet = new HashSet<Character>();
        for (char c: chars){
            if(!charSet.contains(c)){
                charSet.add(c);
                answer += c;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Main m = new Main();
        Scanner in = new Scanner(System.in);
        String string ="";
        string=in.next();
        System.out.println(m.solutions(string));

    }
}
