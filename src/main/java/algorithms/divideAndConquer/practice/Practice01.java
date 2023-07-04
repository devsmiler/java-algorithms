package algorithms.divideAndConquer.practice;


import java.util.Arrays;

import static java.lang.Math.max;

/**
 *  연속된 부분 배열의 합중 가장 큰값을 출력하세요.
 *
 *  nums: -5, 0, -3, 4, -1, 3, 1, -5, 8
 *  output: 10
 *
 *  nums: 5, 4, 0, 7, 8
 *  output: 24
 * */

public class Practice01 {
    public static int divideArray(int[] nums, int left, int right) {
        if (left == right) {
            return nums[left];
        }

        int mid = left + (right - left) / 2;
        int maxLeft = divideArray(nums, left, mid);
        int maxRight = divideArray(nums, mid + 1, right);
        int maxArr = getConquerMax(nums, left, mid, right);
        return max(maxLeft, max(maxRight, maxArr));
    }

    public static int getConquerMax(int[] nums, int left, int mid, int right) {
        int sumLeft = 0;
        int maxLeft = Integer.MIN_VALUE;
        System.out.println("nums: " + Arrays.toString(nums));
        System.out.println("left: " + left + ", mid: " + mid + ", right: " + right);

        for (int i = mid; i >= left; i-- ) {
            sumLeft += nums[i];
            maxLeft = max(maxLeft, sumLeft);
        }

        int sumRight = 0;
        int maxRight = Integer.MIN_VALUE;

        for (int i = mid + 1; i <= right; i++) {
            System.out.println("sum rights: " + sumRight);
            System.out.println("max rights: " + maxRight);
            sumRight += nums[i];
            maxRight = max(maxRight, sumRight);
        }
//        System.out.println("sum rights: " + sumRight);
        System.out.println("max lefts: " + maxLeft);
        System.out.println("max rights: " + maxRight);
        return maxLeft + maxRight;
    }
    public static int solution(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        return divideArray(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        int[] nums = {-5, 0, -3, 4, -1, 3, 1, -5, 8};
//        System.out.println(solution(nums));
        nums = new int[]{5, 4, 0, 7, 8};
        System.out.println(solution(nums));
    }
}
