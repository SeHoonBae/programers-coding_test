package programmers.step2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumAndMinimum {

    @Test
    public void main(){
        Assertions.assertEquals(solution("1 2 3 4"), "1 4");
        Assertions.assertEquals(solution("-1 -2 -3 -4"), "-4 -1");
        Assertions.assertEquals(solution("-1 -1"), "-1 -1");
    }

    public String solution(String s) {
        String answer = "";

        String[] sArr = s.split(" ");

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (String s1 : sArr){
            if(Integer.parseInt(s1) < min)
                min = Integer.parseInt(s1);
            if(Integer.parseInt(s1) > max)
                max = Integer.parseInt(s1);
        }

        answer = min + " " + max;

        return answer;
    }

}

//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges