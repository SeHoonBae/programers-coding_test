package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayOfDividingNumbers {

    @Test
    public void maiin(){
        Assertions.assertArrayEquals(solution(new int[]{5,9,7,10}, 5), new int[]{5,10});
        Assertions.assertArrayEquals(solution(new int[]{2,36,1,3}, 1), new int[]{1,2,3,36});
        Assertions.assertArrayEquals(solution(new int[]{3,2,6}, 10), new int[]{-1});
    }

    // 1. 나누어 떨어지는 수를 찾아서 list에 삽입
    // list를 선택한 이유 : key값 필요 없음, 중복 없음, 크기 모름
    // 2. list의 값이 없다면 -1 배열 return 있다면 배열로 만든 후 오름차순 정렬 return
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        ArrayList<Integer> list = new ArrayList<>();

        for(int a : arr){
            if( a%divisor == 0 ){
                list.add(a);
            }
        }

        if(list.size() == 0){
            answer = new int[]{-1};
        }else{
            answer = new int[list.size()];
            for(int i=0; i<list.size(); i++){
                answer[i] = list.get(i);
            }
            Arrays.sort(answer);
        }

        return answer;
    }

}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges