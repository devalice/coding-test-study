package seolhee._1주차;

import java.util.*;

public class StackProblem02 {
    public static int[] solution(int []arr) {

        ArrayList<Integer> list = new ArrayList<>();
        Deque<Integer> stack = new ArrayDeque<>();
        for (int ar : arr) {
            if (stack.isEmpty()) {
                stack.push(ar);
                continue;
            }
            if (stack.peek() != ar) {
                list.add(stack.pop());
                stack.push(ar);
            }
        }
        list.add(stack.pop());

        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args){
        //int[] arr = {1,1,3,3,0,1,1};
        int[] arr = {4,4,4,3,3};
        System.out.println(Arrays.toString(solution(arr)));
    }
}
