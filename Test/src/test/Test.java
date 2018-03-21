/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author lys
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Map<String,String> map = new HashMap<String,String>();
        list.add("aaaa");
        list.add("bbbb");
        list.add("cccc");
        map.put("1","a1");
        map.put("2","a2");
        map.put("3","a3");
                
        Iterator<String> ite = list.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }
        System.out.println("通过Map.entrySet遍历key和value");
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println("key="+entry.getKey()+",value="+entry.getValue());
        }
        System.out.println("通过Map.entrySet使用iterator遍历key和value");
        Iterator<Map.Entry<String,String>> it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String,String> entry = it.next();
            System.out.println("key="+entry.getKey()+",value="+entry.getValue());
        }
        //二次取值
        System.out.println("通过Map.keySet遍历key和value");
        for(String key:map.keySet()){
            System.out.println("key="+key+",value="+map.get(key));
        }
        System.out.println("通过map.values遍历所有的values，但不能遍历key");
        for(String v:map.values()){
            System.out.println("value="+v);
        }
        
    }
    
}
