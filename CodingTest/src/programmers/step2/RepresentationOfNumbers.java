package programmers.step2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RepresentationOfNumbers {

    @Test
    public void main(){
        Assertions.assertEquals(solution(15), 4);
    }

    public int solution(int n) {
        int answer = 0;

        for(int i=1; i<=n; i++){
            int temp = i;
            for(int j=i+1; j<n; j++){
                temp += j;

                if(temp >= n)
                    break;
            }

            if(temp == n)
                answer++;
        }

        return answer;
    }

}

//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges