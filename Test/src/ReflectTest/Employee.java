/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ReflectTest;

/**
 *
 * @author lys
 */
public class Employee extends Person{
    private String id;
    private String name;
    private int age;
    private long salary;
    
    public Employee(){
        
    }
    
    public Employee(String name){
        this.name = name;
        System.out.println(name);
    }

    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
    
    
    public void getInfo(){
        System.out.println("getInfo");
    }
    public void getInfo(String name,int age){
        System.out.println("我叫" + name + ",年龄是："+age+"岁");
    }
    
    
    
}
