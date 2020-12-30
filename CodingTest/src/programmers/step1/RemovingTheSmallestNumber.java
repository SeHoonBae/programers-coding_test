package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemovingTheSmallestNumber {

    @Test
    public void main(){
        Assertions.assertArrayEquals(solution(new int[]{4,3,2,1}), new int[]{4,3,2});
        Assertions.assertArrayEquals(solution(new int[]{1,2,3,4,5,6,7,8,9}), new int[]{2,3,4,5,6,7,8,9});
        Assertions.assertArrayEquals(solution(new int[]{10}), new int[]{-1});
    }

    // 1. arr에서 가장 작은 수를 구한다
    // 2. arr 값들 중 1번에서 구한 값을 제외하고 answer에 값을 삽입한다.
    // 3. arr의 크기가 1인경우는 {-1}을 return
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        int min = Integer.MAX_VALUE;
        int index = 0;

        // 3.
        if(arr.length == 1)
            return new int[]{-1};

        // 1.
        for(int a : arr)
            min = Math.min(min, a);

        // 2.
        for(int i=0; i<arr.length; i++){
            if(arr[i] == min) continue;
            answer[index++] = arr[i];
        }

        return answer;
    }
}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges