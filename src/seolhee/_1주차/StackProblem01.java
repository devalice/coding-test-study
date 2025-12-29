package seolhee._1주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class StackProblem01 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            int num = Integer.parseInt(br.readLine());

            String[] commands = new String[num];
            for(int i=0; i<num; i++){
                commands[i] = br.readLine();
            }

            Deque<Integer> stack = new ArrayDeque<>();
            for (String command : commands) {
                if (command.contains("push")) {
                    push(command, stack);
                } else if (command.equals("top")) {
                    isTop(stack);
                } else if (command.equals("size")) {
                    System.out.println(stack.size());
                } else if (command.equals("empty")) {
                    isEmpty(stack);
                } else if (command.equals("pop")) {
                    pop(stack);
                }
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    private static void push(String command, Deque<Integer> stack) {
        StringTokenizer st = new StringTokenizer(command);
        st.nextToken();
        stack.push(Integer.parseInt(st.nextToken()));
    }

    private static void pop(Deque<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("-1");
        } else {
            System.out.println(stack.pop());
        }
    }

    private static void isTop(Deque<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("-1");
        } else {
            System.out.println(stack.peek());
        }
    }

    private static void isEmpty(Deque<Integer> stack) {
        if(stack.isEmpty()){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }

}
