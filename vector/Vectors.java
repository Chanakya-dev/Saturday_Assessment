package Saturday_Assessment.vector;

import java.util.Enumeration;
import java.util.Vector;
 class Vectors{

     public static void main(String[] args) {

         Vector<String> v = new Vector<String>();
        
        
         Vector<Person> v1 = new Vector<Person>();
         Person p1 = new Person("siva", 24, "Male", "Delhi");
         Person p2 = new Person("shiva", 21, "Male", "kkd");
         v1.add(p1);
         v1.add(p2);

         Enumeration<Person> e = v1.elements();
         while (e.hasMoreElements()) {
             Person p = e.nextElement();
             System.out.println(p);
         }
       
         
           
        
         
     

 }
}