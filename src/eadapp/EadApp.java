
package eadapp;
import eadapp.data.Database;
import eadapp.ui.LoginScreen;
import java.sql.SQLException;


public class EadApp {

    
    public static Database db;
    
    
    public static void main(String[] args) throws SQLException {
        db = new Database(true);
        
        LoginScreen ls;
	ls = new LoginScreen();
        ls.main(args);
    }
    
}
