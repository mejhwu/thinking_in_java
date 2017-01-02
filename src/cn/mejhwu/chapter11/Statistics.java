package cn.mejhwu.chapter11;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Author: jhwu
 * E-mail: mejhwu@163.com
 * Date: 17-1-2
 * Time: 下午12:49.
 */
public class Statistics {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            int r = rand.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1 : freq + 1);
        }
        System.out.println(m);
    }
}
