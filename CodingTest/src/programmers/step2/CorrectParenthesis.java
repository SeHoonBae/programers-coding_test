package programmers.step2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CorrectParenthesis {

    @Test
    public void main(){
        Assertions.assertEquals(solution("()()"), true);
        Assertions.assertEquals(solution("(())()"), true);
        Assertions.assertEquals(solution(")()("), false);
        Assertions.assertEquals(solution("(()("), false);
    }

    boolean solution(String s) {
        boolean answer = true;

        int openCnt = 0;

        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == '(')
                openCnt++;
            else if (s.charAt(i) == ')')
                openCnt--;

            if (openCnt < 0)
                break;
        }

        if(openCnt != 0)
            answer = false;

        return answer;
    }
}

//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges