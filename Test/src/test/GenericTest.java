/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型测试
 * 类型通配符
 * @author lys
 */
public class GenericTest {
    
    public static void getData(List<?> data){
       System.out.println("data:"+data.get(0));
    }
    public static void getUperNumber(List<? extends Number> data){
        System.out.println("data:"+data.get(0));
    }
    public static void main(String[] args){
       List<String> name = new ArrayList<String>(); 
       List<Integer> age = new ArrayList<Integer>();
       List<Number> number = new ArrayList<Number>();
       
       name.add("张三");
       age.add(20);
       number.add(15);
       
       getData(name);
       getData(age);
       getData(number);
       
       getUperNumber(age);
       getUperNumber(number);
    }
}
