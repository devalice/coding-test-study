package seolhee._1주차;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class StackProblem05 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i=0; i<size; i++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                if(!stack.isEmpty()) stack.pop();
            }else{
                stack.push(num);
            }
        }

        int sum = 0;
        for(int num : stack){
            sum += num;
        }

        System.out.println(sum);
    }
}
