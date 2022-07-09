package leetcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StockPrice {
    Map<Integer, Integer> time_price = new HashMap<Integer, Integer>();
    private int lasttime = 0;
    private int max = 0;
    private int min = 999999;
    private int maxtemp = 0;
    private int mintemp = 0;

    public StockPrice() {

    }

    public void update(int timestamp, int price) {
        if (timestamp > lasttime) {
            lasttime = timestamp;
        }
        time_price.put(timestamp, price);
        if (max < price) {
            max = price;
        } else {
            max = Collections.max(time_price.values());
        }
        if (min > price) {
            min = price;
        } else {
            min = Collections.min(time_price.values());
        }


    }

    public int current() {
        return time_price.get(lasttime);
    }

    public int maximum() {

        return max;
    }

    public int minimum() {
        return min;
    }
}
