package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Lotto {

    @Test
    public void main(){
        Assertions.assertArrayEquals(solution(new int[]{44,1,0,0,31,25}, new int[]{31,10,45,1,6,19}), new int[]{3,5});
        Assertions.assertArrayEquals(solution(new int[]{0,0,0,0,0,0}, new int[]{38,19,20,40,15,25}), new int[]{1,6});
        Assertions.assertArrayEquals(solution(new int[]{45,4,35,20,3,9}, new int[]{20,9,3,45,4,35}), new int[]{1,1});
    }

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        int zeroCnt = 0;
        int equalCnt = 0;
        int maxCnt = 0;

        for(int i=0; i<lottos.length; i++){

            if(lottos[i] == 0){
                zeroCnt++;
                continue;
            }

            for(int j=0; j<win_nums.length; j++){

                if(lottos[i] == win_nums[j]) {
                    equalCnt++;
                    break;
                }
            }
        }

        maxCnt = equalCnt + zeroCnt;

        switch (maxCnt){
            case 6 :
                maxCnt=1;
                break;
            case 5:
                maxCnt=2;
                break;
            case 4:
                maxCnt=3;
                break;
            case 3:
                maxCnt=4;
                break;
            case 2:
                maxCnt=5;
                break;
            default:
                maxCnt=6;
                break;
        }
        equalCnt = maxCnt+zeroCnt > 6 ? 6 : maxCnt+zeroCnt;

        answer[0] = maxCnt;
        answer[1] = equalCnt;

        return answer;
    }

}

//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges