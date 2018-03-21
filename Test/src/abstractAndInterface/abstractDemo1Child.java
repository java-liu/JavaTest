/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abstractAndInterface;


/**
 * abstractDemo1抽象类的普通子类
 * @author lys
 */
public class abstractDemo1Child extends abstractDemo1 {
   String name1 = "jleurew";
    @Override
   void method1(){
       System.out.println(abstractDemo1.class.getName());
       name = name1;
       System.out.println("这是子类重写父类方法！name="+name);
   }
    
}
