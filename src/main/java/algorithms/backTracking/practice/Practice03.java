package algorithms.backTracking.practice;

/**
 * solo 배열에 5지 선다 문제의 정답들이 적혀있다.
 * 3번 연속 해서 같은 정답이 이쑈는 경욱가 없다는 것을 알아낸 후,
 * 문제를 찍어서 푼다고 할 때, 5점 이상을 받을 경우의 수를 출력하세욘
 *
 * 문제는 총 10문제 각 문제당 1점임
 *
 * */
public class Practice03 {
    final static int numOfProblems = 10;
    static int cnt;
    public static void solution(int[] sols) {
        if (sols == null || sols.length != numOfProblems) {
            return;
        }
        cnt = 0;
        int[] submit = new int[numOfProblems];
        backTracking(sols, submit, 0, 0);
        System.out.println(cnt);

    }

    public static void backTracking(int[] sols, int[] submit, int correctCnt, int idx) {
        if (numOfProblems - idx + correctCnt < 5) {
            return;
        }
        if (idx == numOfProblems) {
            if (correctCnt >= 5) {
                cnt += 1;
            }
        } else {
            int towInRow = 0;
            if (idx >= 2) {
                if (submit[idx - 1] == submit[idx - 2]) {
                    towInRow = submit[idx - 1];
                }
            }
            for (int i = 1; i <= 5; i++) {
                if (i == towInRow) {
                    continue;
                }
                submit[idx] = i;

                if (sols[idx] == i) {
                    backTracking(sols, submit, correctCnt + 1, idx + 1);
                } else {
                    backTracking(sols, submit, correctCnt, idx + 1);
                }
                submit[idx] = 0;
            }
        }
    }
    public static void main(String[] args) {
        int[] sols = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        solution(sols);
//        System.out.println(solution(sols););
    }
}
