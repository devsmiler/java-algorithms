package inflearn.hashmap_treemap.아나그램_해쉬;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public void solution(String s1, String s2) {
        HashMap<Character, Integer> mapS1 = new HashMap<>();
        HashMap<Character, Integer> mapS2 = new HashMap<>();

        for(char c : s1.toCharArray()){
            if (mapS1.containsKey(c)) {
                mapS1.put(c, mapS1.get(c)+1);
            }else{
                mapS1.put(c, 1);
            }
        }
        for(char c : s2.toCharArray()){
            if (mapS2.containsKey(c)) {
                mapS2.put(c, mapS2.get(c)+1);
            }else{
                mapS2.put(c, 1);
            }
        }
        System.out.println(mapS1);
        System.out.println(mapS2);
        Iterator<Character> iter = mapS1.keySet().iterator();

        while (iter.hasNext() && mapS1.keySet().size()==mapS2.keySet().size()) {
            Character next = iter.next();
            if (mapS2.containsKey(next) && !mapS2.get(next).equals(mapS1.get(next))) {
                System.out.println("NO");
                return;
            }

        }
        System.out.println("YES");
    }
    public static void main(String[] args) {
        Main n = new Main();
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        n.solution(s1, s2);
//        n.solution("abaCC", "Caaab");
    }
}
