package re2024.baekjoon.dfs.바이러스;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Virus2 {
    static boolean [][] graph;
    static boolean [] visited;
    static int n, m;
    static int answer = 0;

    public void dfs(int x){
        visited[x] = true;
        for (int i =1; i <= n ; i++){
            if (!visited[i] && graph[x][i]) {
                answer++;
                dfs(i);
            }
        }
        
    } 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        visited = new boolean[n+1];
        graph = new boolean[n+1][n+1];
        int x, y = 0;
        for (int i = 0 ; i < m ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            graph[x][y] = graph[y][x] = true;
        }
        Virus2 virus2 = new Virus2();
        virus2.dfs(1);

        System.out.println(answer);
        br.close(); 

    }
}
