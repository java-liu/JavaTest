/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

/**
 * 泛型类
 * @author lys
 */
public class GenericClassTest<T> {
    private T t;
    public void add(T t){
        this.t = t;
    }
    public T get(){
        return t;
    }
    public static void main(String []args){
        GenericClassTest<Integer> integerGeneric = new GenericClassTest<Integer>();
        GenericClassTest<String>  stringGeneric = new GenericClassTest<String>();
        integerGeneric.add(new Integer(10));
        stringGeneric.add(new String("我爱java！"));
        
        System.out.printf("整型值：%d\n\n",integerGeneric.get());
        System.out.printf("字符型值：%s\n\n", stringGeneric.get());
    }
    
}
