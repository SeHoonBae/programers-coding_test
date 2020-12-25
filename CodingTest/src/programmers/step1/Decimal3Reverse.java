package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Decimal3Reverse {

    @Test
    public void main(){
        Assertions.assertEquals(solution(45), 7);
    }

    // 1. 주어진 값을 3진법으로 표현
    // 2. 1번의 값을 뒤집기
    // 3. 2번의 값을 십진법으로 표현
    public int solution(int n) {
        // 해당방법으로도 진법을 구할 수 있음
//        String test = Integer.toString(n, 3);
        int answer = 0;
        String decimal = "";

        int temp = n;
        // 진법 구하는 법 : 구하고자 하는 값에 해당 진법(3)으로 나눈 나머지값들로 나타낼 수 있음
        // 1.
        while(temp/3 > 0){
            decimal = temp%3 + decimal;
            temp/=3;
        }
        decimal=temp%3 + decimal;

        temp = 1;
        // 2, 3. 동시에 진행
        for(int i=0; i<decimal.length(); i++){
            answer += Character.getNumericValue(decimal.charAt(i)) * temp;
            temp*=3;
        }

        return answer;
    }

}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges