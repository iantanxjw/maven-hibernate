import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer
{
    @Id
    private int cid;
    private String name;
    private String lname;

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
