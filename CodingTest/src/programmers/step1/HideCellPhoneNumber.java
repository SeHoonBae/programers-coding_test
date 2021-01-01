package programmers.step1;

import com.sun.source.tree.AssertTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HideCellPhoneNumber {

    @Test
    public void main(){
        Assertions.assertEquals(solution("01033334444"),"*******4444");
        Assertions.assertEquals(solution("027778888"),"*****8888");
    }

    public String solution(String phone_number) {
        String answer = "";

        for (int i=0; i<phone_number.length()-4; i++){
            answer+="*";
        }
        answer += phone_number.substring(phone_number.length()-4, phone_number.length());

        return answer;
    }

}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges