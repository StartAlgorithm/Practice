
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class solve1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder st = new StringBuilder(br.readLine());
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        int max = 0;
        char maxS = ' ';
        for(int x=0;x<num;x++) {
            char str = st.charAt(x);
            map.put(str,map.getOrDefault(str, 0)+1);
            if(max < map.get(str)) {
                max = map.get(str);
                maxS = str;
            }
        }


        System.out.println(maxS);

    }

}
