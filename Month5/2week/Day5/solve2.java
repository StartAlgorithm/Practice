
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class solve2 {

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder a = new StringBuilder(br.readLine());
       StringBuilder b = new StringBuilder(br.readLine());
       HashMap<Character, Integer> bm = new HashMap<Character, Integer>();
        HashMap<Character, Integer> am = new HashMap<Character, Integer>();
       int size = b.length();
       for(int x=0;x<size;x++) {
           bm.put(b.charAt(x), bm.getOrDefault(b.charAt(x),0)+1);
       }
       for(int x=0;x<size-1;x++) {
           am.put(a.charAt(x), am.getOrDefault(a.charAt(x),0)+1);
       }
       int lt = 0;
       int cnt = 0;
       for(int rt=size-1;rt<a.length();rt++) {

           am.put(a.charAt(rt),am.getOrDefault(a.charAt(rt),0)+1);
           if(am.equals(bm)) cnt++;
           am.put(a.charAt(lt), am.get(a.charAt(lt))-1);
           if(am.get(a.charAt(lt))==0) am.remove(a.charAt(lt));
           lt++;
       }

        System.out.println(cnt);
    }





}
