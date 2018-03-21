/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ReflectTest.TestClass;

/**
 *
 * @author lys
 */
public class TestClassType {
    //无参构造器
    public TestClassType(){
        System.out.println("无参构造器！");
    };
    
    static{
        System.out.println("---静态代码块，静态的参数初始化！---");
    }
    {
        System.out.println("---非静态的参数初始化！---");
    }
    public void method1(){
        System.out.println("普通方法！");
    }
    public static void staticMethod(){
        System.out.println("静态方法！");
    }
    
}
