package seolhee._1주차;

import java.util.*;

public class StackProblem04 {
    public static boolean solution(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(c == '('){
                stack.push(c);
            }

            if(c == ')'){
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }

        if(!stack.isEmpty()) return false;

        return true;

    }

    public static void main(String[] args){
        String str = "((((((((((((((()))))))))))))))";
        System.out.println(solution(str));
    }
}
