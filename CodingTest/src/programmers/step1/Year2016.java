package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Year2016 {

    @Test
    public void main(){
        Assertions.assertEquals(solution(5,24), "TUE");
    }

    // 2016년 1월 1일은 금요일
    // 윤년(2월 29일 까지있음)
    // SUN, MON, TUE, WED, THU, FRI, SAT 출력
    // 1일이 금요일이므로 요일의 배열중에서 THU 를 가장 앞에 둔다. 그냥 편할려고.. 일 % 7 = days의 인덱스 값이 된다
    public String solution(int a, int b) {
        String answer = "";
        String[] days = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int[] monthDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // 2016년 월별 날짜 수
        int day = b;

        // 입력받은 월의 이전월들의 날짜를 더함
        for(int i=0; i<a-1; i++)
            day += monthDays[i];

        answer = days[day%7];

        return answer;
    }

}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges