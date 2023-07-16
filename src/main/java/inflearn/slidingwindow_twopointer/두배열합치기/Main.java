package inflearn.slidingwindow_twopointer.두배열합치기;

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
        Main main = new Main();
        main.solution(arrA, nA, arrB, nB);
    }

    private void solution(int[] arrA, int nA, int[] arrB, int nB) {
        int idxA=0;int idxB=0;int idx=0;
        int[] answer = new int[nA + nB];
        while ((idxA < nA) && (idxB < nB)) {
            if (arrA[idxA] < arrB[idxB]) {
                answer[idx++] = arrA[idxA++];
            } else if (arrA[idxA]> arrB[idxB]) {
                answer[idx++] = arrB[idxB++];
            } else if (arrA[idxA] == arrB[idxB]) {
                answer[idx++] = arrA[idxA++];
                answer[idx++] = arrB[idxB++];
            }
        }
        while(idxA < nA){
            answer[idx++] = arrA[idxA++];
        }
        while (idxB < nB) {
            answer[idx++] = arrB[idxB++];
        }

        for (int n : answer) {
            System.out.print(n+" ");
        }
    }
}
