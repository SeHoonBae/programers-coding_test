package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClapBackwards {

    @Test
    public void main(){

        Assertions.assertEquals(solution(3),"수박수");
        Assertions.assertEquals(solution(4),"수박수박");

    }

    public String solution(int n) {
        String answer = "";

        for(int i=1; i<=n; i++)
            answer += i%2==0?"박":"수";

        return answer;
        
        // 아래는 다른사람 풀이
        // char형으로 n개의 절반만큼 배열 생성 n/2에 +1을 해준건 1부터 시작하기 위함
        // char 크기만큼 수박을 생성 한 후 substring으로 길이 자름
//        return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);

    }

}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges