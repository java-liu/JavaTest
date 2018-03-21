/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lys.StringTest;

/**
 * 2-查找字符串最后一次出现的位置
 * @author lys
 */
public class lastIndexOf {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args){
        String str = "Hello world,Hello Runoob";
        int lastIndex = str.lastIndexOf("Runoob");
        if(lastIndex==-1){
            System.out.println("Runoob不在"+str+"字符串中！");
        }else{
            System.out.println("Runoob最后出现的位置是："+lastIndex);
        }
        String type = "";
        String[] types = {"on","1","2","3","4","5","6","7","8","11"};
         if(types!=null){
            for(int i=0;i<types.length;i++){
                if(types[i].matches("[0-9]+")){
                       if (!(types[i].length() > 2)) {
                   // if(0<Integer.parseInt(types[i])){
                        
                    //}
                    if(type.length()==0){
                        type += types[i];
                    }else {
                        type += ","+types[i];
                    }
                }
                }
             

            }
        }
         System.out.println(type);
        // System.out.println(0<Integer.parseInt("on"));
    }
    
}
