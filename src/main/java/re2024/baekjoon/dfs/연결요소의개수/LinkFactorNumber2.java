import java.io.*;
import java.util.StringTokenizer;

class LinkFactorNumber2 {
    final static int MAX = 1000 + 10;
    static boolean [][] graph;
    static boolean [] visited;
    static int n, m;
    static int answer = 0;

    void dfs(int x) {
        visited[x] = true;
        for(int i = 1; i <= n ; i ++) {
            if(!visited[i] && graph[x][i])
                dfs(i);
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
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new boolean[MAX][MAX];
        visited = new boolean[MAX];

        int x, y;
        // 1. 그래프 생성
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            graph[x][y] = graph[y][x] = true;
        }
        LinkFactorNumber2 ln = new LinkFactorNumber2();

        for(int i=1 ; i <= n ;i ++){
            if(!visited[i]){
                ln.dfs(i);
                answer++;
            }

        }


        bw.write(String.valueOf(answer) + "\n");

        br.close(); bw.close();
    }
}