package programmers.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConvertStringToInteger {

    @Test
    public void main(){

        Assertions.assertEquals(solution("1234"),1234);
        Assertions.assertEquals(solution("-1234"),-1234);

    }

    public int solution(String s) {
        return Integer.parseInt(s);
    }

}
