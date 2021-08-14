package programmers.step2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class EatTheGround {

    @Test
    public void main(){
//        Assertions.assertEquals(solution(new int[][]{{1,2,3,5},{5,6,7,8},{4,3,2,1}}), 16);
//        Assertions.assertEquals(solution(new int[][]{{6,2,3,5},{5,6,7,8},{4,3,2,1}}), 18);
//        Assertions.assertEquals(solution(new int[][]{{1,1,1,1},{2,2,2,2},{3,3,3,3}}), 6);
        Assertions.assertEquals(solution(new int[][]{{4,3,2,1},{2,2,2,1},{6,6,6,4},{8,7,6,5}}), 20);
    }

    int solution(int[][] land) {
        int answer = 0;

//        for(int i=1; i<land.length; i++){
//            land[i][0] += Math.max(land[i-1][1], Math.max(land[i-1][2], land[i-1][3]));
//            land[i][1] += Math.max(land[i-1][0], Math.max(land[i-1][2], land[i-1][3]));
//            land[i][2] += Math.max(land[i-1][1], Math.max(land[i-1][0], land[i-1][3]));
//            land[i][3] += Math.max(land[i-1][1], Math.max(land[i-1][2], land[i-1][0]));
//        }
        for(int i=1; i<land.length; i++){
            for(int j=0; j<4; j++){
                int max = 0;
                for(int k=0; k<4; k++){
                    if(j==k)
                        continue;
                    if(max < land[i-1][k])
                        max = land[i-1][k];
                }
                land[i][j] += max;
            }
        }

        answer = Math.max(land[land.length-1][0], Math.max(land[land.length-1][1], Math.max(land[land.length-1][2], land[land.length-1][3])));

        return answer;
    }

}

//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges