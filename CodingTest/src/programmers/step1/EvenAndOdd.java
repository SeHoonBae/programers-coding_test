package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EvenAndOdd {

    @Test
    public void main(){
        Assertions.assertEquals(solution(3), "Odd");
        Assertions.assertEquals(solution(4), "Even");
    }

    // 짝수 - Even, 홀수 - Odd
    public String solution(int num) {
        return num%2==0?"Even":"Odd";
    }

}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges