package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DotProduct {

    @Test
    public void main(){
        Assertions.assertEquals(solution(new int[]{1,2,3,4}, new int[]{-3,-1,0,2}), 3);
        Assertions.assertEquals(solution(new int[]{-1,0,1}, new int[]{1,0,-1}), -2);
    }

    // a와 b의 크기가 같다는 조건이 있으므로 a의 크기만큼 b와 곱한다.
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for(int i=0; i<a.length; i++)
            answer += a[i]*b[i];

        return answer;
    }

}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges