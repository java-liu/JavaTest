/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StaticFactoryTest;

/**
 * 具体的产品
 * noodles对Service抽象借口的实现
 * @author lys
 */
public class Noodles implements Service {

    @Override
    public void getFood() {
       System.out.println("我要了一份面条！"); 
    }
    
    
}
