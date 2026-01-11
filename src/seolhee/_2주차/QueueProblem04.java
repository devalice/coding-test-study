package seolhee._2주차;

import java.util.*;

public class QueueProblem04 {
    public static int solution(int[] priorities, int location) {
        int answer = 0;

        Deque<Integer> queue = new ArrayDeque<>();
        for(int p : priorities){
            queue.offer(p);
        }

        int callCnt = 0; // 실행 번호
        while(!queue.isEmpty()){
            int qFirst = queue.poll();
            boolean onlyPoll = true;

            // 큐 대기열에 더 큰 값이 있으면 현재 값 뒤로 보낸다
            for(int q : queue){
                if(qFirst < q){
                    queue.offer(qFirst);
                    onlyPoll = false;
                    break;
                }
            }

            // 대기열에 더 큰 값이 없으면 실행
            if(onlyPoll){
                callCnt++;
                if(location == 0){
                    return callCnt;
                }else{
                    location--;
                }
            }else{
                if(location == 0){
                    location = queue.size()-1;
                }else{
                    location--;
                }
            }
        }

        return callCnt;
    }

    public static void main(String[] args){
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
        System.out.println(solution(priorities, location));
    }
}
