/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package threadTest;

/**
 * 守护线程
 * @date 2018年4月3日14:59:04
 * @author lys
 */
public class Daemon {
    //静态类
    static class DaemonRunnable implements Runnable{
        @Override
        public void run(){
            try{
//                Thread.sleep(1000);
                //永真循环，测试守护线程当主线程退出时，是否会自动退出
                while(true){
                    System.out.println(Thread.currentThread().getName()+"....running");
                }
                
            }catch(Exception e){
                Thread.currentThread().interrupt();
            }finally{
                System.out.println("这里的代码在java虚拟机退出时不一定会执行！");
            }
        }
      public static void main(String[] args){
          Thread daemon = new Thread(new DaemonRunnable(),"DaemonThread");
          daemon.setDaemon(true);//设置成守护（服务）线程，当用户线程全挂时，所有守护线程也跟着挂
          daemon.start();
          int num = 0;
          while(true){
              if(num++ == 10){
                  break;
              }
              System.out.println(Thread.currentThread().getName()+"......."+num);
              
          }
          System.out.println("over");
      }
    }
    
}
