package inflearn.slidingwindow_twopointer.공통원소구하기;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nA = sc.nextInt();
        int[] arrA = new int[nA];
        for (int i = 0; i < nA; i++) {
            arrA[i] = sc.nextInt();
        }
        int nB = sc.nextInt();
        int[] arrB = new int[nB];
        for (int i = 0; i < nB; i++) {
            arrB[i] = sc.nextInt();
        }
        Main m = new Main();
        m.solution(arrA, nA, arrB, nB);

    }

    private void solution(int[] integersA, int nA, int[] integersB, int nB) {
        Arrays.sort(integersA);
        Arrays.sort(integersB);
        ArrayList<Integer> answer = new ArrayList<>();

        int idxA = 0; int idxB = 0;
        while (idxA < nA && idxB < nB) {
            if(integersA[idxA] == integersB[idxB]){
                answer.add(integersA[idxA]);
                idxA++;idxB++;
            } else if (integersA[idxA] > integersB[idxB]) {
                idxB++;
            }else if (integersA[idxA] < integersB[idxB]) {
                idxA++;
            }
        }
        for (int n: answer) System.out.print(n+" ");
    }
}
