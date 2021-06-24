package programmers.step2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class NLeastCommonMultiples {

    @Test
    public void main(){
        Assertions.assertEquals(solution(new int[]{2,6,8,14}), 168);
        Assertions.assertEquals(solution(new int[]{1,2,3}), 6);
    }

    public int solution(int[] arr) {
        int answer = arr[0];

        for(int i=0; i<arr.length; i++){
            answer = lcm(answer, arr[i]);
        }

        return answer;
    }


    public int gcd(int x, int y){
        if(y == 0)
            return x;

        return gcd(y, x%y);

    }

    public int lcm(int x, int y){
        return x * y / gcd(x, y);
    }

}

//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges