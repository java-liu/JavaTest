/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CollectionTest;

import java.util.ArrayList;
import java.util.List;

/**
 * 11-集合转数组
 * @author lys
 */
public class CollectionTurnArray {
    public static void main(String[] arsg){
        List<String> list = new ArrayList<String>();
        list.add("J");
        list.add("A");
        list.add("V");
        list.add("A");
        list.add("www.w3school.com.cn");
        String[] s1 = list.toArray(new String[0]);//1
        //1 等价于
        //String[] s1 = new String[](list.size());
        //s1 = list.toArray(s1);
        
        for(int i =0;i<s1.length;i++){
            String sr = s1[i];
            System.out.println(sr);
        }
    }
    
    
}
