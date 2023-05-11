import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class solve2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder st1 = new StringBuilder(br.readLine());
        StringBuilder st2 = new StringBuilder(br.readLine());

        HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();
        HashMap<Character,Integer> map2 = new HashMap<Character,Integer>();

        putMap(st1,map1);
        putMap(st2,map2);

        System.out.println(checkWord(map1,map2));
    }

    public static void putMap(StringBuilder sb, HashMap<Character,Integer> map) {
        char str = ' ';
        for(int x=0;x<sb.length();x++) {
            str = sb.charAt(x);
            if(!map.containsKey(str)) {
                map.put(str,1);
                continue;
            }
            map.put(str,map.get(str)+1);
        }
    }

    public static String checkWord(HashMap<Character,Integer> map1,HashMap<Character,Integer> map2) {
        for(char key : map1.keySet()) {
            if(!map2.containsKey(key)) {
                return "NO";
            }
            if(map1.get(key) != map2.get(key)) {
                return "NO";
            }

        }

        return "YES";
    }

}