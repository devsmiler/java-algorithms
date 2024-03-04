package re2024.baekjoon.dfs.dfs와bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main2 {
    final static int MAX = 1000 + 10;
    static boolean graph[][];
    static boolean visited[];
    static ArrayList<Integer> queue;
    static int N,M,V;
    static int answer = 0;

    public static void dfs(int x) {
        
        visited[x] = true;
        System.out.println(x);
        for (int i=1; i<=N ; i++){
            if(graph[x][i]&& !visited[i]){
                dfs(i);
            }
        }
    }
    public static void bfs() {
        visited = new boolean[N+1];
        queue = new ArrayList<>();
        queue.add(V);
        visited[V] = true;
        while (!queue.isEmpty()) {
            int idx = queue.remove(0);
            System.out.println(idx);
            for(int i = 1 ; i< N+1 ; i ++){
                if(graph[idx][i] && !visited[i]){
                    visited[i] = true;
                    queue.add(i);
                }
            }
            
        }
    }
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        int x, y = 0;
        
        graph = new boolean[N+1][N+1];        
        visited = new boolean[N+1];

        System.out.println("");
        //그래프 만들기
        for(int i =0 ; i< M ; i++){
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            graph[x][y] = graph[y][x] = true;            
        }
        //DFS 호출
        dfs(V);
        //BFS 호출 
        bfs();

    }
}
