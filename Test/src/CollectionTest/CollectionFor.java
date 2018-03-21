/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CollectionTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * 集合遍历
 * @author lys
 */
public class CollectionFor {
    
    public static void setTest(){
        //定义一个set集合
        Set<String> set = new HashSet<String>();
        set.add("JAVA");
        set.add("C");
        set.add("C#");
        //重复数据添加失败
        set.add("JAVA");
        set.add("JAVASCRIPT");
        
        //使用Iterator遍历set集合
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String value = it.next();
            System.out.println(value);
        }
        System.out.println("------------------------这是分割线----------------------");
        //使用增强for遍历set集合
        for(String s:set){
           System.out.println(s);
        }
         System.out.println("=========这是方法分割线==========");
    }
   
    public static void listTest(){
        List<String> list = new ArrayList<String>();
        list.add("菜");
        list.add("鸟");
        list.add("教");
        list.add("程");
        list.add("www.w3cschool.com");
        
        //使用Iterator遍历list
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String value = it.next();
            System.out.println(value);
        }
        System.out.println("-----------------这是分割线------------------");
        //使用增强for遍历list
        for(String s:list){
            System.out.println(s);
        }
    }
    
    
    public static void main(String []args){
        setTest();
        listTest();
    }
    
}
