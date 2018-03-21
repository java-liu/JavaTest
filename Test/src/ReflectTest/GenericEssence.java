/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ReflectTest;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 泛型的本质
 * @author lys
 */
public class GenericEssence {
    
    public static void main(String[] args){
        List list1 = new ArrayList();//没有泛型
        List<String> list2 = new ArrayList<String>();//有泛型
        
        /**
         1.正常方式添加元素，在编译器检查泛型
         */
        list1.add("hello");
        list1.add(10);
        list2.add("world");
        //list2.add(11);//报错 list2有泛型限制，只能添加String类型
        System.out.println("list1.size()="+list1.size());
        System.out.println("list2.size()="+list2.size());
        
        /**
         * 2.通过反射添加元素，在运行期动态加载类，首先得到list1和list2的类类型相同，然后在通过方法反射绕过编译器来调用add方法，看能否添加int数据到list2中
         */
        
        Class c1 = list1.getClass();
        Class c2 = list2.getClass();
        System.out.println(c1==c2);
        
        //验证：通过方法的反射给list2添加元素，可以绕过编译检查
        try{
            Method m = c2.getDeclaredMethod("add", Object.class);
            m.invoke(list2, 20);//给list2添加一个int类型
            System.out.println("list2的长度是："+list2.size());
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
}
