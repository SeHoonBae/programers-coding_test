package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HashadNumber {

    @Test
    public void main(){
        Assertions.assertEquals(solution(10), true);
        Assertions.assertEquals(solution(12), true);
        Assertions.assertEquals(solution(11), false);
        Assertions.assertEquals(solution(13), false);
    }

    // 1. 각 자리수의 합 구하기
    // 2. x의 주어진 값을 1번의 값이 나누어 떨어지는지 확인
    public boolean solution(int x) {
        int temp = x;
        int sum = 0;

        // 1.
        while(temp>0){
            sum+=temp%10;
            temp/=10;
        }
        // 2.
        return x%sum==0;
    }

}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges