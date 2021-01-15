package util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class ConnectionHibernate {

    private static SessionFactory sessionFactory = null;

    public static SessionFactory getConnection() {
        return  sessionFactory = new Configuration().configure().buildSessionFactory();
    }


    public static SessionFactory getNewConnection(){
        Configuration configuration = new Configuration();
        configuration.configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        return sessionFactory = configuration.buildSessionFactory(builder.build());
    }
}
