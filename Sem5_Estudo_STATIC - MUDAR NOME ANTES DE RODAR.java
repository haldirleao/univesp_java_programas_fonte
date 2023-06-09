// 08-06-2019. Semana 5, Exercícios de apoio
// Para testar: Copiar o texto e colar em:
//    https://www.compilejava.net
//    ou no https://www.jdoodle.com/online-java-compiler
//    ou https://www.tutorialspoint.com/compile_java_online.php
/*

Estudo, fonte: https://www.javatpoint.com/static-keyword-in-java

Suppose there are 500 students in my college, now all instance data members 
will get memory each time when the object is created. All students have its 
unique rollno and name, so instance data member is good in such case. Here,
"college" refers to the common property of all objects. If we make it static, 
this field will get the memory only once.


*/
// ******************


class Student{  
   int rollno;//instance variable  
   String name;  
   static String college ="ITS";//static variable  
   //constructor  
   Student(int r, String n){  
   rollno = r;  
   name = n;  
   }  
   //method to display the values  
   void display (){System.out.println(rollno+"\t"+name+"\t"+college);}  
}  
//Test class to show the values of objects  
public class TestStaticVariable1{  
 public static void main(String args[]){  
 Student s1 = new Student(111,"Karan");  
 Student s2 = new Student(222,"Aryan");  
 Student s3 = new Student(171,"Haldir");
 //we can change the college of all objects by the single line of code  
 //Student.college="BBDIT";  
 s1.display();  
 s2.display(); 
 s3.display(); 
 }  
}  