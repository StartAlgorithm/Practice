import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;


public class solve1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder input = new StringBuilder(br.readLine());
		Stack<Character> bucket = new Stack<>();
		ArrayList<Character> answer = new ArrayList<>();

		for(int x=0;x<input.length();x++) {
			Character check = input.charAt(x);
			if(check == '(') {
				bucket.push(check);
				continue;
			}

			if(check == ')') {
				bucket.pop();
				continue;
			}

			if(!bucket.empty() && bucket.peek() == '(') {
				continue;
			}



			answer.add(check);

		}
		answer.forEach(s ->System.out.print(s));
		

	}

}