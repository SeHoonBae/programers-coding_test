package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FindKimSeobang {

    @Test
    public void main(){
        Assertions.assertEquals(solution(new String[]{"Jane", "Kim"}), "김서방은 1에 있다");
    }

    public String solution(String[] seoul) {
        String answer = "";

        for (int i=0; i<seoul.length; i++){
            if("Kim".equals(seoul[i])){
                answer = "김서방은 " + i +"에 있다";
                break;
            }
        }

        return answer;
    }
}
