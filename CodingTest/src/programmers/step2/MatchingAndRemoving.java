package programmers.step2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

public class MatchingAndRemoving {

    @Test
    public void main(){
        Assertions.assertEquals(solution("baabaa"), 1);
        Assertions.assertEquals(solution("cdcd"), 0);
    }

    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>(); // Stack 사용 이유 - 제거되지 않은 가장 마지막 문자와 비교해야 되서
        
        for(int i=0; i<s.length(); i++){ // 주어진 문자열 끝까지 비교
            Character compare = s.charAt(i);

            if (stack.empty()){ // 비교 대상 문자가 없을 경우 문자열의 현재위치가 비교대상으로 지정되도록
                stack.add(compare);
            }else if(compare == stack.peek()){ // 비교 대상 문자와 같은 경우 제거
                stack.pop();
            }else{ // 비교 대상 문자와 같지 않다면 해당 문자를 비교대상 문자로
                stack.add(compare);
            }
        }

        if(stack.size()==0) return 1;
        return 0;
    }
}

//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges