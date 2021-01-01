package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GuessTheColatz {

    @Test
    public void main(){

        Assertions.assertEquals(solution(6),8);
        Assertions.assertEquals(solution(16),4);
        Assertions.assertEquals(solution(626331),-1);
    }

    // 1. 주어진 매개변수를 long형으로 바꾸기 - int형은 21억까지의 수만 가능
    // 2. 짝수면 나누기 2 홀수면 3곱하기 +1 수행
    // 3. 2번을 수행한 횟수가 500이 되면 -1 retrun
    public int solution(int num) {
        int answer = 0;
        // 1.
        long number = num;
        // 2.
        while(number != 1){
            if(number%2==0){
                number/=2;
                answer++;
            }else{
                number=number*3+1;
                answer++;
            }
            // 3.
            if(answer==500)
                return -1;
        }

        return answer;
    }

}
