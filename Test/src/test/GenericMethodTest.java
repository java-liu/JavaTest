/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

/**
 * 泛型方法
 * @author lys
 */
public class GenericMethodTest {
    public static<E> void printArray(E[] inputArray){
        //输出数组元素
        for(E element:inputArray){
            System.out.printf("%s ",element);//格式化输出 %s表示输出字符串
        }
        System.out.println();
    }
    public static<T extends Comparable<T>> T maxinum(T x,T y,T z){
        T max = x;
       
        if(y.compareTo(max)>0){
            max = y;
        }
        if(z.compareTo(max)>0){
            max = z;
        }
         return max;
    }
    
    public static void main(String []args ){
        Integer []intArray = {1,2,3,4,5};
        Double []doubleArray = {1.1,2.2,3.3,4.4,5.5,};
        Character []charArray = {'A','B','C','D','E'};
        
        System.out.println("整型数组元素是：");
        printArray(intArray);
        
        System.out.println("\n双精度数组元素是：");
        printArray(doubleArray);
        
        System.out.println("\n字符型数组元素是：");
        printArray(charArray);
        
        System.out.printf("%d, %d 和 %d 中最大的数为 %d\n\n",3, 4, 5,maxinum(3,4,5));
        System.out.printf("%.1f,%.1f 和%.1f 中最大的数为 %.1f\n\n",6.4,5.4,7.8,maxinum(6.4,5.4,7.8));
    }
}
