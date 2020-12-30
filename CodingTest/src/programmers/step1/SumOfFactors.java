package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOfFactors {

    @Test
    public void main(){
        Assertions.assertEquals(solution(12),28);
        Assertions.assertEquals(solution(5),6);
    }

    // 1. n의 약수 구하기 0 <= n <= 3000
    public int solution(int n) {
        int answer = 0;

        for(int i=1; i<= n; i++)
            if(n%i == 0)
                answer += i;

        return answer;
    }

}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges