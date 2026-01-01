package seolhee._1주차;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class StackProblem03 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for(int i=0; i<num; i++) {
            String result = "YES";
            String vps = br.readLine();

            Deque<Character> stack = new ArrayDeque<>();
            for(int j=0; j<vps.length(); j++){
                char str = vps.charAt(j);
                if(str == '('){
                    stack.push(str);
                }else{
                    if(stack.isEmpty()){
                        result = "NO";
                        continue;
                    }
                    stack.pop();
                }
            }

            if (!stack.isEmpty()) {
                result = "NO";
            }

            System.out.println(result);
        }
    }
}
