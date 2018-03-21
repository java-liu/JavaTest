/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OverrideTest;

/**
 *
 * @author lys
 */
public class Client {
    public static void main(String[] args){
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C(); 
        D d = new D();
        
        System.out.println(a1.show(b)+"---1");
        System.out.println(a1.show(c)+"---2");
        System.out.print(a1.show(d)+"---3"+"\n");
        System.out.print(a2.show(b)+"---4"+"\n");
        System.out.print(a2.show(c)+"---5"+"\n");
        System.out.print(a2.show(d)+"---6"+"\n");
        System.out.print(b.show(c)+"---7"+"\n");
        System.out.println(b.show(d)+"---8");
    }
    
}
