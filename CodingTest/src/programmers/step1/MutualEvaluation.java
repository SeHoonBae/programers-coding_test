package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class MutualEvaluation {

    @Test
    public void main(){
        Assertions.assertEquals(solution(new int[][]{{100,90,98,88,65},{50,45,99,85,77},{47,88,95,80,67},{61,57,100,80,65},{24,90,94,75,65}}), "FBABD");
        Assertions.assertEquals(solution(new int[][]{{50,90},{50,87}}), "DA");
        Assertions.assertEquals(solution(new int[][]{{70,49,90},{68,50,38},{73,31,100}}), "CFD");
    }

    public String solution(int[][] scores) {
        StringBuilder builder = new StringBuilder();

        for(int i=0; i<scores.length; i++){
            int selfScore = scores[i][i];
            int avg = 0;
            boolean selfMax = true;
            boolean selfMin = true;
            int sum = 0;

            for(int j=0; j<scores[i].length; j++){
                if(i == j) continue;

                int score = scores[j][i];
                if( score <= selfScore)
                    selfMin = false;

                if ( selfScore <= score)
                    selfMax = false;

                sum += score;
            }

            if(selfMax || selfMin){
                avg = sum/(scores[i].length-1);
            }else{
                sum += selfScore;
                avg =  sum/scores[i].length;
            }

            if (90<= avg)
                builder.append("A");
            else if(80<= avg)
                builder.append("B");
            else if(70<= avg)
                builder.append("C");
            else if(50<= avg)
                builder.append("D");
            else
                builder.append("F");

        }


        return builder.toString();
    }

}

//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges