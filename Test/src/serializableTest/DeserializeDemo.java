/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serializableTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 反序列化对象
 * @author lys
 */
public class DeserializeDemo {
    public static void main(String[] args){
        Employee e = null;
        try{
           FileInputStream fileIn = new FileInputStream("D:\\Users\\lys\\Documents\\NetBeansProjects\\tmp\\employee.ser");
           ObjectInputStream in = new ObjectInputStream(fileIn);
           e = (Employee)in.readObject();
           in.close();
           fileIn.close();
        }catch(IOException ie){
            ie.printStackTrace();
            return;
            
        }catch(ClassNotFoundException ce){
            System.out.println("Employee class not found!");
            ce.printStackTrace();
            return;

        }
        System.out.println("Deserialize Employee...");
        System.out.println("Name ="+e.name);
        System.out.println("Address="+e.address);
        System.out.println("SSN="+e.SSN);
        System.out.println("Number="+e.number);
    }
    
}
