package basic.순열;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *  1, 2, 3, 4 를 이용하여 세자리 자연수를 만드는 방법 순서 o 중복 x
 * */
public class Practice2 {
    void permutation(int[] arr, int depth, int n, int r, boolean[] visited, int[] out) { //r은 자리수 갯수 n은 범위
        if (depth == r) {
            System.out.println(Arrays.toString(out));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                out[depth] = arr[i];
                permutation(arr, depth + 1, n, r, visited, out);
                visited[i] = false;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println();
        int n = 4;
        int r = 3;
        int[] arr = {1, 2, 3, 4};
        boolean[] visited = new boolean[n];
        int[] out = new int[r];

        Practice2 practice = new Practice2();
        practice.permutation(arr, 0, n, r, visited, out);
    }
}
