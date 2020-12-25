package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GymSuit {

    @Test
    public void main(){

        Assertions.assertEquals(solution(5, new int[]{2,4}, new int[]{1,3,5}), 5);
        Assertions.assertEquals(solution(5, new int[]{2,4}, new int[]{3}), 4);
        Assertions.assertEquals(solution(3, new int[]{3}, new int[]{1}), 2);
    }

    // 1. 전체 학생수 n명이 모두 체육복을 가져왔다고 가정
    // 2. 1에서 구한 값에서 lost에 들어있는 해당학생의 도난당한 체육복 빼기
    // 3. 2에서 구한 값에 여분의 체육복을 해당 학생에게 더함
    // 4. 여분의 체육복을 가진 학생은 앞번호와 뒷번호에게 체육복을 빌려줄 수 있음
    // 5. 체육복을 1개라도 가진 학생수 return
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        int[] gymSuit = new int[n];
        // 1.
        for(int i=0; i< gymSuit.length; i++){
            gymSuit[i]++;
        }

        // 2.
        for(int l : lost)
            gymSuit[l-1]--;

        // 3.
        for(int r : reserve)
            gymSuit[r-1]++;

        if(gymSuit[0] == 2){
            if(gymSuit[1] == 0){
                gymSuit[0]--;
                gymSuit[1]++;
            }
        }

        // 4.
        for(int i=1; i<gymSuit.length-1; i++){
            if(gymSuit[i] == 2){
                if(gymSuit[i-1] == 0){
                    gymSuit[i]--;
                    gymSuit[i-1]++;
                }else if (gymSuit[i+1]==0){
                    gymSuit[i]--;
                    gymSuit[i+1]++;
                }
            }
        }

        if(gymSuit[gymSuit.length-1] == 2){
            if(gymSuit[gymSuit.length-2] == 0){
                gymSuit[gymSuit.length-1]--;
                gymSuit[gymSuit.length-2]++;
            }
        }

        // 5.
        for(int suit : gymSuit){
            if(suit > 0) answer++;
        }

        return answer;
    }

}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges