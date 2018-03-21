/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abstractAndInterface;

/**
 * 测试客户端
 * @author lys
 */
public class ClientTest {
    public static void main(String[] args){
        abstractDemo1Child adc  = new abstractDemo1Child();
        adc.method1();
        adc.method2();
        InterfaceDemo1Child idc = new InterfaceDemo1Child();
        idc.imethod1();
        idc.imethod2();
        abstractDemo2Child adc2 = new abstractDemo2Child();
        adc2.method1();
    }
}
