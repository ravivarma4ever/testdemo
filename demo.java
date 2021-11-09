package com.java;  
  
public class demo {  
  
void msg()  
 {  
     System.out.println("Try to access default method outside the package ");  
 }  
       
}  
//save by DefaultExample2.java  
package com.javatpoint;  
import com.java.demo;  
  
public class DefaultExample2 {  
public static void main(String[] args) {  
    demo a=new demo();  
   a.msg();  
      
}  
} 
