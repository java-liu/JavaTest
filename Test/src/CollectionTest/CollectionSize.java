/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CollectionTest;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 集合长度、删除集合中指定的元素
 * @author lys
 */
public class CollectionSize {
    public static void main(String []args){
        System.out.print("集合实例！\n");
        int size;
        HashSet collection = new HashSet();
        String str1 = "Red";
        String str2 = "Green";
        String str3 = "Yellow";
        String str4 = "Blue";
        Iterator iterator;
        collection.add(str1);
        collection.add(str2);
        collection.add(str3);
        collection.add(str4);
        System.out.print("集合数据：");
        collection.remove(str4);
        System.out.println("删除了["+str4+"]元素！");
        iterator = collection.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        
        size = collection.size();
        if(collection.isEmpty()){
            System.out.print("集合是空的！");
        }else{
            System.out.print("集合长度："+ size);
        }
        System.out.println();
    }
    
}
