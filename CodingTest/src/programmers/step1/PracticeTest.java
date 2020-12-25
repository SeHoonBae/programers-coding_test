package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

// 모의고사
public class PracticeTest {

    @Test
    public void main(){

        Assertions.assertArrayEquals(solution(new int[]{1,2,3,4,5}), new int[]{1});
        Assertions.assertArrayEquals(solution(new int[]{1,3,2,4,2}), new int[]{1,2,3});
    }

    // 1. 해당 학생이 푼 정답의 규칙을 파악
    // 2. 1번에서 찾은 규칙을 토대로 정답과 비교
    // 3. 정답수가 가장 많은 개수 구하기
    // 4. 각 학생의 정답 수와 정답수가 가장많은 개수 비교
    // 5. 4번을 비교하여 일치한다면 answer에 1번학생부터 순차적으로 값 넣기
    public int[] solution(int[] answers) {
        int[] answer = {};

        // 1.
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int student1_answerCnt = 0;
        int student2_answerCnt = 0;
        int student3_answerCnt = 0;

        // 2.
        for(int i=0; i<answers.length; i++){
            if(answers[i] == student1[i%student1.length]) student1_answerCnt++;
            if(answers[i] == student2[i%student2.length]) student2_answerCnt++;
            if(answers[i] == student3[i%student3.length]) student3_answerCnt++;
        }

        // 3
        int max = Math.max(student1_answerCnt,Math.max(student2_answerCnt, student3_answerCnt));

        ArrayList<Integer> maxAnswer = new ArrayList<>();

        // 4. 학생 정답수와 max 값 비교
        if(student1_answerCnt == max) maxAnswer.add(1);
        if(student2_answerCnt == max) maxAnswer.add(2);
        if(student3_answerCnt == max) maxAnswer.add(3);

        answer = new int[maxAnswer.size()];
        for(int i=0; i<maxAnswer.size(); i++)
            answer[i] = maxAnswer.get(i);

        return answer;
    }

}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges