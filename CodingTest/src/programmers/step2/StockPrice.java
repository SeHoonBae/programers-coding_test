package programmers.step2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StockPrice {

    @Test
    public void main(){
        Assertions.assertArrayEquals(solution(new int[]{1,2,3,2,3}), new int[]{4,3,1,1,0});
        /*
        * 1초 시점의 ₩1은 끝까지 가격이 떨어지지 않았습니다.
        * 2초 시점의 ₩2은 끝까지 가격이 떨어지지 않았습니다.
        * 3초 시점의 ₩3은 1초뒤에 가격이 떨어집니다. 따라서 1초간 가격이 떨어지지 않은 것으로 봅니다.
        * 4초 시점의 ₩2은 1초간 가격이 떨어지지 않았습니다.
         * 5초 시점의 ₩3은 0초간 가격이 떨어지지 않았습니다.
        * */
    }

    /*
    * 문제 설명
    * 초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.
    * */
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
//         int index = 0;

//         Queue<Integer> q = new LinkedList<>();

//         for(int p : prices)
//             q.offer(p);

//         while(!q.isEmpty()){
//             int stockPrice = q.poll();
//             int time = 0;

//             Iterator<Integer> iterator = q.iterator();

//             while (iterator.hasNext()){
//                 time++;
//                 int currentPrice = iterator.next();
//                 if(currentPrice < stockPrice){
//                     break;
//                 }
//             }
//             answer[index++] = time;

//         }
        for(int i=0; i<prices.length-1; i++){
            for(int j=i+1; j<prices.length; j++){
                answer[i]++; // 마지막 값을 제외한 주식에서는 1초간 떨어지지 않았다는 조건이 있음
                if(prices[i] > prices[j])
                    break;
            }
        }

        return answer;
    }
}

//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges