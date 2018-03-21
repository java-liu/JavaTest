/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AnnotationTest;

import AnnotationTest.FruitColor.Color;

/**
 * 注解使用
 * @author lys
 */
public class Apple {
    @FruitName("apple")
    private String name;
    
    @FruitColor(FruitColor = Color.RED)
    private String appleColor;
    @FruitProvider(id=1,name="红富士集团",address="陕西省西安市延安路89号红富士大厦")
    private String appleProvider;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAppleColor() {
        return appleColor;
    }

    public void setAppleColor(String appleColor) {
        this.appleColor = appleColor;
    }

    public String getAppleProvider() {
        return appleProvider;
    }

    public void setAppleProvider(String appleProvider) {
        this.appleProvider = appleProvider;
    }
    public void displayName(){
        System.out.println("水果名称是：苹果");
    }

}
