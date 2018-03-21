/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package developerWorks;

/**
 *
 * @author lys
 */
public class Person {
    private String name;
    private int age;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public Person(String name){
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    
    @Override
    public String toString(){
        String str = null;
        str = "name="+name.toString()+"，age="+age+"，sex="+sex.toString();
        return str;
    }
    public String getFullInfo(){
        return name.concat(" ").concat(sex);
    }
    
}
