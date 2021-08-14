package programmers.step2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Iterator;

public class Camouflage {

    @Test
    public void main(){
        Assertions.assertEquals(solution(new String[][]{{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban","headgear"}}), 5);
        Assertions.assertEquals(solution(new String[][]{{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup","face"}}), 3);
    }

    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> map = new HashMap<>();

        for(int i=0; i<clothes.length; i++){
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0)+1);
        }

        Iterator<String> iterator = map.keySet().iterator();

        while (iterator.hasNext()){
            String key = iterator.next();
            answer *= (map.get(key) + 1);
        }

        answer -= 1;

        return answer;
    }

}

//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges