package step1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 1번 지표	라이언형(R), 튜브형(T)
 * 2번 지표	콘형(C), 프로도형(F)
 * 3번 지표	제이지형(J), 무지형(M)
 * 4번 지표	어피치형(A), 네오형(N)
 *
 *  검사 결과는 모든 질문의 성격 유형 점수를 더하여 각 지표에서 더 높은 점수를 받은 성격 유형이 검사자의 성격 유형이라고 판단합니다.
 *  단, 하나의 지표에서 각 성격 유형 점수가 같으면, 두 성격 유형 중 사전 순으로 빠른 성격 유형을 검사자의 성격 유형이라고 판단합니다.
 *
 * 제한사항
 * 1 ≤ survey의 길이 ( = n) ≤ 1,000
 * survey의 원소는 "RT", "TR", "FC", "CF", "MJ", "JM", "AN", "NA" 중 하나입니다.
 * survey[i]의 첫 번째 캐릭터는 i+1번 질문의 비동의 관련 선택지를 선택하면 받는 성격 유형을 의미합니다.
 * survey[i]의 두 번째 캐릭터는 i+1번 질문의 동의 관련 선택지를 선택하면 받는 성격 유형을 의미합니다.
 * 예를들어 survey의 원소가 "RT"인 경우 비동의일수록 R(라이언형)에 점수를 동의일수록 T(튜브형)에 점수를 줍니다.
 *
 * choices의 길이 = survey의 길이
 *
 *
 * choices[i]는 검사자가 선택한 i+1번째 질문의 선택지를 의미합니다.
 * 1 ≤ choices의 원소 ≤ 7
 *
 * choices	뜻
 * 1	매우 비동의
 * 2	비동의
 * 3	약간 비동의
 * 4	모르겠음
 * 5	약간 동의
 * 6	동의
 * 7	매우 동의
 */
public class PersonalityTypeTest {

    @DisplayName("1번 예시에 주어진 값을 비교한다.")
    @Test
    void personality1() {

        String[] survey = {"AN","CF","MJ","RT","NA"};
        int[] choices = {5,3,2,7,5};
        String result = "TCMA";

        assertThat(result).isEqualTo(solution(survey, choices));
    }

    @DisplayName("2번 예시에 주어진 값을 비교한다.")
    @Test
    void personality2() {

        String[] survey = {"TR","RT","TR"};
        int[] choices = {7,1,3};
        String result = "RCJA";

        assertThat(result).isEqualTo(solution(survey, choices));

    }

    public String solution(String[] survey, int[] choices) {
        String answer = "";
        return answer;
    }

}
