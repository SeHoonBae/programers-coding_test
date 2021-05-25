package programmers.step2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

// 오픈채팅방
public class OpenChat {

    @Test
    public void main(){
        Assertions.assertEquals(solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"}), new String[]{"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."});
    }

    public String[] solution(String[] record) {
        String[] answer = {};
        ArrayList<String> result = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();

        for(int i=0; i<record.length; i++){
            String[] records = record[i].split(" ");
            String division = records[0];
            String userId = records[1];

            if(division.equals("Enter")){
                String nickname = records[2];
                result.add(userId+"님이 들어왔습니다.");
                map.put(userId, nickname);
            }else if(division.equals("Leave")){
                result.add(userId+"님이 나갔습니다.");
            }else if(division.equals("Change")){
                String nickname = records[2];
                map.put(userId, nickname);
            }
        }

        answer = new String[result.size()];

        for(int i=0; i< answer.length; i++){
            String userId = result.get(i).substring(0,result.get(i).indexOf("님"));
            answer[i] = result.get(i).replace(userId, map.get(userId));
        }

        return answer;
    }

//    public String[] solution(String[] record) {
//        String[] answer = {};
//        ArrayList<String> result = new ArrayList<>();
//        HashMap<String, String> map = new HashMap<>();
//
//        for(int i=0; i<record.length; i++){
//            String[] records = record[i].split(" ");
//            String division = records[0];
//            String userId = records[1];
//
//            if(division.equals("Enter") || division.equals("Change")) {
//                String nickname = records[2];
//                map.put(userId, nickname);
//            }
//
//            if(division.equals("Enter") || division.equals("Leave")){
//                result.add(userId + " " + division);
//            }
//        }
//
//
//
//        answer = new String[result.size()];
//
//        for(int i=0; i< answer.length; i++){
//            String[] results = result.get(i).split(" ");
//            String userId = results[0];
//            String division = results[1];
//
//            answer[i] = map.get(userId) + (division.equals("Enter") ? "님이 들어왔습니다." : "님이 나갔습니다.");
//        }
//
//        return answer;
//    }


}

//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges