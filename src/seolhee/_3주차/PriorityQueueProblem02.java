package seolhee._3주차;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class PriorityQueueProblem02 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i<size; i++){
            int num = Integer.parseInt(br.readLine());
            if(num > 0) {
                pq.offer(num);
            } else if(num == 0) {
                if(pq.isEmpty()) System.out.println("0");
                else System.out.println(pq.poll());
            }
        }
    }
}
