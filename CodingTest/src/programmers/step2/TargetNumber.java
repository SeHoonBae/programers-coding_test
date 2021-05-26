package programmers.step2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TargetNumber {

    @Test
    public void main(){

        Assertions.assertEquals(solution(new int[]{1,1,1,1,1}, 3), 5);

    }

    public int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(0, numbers, target, 0);
        return answer;
    }

    public int dfs(int idx, int[] numbers, int target, int sum){

        int result = 0;

        if(idx == numbers.length){
            if(sum==target){
                return 1;
            }else{
                return 0;
            }
        }

        result += dfs(idx+1, numbers, target, sum+numbers[idx]);
        result += dfs(idx+1, numbers, target, sum-numbers[idx]);

        return result;

    }
}

//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges