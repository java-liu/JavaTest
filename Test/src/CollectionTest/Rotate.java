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
 * 12-list循环移动元素
 * @author lys
 */
public class Rotate {
    public static void main(String[] args){
       List list  = Arrays.asList("one Two Three Four Five Six".split(" "));
       System.out.println("List:"+list);
       Collections.rotate(list,3);
       System.out.println("Rotate:"+list);
       System.out.println("最大值："+Collections.max(list));
       System.out.println("最小值："+Collections.min(list));
    }
    
}
