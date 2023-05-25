import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class solve1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine());
        Stack<Integer> st = new Stack<>();
        for(int x=0;x<sb.length();x++) {
            Character input = sb.charAt(x);
            if(!Character.isDigit(input)) {
                int rt = st.pop();
                int lt = st.pop();
                if(input == '+')  st.push(lt + rt);
                else if(input == '-') st.push(lt - rt);
                else if(input == '*') st.push(lt * rt);
                else if(input == '/') st.push(lt / rt);
            } else {
                st.push(input - 48);
            }
        }

        System.out.println(st.pop());

    }
}
