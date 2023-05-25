
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class solve2 {

    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int size = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    ArrayList<Integer> array = new ArrayList<>();
    for(int x=0;x<size;x++) {
        array.add(Integer.parseInt(st.nextToken()));
    }

    Collections.sort(array);

    array.forEach(s -> System.out.print(s + " "));

    }

}