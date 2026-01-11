package seolhee._2주차;

import java.io.*;
import java.util.*;

public class QueueProblem05 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String command = br.readLine();
        StringTokenizer st = new StringTokenizer(command);
        int num = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new ArrayDeque<>();
        for(int i=0; i<num; i++){
            queue.offer(i+1);
        }

        int[] answer = new int[num];
        int count = 0;
        while(!queue.isEmpty()){
            if(queue.size() == 1) {
                answer[count] = queue.poll();
                break;
            }

            for(int i=0; i<k-1; i++) {
                int q = queue.poll();
                queue.offer(q);
            }

            answer[count++] = queue.poll();
        }

        System.out.print("<");
        for(int i=0; i<answer.length; i++){
            if(i==answer.length-1) System.out.print(answer[i]);
            else System.out.print(answer[i] +", ");
        }
        System.out.print(">");
    }
}
