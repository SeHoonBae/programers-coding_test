package programmers.step2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class FibonacciNumber {

    @Test
    public void main(){
        Assertions.assertEquals(solution(3), 2);
        Assertions.assertEquals(solution(5), 5);
    }

    public int solution(int n) {
        return fibonacci(n);
    }

    public int fibonacci(int n){

        int[] fibonacciArr = new int[n+1];
        fibonacciArr[0] = 0;
        fibonacciArr[1] = 1;

        for (int i=2; i<=n; i++){
            fibonacciArr[i] = (fibonacciArr[i-1] + fibonacciArr[i-2])%1234567;
        }

        return fibonacciArr[n];
    }

}

//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges