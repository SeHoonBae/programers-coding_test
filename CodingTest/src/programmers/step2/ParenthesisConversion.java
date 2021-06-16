package programmers.step2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParenthesisConversion {

    @Test
    public void main(){
        Assertions.assertEquals("(()())()", solution("(()())()"));
        Assertions.assertEquals("()", solution(")("));
        Assertions.assertEquals("()(())()", solution("()))((()"));
    }

    // 1. 균형 잡힌 괄호 문자열 나누는 방법
    // 2. 올바른 괄호인지 파악
    // 3. 올바른 괄호가 아닌 경우 과정
    public String solution(String p) {
        String answer = "";



        answer = divide(p);


        return answer;
    }

    // 올바른 괄호인지 파악악
   public boolean isCorrect(String p){
        boolean result = true;
        int correct = 0;

        for(int i=0; i<p.length(); i++){
            if(p.charAt(i) == '(')
                correct++;
            else if(p.charAt(i) == ')')
                correct--;

            if(correct < 0){
                result = false;
                break;
            }
        }

        return result;
    }

    // 균형 잡힌 괄호 문자열 나누는 방법
    public String divide(String p){

        String result = "";
        int num = 0;
        String u = "";
        String v = "";

        // 입력이 빈 문자열인 경우 빈 문자열을 반환
        if(p.equals(result))
            return result;

        if(isCorrect(p))
            return p;

        for(int i=0; i<p.length(); i++){
            if(p.charAt(i) == '('){
                u += p.charAt(i);
                num++;
            }
            else if(p.charAt(i) == ')'){
                u += p.charAt(i);
                num--;
            }

            if (num == 0){
                if(i+1 < p.length()){
                    v = p.substring(i+1, p.length());
                }
                break;
            }
        }

        if(isCorrect(u)){
            result += u;
            result += divide(v);
        }else{
            result = "(";
            result += divide(v);
            result += ")";

            String temp = "";
            for (int i=1; i<u.length()-1; i++)
                temp += u.charAt(i);

            result += reverse(temp);

        }

        return result;
    }

    // 문자열 뒤집기
    public String reverse(String p){
        String result = "";
        for(int i=0; i<p.length(); i++){
            if(p.charAt(i) == '(')
                result += ")";
            else if(p.charAt(i) == ')')
                result += "(";
        }

        return result;
    }

}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges