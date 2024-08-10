package Stack;
import java.util.Enumeration;
import java.util.Stack;

public class Stacks1 {

    public static void main(String[] args) {
        Stack<Person1> stack = new Stack<Person1>();

        stack.push(new Person1("Janaki", 30, "Manager", 5000.0));
        stack.push(new Person1("hemu", 25, "Developer", 3000.0));
        stack.push(new Person1("Mani", 40, "Designer", 4000.0));
        stack.push(new Person1("Sai", 35, "HR", 3500.0));
        stack.push(new Person1("Dhinash", 28, "Accountant", 4500.0));
        
        Enumeration<Person1> enumeration = stack.elements();
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
