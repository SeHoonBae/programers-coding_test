package programmers.step2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class NumberList {

    @Test
    public void main(){
        Assertions.assertEquals(solution(new String[]{ "97674223", "119","1195524421"}), false);
        Assertions.assertEquals(solution(new String[]{"123","456","789"}), true);
        Assertions.assertEquals(solution(new String[]{"12","123","1235","567","88"}), false);
        Assertions.assertEquals(solution(new String[]{"123","124","1235"}), false);
    }

    // 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true
    public boolean solution(String[] phone_book) {

        Arrays.sort(phone_book);

        // phone_book을 오름차순으로 정렬하였으므로 앞의 값과 바로 뒤의 값만 비교하면 된다.
        for(int i = 0; i<phone_book.length-1; i++){
            if(phone_book[i+1].startsWith(phone_book[i])){
                return false;
            }
        }

        return true;
    }

}

//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges