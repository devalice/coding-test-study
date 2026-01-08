package seolhee._2주차;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class QueueProblem02 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        Deque<Integer> queue = new ArrayDeque<>();
        for(int i=1; i<=num; i++){
            queue.offer(i);
        }

        int i=1;
        while(!queue.isEmpty() && !(queue.size()==1)) {
            int n = queue.poll();
            if (i % 2 == 0) {
                queue.offer(n);
            }
            i++;
        }

        System.out.println(queue.poll());
    }
}

