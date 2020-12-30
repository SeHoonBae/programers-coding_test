package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class InvertingNumbersIntoArray {

    @Test
    public void main(){
        Assertions.assertArrayEquals(solution(12345), new int[]{5,4,3,2,1});
    }

    // 1. 10으로 나눈 나머지가 각 자리값이다.
    // 2. 1번 진행 후 10으로 나눈 몫을 구한다.(다음 자리값을 얻기 위해서)
    // 3. 1~2번 을 각 자리값 만큼 반복한다.
    // 4. 마지막 자리값부터 배열에 넣는다면 주어진 수의 자리값의 반대가 나온다.
    public int[] solution(long n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();

        while(n>0){
            list.add((int) (n%10));
            n/=10;
        }

        answer = new int[list.size()];

        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }

}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges