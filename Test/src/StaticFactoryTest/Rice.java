/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StaticFactoryTest;

/**
 * 具体产品
 * Rice对抽象借口的实现
 * @author lys
 */
public class Rice implements Service {
    @Override
    public void getFood(){
        System.out.println("我要了一份米饭！");
        
    }
}
