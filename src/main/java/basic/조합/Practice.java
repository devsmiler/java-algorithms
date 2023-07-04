package basic.조합;

import java.util.Arrays;

public class Practice {
    void combination(int[] arr,  boolean[] visited, int depth, int n, int r) { //r은 자리수 갯수 n은 범위
        if (r == 0) {
            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
            return;
        }
        if (depth == n) { // 자리수 범주 초과시 리턴
            return;
        }

        visited[depth] = true;
        combination(arr, visited, depth + 1, n, r - 1);

        visited[depth] = false;
        combination(arr, visited, depth + 1, n, r);
    }
    public static void main(String[] args) {
        System.out.println();
        int n = 4;
        int r = 3;
        int[] arr = {1, 2, 3, 4};
        boolean[] visited = new boolean[n];
        int[] out = new int[r];

        Practice practice = new Practice();
        practice.combination(arr, visited, 0, n, r);

    }
}