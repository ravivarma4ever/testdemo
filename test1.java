//save by A.java  
  
package com.java;  
  
public class test {  
  
void msg()  
 {  
     System.out.println("Try to access default method outside the package ");  
 }  
       
}  
//save by DefaultExample2.java  
package com.javatpoint;  
import com.java.test;  
  
public class DefaultExample2 {  
public static void main(String[] args) {  
    test a=new test();  
   a.msg();  
      
}  
}  
