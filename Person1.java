package Saturday_Assessment;


public class Person1 implements Comparable<Person1> {
    private String name;
    private long salary;
    public Person1(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + (int) (salary ^ (salary >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person1 other = (Person1) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (salary != other.salary)
            return false;
        return true;
    }
    @Override
    public int compareTo(Person1 o) {
        return this.name.compareTo(o.name);
        
    }
    @Override
    public String toString() {
        return "Person1 [name=" + name + ", salary=" + salary + "]";
    }
    

    
}
