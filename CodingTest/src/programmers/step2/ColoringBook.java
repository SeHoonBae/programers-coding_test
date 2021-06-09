package programmers.step2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ColoringBook {

    @Test
    public void main() {

//        Assertions.assertArrayEquals(solution(6, 4, new int[][]{{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}}), new int[]{4, 5});
        Assertions.assertArrayEquals(solution(3, 3, new int[][]{{0,1,0}, {1,1,0}, {0,0,0}}), new int[]{1,3});
//        Assertions.assertArrayEquals(solution(13, 16, new int[][]{{0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0}, {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0}, {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0}, {0, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1, 0},{0, 1, 1, 1, 2, 1, 2, 1, 1, 2, 1, 2, 1, 1, 1, 0},{0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},{0, 1, 3, 3, 3, 1, 1, 1, 1, 1, 1, 3, 3, 3, 1, 0},{0, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 0},{0, 0, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 1, 1, 0, 0},{0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0},{0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0}}), new int[]{12, 120});

    }
    int sizeOfOneArea;
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};

//    public int[] solution(int m, int n, int[][] picture) {
//        int numberOfArea = 0;
//        int maxSizeOfOneArea = 0;
//
//        // 1. 모든 영역을 비교해야됨
//        // 2. 해당 영역이 0이거나 같은 영역으로 판단되는 경우에는 재방문 X
//        boolean[][] check = new boolean[m][n];
//
//        for(int i=0; i<m; i++){
//            for(int j=0; j<n; j++){
//                if(check[i][j]) continue;
//
//                if(picture[i][j] != 0){
//                    sizeOfOneArea = 0;
//                    numberOfArea++;
//
//                    dfs(i, j, m, n, picture, check);
//                }
//
//                if(maxSizeOfOneArea < sizeOfOneArea)
//                    maxSizeOfOneArea = sizeOfOneArea;
//
//            }
//        }
//
//        int[] answer = new int[2];
//        answer[0] = numberOfArea;
//        answer[1] = maxSizeOfOneArea;
//        return answer;
//    }
//
//    private void dfs(int x, int y, int m, int n, int[][] picture, boolean[][] check) {
//
//        if(check[x][y]) return;
//
//        sizeOfOneArea++;
//        check[x][y] = true;
//
//        for(int i=0; i<4; i++){
//            int nx = x+dx[i];
//            int ny = y+dy[i];
//
//            if(nx<0 || nx>=m || ny < 0 || ny>=n) continue;
//
//            if(picture[x][y] == picture[nx][ny] && !check[nx][ny]){
//                dfs(nx, ny, m, n, picture, check);
//            }
//
//        }
//
//    }

    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        // 1. 모든 영역을 비교해야됨
        // 2. 해당 영역이 0이거나 같은 영역으로 판단되는 경우에는 재방문 X
        boolean[][] check = new boolean[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(check[i][j]) continue;
                check[i][j] = true;

                if(picture[i][j] != 0){
                    sizeOfOneArea = 1;
                    numberOfArea++;

                    dfs(i, j, m, n, picture, check);
                }

                if(maxSizeOfOneArea < sizeOfOneArea)
                    maxSizeOfOneArea = sizeOfOneArea;

            }
        }

        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }

    private void dfs(int i, int j, int m, int n, int[][] picture, boolean[][] check) {

        if(i<m-1 && picture[i+1][j] == picture[i][j] && !check[i+1][j]){
            check[i+1][j] = true;
            sizeOfOneArea += 1;
            dfs(i+1, j, m, n, picture, check);
        }
        if(0<i && picture[i-1][j] == picture[i][j] && !check[i-1][j]){
            check[i-1][j] = true;
            sizeOfOneArea += 1;
            dfs(i-1, j, m, n, picture, check);
        }
        if(j<n-1 && picture[i][j+1] == picture[i][j] && !check[i][j+1]){
            check[i][j+1] = true;
            sizeOfOneArea += 1;
            dfs(i, j+1, m, n, picture, check);
        }
        if(0<j && picture[i][j-1] == picture[i][j] && !check[i][j-1]){
            check[i][j-1] = true;
            sizeOfOneArea += 1;
            dfs(i, j-1, m, n, picture, check);
        }
    }

}


//출처: 프로그래머스 코딩 테스트 연습, https://programmers.co.kr/learn/challenges