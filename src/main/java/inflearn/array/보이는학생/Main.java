package inflearn.array.보이는학생;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public void solution(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int maxNum=0;
        for (int num : nums) {
            if (num > maxNum) {
                arr.add(num);
                maxNum = num;
            }
        }
        System.out.println(arr.size());

    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
//        n = 8;
//        int[] arr = {130, 135, 148, 140, 145, 150, 150, 153};

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();

        }
        main.solution(arr);

    }
}
