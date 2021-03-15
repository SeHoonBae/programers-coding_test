package programmers.step2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SkillTree {

    @Test
    public void test(){
        Assertions.assertEquals(solution("CBD", new String[]{"CBADF","BACDE","AECB","BDA"}), 2);
    }

    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for(int i=0; i< skill_trees.length; i++){
            boolean flag = false;
            int index = 0;
            for(int j=0; j<skill_trees[i].length(); j++){
                // 1. skill_tree의 각 인덱스 값이 skill에 포함된 값인지 비교
                for(int k=0; k<skill.length(); k++){
                    // 2. 1번의 값이 true인 경우 skill의 순서와 비교
                    if(skill.charAt(k) == skill_trees[i].charAt(j)){
                        // 3. 2번의 순서 비교시 맞으면 계속 진행 틀리면 다음 skill_tree로 넘어감
                        if(skill_trees[i].charAt(j) == skill.charAt(index)){
                            index++;
                            break;
                        }else{
                            flag = true;
                            break;
                        }
                    }
                }

                if(flag)
                    break;
            }
            // 4. 각 skill_trees의 값을 비교 후 순서대로 되어있다면 answer값 증가
            if(!flag)
                answer++;
        }

        return answer;
    }
}

//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges