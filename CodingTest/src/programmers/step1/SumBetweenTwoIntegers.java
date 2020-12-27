package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumBetweenTwoIntegers {

    @Test
    public void main(){
        Assertions.assertEquals(solution(3,5), 12);
        Assertions.assertEquals(solution(3,3), 3);
        Assertions.assertEquals(solution(5,3), 12);
    }

    // 1. a와 b중 큰 값을 찾는다
    // 2. 작은값 ~ 큰값을 모두 더한다
    public long solution(int a, int b) {
        long answer = 0;

        // 1.
        int min = a<b?a:b;
        int max = a>b?a:b;

        // 2.
        for(int i=min; i<=max; i++)
            answer+=i;

        return answer;
    }

}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges