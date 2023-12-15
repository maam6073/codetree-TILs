import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split("");
        int cnt = 0;

        for(int i = 1; i < s.length; i++){
            if(s[i-1].equals("(") && s[i].equals("(")){
                for(int j = i; j < s.length; j++){
                    if(s[j-1].equals(")") && s[j].equals(")"))
                        cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}