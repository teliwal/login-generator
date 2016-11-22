package geco;

import org.junit.Before;
import org.junit.Test;
import java.util.List;
import static  org.junit.Assert.*;

/**
 * Created by telly on 22/11/16.
 */
public class LoginServiceTest {

    private LoginService l;
    String logins [] = {"telly","amaury","pepito","bah","lea","pipita"};

    @Before
    public void setUp() throws Exception {
        l = new LoginService(logins);
    }

    @Test
    public void loginExists() throws Exception {
        String a ="telly";
        assertTrue("login trouve",l.loginExists(a));
    }

    @Test
    public void addLogin() throws Exception {
        String a ="kikala";
        l.addLogin(a);
        assertTrue("login ajoute",l.loginExists(a));
    }

    @Test
    public void findAllLoginsStartingWith() throws Exception {
        List<String> li =l.findAllLoginsStartingWith("p");
        assertEquals("taille egale",2,li.size());
    }

    @Test
    public void findAllLogins() throws Exception {
        List<String> li =l.findAllLogins();
        assertEquals("taille totale",6,li.size());
    }

}