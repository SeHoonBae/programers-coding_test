package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumericStringsAndEnglishWords {

    @Test
    public void main(){

        Assertions.assertEquals(1478, solution("one4seveneight"));
        Assertions.assertEquals(234567, solution("23four5six7"));
        Assertions.assertEquals(234567, solution("2three45sixseven"));
        Assertions.assertEquals(123, solution("123"));

    }

    public int solution(String s) {
        int answer = 0;

        String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i=0; i<strArr.length; i++){
            s = s.replaceAll(strArr[i], Integer.toString(i));
        }

        answer = Integer.parseInt(s);

        return answer;
    }
}

//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges