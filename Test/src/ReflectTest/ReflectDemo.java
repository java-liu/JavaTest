/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ReflectTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * @author lys
 */
public class ReflectDemo {
    public static void main(String[] args) throws Exception{
        try{
                 Class c1 = Employee.class;//先生成类类型  类类型：类的类型，描述一个类包含什么。通过类类型 ，可以知道一个类的属性和方法
                 Object o = c1.newInstance();//初始化一个实例
                 Class c2 = Class.forName("ReflectTest.Employee");
                 Object o1 = c2.newInstance();
                 Method method = c2.getDeclaredMethod("getInfo", String.class,int.class);//获取指定的方法
                 method.invoke(o1, "jack",23);
                 
                 Method[] methods1 = c2.getMethods();//获取该类所有的public方法，包含父类的
                 Method[] methods2 = c2.getDeclaredMethods();//获取该类所有的方法，不包含父类
                 for(Method method1:methods1){
                     System.out.println(method1.getName());
                 }
                 System.out.println("==============1=============");
                 for(Method method2:methods2){
                     System.out.println(method2.getName());
                 }
                 
                System.out.println("==============2============="); 
                 Employee em = new Employee();
                 Class c3 = em.getClass();
                 Class c4 = Employee.class;
                 System.out.println(c3==c4);
                  System.out.println("==============3=============");
                 Person ee = new Employee();
                 Class c5 = ee.getClass();//c5表示Employee类型
                 Class c6 = Person.class;//c6表示Person类型
                 System.out.println(c5==c6);
                  System.out.println("==============4=============");
                 int[] a  = new int[4];
                 Class c7 = a.getClass();
                 Class c8 = int[].class;
                 Class c9 = c7.getComponentType();
                 System.out.println(c7==c8);
                 System.out.println(c8.isArray());
                 System.out.println(c9.getName());
                 
                 
                 Employee el = new Employee();
                 Class c10 = el.getClass();
                 Field field = c10.getDeclaredField("age");
                 Object o10 = c10.newInstance();
                 field.setAccessible(true);//设置属性可访问，如果是public的可不用设置
                 field.set(o10, 10);
                 Object age = field.get(o10);
                 System.out.println(age+"============5========");
                 
                 Field[] fields = c10.getDeclaredFields();
                 for(Field fd:fields){
                     System.out.println(fd.getName()+"=============6==========");
                 }
                 
                 
                 //获取构造函数
                 Class c11 = Class.forName("ReflectTest.Employe");
                 //获取特定的带参数的构造函数
                 Constructor constructor = c11.getConstructor(String.class);
                 //
                 constructor.setAccessible(true);//设置是否允许访问，因为构造器是私有的，所以要手动设置，如果是public,可以不用设置
                 constructor.newInstance("lys");
                 System.out.println(constructor);
                 
                 
        }catch(Exception e){
                e.printStackTrace();
        
        }
     
        
    }
    
}
