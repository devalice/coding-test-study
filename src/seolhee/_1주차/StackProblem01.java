package seolhee._1주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class StackProblem01 {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        String[] commands = new String[num];
        for(int i=0; i<num; i++){
            commands[i] = br.readLine();
        }

        Deque<Integer> stack = new ArrayDeque<>();
        for (String command : commands) {
            if (command.startsWith("push")) {
                push(command, stack);
            } else if (command.equals("top")) {
                isTop(stack);
            } else if (command.equals("size")) {
                sb.append(stack.size()).append("\n");
            } else if (command.equals("empty")) {
                isEmpty(stack);
            } else if (command.equals("pop")) {
                pop(stack);
            }
        }

        System.out.print(sb);
    }

    private static void push(String command, Deque<Integer> stack) {
        StringTokenizer st = new StringTokenizer(command);
        st.nextToken();
        stack.push(Integer.parseInt(st.nextToken()));
    }

    private static void pop(Deque<Integer> stack) {
        if (stack.isEmpty()) {
            sb.append("-1\n");
        } else {
            sb.append(stack.pop()).append("\n");
        }
    }

    private static void isTop(Deque<Integer> stack) {
        if (stack.isEmpty()) {
            sb.append("-1\n");
        } else {
            sb.append(stack.peek()).append("\n");
        }
    }

    private static void isEmpty(Deque<Integer> stack) {
        if(stack.isEmpty()){
            sb.append("1\n");
        }else{
            sb.append("0\n");
        }
    }

}
