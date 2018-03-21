/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StaticFactoryTest;

/**
 * 建立一个食品加工工厂
 * @author lys
 */
public class FoodFactory {
    public static Service getFood(String type)throws Exception{
        
           if(type.equals("Noodles")){
               return Noodles.class.newInstance();
           }else if(type.equals("Rice")){
               return Rice.class.newInstance();
           }else{
               System.out.println("找不到具体实例化类！");
               return null;
           } 
      
    }
    
}
