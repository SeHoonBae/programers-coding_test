package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Stack;

// 프로그래머스 크레인 인형뽑기 게임
public class CraneDollDrawGame {

    @Test
    public void test() {
        Solution s = new Solution();
        Assertions.assertEquals(4, s.solution(new int[][]{{0,0,0,0,0}, {0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}, new int[]{1,5,3,5,1,2,1,4}));

    }

    class Solution {
        public int solution(int[][] board, int[] moves) {
            int answer = 0;
            // Stack은 후입선출로 마지막에 들어간 값이 먼저 나옴
            Stack stack = new Stack();

            // 크레인이 움직이면서 board에 있는 인형값을 stack에 쌓으며 이전 인형과 같다면 인형 제거
            // 크레인의 위치는 열의 위치
            for(int move : moves){
                for(int i=0; i<board.length; i++){
                    // 인형이 뽑히는 위치는 열위치를 나타냄
                    if(board[i][move-1] != 0){
                        // 이전에 뽑은 인형이 없거나 같지 않다면 비교대상이 아님
                        if (stack.size() != 0 && (int)stack.peek() == board[i][move-1]){
                            answer += 2;
                            stack.pop();
                        }else{
                            stack.add(board[i][move-1]);
                        }
                        board[i][move-1] = 0;
                        break;
                    }
                }
            }
            return answer;
        }
    }

}

//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges