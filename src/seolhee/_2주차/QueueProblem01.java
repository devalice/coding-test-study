package seolhee._2주차;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class QueueProblem01 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new ArrayDeque<>();
        for(int i=0; i<size; i++){
            String command = br.readLine();
            if(command.startsWith("push")){
                int num = Integer.parseInt(command.split(" ")[1]);
                offer(queue, num);
            }else if(command.equals("pop")){
                System.out.println(pop(queue));
            }else if(command.equals("size")){
                System.out.println(size(queue));
            }else if(command.equals("empty")){
                System.out.println(isEmpty(queue));
            }else if(command.equals("front")){
                System.out.println(front(queue));
            }else if(command.equals("back")){
                System.out.println(back(queue));
            }
        }
    }

    public static void offer(Deque q, int num){
        q.offer(num);
    }

    public static int pop(Deque q){
        if(q.isEmpty()) return -1;
        else return (int)q.poll();
    }

    public static int size(Deque q){
        return q.size();
    }

    public static int isEmpty(Deque q){
        if(q.isEmpty()) return 1;
        else return 0;
    }

    public static int front(Deque q){
        if(q.isEmpty()) return -1;
        else return (int)q.peek();
    }

    public static int back(Deque q){
        if(q.isEmpty()) return -1;
        else return (int)q.peekLast();
    }

}
