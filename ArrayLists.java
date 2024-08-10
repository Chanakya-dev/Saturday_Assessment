package Saturday_Assessment;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists{
public static void main(String[]args){
  ArrayList<String> b=new ArrayList<String>();
  b.add("Hello");
  b.add("World");
  for (String element : b) {
    System.out.println(element);
}

  System.out.println("***********");
  ArrayList<Person> p=new ArrayList<Person>();
  p.add(new Person(" manoj", 20));
  p.add(new Person("mmk", 21));

  Iterator<Person> it1=p.iterator();
  while(it1.hasNext()){
    System.out.println(it1.next().toString());
  }
  
  


}
}