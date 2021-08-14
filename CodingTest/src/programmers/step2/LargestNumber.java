package programmers.step2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LargestNumber {

    @Test
    public void main(){
        Assertions.assertEquals(solution(new int[]{6, 10, 2}), "6210");
        Assertions.assertEquals(solution(new int[]{3,30,34,5,9}), "9534330");
        Assertions.assertEquals(solution(new int[]{31,30,34,35,39}), "3935343130");
        Assertions.assertEquals(solution(new int[]{1,3,2,4,9}), "94321");
        Assertions.assertEquals(solution(new int[]{1,9,2,9,9,0}), "999210");
        Assertions.assertEquals(solution(new int[]{10, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}), "987654321101000");
        Assertions.assertEquals(solution(new int[]{4,45,5}), "5454");
        Assertions.assertEquals(solution(new int[]{1, 412,41,4,45,5}), "5454414121");
        Assertions.assertEquals(solution(new int[]{0,0,0,0}), "0");
        Assertions.assertEquals(solution(new int[]{0,1000,0,0}), "1000000");
        Assertions.assertEquals(solution(new int[]{12,121}), "12121");
        Assertions.assertEquals(solution(new int[]{21,212}), "21221");
    }

    public String solution(int[] numbers) {
        String answer = "";

        String[] nums = new String[numbers.length];

        for(int i=0; i<numbers.length; i++)
            nums[i] = numbers[i] + "";

        Arrays.sort(nums, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return ((o2+o1).compareTo(o1 + o2));
            }
        });

        if(nums[0].equals("0"))
            return "0";

        for(String num : nums)
            answer += num;

        return answer;
    }

}

//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges