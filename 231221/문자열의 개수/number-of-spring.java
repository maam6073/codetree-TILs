import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 여기에 코드를 작성해주세요.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strList = new ArrayList<>();
        while(true){
           String s = br.readLine();
            if(s.equals("0"))
                break;

            strList.add(s);
        }
        System.out.println(strList.size());
        for(int i = 0; i < strList.size(); i++){
            if(i %2 == 0)
                System.out.println(strList.get(i));
        }
    }
}