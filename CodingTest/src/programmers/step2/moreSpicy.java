package programmers.step2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.PriorityQueue;

public class moreSpicy {

    @Test
    public void main(){
        Assertions.assertEquals(solution(new int[]{1,2,3,9,10,12}, 7), 2);
    }

    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> q = new PriorityQueue<>();

        for (int s : scoville)
            q.offer(s);

        while (q.peek() < K && 2 <= q.size()){
            Integer min = q.poll();
            Integer secondMin = q.poll();
            q.offer(min + secondMin*2);
            answer++;
        }

        if (q.peek() < K)
            return -1;

        return answer;
    }

}

//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges