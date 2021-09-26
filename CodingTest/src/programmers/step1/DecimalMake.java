package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DecimalMake {

    @Test
    public void test(){
        Assertions.assertEquals(solution(new int[]{1,2,3,4}), 1);
        Assertions.assertEquals(solution(new int[]{1,2,7,6,4}), 4);
    }

    public int solution(int[] nums) {
        int answer = 0;

        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    int result = nums[i] + nums[j] + nums[k];
                    boolean isDecimal = true;

                    for(int p=2; p<=Math.sqrt(result); p++){
                        if(result%p==0){
                            isDecimal = false;
                            break;
                        }
                    }
                    if(isDecimal) answer++;
                }
            }
        }

        return answer;
    }

//    public int solution(int[] nums) {
//        int answer = 0;
//
//        boolean[] visited = new boolean[nums.length];
//
//        answer = decimalCnt(nums, visited, 0, 3);
//
//        return answer;
//    }
//
//    public int decimalCnt(int[] arr, boolean[] visited, int start, int cnt){
//
//        int result = 0;
//
//        if( cnt == 0){
//
//            int tmp = 0;
//            for(int i=0; i<arr.length; i++){
//                if(visited[i])
//                    tmp += arr[i];
//            }
//
//            if(isDecimal(tmp))
//                result++;
//        }else{
//            for (int i=start; i<arr.length; i++){
//                visited[i] = true;
//                result += decimalCnt(arr, visited, i+1, cnt-1);
//                visited[i] = false;
//            }
//        }
//
//        return result;
//
//    }
//
//    public boolean isDecimal(int num){
//        boolean result = true;
//
//        for(int i = 2; i*i<=num; i++){
//
//            if(num%i==0){
//                result = false;
//                break;
//            }
//
//        }
//        return result;
//    }

}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges