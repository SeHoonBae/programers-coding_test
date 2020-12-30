package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConvertStringToInteger {

    @Test
    public void main(){

        Assertions.assertEquals(solution("1234"),1234);
        Assertions.assertEquals(solution("-1234"),-1234);

    }

    public int solution(String s) {
        return Integer.parseInt(s);
    }

}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges