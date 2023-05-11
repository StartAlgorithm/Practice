
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class solve2 {

    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int size = Integer.parseInt(st.nextToken());
    int change = Integer.parseInt(st.nextToken());

    int[] num = new int[size];
    StringTokenizer st2 = new StringTokenizer(br.readLine());
    for(int x=0;x<size;x++) {
        num[x] = Integer.parseInt(st2.nextToken());
    }
    int answer = 0;
    int cnt = 0;
    int lt = 0;

    for(int rt=0;rt<size;rt++) {
        if(num[rt] == 0 ) cnt++;
        while(cnt>change) {
            if(num[lt]==0) cnt--;
            lt++;
        }
        answer = Math.max(answer,rt -lt +1);
    }

        System.out.println(answer);

    }

}