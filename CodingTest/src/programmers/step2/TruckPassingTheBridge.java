package programmers.step2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

public class TruckPassingTheBridge {

    @Test
    public void main(){
        Assertions.assertEquals(solution(2, 10, new int[]{7,4,5,6}), 8);
        Assertions.assertEquals(solution(100, 100, new int[]{10}), 101);
        Assertions.assertEquals(solution(100, 100, new int[]{10,10,10,10,10,10,10,10,10,10}), 110);
    }

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int weight_total = 0;
        int index = 0;

        Queue<Integer> q = new LinkedList<>();

        while(true){
            if(q.size() == bridge_length){
                weight_total-=q.poll();
            }

            if(index < truck_weights.length && weight_total + truck_weights[index] <= weight){
                weight_total+=truck_weights[index];
                q.offer(truck_weights[index++]);
            }else{
                q.offer(0);
            }

            answer++;

            if(weight_total == 0) break;

        }


        return answer;
    }

}

//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges