import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        String answer = s[1];
        int cnt = 0;
        for(int i = 0; i < n; i++){
            String str = br.readLine();
            if(str.equals(answer))
                cnt++;
        }
        System.out.print(cnt);
    }
}