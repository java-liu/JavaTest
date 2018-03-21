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
public class Singleton2 {
    public static class SingletonHolder{
        private static final Singleton2 instance = new Singleton2(); 
    }
    public Singleton2(){};
    public static final Singleton2 getInstance(){
        return SingletonHolder.instance;
    }
    
}
