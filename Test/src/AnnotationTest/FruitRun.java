/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AnnotationTest;

/**
 * 输出结果
 * @author lys
 */
public class FruitRun {
    public static void main(String[] args){
           int a = 1 ;
        short b = 1;
        char c = 'a';
        long d = 3;
        byte e = -128;
        double f = 3.6f;
        boolean g = false ;
        float h = 2.6f;
        String i;
        FruitInfoUtil.getFruitInto(Apple.class);
        System.out.println(e);
    }
}
