package programmers.step2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Queue;
import java.util.Stack;

public class Country124 {

    @Test
    public void main(){
        Assertions.assertEquals(solution(1), "1");
        Assertions.assertEquals(solution(2), "2");
        Assertions.assertEquals(solution(3), "4");
        Assertions.assertEquals(solution(4), "11");
        Assertions.assertEquals(solution(5), "12");
        Assertions.assertEquals(solution(6), "14");
        Assertions.assertEquals(solution(7), "21");
        Assertions.assertEquals(solution(8), "22");
        Assertions.assertEquals(solution(9), "24");
        Assertions.assertEquals(solution(10), "41");
    }

    /*
    * 124 나라에는 모든 수를 표현할 때 1, 2, 4만 사용합니다.
    * 10진법  124나라
    * 1         1
    * 2         2
    * 3         4
    * 4         11
    * 5         12
    * 6         14
    * 7         21
    * 8         22
    * 9         24
    * 10        41
    * 규칙을 찾는게 핵심
    * 1. 3으로 나눴을 때 나머지가 0인 경우 나눈 몫의 값에서 -1을 한다.
    * 2. 3으로 나눴을 때 나머지가 0이 아닌경우 나눈 나머지를 3진법으로 표현
    * 3. 나머지가 0인 경우는 4로 표시
    * */
    public String solution(int n) {
        String[] numbers = {"4", "1", "2"};
        String answer = "";

        int num = n;

        while(num > 0){
            int remainder = num % 3;
            num /= 3;

            if(remainder == 0) num--;

            answer = numbers[remainder] + answer;
        }

        return answer;
    }

}

//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges