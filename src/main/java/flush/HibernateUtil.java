package flush;

import org.apache.log4j.PropertyConfigurator;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {

    private static SessionFactory factory;

    static {
        try {
            factory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .buildSessionFactory();
            PropertyConfigurator.configure("log4j.properties");
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }

    public static SessionFactory getSessionFactory() {
        return factory;
    }

}
