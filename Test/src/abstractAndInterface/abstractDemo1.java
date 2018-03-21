/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abstractAndInterface;

/**
 * 抽象类
 * @author lys
 */
public abstract class abstractDemo1 {
    public String name = "ddda";
    private String sex;
    private int age;
    //抽象方法不能有方法体，不能是私有的，需要让子类继承
    abstract void method1();
    void method2(){
        name = "dsfs4";
        System.out.println("这是抽象方法中的普通方法！"+name);
    }
    
}
