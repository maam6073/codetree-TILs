import java.util.*;
import java.io.*;

public class Main {
    private static int R,C;
    private static char[][] arr;

    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        R = Integer.parseInt(s[0]);
        C = Integer.parseInt(s[1]);
        arr = new char[R][C];
        for(int i = 0; i < R; i++){
            s = br.readLine().split(" ");
            for(int j = 0; j < C; j++){
                arr[i][j] = s[j].charAt(0);
            }
        }

        int cnt = 0;
        for(int i = 1; i < R; i++)
            for(int j = 1; j < C; j++)
                for(int k = i + 1; k < R - 1; k++)
                    for(int l = j + 1; l < C - 1; l++)
                        // 그 중 색깔이 전부 달라지는 경우에만 개수를 세줍니다.
                        if(arr[0][0] != arr[i][j] && 
                           arr[i][j] != arr[k][l] &&
                           arr[k][l] != arr[R - 1][C - 1])
                            cnt++;
        
        System.out.println(cnt);
    }
}