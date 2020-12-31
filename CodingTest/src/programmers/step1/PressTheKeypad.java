package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PressTheKeypad {

    @Test
    public void main(){
        Assertions.assertEquals(solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right"),"LRLLLRLLRRL");
        Assertions.assertEquals(solution(new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left"),"LRLLRRLLLRR");
        Assertions.assertEquals(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, "right"),"LLRLLRLLRL");
    }

    // 1,4,7 은 왼손, 3, 6, 9는 오른손 , 2, 5, 8, 0은 왼손과 오른손 중 더 가까운 곳에 위치한 방향으로(거리가 같다면 어느손잡이인지로 판단)
    // 1,4,7의 위치를 각 1,2,3이라고 정의, 출발점은 *인 4로 -> vertical에 한하여 horizen은 1
    // 2,5,8의 위치를 각 1,2,3이라고 정의, 출발점은 #인 4로 -> vertical에 한하여 horizen은 3
    // 2,5,8,0의 위치를 각 1,2,3,4라고 정의 -> vertical에 한하여 horizen은 2
    // 행(horizen)과 열(vertical)을 따로 둔 이유는 vertical 하나만 지정하여 위치를 정하고자 한다면
    // left가 5번에 위치해 있고 right가 6번에 위치한 경우 8번을 누르고자한다면 둘다 차이는 1이되고 이때 어느손잡인지에 따라 선택되게 되는 경우가 있어서
    public String solution(int[] numbers, String hand) {
        String answer = "";

        int left_horizen = 1;
        int left_vertical = 4;
        int right_horizen = 3;
        int right_vertical = 4;
        int difference;

        for(int number : numbers){
            switch (number){
                case 1 :
                    left_horizen = 1;
                    left_vertical = 1;
                    answer += "L";
                    break;
                case 4 :
                    left_horizen = 1;
                    left_vertical = 2;
                    answer += "L";
                    break;
                case 7 :
                    left_horizen = 1;
                    left_vertical = 3;
                    answer += "L";
                    break;
                case 3 :
                    right_horizen = 3;
                    right_vertical = 1;
                    answer += "R";
                    break;
                case 6 :
                    right_horizen = 3;
                    right_vertical = 2;
                    answer += "R";
                    break;
                case 9 :
                    right_horizen = 3;
                    right_vertical = 3;
                    answer += "R";
                    break;
                case 2 :
                    difference = (Math.abs(left_horizen - 2)+Math.abs(left_vertical-1)) - (Math.abs(right_horizen - 2)+Math.abs(right_vertical-1));
                    if(difference > 0){
                        right_horizen = 2;
                        right_vertical = 1;
                        answer += "R";
                    }else if(difference < 0){
                        left_horizen = 2;
                        left_vertical = 1;
                        answer += "L";
                    }else{
                        if(hand.equals("right")){
                            right_horizen = 2;
                            right_vertical = 1;
                            answer += "R";
                        }else {
                            left_horizen = 2;
                            left_vertical = 1;
                            answer += "L";
                        }
                    }
                    break;
                case 5 :
                    difference = (Math.abs(left_horizen - 2)+Math.abs(left_vertical-2)) - (Math.abs(right_horizen - 2)+Math.abs(right_vertical-2));
                    if(difference > 0){
                        right_horizen = 2;
                        right_vertical = 2;
                        answer += "R";
                    }else if(difference < 0){
                        left_horizen = 2;
                        left_vertical = 2;
                        answer += "L";
                    }else{
                        if(hand.equals("right")){
                            right_horizen = 2;
                            right_vertical = 2;
                            answer += "R";
                        }else {
                            left_horizen = 2;
                            left_vertical = 2;
                            answer += "L";
                        }
                    }
                    break;
                case 8 :
                    difference = (Math.abs(left_horizen - 2)+Math.abs(left_vertical-3)) - (Math.abs(right_horizen - 2)+Math.abs(right_vertical-3));
                    if(difference > 0){
                        right_horizen = 2;
                        right_vertical = 3;
                        answer += "R";
                    }else if(difference < 0){
                        left_horizen = 2;
                        left_vertical = 3;
                        answer += "L";
                    }else{
                        if(hand.equals("right")){
                            right_horizen = 2;
                            right_vertical = 3;
                            answer += "R";
                        }else {
                            left_horizen = 2;
                            left_vertical = 3;
                            answer += "L";
                        }
                    }
                    break;
                case 0 :
                    difference = (Math.abs(left_horizen - 2)+Math.abs(left_vertical-4)) - (Math.abs(right_horizen - 2)+Math.abs(right_vertical-4));
                    if(difference > 0){
                        right_horizen = 2;
                        right_vertical = 4;
                        answer += "R";
                    }else if(difference < 0){
                        left_horizen = 2;
                        left_vertical = 4;
                        answer += "L";
                    }else{
                        if(hand.equals("right")){
                            right_horizen = 2;
                            right_vertical = 4;
                            answer += "R";
                        }else {
                            left_horizen = 2;
                            left_vertical = 4;
                            answer += "L";
                        }
                    }
                    break;
            }
        }

        return answer;
    }
}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges