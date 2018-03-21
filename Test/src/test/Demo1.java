/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import java.util.Arrays;

/**
 *
 * @author lys
 */
public class Demo1 {
    public static void main(String []args){
        String st1 = "0";
        String st2 = "null";
        String st3 = st1+st2;
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        String[] ss = new String[6];
        String str4 = "faa,cc,0aa4";
        String[] str5 = {"dd","cca","rd"};
        String[] strs = str4.split(",");
        System.arraycopy(str5, 0,ss ,0, str5.length);
        System.arraycopy(strs, 0, ss, str5.length, strs.length);
        int size = ss.length;
        for(String array:ss){
           System.out.println(array); 
        }
        System.out.println(new String("ddd")==new String("ddd"));
        System.out.println(new String("ccc").intern()==new String("ccc").intern());
        
        
    }
    
}
