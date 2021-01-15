import model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.ConnectionHibernate;

public class RunHibernate {
    public static void main(String[] args) {
        //Student student = new Student("Ivan", "rwer@gmail.com");
        ConnectionHibernate.getConnection();
    }
}
