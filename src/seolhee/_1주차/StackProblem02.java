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

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args){
        //int[] arr = {1,1,3,3,0,1,1};
        int[] arr = {4,4,4,3,3};
        System.out.println(Arrays.toString(solution(arr)));
    }
}
