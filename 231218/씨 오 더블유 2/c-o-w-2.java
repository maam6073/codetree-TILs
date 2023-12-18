import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split("");

        int cnt = 0;
        for(int i = 0; i < n; i++){
            if(s[i].equals("C")){
            for(int j = i +1; j < n; j++){
                if(s[j].equals("O")){
                for(int k = j +1; k < n; k++){
                    if(s[k].equals("W")){
                        cnt++;
                    }
                }
                }
            }
            }
        }
        
        System.out.print(cnt);
    }
}