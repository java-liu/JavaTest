/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package threadTest;

/**
 * 线程实现方法一：实现Runnable接口
 * @author lys
 */
public class RunnableDemo implements Runnable{
    private Thread t;
    private String threadName;
    //构造方法
    RunnableDemo(String name){
        this.threadName = name;
        System.out.println("Creating "+ threadName);
        
    }

    @Override
    public void run() {
        System.out.println("Running "+ threadName);
        try{
             for(int i = 4;i>0;i--){
            System.out.println("Thread "+ threadName+","+i);
            Thread.sleep(50);
        }
        }catch(InterruptedException ie){
            System.out.println("Thread "+ threadName + "interrupt");
            ie.printStackTrace();
            
        }
        System.out.println("Thread "+ threadName +" exit." );
       
       
    }
    public void start(){
        System.out.println("Starting " + threadName);
        if(t==null){
            t = new Thread(this,threadName);
            t.start();
        }
    }
    public static void main(String[] args){
        RunnableDemo r1 = new RunnableDemo("Thread-1");
        r1.start();
        
        RunnableDemo r2 = new RunnableDemo("Thread-2");
        r2.start();
    }
}
