package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddDigits {

    @Test
    public void main(){
        Assertions.assertEquals(solution(123),6);
        Assertions.assertEquals(solution(987),24);
    }

    // 각 자리수는 10의 배수이다
    // 1. 마지막 자리는 10으로 나눈 나머지값이다.
    // 2. 1번을 진행 후 주어진 값을 10으로 나누면 그다음 자리수의 값을 알 수 있다.
    // 3. 1번과 2번을 자리수만큼 반복한다.
    public int solution(int n) {
        int answer = 0;

        do {
            // 1.
            answer += n%10;
            // 2.
            n/=10;
        }while (n>0); // 3.

        return answer;
    }

}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges