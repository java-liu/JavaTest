/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CollectionTest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author lys
 */
public class HashMapTest {
    public static void main(String[] args){
       HashMap<String,String> hMap = new HashMap<String,String>();
       hMap.put("1", "1st");
       hMap.put("2", "2nd");
       hMap.put("3","3rd");
       Collection cl = hMap.values();
       Iterator itr  = cl.iterator();
       while(itr.hasNext()){
           System.out.println(itr.next());
       }
       System.out.println("==================================");
       Map<String,String> maps = new HashMap<String,String>();
       maps.put("1","PHP");
       maps.put("2", "JAVA");
       maps.put("3", "C");
       maps.put("4","CSS");
       maps.put("5", "HTML");
       
       strongForMethod2(maps);
       System.out.println("========1=========");
       strongForMethod1(maps);
       System.out.println("========2=========");
       traditionalMethod2(maps);
       System.out.println("========3=========");
       traditionalMethod1(maps);
    }
    //增强for循环来遍历map：entrySet();
    public static void strongForMethod2(Map<String,String> maps){
        Set<Entry<String,String>> set = maps.entrySet();
        for(Entry<String,String> entry:set){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ":" + value);
        }
    }
    
    public static void strongForMethod1(Map<String,String> maps){
        Set<String> set = maps.keySet();
        for(String s:set){
            String key = s;
            String value = maps.get(s);
            System.out.println(key + ":" + value);
        }
    }
    
    private static void traditionalMethod2(Map<String,String> maps){
        //使用entrySet（）方法，获取maps集合中的每一个键值对
        Set<Entry<String,String>> sets = maps.entrySet();
        //取得迭代器遍历出对应的值
        Iterator<Entry<String,String>> it = sets.iterator();
        while(it.hasNext()){
            Map.Entry<String,String> entry = it.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ":" + value);
         }
    }
    private static void traditionalMethod1(Map<String,String> maps){
        Set<String> set = maps.keySet();
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String key = it.next();
            String value = maps.get(key);
            System.out.println(key + ":" + value);
        }
    }
    
}
