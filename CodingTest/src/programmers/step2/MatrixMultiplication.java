package programmers.step2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MatrixMultiplication {

    @Test
    public void main(){
        Assertions.assertArrayEquals(solution(new int[][]{{1,4},{3,2},{4,1}}, new int[][]{{3,3},{3,3}}), new int[][]{{15,15},{15,15},{15,15}});
        Assertions.assertArrayEquals(solution(new int[][]{{2,3,2},{4,2,4},{3,1,4}}, new int[][]{{5,4,3},{2,4,1},{3,1,1}}), new int[][]{{22,22,11},{36,28,18},{29,20,14}});
    }

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for(int i = 0 ; i < arr1.length ; ++i){
            for(int j = 0 ; j < arr2[0].length ; ++j){
                for(int k = 0 ; k < arr1[0].length ; ++k) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        return answer;
    }

}

//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges