package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SecretMap {

    @Test
    public void main(){

        Assertions.assertArrayEquals(solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28}), new String[]{"#####","# # #", "### #", "#  ##", "#####"});
//        Assertions.assertArrayEquals(solution(6, new int[]{46, 33, 33 ,22, 31, 50}, new int[]{27 ,56, 19, 14, 14, 10}), new String[]{"######", "###  #", "##  ##", " #### ", " #####", "### # "});

    }

    // 1. arr1과 arr2를 or비트연산을 구한다.
    // 2. 1에서 구한 값을 String으로 변환 (각 자리수가 1이면 # 0이면 공백)
    // 3. 2에서 구한 값을 answer 배열에 각각 넣는다.
    public String[] solution(int n, int[] arr1, int[] arr2) {
        // answer는 n으로 이루어진 정사각형의 세로길이 만큼 나오므로 n으로 크기 지정
        String[] answer = new String[n];
        String[] arr1TwoDecimal = twoDecimalArr(arr1, n);
        String[] arr2TwoDecimal = twoDecimalArr(arr2, n);
        String temp = "";

        // 3.
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr1TwoDecimal[i].charAt(j) == '0' && arr2TwoDecimal[i].charAt(j) == '0')
                    temp += " ";
                else
                    temp += "#";
            }
            answer[i] = temp;
            temp = "";
        }

        return answer;
    }


    public String[] twoDecimalArr(int[] arr,int n){

        String temp = "";
        String[] result = new String[n];

        for(int i=0; i<arr.length; i++){

            // 1, 2.
            while(arr[i]>0){
                temp = arr[i]%2 + temp;
                arr[i]/=2;
            }

            // 2.
            if(temp.length() != n){
                int difference = n-temp.length();
                for (int j=0; j<difference; j++)
                    temp = "0"+temp;
            }

            result[i] = temp;
            temp = "";
        }

        return result;
    }

}
//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges