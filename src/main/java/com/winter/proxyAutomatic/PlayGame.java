package com.winter.proxyAutomatic;

import com.winter.proxyTest.Girl;
import com.winter.proxyTest.TeacherCang;
import com.winter.proxyTest.Tony;
import com.winter.proxyTest.TuHao;

/**
 * @Author:DongXifu
 * @Description:
 * @Date Created in 下午5:14 2018/11/22
 **/
public class PlayGame {
    public static void main(String[] args) {
        TuHao th = new TuHao(1.7F);
        Girl tc = new TeacherCang();
        Girl tony1 = (Girl)TonyCompany.proxy(tc);
        th.dating(tony1);

        Boy tcc = new TeacherChen();
        Boy tony2 = (Boy)TonyCompany.proxy(tcc);
        tony2.dating('E');
        tony2.show();


    }
}
