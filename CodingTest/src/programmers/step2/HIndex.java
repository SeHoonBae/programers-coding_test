package programmers.step2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class HIndex {

    @Test
    public void main(){
        Assertions.assertEquals(solution(new int[]{3,0,6,1,5}), 3);
        Assertions.assertEquals(solution(new int[]{10,8,5,4,3}), 4);
        Assertions.assertEquals(solution(new int[]{25,8,5,3,3}), 3);
    }

    public int solution(int[] citations) {

        Arrays.sort(citations);
        int max = citations.length;

//        for(int i=max; i>=0; i--){
//            int moreThanCnt = 0;
//            int belowCnt = 0;
//
//            for (int j=0; j<citations.length; j++){
//
//                if(citations[j] <= i)
//                    belowCnt++;
//                if(i <= citations[j]){
//                    moreThanCnt++;
//                }
//            }
//
//            if(i <= moreThanCnt && belowCnt <= i)
//                return i;
//        }

        for(int i=0; i<citations.length; i++){
            if(citations[i] >= max)
                return max;
            max--;
        }
        return max;
    }

}

//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges