package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;

public class PlusTwoNumber {

    public int[] solution(int[] numbers) {
        // PriorityQueue는 자동 정렬되며 Set과 마찬가지로 중복된 값에 대해서는 중복되지 않음
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        // numbers의 모든 수를 더하여 PriorityQueue에 넣어주는 부분
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                queue.offer(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[queue.size()];
        for(int i=0; i<answer.length; i++)
            answer[i] = queue.poll();

        return answer;
    }

    @Test
    public void main(){

        Assertions.assertArrayEquals(solution(new int[]{2,1,3,4,1}), new int[]{2,3,4,5,6,7});
        Assertions.assertArrayEquals(solution(new int[]{5,0,2,7}), new int[]{2,5,7,9,12});
    }

}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges