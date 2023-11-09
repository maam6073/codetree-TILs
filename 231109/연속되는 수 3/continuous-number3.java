import java.util.*;
import java.io.*;

public class Main {
    private static String[] strArr = new String[1000];
    private static int[] answer = new int[1002];
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            String s = br.readLine();
            strArr[i] = s;
        }
        int idx = 0;

        for(int i = 0; i < n; i++){
            answer[idx] ++;
            if(i != 0 && (strArr[i].charAt(0)=='-') != (strArr[i-1].charAt(0) =='-')){
                idx++;
            }
            else if(i != 0 && Character.isDigit(strArr[i].charAt(0)) != Character.isDigit(strArr[i-1].charAt(0))){
                idx++;
            }
        }
        Arrays.sort(answer);
        System.out.print(answer[answer.length-1]);
    }
}