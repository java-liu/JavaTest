/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package OverrideTest;

/**
 *
 * @author lys
 */
public class B extends A{
    public String show(B obj){
        return "B and B";
    }
    public String show(A obj){
        return "B and A";
    }
    public String show(D obj){
        return "B and D";
    }
     public String show(C obj){
        return "B and C";
    }
    
}
