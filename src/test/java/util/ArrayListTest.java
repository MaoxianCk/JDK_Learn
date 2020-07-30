package test.java.util;

import mxutils.TimeSpan;

import java.util.ArrayList;

/**
 * @author Ck
 */
public class ArrayListTest {
    /**
     * @author Ck
     * 测试预分配大小对速度的影响
     */
    public static void ensureCapacityTest(){
        ArrayList<Integer> list = new ArrayList<>();
        int testRange = 1000000;

        // 无分配，直接add
        TimeSpan timeSpan = new TimeSpan();
        for(int i=0;i<testRange;i++){
            list.add(i);
        }
        timeSpan.printTimeSpan();
        System.out.println(list.size());

        // 预分配，再add
        list = new ArrayList<>();
        timeSpan.init();
        list.ensureCapacity(testRange);
        for(int i=0;i<testRange;i++){
            list.add(i);
        }
        timeSpan.printTimeSpan();
        System.out.println(list.size());

    }

    public static void main(String[] args){
        ensureCapacityTest();
    }
}
