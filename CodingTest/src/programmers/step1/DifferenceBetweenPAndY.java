package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DifferenceBetweenPAndY {

    @Test
    public void main(){
        Assertions.assertEquals(solution("pPoooyY"), true);
        Assertions.assertEquals(solution("Pyy"), false);
    }
    
    // 1. p 또는 P가 있으면 1 더하고 y 또는 Y가 있으면 -1 하여 최종 값이 0이되면 개수가 같으므로 true 반환
    boolean solution(String s) {

        int difference = 0;

        for(char c : s.toCharArray()){
            if(c == 'P' || c == 'p') difference++;
            if(c == 'Y' || c == 'y') difference--;
        }
        return difference==0;
    }

}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges