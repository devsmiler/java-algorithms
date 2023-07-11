package inflearn.array.큰수출력하기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public void solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if(arr[i-1] < arr[i]){
                answer.add(arr[i]);
            }
        }
        for (Integer integer : answer) {
            System.out.print(integer+" ");
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
//        n = 6;

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();

        }
        main.solution(n, arr);
    }
}
