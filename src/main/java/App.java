import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App
{
    public static void main (String [] args)
    {
        Customer bob = new Customer();
        bob.setCid(101);
        bob.setName("bob");
        bob.setLname("lama");

        Configuration con = new Configuration().configure().addAnnotatedClass(Customer.class);


        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();

        session.save(bob);

        tx.commit();
    }
}