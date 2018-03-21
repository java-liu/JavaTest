/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serializableTest;

/**
 * 员工类
 * @author lys
 */
public class Employee implements java.io.Serializable{
   // private String id;
    public String name;
    public String address;
    public  transient String SSN;
    public int number;
    
    public void mailCheck(){
        System.out.println("Malling a check to "+ name + " "+ address);
    }
    
}
