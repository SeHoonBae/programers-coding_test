package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GCD_LCM {

    @Test
    public void main(){
        Assertions.assertArrayEquals(solution(3, 12), new int[]{3, 12});
        Assertions.assertArrayEquals(solution(2, 5), new int[]{1, 10});
    }

    // 최소 공배수 식 : n*m/최대공약수
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int lcm=1;
        int gcd;

        for(int i=2; i<=n && i<=m; i++){
            if(n%i==0 && m%i==0)
                lcm = i;
        }
        gcd = n*m/lcm;
        answer[0]=lcm;
        answer[1]=gcd;

        return answer;
    }

}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges