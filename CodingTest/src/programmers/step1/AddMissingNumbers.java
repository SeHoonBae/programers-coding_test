package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddMissingNumbers {

    @Test
    public void main(){
        Assertions.assertEquals(solution(new int[]{1,2,3,4,6,7,8,0}), 14);
        Assertions.assertEquals(solution(new int[]{5,8,4,0,6,7,9}), 6);
    }

    public int solution(int[] numbers) {
        int answer = 45;

        for(int n : numbers)
            answer -= n;

        return answer;
    }

}

//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges