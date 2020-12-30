package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreateWeirdCharacters {

    @Test
    public void main(){
        Assertions.assertEquals(solution("try hello world"),"TrY HeLlO WoRlD");
        Assertions.assertEquals(solution("try"),"TrY");
        Assertions.assertEquals(solution("a b "),"A B ");
    }

    // 1. 각 단어 추출하기
    // 2. 각 단어의 글자위치의 홀수 번째는 대문자 짝수번째는 소문자로 변경
    // 3. 각 단어를 공백을 구분으로 합쳐서 return 하기
    public String solution(String s) {
        String answer = "";
        // 1.
        String[] words = s.split(" ", -1);

        // 2.
        for(String word : words){
            String result = "";
            for(int i=0; i<word.length(); i++){
                if(i%2==0) // 인덱스가 짝수가 글자에서는 홀수
                    result += Character.toUpperCase(word.charAt(i));
                else // 인덱스가 홀수가 글자에서는 짝수
                    result += Character.toLowerCase(word.charAt(i));
            }
            // 3.
            answer += result + " ";
        }
        // 마지막 공백 제거
        if(answer.endsWith(" "))
            answer = answer.substring(0, answer.length()-1);
        return answer;
    }
}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges