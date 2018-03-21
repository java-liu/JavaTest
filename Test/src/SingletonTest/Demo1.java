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
public enum Demo1 {
    INSTANCE;
    public void getSingleton(){
        System.out.println("实例！");
    }
    
}
