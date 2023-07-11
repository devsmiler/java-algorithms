package baekjoon.linkedlist.수열의회전;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Practice {

    public LinkedList<Integer> solutions (int[] nums, int k){
        LinkedList<Integer> linkedListNums = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) linkedListNums.add(nums[i]);
        for (int i = 0; i < k; i++) {
            linkedListNums.add(linkedListNums.pollFirst());
        }
        return linkedListNums;
    }
    public static void main(String[] args) {
        Practice practice = new Practice();
        int[] nums = {3, 7, 1, 5, 9, 2, 8};
        System.out.println(practice.solutions(nums, 3));
    }
}
