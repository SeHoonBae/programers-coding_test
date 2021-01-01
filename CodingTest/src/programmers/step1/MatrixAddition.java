package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MatrixAddition {

    @Test
    public void main(){
        Assertions.assertArrayEquals(solution(new int[][]{{1,2},{2,3}}, new int[][]{{3,4},{5,6}}), new int[][]{{4,6},{7,9}});
        Assertions.assertArrayEquals(solution(new int[][]{{1},{2}}, new int[][]{{3},{4}}), new int[][]{{4},{6}});
    }

    public int[][] solution(int[][] arr1, int[][] arr2) {
        // arr1과 arr2의 행렬의 크기는 같다고 생각, 다르다면 덧셈에서 에러가 나기 때문
        int[][] answer = new int[arr1.length][arr1[0].length];

        for(int i=0; i<answer.length; i++){
            for(int j=0; j<answer[0].length; j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }

}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges