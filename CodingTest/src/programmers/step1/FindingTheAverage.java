package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class FindingTheAverage {

    @Test
    public void main(){
        Assertions.assertEquals(solution(new int[]{1,2,3,4}), 2.5);
        Assertions.assertEquals(solution(new int[]{5,5}), 5);
    }

    // 1. arr의 모든 값들을 더한다.
    // 2. 1번의 값에 arr의 크기만큼 나눈다
    public double solution(int[] arr) {
        // 아래 stream으로 하면 가독성은 좋지만 속도가 느려짐
//        return Arrays.stream(arr).average().getAsDouble();

        double answer = 0;

        // 1.
        for(int a : arr)
            answer += a;
        // 2.
        return answer/arr.length;
    }

}
