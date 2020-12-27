package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class StringsInDescendingOrder {

    @Test
    public void main(){
        Assertions.assertEquals(solution("Zbcdefg"),"gfedcbZ");
    }

    // 1. 주어진 매개변수를 char형으로 변환
    // 2. 1번의 값을 내림차순 정렬
    public String solution(String s) {
        String answer = "";
        // 1.
        char[] arr = s.toCharArray();
        // 2.
        Arrays.sort(arr);
        return new StringBuilder(new String(arr)).reverse().toString();
//        for(char a : arr)
//            answer = a + answer;

//        return answer;
    }

}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges