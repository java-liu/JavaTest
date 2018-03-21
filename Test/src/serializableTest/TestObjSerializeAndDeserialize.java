/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serializableTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.MessageFormat;

/**
 * 序列化和反序列化Person对象
 * @author lys
 */
public class TestObjSerializeAndDeserialize {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        //SerializePerson();
        Person p = DeserializePerson();//反序列化对象
        System.out.println(MessageFormat.format("age={0},name={1},sex={2}", p.getAge(),p.getName(),p.getSex()));
        
    }
    
    /**
     * 序列化对象
     * 1.创建一个对象输出流
     * 2.通过对象的writeObject()方法写对象
     */
    public static void SerializePerson() throws FileNotFoundException,IOException{
        Person person = new Person();
        person.setAge(21);
        person.setName("张三");
        person.setSex("男");
        ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(new File("D:/person.txt")));
        oo.writeObject(person);
        System.out.println("Person对象序列化成功！");
        oo.close();
    }
    /**
     * 反序列化对象
     * 1.创建一个对象输入流，它可以包装一个其他类型的输入流，如文件输入流；
     * 2.通过对象输入流的readObject()方法读对象
     */
    public static Person DeserializePerson()throws IOException, ClassNotFoundException{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("D:/person.txt")));
        Person person = (Person)in.readObject();
        in.close();
        System.out.println("Person对象反序列化成功！");
        return person;
    }
    
}
