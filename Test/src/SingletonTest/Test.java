/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SingletonTest;

/**
 *
 * @author lys
 */
public class Test {
    public static void main(String[] args){
        Demo1 demo1 = Demo1.INSTANCE;
        Demo1 demo2 = Demo1.INSTANCE;
        System.out.println(demo2==demo1);
        for(Demo1 demo:Demo1.values()){
            demo.getSingleton();
            
            System.out.println(demo.getClass().getName());
        
        }
        Singleton singleton1 = new Singleton();
        Singleton singleton2 = new Singleton();
        System.out.println(singleton1.getInstance()==singleton2.getInstance());
        
        
        Singleton2 singleton3 = new Singleton2();
        Singleton2 singleton4 = new Singleton2();
        Singleton2 singleton5 = new Singleton2();
        System.out.println(singleton3.getInstance()==singleton5.getInstance());
    
    }
    
    
}
