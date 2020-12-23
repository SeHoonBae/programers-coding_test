package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PlusTwoNumber {

    public int[] solution(int[] numbers) {
        // HashSet은 중복된 값 저장 X
        HashSet<Integer> set = new HashSet<Integer>();
        // numbers의 모든 수를 더하여 set에 넣어주는 부분
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[set.size()];
        int digit = 0;
        Iterator iterator = set.iterator();

        // set에 있는 값들을 answer로 넣어줌
        while (iterator.hasNext())
            answer[digit++] = (int) iterator.next();

        // 오름차순 정렬
        Arrays.sort(answer);
        
        return answer;
    }

    @Test
    public void main(){

        Assertions.assertArrayEquals(solution(new int[]{2,1,3,4,1}), new int[]{2,3,4,5,6,7});
        Assertions.assertArrayEquals(solution(new int[]{5,0,2,7}), new int[]{2,5,7,9,12});
    }

}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges