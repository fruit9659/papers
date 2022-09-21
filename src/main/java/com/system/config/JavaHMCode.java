package com.system.config;

/**
 * @author Fruit
 * @version 1.0
 * @create 2022/9/20   17:58
 */
public class JavaHMCode {
    public static int getDistance(String dis1, String dis2) {
        int distance = 0;
        for (int i = 0; i < dis1.length(); i++) {
            if (dis1.charAt(i) != dis2.charAt(i)) {
                distance++;
            }
        }
        return distance;
    }


    public static double getJavaSimilarity(String Sim1, String Sim2) {
        int HaiMingDistance = getDistance(Sim1, Sim2);
        return 0.01 * (100 - HaiMingDistance * 100 / 128);
    }
}
