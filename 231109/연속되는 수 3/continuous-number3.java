import java.util.*;
import java.io.*;

public class Main {
    private static String[] strArr = new String[1000];
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            String s = br.readLine();
            strArr[i] = s;
        }

        int p = 0 , m = 0;
        for(int i = 0; i < n; i++){
            if(strArr[i].charAt(0) == '-'){
                m++;
            }
            else{
                p++;
            }
        }
        System.out.print(p > m ?  p : m);
    }
}