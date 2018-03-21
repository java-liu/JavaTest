/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lys.StringTest;

/**
 * 1-字符串比较
 * @author lys
 */
public class CompareTo {
    public static void main(String[] args){
        String sr1 = "HELLO WORLD";
        String sr2 = "hello world";
        Object sr3 = sr1;
        System.out.println(sr1.compareTo(sr2));
        System.out.println(sr1.compareToIgnoreCase(sr2));
        System.out.println(sr1.compareTo(sr3.toString()));
        String ids = "";
        String[] id = ids.split(",");
        System.out.println(id.length);
    }
    
}
