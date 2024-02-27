package re2024.baekjoon.dfs.연결요소의개수;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

class LinkFactorNumber3 {
    final static int MAX = 1000 + 10;
    static ArrayList<Integer>[]  graph;
    static boolean [] visited;
    static int n, m;
    static int answer = 0;

    void dfs(int x) {
        visited[x] = true;
        
        for(int i = 1; i <= graph[x].size() ; i ++) {
            System.out.println(i);
            if(!visited[graph[x].get(i)])
                dfs(graph[x].get(i));
        }
        
    }
    /**
     * 2024.02.21
     * 
     * 백준 DFS - 연결요소의 갯수
     * 백준 11724번 문제입니다.
     */

    public static void main(String[] args) throws IOException {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
 
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        graph = new ArrayList[n+1];// Fix: Specify the type parameter

        for(int i = 0 ; i< n+1; i++){
            graph[i] = new ArrayList<Integer>();
        }

        visited = new boolean[MAX];

        int x, y;
        
        // 1. 그래프 생성
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            
            graph[x].add(y);
            graph[y].add(x);

        }
        LinkFactorNumber3 ln = new LinkFactorNumber3();

        for(int i=1 ; i <= n ;i ++){
            if(!visited[i]){
                System.out.println(i);
                ln.dfs(i);
                answer++;
            }

        }
        System.out.println(answer);
    }
}