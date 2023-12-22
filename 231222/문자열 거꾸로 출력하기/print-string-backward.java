import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            String s = br.readLine();
            if(s.equals("END"))
                break;
            else{
                for(int i = s.length()-1; i >= 0; i--){
                    sb.append(s.charAt(i));
                }
                sb.append("\n");
            }
        }
        System.out.print(sb);
    }
}