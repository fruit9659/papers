package com.system.config;

import com.system.papers.mainProject;
import org.junit.Test;

/**
 * @author Fruit
 * @version 1.0
 * @create 2022/9/20   18:25
 */
public class mainFileOtTest {
    @Test
    public void mainFileTest1(){
        String target = "G:\\systemPapers\\src\\main\\resources\\txt\\orig.txt";
        String target1 = "G:\\systemPapers\\src\\main\\resources\\txt\\orig_add.txt";
        String target2 = "G:\\systemPapers\\src\\main\\resources\\txt\\target.txt";
        new mainProject().main(new String[]{target,target1,target2});
    }
    @Test
    public void mainFileTest2(){
        String target = "G:\\systemPapers\\src\\main\\resources\\txt\\orig.txt";
        String target1 = "G:\\systemPapers\\src\\main\\resources\\txt\\orig_del.txt";
        String target2 = "G:\\systemPapers\\src\\main\\resources\\txt\\target.txt";
        new mainProject().main(new String[]{target,target1,target2});
    }
}
