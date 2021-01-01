package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Budget {

    @Test
    public void main(){
        Assertions.assertEquals(solution(new int[]{1,3,2,5,4}, 9), 3);
        Assertions.assertEquals(solution(new int[]{2,2,3,3}, 10), 4);
    }

    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for(int i=0; i<d.length; i++){
            if(budget-d[i] < 0)
                break;
            else{
                budget = budget - d[i];
                answer++;
            }
        }

        return answer;
    }

}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges