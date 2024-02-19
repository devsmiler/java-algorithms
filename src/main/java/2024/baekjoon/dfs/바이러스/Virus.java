import java.io.*;
import java.util.StringTokenizer;

public class Virus {

    static boolean [][] graph;
    static boolean [] visited;
    static int n, m;
    static int answer = 0;

    public void dfs(int x) {
        visited[x] = true;
        for (int i = 1; i <= n; i++) {
            if (graph[x][i] && !visited[i]) {
                answer++;
                dfs(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Virus 백준 2606번 문제입니다.");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        graph = new boolean[n+1][n+1];
        visited = new boolean[n+1];

        int x, y;
        // 1. 그래프 생성
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            graph[x][y] = graph[y][x] = true;
        }

        Virus virus = new Virus();
        virus.dfs(1);

        System.out.println(answer);

        bw.write(String.valueOf(answer - 1));

        br.close(); bw.close();
    }
}