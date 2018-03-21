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
public class TestClass {
    public static void main(String[] args){
        try{
             //测试getClass
            TestClassType tct = new TestClassType();//
            Class tc3 = tct.getClass();
            System.out.println("TestClassType==="+tc3);
            Thread.sleep(5000);
            //测试.class
            Class tc1 = TestClassType.class;
            System.out.println("TestClassType--"+tc1);
            Thread.sleep(3000);
            //测试forName，初始化构造器
            Class tc2 = Class.forName("ReflectTest.TestClass.TestClassType");
            System.out.println("TestClassType=="+tc2);
            
           
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
