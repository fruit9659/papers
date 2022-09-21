package com.system.config;

import com.hankcs.hanlp.HanLP;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;

/**
 * @author Fruit
 * @version 1.0
 * @create 2022/9/20   18:02
 */
public class JavaSimHash {
    public static String getFileHash(String file){
        try{
            MessageDigest Digest = MessageDigest.getInstance("SHA");
            return new BigInteger(1, Digest.digest(file.getBytes("UTF-8"))).toString(2);
        }catch(Exception e){
            e.printStackTrace();
            return file;
        }
    }

    public static String getJavaSimHash(String FileSimHash){
        String SKASimHash = " ";
        int[] array = new int[256];
        int size,i=0;
        List<String> ListFile = HanLP.extractKeyword(FileSimHash, FileSimHash.length());
        size = ListFile.size();
        for(String KeyList : ListFile){
            String ListHash = getFileHash(KeyList);
            if (ListHash.length() < 256) {
                int Complement = 256 - ListHash.length();
                for (int j = 0; j < Complement; j++) {
                    ListHash += "0";
                }
            }
            for (int j = 0; j < array.length; j++) {
                if (ListHash.charAt(j) == '1') {
                    array[j] += (10 - (i / (size / 10)));
                } else {
                    array[j] -= (10 - (i / (size / 10)));
                }
            }
            i++;
        }
        for (int j = 0; j < array.length; j++) {
            if (array[j] <= 0) {
                SKASimHash += "0";
            } else {
                SKASimHash += "1";
            }
        }
        return SKASimHash;
    }
}
