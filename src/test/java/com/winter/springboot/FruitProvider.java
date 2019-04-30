package com.winter.springboot;

public @interface FruitProvider {
     /**
      * 供应商编号
      */
     public int id() default -1;

     /*** 供应商名称*/
     public String name() default "";
 }