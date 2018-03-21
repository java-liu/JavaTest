/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AnnotationTest;

import java.lang.reflect.Method;

/**
 *
 * @author lys
 */
public class TestAnno {
    public static void main(String[] args){
        Demo1 d1 = new Demo1();
        Method[] methods = d1.getClass().getMethods();
        TestAnnotation ta = methods[0].getAnnotation(TestAnnotation.class);
        ta.id();
        System.out.println(ta.id()+"===="+ta.code());
    }
    
}
