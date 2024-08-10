package Saturday_Assessment.lists;
import java.util.LinkedList;

import java.util.Iterator;

public class person_list{
public static void main(String[]args)
  {
    LinkedList<Person> l=new LinkedList<Person>();
    Person p=new Person("prasad",56,89000);
    l.add(new Person("pratap",45,50000));
    l.add(p);
    Iterator i=l.listIterator();
    while(i.hasNext()){
      System.out.println(i.next());
    }
    
  
  }
}


