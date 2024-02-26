package re2024.baekjoon.dfs.바이러스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class Virus3 {
    static ArrayList<Integer>[] graph;
    static boolean [] visited;
    static int n, m;
    static int answer = 0;
    static void dfs(int num){
        visited[num] = true;
        answer++;
        for (int i = 0; i < graph[num].size(); i++) {
            if(!visited[graph[num].get(i)]){
                dfs(graph[num].get(i));
            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        
        graph = new ArrayList[100];
        visited = new boolean[n+1];


        int x = 0;
        int y = 0;
        for (int i = 1; i <=n; i++) {
            graph[i] = new ArrayList<>();
            
        }
        
        for (int i = 1; i<= m ; i ++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            graph[x].add(y);
            graph[y].add(x);
        }

        for( int i = 1 ; i <= n ; i++ ){
            Collections.sort(graph[i]);
        } // 정렬

        dfs(1);

        for (boolean v : visited) {
            System.out.println(v);
        }
        System.out.println(answer-1);
    }
    
}
