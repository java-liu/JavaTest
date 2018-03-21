/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package developerWorks;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author lys
 */
public class Test1 {
    public static void main(String[] args){
        Logger l = Logger.getLogger(Person.class.getName());
      Person person = new Person("lys");
      person.setAge(21);
      person.setSex("男");
      System.out.println(Person.class.getName());
//      l.info("name="+person.getName());
//      l.info("Person："+person.toString());
//      l.info("getFullInfo="+person.getFullInfo());
      int a = 0;
      Integer b = 0;
      while(a<3){
               l.info("doWhile" + a + "次！");      
        
          a++;
          
      }
      List<String> li = new ArrayList<>();
      li.add("2aaa");
      li.add("3bbb");
      li.add("4ccc");
      for(String str:li){
          l.info("li="+str);
      }
    }
    
    
    
}
