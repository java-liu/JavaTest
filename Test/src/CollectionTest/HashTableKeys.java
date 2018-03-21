/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CollectionTest;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author lys
 */
public class HashTableKeys {
    public static void main(String[] args){
        Hashtable ht = new Hashtable();
        ht.put("1","JAVA");
        ht.put("2", "PHP");
        ht.put("3", ".NET");
        Enumeration e = ht.keys();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        getFirstLetter("");
        
    }
         public static String getFirstLetter(String str) {
           String convert = "";
           for (int j = 0; j < str.length(); j++) {
               char word = str.charAt(j);
               // 提取汉字的首字母
               String[] pinyinArray = null;
               if (pinyinArray != null) {
                   convert += pinyinArray[0].charAt(0);
               } else {
                   convert += word;
               }
           }
           return convert.toLowerCase();
       }
    
}
