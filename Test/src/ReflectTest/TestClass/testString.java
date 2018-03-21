/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ReflectTest.TestClass;

import java.lang.reflect.Field;

/**
 * 用反射修改String的值
 * @author lys
 */
public class testString {
    //用反射方法修改String的值
    public static void testReflection() throws Exception{
        //创建字符串“Hello World” 并赋值给引用s
        String s = "Hello World";
        
        System.out.println("s=" + s);
        
        //获取String类的value属性
        Field valueFieldOfString  = String.class.getDeclaredField("value");
        
        //设置此属性可以访问
        valueFieldOfString.setAccessible(true);
        
        //获取s对象上的value属性的值
        char[] values = (char[])valueFieldOfString.get(s);
        
        values[5] = '_';//改变value所引用的数组中的第五个字符
        
        
        System.out.println("s=" + s);
        
    }
    
    public static void main(String[] args) throws Exception{
        testReflection();
        
        String a = "ABCabc";
        a.replace('A', 'a');
        System.out.println(a);
        
        a = a.replace('A', 'a');
        
        System.out.println(a);
        StringBuilder abc = new StringBuilder("abc");
        StringBuffer sb = new StringBuffer("def");
        //int i = StringUtils.countMatches("aaadf1111","1");
    }
    
}
