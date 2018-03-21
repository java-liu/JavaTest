/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CollectionTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 集合打乱顺序
 * @author lys
 */
public class CollectionsShuffle {
    public static void main(String []args){
        List<Integer> list = new ArrayList<Integer>();
        for(int i =0;i<10;i++){
            list.add(new Integer(i));
        }
        System.out.println("打乱前：");
        System.out.println(list);
        for(int j = 1;j<5;j++){
            System.out.println("第"+ j +"打乱！");
            Collections.shuffle(list);
            System.out.println(list);
            
        }
    }
    
    
}
