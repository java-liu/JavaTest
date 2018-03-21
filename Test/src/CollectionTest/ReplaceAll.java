/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CollectionTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 17-元素替换 list截取
 * @author lys
 */
public class ReplaceAll {
    public static void main(String[] args){
        List list = Arrays.asList("one two three four five six one three".split(" "));
        System.out.println("List:"+list);
        Collections.replaceAll(list, "one", "hundred");
        System.out.println("ReplactAll:"+list);
        List subList = Arrays.asList("three".split(" "));
        System.out.println("子列表："+subList);
        System.out.println("IndexOfSubList:"+Collections.indexOfSubList(list, subList));
        System.out.println("lastIndexOfSubList:"+Collections.lastIndexOfSubList(list, subList));
        
    }
    
}
