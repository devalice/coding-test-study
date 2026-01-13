package seolhee._3주차;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class PriorityQueueProblem01 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) ->{
            int tempA = a;
            int tempB = b;

            // 절대값 계산
            if(a < 0) tempA = a*-1;
            if(b < 0) tempB = b*-1;

            if(tempA == tempB) return a-b;
            else return tempA-tempB;
        });

        for(int i=0; i<size; i++){
            int num = Integer.parseInt(br.readLine());
            if(num != 0) pq.offer(num);
            else if(pq.isEmpty()) System.out.println("0");
            else System.out.println(pq.poll());
        }
    }
}
