package seolhee._2주차;

import java.util.*;


public class QueueProblem03 {

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};

        Deque<Integer> queue = new ArrayDeque<Integer>();
        for(int i=0; i<progresses.length; i++){
            int dis = (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]);
            queue.offer(dis);
        }

        List<Integer> lists = new ArrayList<>();
        int count = 0;
        int qFirst = 0;
        int q = 0;
        int qSize = queue.size();

        for(int i=0; i<qSize; i++){
            if(i == 0){
                qFirst = queue.peekFirst();
                q = queue.poll();
            }

            if(qFirst >= q){
                count++;
            }else{
                lists.add(count);
                qFirst = q;
                count = 1;
            }

            if(!queue.isEmpty()) q = queue.poll();
        }
        lists.add(count);

        answer = new int[lists.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = lists.get(i);
        }


        return answer;
    }

    public static void main(String[] args){
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        System.out.println(Arrays.toString(solution(progresses, speeds)));

    }
}
