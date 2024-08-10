package Saturday_Assessment.lists;

public class Person {
    private String name;
    private int id;
    private int sal;
    public Person(){
        
    }
    public Person(String name,int id,int sal){
        this.name=name;
        this.id=id;
        this.sal=sal;

    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getSal(){
        return sal;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setSal(int sal){
        this.sal=sal;
    }
    @Override
    public String toString() {
        return "name=" + name + ", id=" + id + ", sal=" + sal ;
    }
    
    
    
}



