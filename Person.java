package Saturday_Assessment;

public class Person {
    private int age;
    private String name;
    private String bloodgroup;
    public Person(int age, String name, String bloodgroup, String gender) {
        this.age = age;
        this.name = name;
        this.bloodgroup = bloodgroup;
        this.gender = gender;
    }
    public Person(String string, int i) {
        //TODO Auto-generated constructor stub
    }
    private String gender;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBloodgroup() {
        return bloodgroup;
    }
    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "Person [age=" + age + ", name=" + name + ", bloodgroup=" + bloodgroup + ", gender=" + gender + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((bloodgroup == null) ? 0 : bloodgroup.hashCode());
        result = prime * result + ((gender == null) ? 0 : gender.hashCode());
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
        Person other = (Person) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (bloodgroup == null) {
            if (other.bloodgroup != null)
                return false;
        } else if (!bloodgroup.equals(other.bloodgroup))
            return false;
        if (gender == null) {
            if (other.gender != null)
                return false;
        } else if (!gender.equals(other.gender))
            return false;
        return true;
    }
    
}
