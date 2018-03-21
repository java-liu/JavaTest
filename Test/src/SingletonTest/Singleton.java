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
public class Singleton {
    public static Singleton instance = new Singleton();
    public Singleton(){};
    public static Singleton getInstance(){
        return instance;
    }
}
