package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class nNumbersSpacedByX {

    @Test
    public void main(){
        Assertions.assertArrayEquals(solution(2,5), new long[]{2,4,6,8,10});
        Assertions.assertArrayEquals(solution(4,3), new long[]{4,8,12});
        Assertions.assertArrayEquals(solution(-4,2), new long[]{-4,-8});
    }

    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for(int i=0; i<answer.length; i++){
            answer[i] = (long) x * (i+1);
        }

        return answer;
    }

}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges