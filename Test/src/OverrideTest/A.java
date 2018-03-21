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
public class A {
    public String show(A obj){
        return ("A and A");
    }
    public String show(D obj){
        return ("A and D");
    }
     public String show(C obj){
        return ("A and C");
    }
    
}
