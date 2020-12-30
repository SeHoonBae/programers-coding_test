package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarPassword {

    @Test
    public void main(){
        Assertions.assertEquals(solution("AB",1), "BC");
        Assertions.assertEquals(solution("z",1), "a");
        Assertions.assertEquals(solution("a B z",4), "e F d");
    }

    // a ~ z는 97 ~ 122 총 26자
    // A ~ Z는 65 ~ 80 총 26자
    public String solution(String s, int n) {
        String answer = "";

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' ')
                answer += " ";
            else if(97 <= s.charAt(i) && s.charAt(i) <= 122)
                answer = s.charAt(i)+n > 122 ? answer + Character.toString((s.charAt(i)+n) %122 + 96) : answer + Character.toString((s.charAt(i)+n));
            else
                answer = s.charAt(i)+n > 90 ? answer + Character.toString((s.charAt(i)+n) %90 + 64) : answer + Character.toString((s.charAt(i)+n));
        }

        return answer;
    }

}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges