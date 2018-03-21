/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serializableTest;

import java.io.Serializable;

/**
 * 把对象转换成字节序列的过程称为对象的序列化；
 * 把字节序列恢复为对象的过程称为对象的反序列化
 * 对象的序列化有两种用途：
 * 1）、把对象的字节序列永久保存到硬盘上，通常存放在一个文件中
 * 2）、在网络上传送对象的字节序列
 * @author lys
 */
public class Person implements Serializable{
    /**
    * 对象序列化包含两个步骤
    * 1)、创建一个对象输出流，它可以包含一个其他类型的目标输出流，如文件输出流；
    * 2)、通过对象输出流的writeObject()方法写对象
    */
    private static final long SeriaVersionUID = -155482545212325534L;
    private String name;
    private String sex;
    private int age;
    private String address1;

    
    
  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }
    
    
    
}
