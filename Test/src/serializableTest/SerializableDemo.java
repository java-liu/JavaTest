/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serializableTest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 序列化对象
 * @author lys
 */
public class SerializableDemo {
    public static void main(String[] args){
        Employee e = new Employee();
        e.name = "jack";
        e.address = "北京";
        e.number = 10;
        e.SSN = "01001";
        try{
           FileOutputStream fileOut = new FileOutputStream("D:\\Users\\lys\\Documents\\NetBeansProjects\\tmp\\employee.ser");
           ObjectOutputStream out = new ObjectOutputStream(fileOut);
           out.writeObject(e);
           out.close();
           fileOut.close();
           System.out.println("Serializable data is saved in /tmp/employee.ser");
           
        }catch(IOException ie){
            ie.printStackTrace();
        }
    }
    
}
