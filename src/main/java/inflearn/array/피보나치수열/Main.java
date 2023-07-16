package inflearn.array.피보나치수열;

import java.util.Scanner;

public class Main {
    public void solution(int n) {
        int[] arr = new int[n];
        arr[0] = 1; arr[1] = 1; n -= 2;
        int i = 1;
        while (n > 0) {
            arr[i + 1] = arr[i] + arr[i - 1];
            i++;
            n -= 1;
        }
        for (int num : arr) System.out.print(num+" ");
    }
    public static void main(String[] args) {
        Main main = new Main();

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        main.solution(n);
    }
}
