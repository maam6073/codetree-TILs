import java.util.*;
import java.io.*;


public class Main {
    private static int n;
    private static int[][] arr = new int[100][100];
    private static int[] dx = new int[]{0, 1, 0, -1};
    private static int[] dy = new int[]{1, 0, -1, 0};
    private static int dir = 0;
    private static int sP = 49;
    private static int x = sP, y = sP;


    private static void dirNumChange(char d){
        if(d == 'N')
            dir = 3;
        else if(d == 'W')
            dir = 2;
        else if(d == 'S')
            dir = 1;
        else if(d == 'E')
            dir = 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 1;
        boolean check = false;

        for(int i = 0; i < n; i++){
            String[] s = br.readLine().split(" ");
            char d = s[0].charAt(0);
            int distance = Integer.parseInt(s[1]);
            dirNumChange(d);

            for(int j = 0; j < distance; j++){
                int nx = x + dx[dir];
                int ny = y + dy[dir];

                arr[nx][ny] = cnt;

                if(i != 0 && ny == sP && nx == sP){
                    check = true;
                    break;
                }

                cnt++;

                x = nx;
                y = ny;
            }

            if(check)
                break;
            else if(i == n-1 && check == false)
                cnt = -1;
        }

        System.out.print(cnt);
    }
}