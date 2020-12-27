package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

public class ArrangeString {

    @Test
    public void main(){
        Assertions.assertArrayEquals(solution(new String[]{"sun", "bed", "car"}, 1), new String[]{"car", "bed", "sun"});
        Assertions.assertArrayEquals(solution(new String[]{"abce", "abcd", "cdx"}, 2), new String[]{"abcd", "abce", "cdx"});

    }

    // 1. strings 배열에서 n번째 인덱스로 순서 비교
    // 2. strings 배열에서 서로 비교하는 n번째 값이 같다면 사전순서
    public String[] solution(String[] strings, int n) {

//        Arrays.sort(strings);
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 2.
                if(o1.charAt(n)-o2.charAt(n)==0){
                    return o1.compareTo(o2);
                }
                // 1.
                return o1.charAt(n)-o2.charAt(n);
            }
        });

        return strings;
    }

}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges