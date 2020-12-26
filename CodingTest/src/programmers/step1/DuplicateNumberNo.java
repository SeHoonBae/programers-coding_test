package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class DuplicateNumberNo {

    @Test
    public void main(){
        Assertions.assertArrayEquals(solution(new int[]{1,1,3,3,0,1,1}), new int[]{1,3,0,1});
        Assertions.assertArrayEquals(solution(new int[]{4,4,4,3,3}), new int[]{4,3});
    }

    // 1. 몇개의 값이 될지 모르므로 배열은 적합하지 않음. ArrayList로 구현(arr의 첫번째 값을 넣어준다. 비교대상이 필요하므로)
    // 2. 연속된 arr의 값을 제거(1번에 넣은 값과 비교후 같으면 다음으로 같지 않다면 arr의 해당 값을 list에 넣어준다.
    // 3. 가장 마지막의 list의 값과 arr의 값들을 2번처럼 각각 비교
    // 4. list를 배열로 변환
    public int[] solution(int []arr) {
        int[] answer = {};

        ArrayList<Integer> list = new ArrayList<>();

        int index = 0;
        // 1.
        list.add(arr[0]);
        // 2, 3
        for(int a : arr){
            if(null != list.get(index) && list.get(index) == a){
                continue;
            }else{
                list.add(a);
                index++;
            }

        }
        // 4.
        answer = new int[list.size()];

        int arr_index=0;
        for(Integer i : list)
            answer[arr_index++]=i;

        return answer;
    }

}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges