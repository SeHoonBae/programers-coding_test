package programmers.step2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCompression {

    @Test
    public void main(){
        Assertions.assertEquals(solution("aabbaccc"), 7);
        Assertions.assertEquals(solution("ababcdcdababcdcd"), 9);
        Assertions.assertEquals(solution("abcabcdede"), 8);
        Assertions.assertEquals(solution("abcabcabcabcdededededede"), 14);
        Assertions.assertEquals(solution("xababcdcdababcdcd"), 17);
    }

    public int solution(String s) {
        int answer = s.length();

        // 반복은 해당 문자열의 절반까지만 가능
        for(int i=1; i<=s.length()/2; i++){
            // 비교 문자열
            String temp = s.substring(0,i);
            String result = "";
            int cnt = 1;
            int index = i;

            while (s.length() > index){
                if(s.length() < index+i){
                    break;
                }
                // 반복되는 문자열인 경우
                if(temp.equals(s.substring(index, index+i))){
                    cnt++;
                }else{
                    if(cnt==1){
                        result += temp;
                    }else{
                        result += cnt + temp;
                    }
                    cnt = 1;
                    temp = s.substring(index, index+i);
                }

                index+=i;
            }

            if(cnt==1){
                result += temp;
            }else{
                result += cnt + temp;
            }

            if(index <= s.length()-1)
                result += s.substring(index, s.length());


            if(answer > result.length())
                answer = result.length();

        }

        return answer;
    }

//    아래는 참조
//    public int solution(String s) {
//        int answer = 0;
//
//        for(int i=1; i<=(s.length()/2)+1; i++){
//            int result = getSplitedLength(s, i, 1).length();
//            answer = i==1 ? result : (answer>result?result:answer);
//        }
//
//        return answer;
//    }
//
//    public String getSplitedLength(String s, int n, int repeat){
//        if(s.length() < n) return s;
//        String result = "";
//        String preString = s.substring(0, n);
//        String postString = s.substring(n, s.length());
//
//        // 불일치 -> 현재까지 [반복횟수 + 반복문자] 조합
//        if(!postString.startsWith(preString)){
//            if(repeat ==1) return result += preString + getSplitedLength(postString, n, 1);
//            return result += Integer.toString(repeat) + preString + getSplitedLength(postString, n, 1);
//        }
//
//        return result += getSplitedLength(postString, n, repeat+1);
//    }

}

//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges