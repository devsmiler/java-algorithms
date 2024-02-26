package re2024.baekjoon.dfs.바이러스;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Virus3 {
    static ArrayList<Integer>[]  graph;
    static boolean [] visited;
    static int n, m;
    static int answer = 0;

    public void dfs(int x){
        visited[x] = true;  
        answer++;

        for(int i = 1 ; i < graph[x].size(); i ++){
            if(!visited[graph[x].get(i)] ){
                dfs(graph[x].get(i));
            }
        }

    } 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        graph = new ArrayList[n+1]; // Fix: Specify the type parameter
        visited = new boolean[n+1];
        
        for(int i = 0 ; i< n+1; i++){
            graph[i] = new ArrayList<Integer>();
        }


        int x, y = 0;

        for (int i = 0 ; i < m ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            graph[x].add(y);
            graph[y].add(x);
        }
        Virus3 v = new Virus3();
        v.dfs(1);

        System.out.println(answer-1);
        br.close(); 

    }
}
