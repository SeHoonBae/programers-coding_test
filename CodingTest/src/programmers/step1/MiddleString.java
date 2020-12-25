package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MiddleString {

    @Test
    public void main(){
        Assertions.assertEquals(solution("abcde"),"c");
        Assertions.assertEquals(solution("qwer"),"we");
    }

    public String solution(String s) {
//        String answer = "";
//
//        if(0 == s.length()%2){
//            int digit = s.length()/2-1;
//            answer = s.substring(digit,digit+2);
//        }else{
//            int digit = s.length()/2;
//            answer = s.substring(digit, digit+1);
//        }

        return s.length()%2==0 ? s.substring(s.length()/2-1,s.length()/2+1) : s.substring(s.length()/2, s.length()/2+1);
//        return answer;
    }

}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges