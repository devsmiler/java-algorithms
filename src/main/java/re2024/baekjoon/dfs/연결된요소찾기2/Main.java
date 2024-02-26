package re2024.baekjoon.dfs.연결된요소찾기2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    final static int Max = 1000000 + 10;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int n, m, r;
    static int[] answer;
    static int order = 1;
    public void dfs(int x) {
        visited[x] = true;
        answer[x] = order;
        order++;
        for (int i = 0; i < graph[x].size(); i++) {
            int y = graph[x].get(i);
            if (!visited[y]) {
                dfs(y);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        n = Integer.parseInt(stringTokenizer.nextToken());
        m = Integer.parseInt(stringTokenizer.nextToken());
        r = Integer.parseInt(stringTokenizer.nextToken());

        // 1. 그래프 생성
        graph = new ArrayList[Max];
        for (int i = 0; i <= n ; i++) {
            graph[i] = new ArrayList<>();
        }

        visited = new boolean[Max];
        answer = new int[Max];
        order = 1;

        for(int i =0; i<m; i++) {
            stringTokenizer = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(stringTokenizer.nextToken());
            int y = Integer.parseInt(stringTokenizer.nextToken());
            graph[x].add(y);
            graph[y].add(x);
        }
        // 2. 내림차순 정렬
        for (int i = 1; i <= n; i++) {
            Collections.sort(graph[i], Collections.reverseOrder());
            
        }
        Main main = new Main();
        // 3. 재귀함수 호출
        main.dfs(r);
        // 4. 결과 출력

        for (int i = 1; i <= n; i++) {
            System.out.println(String.valueOf(answer[i]) + " ");
        }
    }


}
