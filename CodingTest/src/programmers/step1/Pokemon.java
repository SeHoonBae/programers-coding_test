package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class Pokemon {

    @Test
    public void main(){

        Assertions.assertEquals(solution(new int[]{3,1,2,3}), 2);
        Assertions.assertEquals(solution(new int[]{3,3,3,2,2,4}), 3);
        Assertions.assertEquals(solution(new int[]{3,3,3,2,2,2}), 2);

    }

    public int solution(int[] nums) {
        int answer = 0;

        int cnt = nums.length/2;

        HashMap<Integer, Integer> list = new HashMap<>();

        for(int n : nums){
            list.put(n, 0);
        }

        if(list.size() <= cnt){
            answer = list.size();
        }else{
            answer = cnt;
        }

        return answer;
    }

}

//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges