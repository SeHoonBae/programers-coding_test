package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringHandlingBasics {

    @Test
    public void main(){
        Assertions.assertEquals(solution("a234"), false);
        Assertions.assertEquals(solution("1234"), true);
    }

    // 1. s의 길이가 4 또는 6인지 비교
    // 2. s가 숫자로 변환 가능한지 비교
    public boolean solution(String s) {
        if(s.length() == 4 || s.length() == 6){
            try {
                Integer.parseInt(s);
                return true;
            }catch (Exception e){
                return false;
            }
        }
        return false;
    }

}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges