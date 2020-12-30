package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

public class ArrangingInDescendingIntegerOrder {

    @Test
    public void main(){
        Assertions.assertEquals(solution(118372), 873211);
    }

    // 1. 각 자리값을 구한다.
    // 2. 각 자리값을 구한것을 내림차순 정렬한다.
    // 3. 2번에서 구한 값들을 연결하여 return 한다.
    String res = "";
    public long solution(long n) {

//        int n_length = Long.toString(n).length();
//        String[] n_digit = new String[n_length];
//        int index = 0;
//
//        while(n>0){
//            n_digit[index++] = (n%10)+"";
//            n/=10;
//        }
//
//        Arrays.sort(n_digit, Collections.reverseOrder());
//
//        String result = "";
//        for(String digit : n_digit)
//            result += digit;
//
//        return Long.parseLong(result);
        res = "";
        Long.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char)c) + res);
        return Long.parseLong(res);
    }
}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges