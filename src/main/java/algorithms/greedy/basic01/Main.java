package algorithms.greedy.basic01;

import java.util.ArrayList;

class Activity {
    String name;
    int start;
    int end;

    public Activity(String name, int start, int end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }
}
/**
 *
 * 시간표 선택 문제
 * */

public class Main {
    public static void selectActivity(ArrayList<Activity> list) {
        list.sort((x1, x2) -> x1.end - x2.end);
        int currentTime = 0;
        ArrayList<Activity> result = new ArrayList<>();

        for (Activity item : list) {
            if(currentTime <= item.start) {
                currentTime = item.end;
                result.add(item);

            }
        }

        for (Activity activity : result) {
            System.out.print(activity.name + " ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        ArrayList<Activity> list = new ArrayList<>();
        list.add(new Activity("A", 1, 5));
        list.add(new Activity("B", 4, 5));
        list.add(new Activity("C", 2, 3));
        list.add(new Activity("D", 4, 7));
        list.add(new Activity("E", 6, 10));
        selectActivity(list);

    }
}
