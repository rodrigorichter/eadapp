
package eadapp;
import eadapp.classesEntidade.Conta;
import eadapp.classesInterface.AccountSettings;
import eadapp.OLD.data.Database;
import eadapp.ui.LoginScreen;
import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


public class EadApp {

    public static Database db;
    public static EntityManagerFactory emf;
    public static EntityManager em;
    
    public static void main(String[] args) throws SQLException {
        emf = javax.persistence.Persistence.createEntityManagerFactory("EadAppPU");
        em = emf.createEntityManager();
        
       
        LoginScreen ls;
	ls = new LoginScreen();
        ls.main(args);
    }
}
