package baekjoon.linkedlist.중복제거;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Practice {
    public LinkedList<Integer> solutions(int[] nums) {
        Set<Integer> targetSet = new HashSet<Integer>();
        for(int n : nums) targetSet.add(n);

        LinkedList<Integer> l = new LinkedList<>();
        l.addAll(targetSet);

        return l;
    }
    public static void main(String[] args) {
        Practice practice = new Practice();

        System.out.println(practice.solutions(new int[]{0, 1, 1, 1, 2, 2, 2}));

    }
}
