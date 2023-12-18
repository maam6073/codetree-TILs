import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split("");

        int c = 0;
        int cnt = 0;
        while(s[c].equals("C")){
            for(int o = 1; o < n; o++){
                if(s[o].equals("O")){
                    for(int w = o+1; w < n; w++){
                        if(!s[o].equals(s[w])){
                            cnt++;
                        }
                    }
                }
                else
                    break;
            }
            c++;
        }
        System.out.print(cnt);
    }
}