package campus.exam;

import java.util.*;

/**
 * x, y, n이 주어진다.
 * x를 y로 변환한다.
 * 변환하는 방법은 총 3가지다.
 * 1. x *2
 * 2. x *3
 * 3. x + n
 * 세 가지를 사용하여 결과 n을 만들 것.
 */
public class 자연수변환 {

    public int solution(int x, int y, int n) {
        if (x == y) return 0;

        Queue<int[]> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        // 큐 초기화: 시작값과 연산 횟수
        queue.add(new int[]{x, 0});
        visited.add(x);

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentValue = current[0];
            int currentCount = current[1];

            // 세 가지 연산 수행
            int[] nextValues = new int[]{
                    currentValue + n,
                    currentValue * 2,
                    currentValue * 3
            };

            for (int nextValue : nextValues) {
                if (nextValue == y) {
                    return currentCount + 1; // 목표에 도달하면 연산 횟수 반환
                }
                // 방문하지 않은 값만 큐에 추가
                if (!visited.contains(nextValue) && nextValue > 0 && nextValue <= y) {
                    queue.add(new int[]{nextValue, currentCount + 1});
                    visited.add(nextValue);
                }
            }
        }

        return -1; // y에 도달할 수 없는 경우
    }
}
