package re2024.baekjoon.dfs.dfs와bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    final static int MAX = 1000 + 10;
    static boolean graph[][];
    static boolean visited[];
    static ArrayList<Integer> queue;
    static int N,M,V;
    static int answer = 0;

    public static void dfs(int x) {
        visited[x] = true;
        System.out.print(x);
        for (int i = 1; i <= N; i++) {
            if (graph[x][i] && !visited[i]) {                
                dfs(i);
            }
        }
    }
    public static void bfs() {
        queue = new ArrayList<>();
        visited = new boolean[N+1];
        queue.add(V);
        visited[V] = true;
        while(!queue.isEmpty()){
            int idx = queue.remove(0);
            System.out.print(idx + " ");

            for(int i = 1; i <= N; i ++){
               if(graph[idx][i] && !visited[i]){
                    queue.add(i);
                    visited[i] =true;
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


        //그래프 만들기
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            graph[x][y] = graph[y][x] = true;
        }
        
        //DFS 호출
        dfs(V);

        //BFS 호출 
        System.out.println();
        bfs();
    }
}
