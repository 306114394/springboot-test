package com.winter.springboot;

import com.basoft.service.entity.StringAddress;
import org.apache.catalina.Store;
import org.junit.Test;
import org.springframework.beans.BeanUtils;
import sun.rmi.rmic.Generator;

import javax.swing.text.html.HTMLDocument;
import java.lang.annotation.Inherited;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

/**
 * @Author:DongXifu
 * @Description: 创建一个长度不可变list
 * @Date Created in 下午5:30 2019/3/22
 **/
public class ColectionsTest {
    
    /** 
     * @Param 
     * @return void
     * @describe
     * @author Dong Xifu
     * @date 2019/3/25 上午9:00
     */
    @Test
    public void TestColections(){
        List<StringAddress> stringList = new ArrayList<StringAddress>(
            Collections.nCopies(4,new StringAddress("hello")));

        List a = Collections.nCopies(4,"a");
        System.out.println(stringList);
        stringList.add(new StringAddress("ss"));
        Collections.fill(stringList,new StringAddress("Word!"));
        //System.out.println(stringList);

    }

    @Test
    public void  TestQueue(){
        Queue<Integer> queue = new LinkedList<Integer>();
        Random rand = new Random(47);
        for (int i=0;i<10;i++){
            queue.offer(rand.nextInt(i + 10));
        }
        printQ(queue);

        Queue<Character> qc = new LinkedList<Character>();
        for (char c:"Brontosaurus".toCharArray())
            qc.offer(c);
        printQ(qc);



    }

    private void printQ(Queue queue) {
        while (queue.peek()!=null)
            System.out.println(queue.remove()+" ");
        //System.out.println();
    }

}
