/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AnnotationTest;

import java.lang.reflect.Field;

/**
 * 注解处理器--反射
 * @author lys
 */
public class FruitInfoUtil {
     public enum k{RED,BLUE};
    public static void getFruitInto(Class<?> clazz){
        String strFruitName = "水果名称是：";
        String strFruitColor = "水果颜色是：";
        String strFruitProvider = "水果产地是：";
        
     
       
        
        Field[] fields = clazz.getDeclaredFields();//获取类所有属性
        
        for(Field field:fields){
            if(field.isAnnotationPresent(FruitName.class)){
               FruitName fruitName = (FruitName)field.getAnnotation(FruitName.class);
               strFruitName = strFruitName + fruitName.value();
               System.out.println(strFruitName);
            }
            else if(field.isAnnotationPresent(FruitColor.class)){
                FruitColor fruitColor = (FruitColor)field.getAnnotation(FruitColor.class);
                strFruitColor = strFruitColor + fruitColor.FruitColor();
                System.out.println(strFruitColor);
            }
            else if(field.isAnnotationPresent(FruitProvider.class)){
                FruitProvider fruitProvider = (FruitProvider)field.getAnnotation(FruitProvider.class);
                strFruitProvider = "供应商编号："+ fruitProvider.id() + ",供应商名称是："+ fruitProvider.name() + ",供应商地址："+ fruitProvider.address();
                System.out.println(strFruitProvider);
            }
        }
    }
    
}
