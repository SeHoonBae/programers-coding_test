package programmers.step2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Printer {

    @Test
    public void main(){
        Assertions.assertEquals(solution(new int[]{2,1,3,2}, 2), 1);
        Assertions.assertEquals(solution(new int[]{1,1,9,1,1,1}, 0), 5);
    }

    // 1. 맨 처음 값을 꺼내서 우선순위가 가장 큰지 확인한다.
    // 2-1. 1번 값이 true인 경우 location에 위치한 값인지 확인한 후 같다면 return
    // 2-2. 1번 값이 false인 경우 해당 값을 제일 뒤로 보내므로 location -1 한 후 1~2번 반복
    public int solution(int[] priorities, int location) {
        int answer = 0; // 몇번째 인지

        // Queue를 이용한 이유 : 제일 처음 값을 비교하므로 선입선출구조인 Queue를 선택
        Queue<Integer> queue = new LinkedList<>();

        for(int p : priorities)
            queue.offer(p);

        while (!queue.isEmpty()){
            int value = queue.poll();
            boolean isMax = true;

            Iterator<Integer> iterator = queue.iterator();

            while (iterator.hasNext()){
                int compare = iterator.next();

                if(value < compare){
                    queue.add(value);
                    isMax = false;
                    break;
                }
            }

            if(isMax){
               answer++;

               if(location==0)
                   return answer;
            }

            if(location==0){
                location = queue.size()-1;
            }else{
                location--;
            }
        }

        return answer;
    }
}

//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges