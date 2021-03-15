package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class FailureRate {

    @Test
    public void main(){
        Assertions.assertArrayEquals(solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3}), new int[]{3,4,2,1,5});
        Assertions.assertArrayEquals(solution(4, new int[]{4,4,4,4,4}), new int[]{4,1,2,3});
    }

    public int[] solution(int N, int[] stages) {
        int total = stages.length;
        int index = 0;
        int[] answer = new int[N];
        double[] temp = new double[N+2];
        ArrayList<Stage> fail = new ArrayList<Stage>();

        // 1. 각 스테이지별 남은 사람 수를 구한다.
        for(int stage : stages){
            temp[stage]++;
        }

        // 2. 각 스테이지별 실패율을 구한다.
        for(int i=1; i<temp.length-1; i++){
            Stage s = new Stage(i, temp[i] / total);
            fail.add(s);
            total -= temp[i];
        }

        // 3. 각 스테이지별 실패율을 내림차순 정렬한다.
        Collections.sort(fail);

        for(Stage s : fail){
            answer[index++] = s.getNum();
        }

        return answer;
    }

    public class Stage implements Comparable<Stage>{
        private int num;
        private double failureRate;

        public Stage(int num, double failureRate){
            this.num = num;
            this.failureRate = failureRate;
        }

        public double getFailureRate(){
            return failureRate;
        }

        public int getNum(){
            return num;
        }

        @Override
        public int compareTo(Stage o) {
            if(o.getFailureRate() - getFailureRate() > 0) return 1;
            else if(o.getFailureRate() - getFailureRate() < 0) return -1;
            else return 0;
        }

    }

}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges