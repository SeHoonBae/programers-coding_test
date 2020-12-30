package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindPrimeNumbers {

    @Test
    public void main(){
        Assertions.assertEquals(solution(10), 4);
        Assertions.assertEquals(solution(5), 3);
    }

    // 1. 소수는 구하는 방식은 무엇이 있는가?
    // 1과 자기자신을 제외한 다른 숫자들에 나누어 떨어지지 않아야 함.
    //
    public int solution(int n) {
        // 2는 소수이고 n은 2이상이라는 가정이 있으므로 1로 초기화
        int answer = 1;

        // 2의 배수는 소수가 아니므로 애초에 제외
        for(int i=3; i<=n; i=i+2){
            int count = 0; // 나눠지는 값이 있는지 확인
            // 소수는 나눠지는 수가 자신의 제곱근 이하인것만 비교하면 됨
            for(int j=3; j*j<=i; j++){
                if (i%j == 0){
                    count++;
                    break;
                }
            }
            if(count == 0) answer++;
        }

        return answer;
    }

}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges