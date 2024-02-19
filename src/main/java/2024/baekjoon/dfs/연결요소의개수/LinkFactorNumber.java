import java.io.*;
import java.util.StringTokenizer;

class LinkFactorNumber {
    final static int MAX = 1000 + 10;
    static boolean [][] graph;
    static boolean [] visited;
    static int n, m;
    static int answer = 0;

    void dfs(int x) {
        visited[x] = true;
        for (int i = 1; i <= n; i++) {
            if (graph[x][i] && !visited[i]) {
                dfs(i);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        System.out.println("백준 11724번 문제입니다.");

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

        LinkFactorNumber main = new LinkFactorNumber();

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                main.dfs(i);
                answer++;
            }
        }

        bw.write(String.valueOf(answer) + "\n");

        br.close(); bw.close();
    }
}