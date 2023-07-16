package inflearn.array.가위바위보;

import java.util.Scanner;

public class Main {
    // 1.가위 2.바위 3.보
    public void whoWin(int a, int b) {
        if (a == b) {
            System.out.println("D");
        } else if (
            (a == 1 && b == 3) ||
            (a == 2 && b == 1) ||
            (a == 3 && b == 2) ) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
    public void solution(int[] arrA, int[] arrB, int round) {
        for (int i = 0; i < round; i++) {
            whoWin(arrA[i], arrB[i]);
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        main.solution(a, b, n);
    }
}
