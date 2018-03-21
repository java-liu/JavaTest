/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ReflectTest;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 *
 * @author lys
 */
public class TestReflect {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException{
        //反射获取类三种方式
        //第一种方式,此种方式会自动初始化该class对象
        //Class c1 = Class.forName("Employee");
        //第二种方式,.class方式来创建Class对象的引用时，不会自动初始化该Class对象
        Class c1 = Employee.class;
        //第三种方式
        //java语言中任何一个java对象都有getClass方法
        Employee e = new Employee();
        Class c3 = e.getClass();
        
        //2-创建对象：获取类以后我们来创建它的对象，利用newInstance;
        //创建此Class对象所表示的类的一个实例
        Object o  = c1.newInstance();
        
        //3-获取属性：分为获取所有属性和指定的属性
        //a.先获取所有属性
        Field[] fs = c1.getDeclaredFields();
        
        //定义可变长度的字符串，来存储属性
        StringBuffer sb = new StringBuffer();
        //通过追加方法，把每个属性拼接到此字符串中
        //最外边的public定义
        sb.append(Modifier.toString(c1.getModifiers())+ " class "+ c1.getSimpleName()+"{\n");
        //里面的每个属性
        for(Field field:fs){
            sb.append("\t");//空格
            sb.append(Modifier.toString(field.getModifiers())+" ");
            sb.append(field.getType().getSimpleName()+" "+field.getName()+";\n");
        }
        sb.append("}");
        
        System.out.println(sb);
        
        
        //b.获取特定的属性
        // 获取Id属性
        Field idF = c1.getDeclaredField("id");
        //实例化这个类
        Object o1 = c1.newInstance();
        //打破封装
        idF.setAccessible(true);//使用反射机制可以打破java的封装性，导致了java对象的属性不安全
        //赋值 set
        idF.set(o1, "120");
        //get
        System.out.println(idF.get(o1));
        
    }
    
}
