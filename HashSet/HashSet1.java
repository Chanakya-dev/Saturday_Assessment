package HashSet;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Comparator;

public class HashSet1 {

    public static void main(String[] args) {
        Comparator<Person2> p=null;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the choice of 1 or 2");
        int choice = sc.nextInt();
        if (choice==1)
        p=new SortByName();
        else
        p=new SortBySalary();

        Set<Person2> set = new HashSet<Person2>(p);
        set.add(new Person2("John", 30, "Manager", 5000.0));
        set.add(new Person2("Jane", 25, "Developer", 3000.0));
        set.add(new Person2("Mark", 40, "Designer", 4000.0));
        set.add(new Person2("Sarah", 35, "HR", 3500.0));
        set.add(new Person2("Mike", 28, "Accountant", 4500.0));

        for(Person2 p1:set)
        System.out.println(p1);
    }

    
}
