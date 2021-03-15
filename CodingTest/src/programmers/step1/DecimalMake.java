package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DecimalMake {

    @Test
    public void test(){
        Assertions.assertEquals(solution(new int[]{1,2,3,4}), 1);
        Assertions.assertEquals(solution(new int[]{1,2,7,6,4}), 4);
    }

    public int solution(int[] nums) {
        int answer = 0;

        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    int result = nums[i] + nums[j] + nums[k];
                    boolean isDecimal = true;

                    for(int p=2; p<=Math.sqrt(result); p++){
                        if(result%p==0){
                            isDecimal = false;
                            break;
                        }
                    }
                    if(isDecimal) answer++;
                }
            }
        }

        return answer;
    }

}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges