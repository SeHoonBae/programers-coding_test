package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class KNumber {

    @Test
    public void main(){

        Assertions.assertArrayEquals(solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2,5,3},{4,4,1},{1,7,3}}), new int[]{5,6,3});

    }

    // 1. array의 값을 commands의 1행의 i,j로 자른다.
    // 2. 1의 배열을 정렬한다.
    // 3. 2의 배열에서 k번째 수를 answer배열에 삽입
    // 4. 1~3의 방식을 commands의 행의 갯수만큼 반복
    public int[] solution(int[] array, int[][] commands) {
        // return 할 answer 배열은 매개변수의 commands의 행의 갯수와 같다.
        int[] answer = new int[commands.length];

        // 4.
        for(int i=0; i<commands.length; i++){
            int first = commands[i][0]; // 자를 시작 요소
            int last = commands[i][1]; // 자를 마지막 요소
            int index = first-1; // temp에 값을 넣을 때 사용 할 인덱스
            int[] temp = new int[last - first + 1];

            // 1.
            for(int j=0; j<temp.length; j++)
                temp[j] = array[index++];
            // int first ~ 바로 위 까지 내용을
            // int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]); 로 줄일 수 있음
            // 2.
            Arrays.sort(temp);

            // 3.
            answer[i] = temp[commands[i][2]-1];

        }

        return answer;
    }

}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges