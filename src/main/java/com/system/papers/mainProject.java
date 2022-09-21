package com.system.papers;

import com.system.config.JavaHMCode;
import com.system.config.JavaSimHash;
import com.system.config.JavaTxtFile;

/**
 * @author Fruit
 * @version 1.0
 * @create 2022/9/20   18:15
 */
public class mainProject {
    public static void main(String[] args) {
        StringBuilder st = new StringBuilder();
        String txtPath1 = args[0];
        String txtPath12 = args[1];
        String targetFilePath = args[2];
        String TxtFilePath1 = JavaTxtFile.readTxtFile(txtPath1);
        String TxtFilePath2 = JavaTxtFile.readTxtFile(txtPath12);
        String SKA1 = JavaSimHash.getJavaSimHash(TxtFilePath1);
        String SKA2 = JavaSimHash.getJavaSimHash(TxtFilePath2);
        double similarity = JavaHMCode.getJavaSimilarity(SKA1, SKA2);
        st.append("相似度：").append(similarity).append("\n");
        JavaTxtFile.writeTxtFile(targetFilePath,st.toString());
    }

}
