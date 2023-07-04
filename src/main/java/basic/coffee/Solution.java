package basic.coffee;

class Solution {
    int answer = 0;
    public void myCoffeeMachine(int n_coffee, int[] beans, int[] orders, int depth){
        int coffeeCount = n_coffee;
        int i =0;
        while (i < orders.length){

            if (coffeeCount == 0){
                coffeeCount = n_coffee;
                beans[depth] *= 2;
                if (beans[depth] >= 20) {
                    depth +=1;
                    if (depth >= beans.length  ){
                        answer = -1;
                        break;
                    }
                }
                continue;
            }

            coffeeCount -=1;
            answer += beans[depth] * (1 + orders[i]);
            i ++ ;
        }

    }

    public int solution(int n_coffee, int[] beans, int[] orders) {
        myCoffeeMachine(n_coffee,beans,orders,0);
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] beans = {5, 2, 4};
        int[] orders = {1, 3, 2, 2, 1, 3, 3, 2};
        System.out.println(solution.solution(2, beans, orders));

    }
}