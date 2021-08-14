package programmers.step2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.UpperCase;

import java.util.Locale;

public class JadenCase {

    @Test
    public void main(){
        Assertions.assertEquals(solution("3people unFollowed me"), "3people Unfollowed Me");
        Assertions.assertEquals(solution("for the last week"), "For The Last Week");
        Assertions.assertEquals(solution(" a    b"), " A    B");
        Assertions.assertEquals(solution(" 3a    b  "), " 3a    B  ");
    }

    // split(" ") 수행시 마지막 " " 은 잘린며 기존 " "은 ""로 변환됨
    // -> 예시
    // String s = "a b  "
    // String[] temp = s.split(" ");
    // temp -> {"a", "", "b"}
    public String solution(String s) {
        StringBuffer answer = new StringBuffer();

        String[] temp = s.toLowerCase().split("");
        boolean isFirst = true;

        for (String t : temp){
            if(t.equals(" ")){
                isFirst = true;
                answer.append(" ");
            }else if(isFirst){
                answer.append(t.toUpperCase());
                isFirst = false;
            }else{
                answer.append(t);
            }
        }

        return answer.toString();
    }
}

//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges