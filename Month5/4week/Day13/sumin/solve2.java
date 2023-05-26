
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class solve2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = new String(br.readLine());
        String array = new String(br.readLine());
        Deque<Character> goal = new ArrayDeque<>();
        for(char c : st.toCharArray()) {
            goal.add(c);
        }

        for(int x=0;x<array.length();x++) {
            if(!goal.isEmpty() && goal.peek() == array.charAt(x)) {
                goal.pop();
            }
        }

        if(goal.isEmpty()) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}