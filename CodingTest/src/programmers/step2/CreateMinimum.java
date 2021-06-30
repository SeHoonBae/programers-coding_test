package programmers.step2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

public class CreateMinimum {

    @Test
    public void main(){
        Assertions.assertEquals(solution(new int[]{1,4,2}, new int[]{5,4,4}), 29);
        Assertions.assertEquals(solution(new int[]{1,2}, new int[]{3,4}), 10);
    }

    public int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i=0; i<A.length; i++)
            answer += A[i] * B[B.length-i-1];

        return answer;
    }

}

//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges