package algorithms.greedy.practice;


/**
 * 문제 설명
 * 정수 nums 배열 존재
 * 각 원소의 값은 해당 위치에서 오른쪽으로 이동할수 있는 최대값
 * 첫 번째 위치에서 시작해서 가장 끝까지 이동이 가능한지 판별하는 프로그램
 * 가능하면 true 아니면 false
 *
 * nums: 2, 3, 0, 1, 4
 * output: true
 *
 * nums: 3, 0, 0, 1, 1
 * output: true
 *
 * nums: 3, 2, 1, 0, 4
 * output: false
 *
 * */


public class Practice01 {
    public static boolean solution(int[] nums) {
        int pos = 0;

        for (int i =0; i< nums.length; i++){
            if(pos < i) { // 도달 못할때 최대값 넣었는데 i 값 보다 작은거야 그럼 뭐 방법이 없지
                return false;
            } else if (pos >= nums.length - 1) { // 이건 도달했을때 pos가 더 커버리는거지 그니까  끝까지 갈수 있단 이야기
                return true;
            }
            pos = Math.max(pos, i + nums[i]);
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {2, 3, 0, 1, 4};
        System.out.println(solution(nums));

        nums = new int[]{3, 0, 0, 1, 1};
        System.out.println(solution(nums));

        nums = new int[]{3, 2, 1, 0, 4};
        // 얘가 pos < i여기에 걸리는거지 결국 Math max 걸어도 최대는 계속 3이 되버리고 다음 루프에서 i는 4가 되면서 걸리지
        System.out.println(solution(nums));
    }
}
