package Saturday_Assessment.sets;

public class Person1 implements Comparable<Person1>{
    private int pid;
    private String pname;
    private double psal;
    private String pdesg;
  
    @Override
    public int compareTo(Person1 o) {
         return 0;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPsal() {
        return psal;
    }

    public void setPsal(double psal) {
        this.psal = psal;
    }

    public String getPdesg() {
        return pdesg;
    }

    public void setPdesg(String pdesg) {
        this.pdesg = pdesg;
    }

    @Override
    public String toString() {
        return "Person [pid=" + pid + ", pname=" + pname + ", psal=" + psal + ", pdesg=" + pdesg + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + pid;
        result = prime * result + ((pname == null) ? 0 : pname.hashCode());
        long temp;
        temp = Double.doubleToLongBits(psal);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((pdesg == null) ? 0 : pdesg.hashCode());
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
        if (pid != other.pid)
            return false;
        if (pname == null) {
            if (other.pname != null)
                return false;
        } else if (!pname.equals(other.pname))
            return false;
        if (Double.doubleToLongBits(psal) != Double.doubleToLongBits(other.psal))
            return false;
        if (pdesg == null) {
            if (other.pdesg != null)
                return false;
        } else if (!pdesg.equals(other.pdesg))
            return false;
        return true;
    }

    public Person1(int pid, String pname, double psal, String pdesg) {
        this.pid = pid;
        this.pname = pname;
        this.psal = psal;
        this.pdesg = pdesg;
    }

    public Person1() {
    }
    
    
    
}

