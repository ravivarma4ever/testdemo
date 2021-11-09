package com.java;  
  
public class demo {  
  
void msg()  
 {  
     System.out.println("Try to access default method outside the package ");  
     username = "demo"
     password = "password"
     int target = -5;
     int num = 3;
     //target =- num;  // Noncompliant; target = -3. Is that really what's meant?
     target =+ num; // Noncompliant; target = 3
     return target;
        if (username.equals('demo')){
        System.out.println("Hello to the world");       
      }
 }  
 void msg()
 {
    System.out.println("Hello to the world");   
    username = demo
    password = password
      if (username.equals('demo')){
        System.out.println("Hello to the world");       
      }
 }
       
}  
//save by DefaultExample2.java  
package com.javatpoint;  
import com.java.demo;  
  
public class DefaultExample2 {  
public static void main(String[] args) {  
    demo a=new demo(); 
   a.msg();  
   int target = -5;
   int num = 3;
   target =- num;  // Noncompliant; target = -3. Is that really what's meant?
   target =+ num; // Noncompliant; target = 3
   if (target.equals(num)) {  
    System.out.println("Hello to the world");
   }
    switch (param) {
  case 0:
    doSomething();
    break;
  default: // default clause should be the last one
    //error();
    break;
  case 1:
    doSomethingElse();
    break;
}  
}  
} 
