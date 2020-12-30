package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IntegerSquareRootDiscrimination {

    @Test
    public void main(){
        Assertions.assertEquals(solution(121), 144);
        Assertions.assertEquals(solution(3), -1);
    }

    // 1. 주어진 값을 정수형 제곱근한다.
    // 2. 1번의 값을 다시 2의 제곱으로 한다
    // 3. 2번의 값이 주어진 값과 같다면 주어진 값은 양의 정수 x의 제곱근이므로 x+1의 제곱을 return 한다.
    public long solution(long n) {

//        for(int i=1; i*i <= n; i++){
//            if(i*i == n){
//                return  (i+1)*(i+1);
//            }
//        }
//        return -1;
        if (Math.pow((int)Math.sqrt(n), 2) == n) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }
        return -1;
    }

}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges