package inflearn.hashmap_treemap.학급회장;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public void solution(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int hit = 0;
        char answer = 0;

        for(char c :s.toCharArray()){
            if (!map.containsKey(c)) {
                map.put(c, 1);
            }else {
                map.put(c, map.get(c) + 1);
            }
        }
        for (char c : map.keySet()) {

            if (map.get(c) > hit) {
                hit = map.get(c);
                answer = c;
            }
        }
        System.out.println(answer);
    }
    public static void main(String[] args) {
        Main n = new Main();
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        String s = sc.next();
        n.solution(s);
        //"BACBACCACCBDEDE"
    }
}
