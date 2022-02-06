package leetcode;

import java.util.HashMap;
import java.util.Map;

public class countGoodRectangles {
    public int countGoodRectangles(int[][] rectangles) {
        Map<Integer, Integer> target = new HashMap<Integer, Integer>();
        int temp = 0,counter = 0;
        for (int i = 0; i < rectangles.length; i++) {
            temp = rectangles[i][0] > rectangles[i][1] ? rectangles[i][1] : rectangles[i][0];
            if (target.containsKey(temp)) {
                int a = target.get(temp).intValue() + 1;
                target.put(temp, a);
            } else {
                target.put(temp, 1);
            }
        }
        for (Integer value : target.values()) {
            counter = counter < value ? value : counter;
        }
        return counter;
    }

}
