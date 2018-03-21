/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StaticFactoryTest.StaticClass;

/**
 * Java静态类测试
 * @author lys
 */
public class StaticTest {
    //无参构造器
    public StaticTest(){};
    public static int i = 2;
    public int j = 3;
    private String name;
    private int age;
    static{
        int x = 31;
        int y = 32;
        i = 55;
        System.out.println(x+"====="+y);
        
    }
      
    /**
     * 静态内部类
     * 1.静态内部类使用场景一般是当外部类需要使用内部类，而内部类无需使用外部资源，并且内部类可以单独创建的时候会考虑采用静态内部类的设计
     */
    public static class OuterA{
        private String name;
        private int age;
        public static int age2;
        
        public OuterA(){};
        public OuterA(int age){
            this.age = age;
        }
        public OuterA withName(String name){
            this.name = name;
            return this;
        }
        public OuterA withAge(int age){
            this.age = age;
            return this;
        }
        //静态内部类调用外部类的构造器，来构造外部类，由于静态内部类可以单独初始化，可以供外部类使用
        //典型的build模式
        public StaticTest build(){
            return new StaticTest(this);
        }
     
        
        
        
        
        //静态内部类可以声明静态变量也可以声明非静态成员变量
        public int m = 4;
        public static int n = 5;
        //静态内部类可以声明静态方法也可以声明非静态方法
        public void getInResult(){
            System.out.println(i);
            //静态类不能访问非静态成员变量
            //System.out.println(j);
        }
        public static void getInResultA(){
            int a;
            int b = 444;
            i = i + 1;
            System.out.println("静态内部类静态方法访问静态方法内非静态变量b="+b);
            
            System.out.println("静态内部类静态方法访问外部类静态成员变量i="+i);
            //内部静态类不能访问非静态成员变量
            //-----System.out.println(j);
            //内部静态方法不能访问静态类中的非静态成员变量
            //-----System.out.println(m);
            System.out.println("静态内部类静态方法访问静态内部类静态成员变量n="+n);
        }
    }
    public StaticTest(OuterA oa){
        this.age = oa.age;
        this.name = oa.name;
    }
    public StaticTest getTest(){
        //build 模式
        StaticTest st = new StaticTest.OuterA().withAge(25).withName("lys").build();
        
        System.out.println(st.name+st.age);
        return st;
    }
    /**
     * 普通内部类
     */
    public class OuterB{
        public void getResultB(){
            //普通内部类可以访问任意外部类的成员变量
            System.out.println("普通内部类i="+i);
            System.out.println("普通内部类j="+j);
            //-----------------------------
            //普通内部类不能访问静态内部类中的非静态成员变量
            //-----System.out.println("普通内部类m="+StaticTest.OuterA.m);
            //普通内部类可以访问静态内部类中的静态成员变量
            System.out.println("普通内部类n="+StaticTest.OuterA.n);
        }
        
    }
    
    public void getOutResult(){
        //
        System.out.println(i+1);
        
    }
    public static void getOutResultA(){
        System.out.println(i+2+"OutResultA");
        //静态方法不能访问非静态成员变量
        //------System.out.println(j);
        System.out.println(StaticTest.OuterA.n);
        //普通类中的静态方法不能访问静态内部类中的非静态成员变量，可以访问静态内部类中的静态成员变量
        //------System.out.println(StaticTest.OuterA.m);
        
    }
    public static void main(String[] args){
        StaticTest st = new StaticTest();
        System.out.println(st.j+"-----"+StaticTest.i);
        System.out.println(++i+"===");
        System.out.println(i+"====");
        //静态内部类可以单独初始化
        OuterA ot = new StaticTest.OuterA();
        ot.getInResult();
        st.getOutResult();
        ot.getInResultA();
        getOutResultA();
       //普通内部类不能单独初始化 
        OuterB ob = st.new OuterB();
        //普通内部类不可以访问外部类中任意的方法
        ob.getResultB();
        //-----ob.getOutResult();
        //-----ob.getOutResultA();
        st.getTest();
        
    }
    
}
