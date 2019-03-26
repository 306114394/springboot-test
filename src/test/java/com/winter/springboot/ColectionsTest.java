package com.winter.springboot;

import com.basoft.service.entity.StringAddress;
import org.apache.catalina.Store;
import org.junit.Test;
import sun.rmi.rmic.Generator;

import javax.swing.text.html.HTMLDocument;
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
}
