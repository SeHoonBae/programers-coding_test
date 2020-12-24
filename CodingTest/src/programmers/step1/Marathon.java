package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Marathon {

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        // 완주하지 못한사람은 참가자 중 완주자에 이름이 없는 사람
        // 참가자 - 완주자 = 완주하지 못한 자
        // 참가자와 완주자 배열을 오름차순 정렬 후 차례대로 비교하여 다른 이름이 있는경우 해당 참가자는 완주하지 못한 자
        Arrays.sort(participant);
        Arrays.sort(completion);
        for (int i=0; i<completion.length; i++){
            if(!participant[i].equals(completion[i])){
                answer= participant[i];
                break;
            }
        }
        // 마지막 참가자가 완주하지 못한 경우를 위해 아래식 적용
        return answer.equals("")?answer=participant[participant.length-1]:answer;
    }

    @Test
    public void main(){
        Assertions.assertEquals(solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}), "leo");
        Assertions.assertEquals(solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"}), "vinko");
        Assertions.assertEquals(solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}), "mislav");
    }

}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges