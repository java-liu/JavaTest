/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StaticFactoryTest;

/**
 * 测试客户端
 * @author lys
 */
public class SimpleFactoryTest {
    public static void main(String[] args)throws Exception{
        //实例化各种食物
        Service noodles = FoodFactory.getFood("Noodles");
        Service fruits = FoodFactory.getFood("fruits");
        Service rice = FoodFactory.getFood("Rice");
        
        if(noodles!=null){
            noodles.getFood();
        }
         if(fruits!=null){
            fruits.getFood();
        }
        if(rice!=null){
            rice.getFood();
        }
       
        
        
    }
    
}
