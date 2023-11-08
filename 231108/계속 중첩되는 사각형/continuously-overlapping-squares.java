import java.util.*;
import java.io.*;

public class Main {
    static int offset = 100;
    static int MAX_L = offset *2;
    static int answer = 0;
    static int[][] arr = new int[MAX_L][MAX_L];
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            String[] s = br.readLine().split(" ");
            int x1 = Integer.parseInt(s[0])+offset;
            int y1 = Integer.parseInt(s[1])+offset;
            int x2 = Integer.parseInt(s[2])+offset;
            int y2 = Integer.parseInt(s[3])+offset;
            for(int j = x1; j < x2; j++){
                for(int k = y1; k < y2; k++){
                    if(i %2 == 0)
                        arr[j][k] = 1;
                    else{
                        arr[j][k] = 2;
                    }
                }
            }
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == 2){
                    answer++;
                }
            }
        }
        System.out.print(answer);
    }
}