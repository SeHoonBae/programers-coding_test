package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DartGame {

    @Test
    public void test(){
        Assertions.assertEquals(solution("1S2D*3T"), 37);
        Assertions.assertEquals(solution("1D2S#10S"), 9);
        Assertions.assertEquals(solution("1D2S0T"), 3);
        Assertions.assertEquals(solution("1S*2T*3S"), 23);
        Assertions.assertEquals(solution("1D#2S*3S"), 5);
        Assertions.assertEquals(solution("1T2D3D#"), -4);
        Assertions.assertEquals(solution("1D2S3T*"), 59);
    }


    public int solution(String dartResult) {
        int answer = 0;
        // 1. 다트 게임은 총 3번의 기회로 구성된다 - 총 숫자는 3개
        int[] number = new int[3];
        // number 배열의 인덱스
        int index = -1;

        for(int i=0; i<dartResult.length(); i++){

            char dartChar = dartResult.charAt(i);

            // 2. 각 기회마다 얻을 수 있는 점수는 0점에서 10점까지이다.
            if( 0 <= dartChar - '0' && dartChar-'0' <= 9){
                index++; // number 배열에 인덱스이며 뒤에 나올 문자열에 따라 연산처리를 하기 때문에 숫자를 넣는 곳에서 인덱스값 처리
                int num = dartChar - '0'; // char형 에서 -'0'을 하면 int형 숫자가 나옴

                // 숫자가 10인 경우를 대비
                if( num == 1 && i < dartResult.length()-1 && dartResult.charAt(i+1)-'0' == 0){
                    num = 10;
                    i++;
                }
                number[index] = num;
            }
//          3. 점수와 함께 Single(S), Double(D), Triple(T) 영역이 존재하고 각 영역 당첨 시 점수에서 1제곱, 2제곱, 3제곱 (점수1 , 점수2 , 점수3 )으로 계산된다.
//          8. Single(S), Double(D), Triple(T)은 점수마다 하나씩 존재한다.
            else if(dartChar == 'D'){
                number[index] = (int) Math.pow(number[index], 2);
            }else if(dartChar == 'T') {
                number[index] = (int) Math.pow(number[index], 3);
            }
//          4. 옵션으로 스타상(*) , 아차상(#)이 존재하며 스타상(*) 당첨 시 해당 점수와 바로 전에 얻은 점수를 각 2배로 만든다. 아차상(#) 당첨 시 해당 점수는 마이너스된다.
//          9. 스타상(*), 아차상(#)은 점수마다 둘 중 하나만 존재할 수 있으며, 존재하지 않을 수도 있다.
            else if(dartChar == '*'){
                number[index]*=2;

//              5. 스타상(*)은 첫 번째 기회에서도 나올 수 있다. 이 경우 첫 번째 스타상(*)의 점수만 2배가 된다.
//              6. 스타상(*)의 효과는 다른 스타상(*)의 효과와 중첩될 수 있다. 이 경우 중첩된 스타상(*) 점수는 4배가 된다.
//              7. 스타상(*)의 효과는 아차상(#)의 효과와 중첩될 수 있다. 이 경우 중첩된 아차상(#)의 점수는 -2배가 된다.
                if(0 < index)
                    number[index-1]*=2;

            }else if(dartChar == '#'){
                number[index]*=-1;
            }

        }

        for(int n : number)
            answer+=n;


        return answer;
    }

}
