package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddYinAndYang {

    @Test
    public void main(){

        Assertions.assertEquals(solution(new int[]{4,7,12}, new boolean[]{true, false, true} ), 9);
        Assertions.assertEquals(solution(new int[]{1,2,3}, new boolean[]{false, false, true} ), 0);

    }

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i=0; i<absolutes.length; i++){

            if(signs[i])
                answer += absolutes[i];
            else
                answer -= absolutes[i];

        }

        return answer;
    }

}

//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges