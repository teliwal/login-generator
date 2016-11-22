package geco;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by telly on 22/11/16.
 */
public class LoginGeneratorTest {
    LoginService logser;
    LoginGenerator loggen;
    @Before
    public void setUp() throws Exception {
        logser = new LoginService(new String[] {"JROL","BPER","CGUR",
                                        "JDUP","JRAL","JRAL1"});
        loggen = new LoginGenerator(logser);
    }

    @Test
    public void generateLoginForNomAndPrenom1() throws Exception {
        String nom = "Durand";
        String prenom = "Paul";
        String res=loggen.generateLoginForNomAndPrenom(nom,prenom);
        int a = res.compareTo("PDUR");
        assertEquals("Paul Durand succes",0,a);
    }

    @Test
    public void generateLoginForNomAndPrenom2() throws Exception {
        String nom = "Rolling";
        String prenom = "Jean";
        String res=loggen.generateLoginForNomAndPrenom(nom,prenom);
        int a = res.compareTo("JROL1");
        assertEquals("Jean Rolling succes",0,a);
    }

    @Test
    public void generateLoginForNomAndPrenom3() throws Exception {
        String nom = "Dùrand";
        String prenom = "Paul";
        String res=loggen.generateLoginForNomAndPrenom(nom,prenom);
        int a = res.compareTo("PDUR");
        assertEquals("Paul Dùrand succes",0,a);
    }
    /*@Test
    public void generateLoginForNomAndPrenom2() throws Exception {
        String nom = "Ralling";
        String prenom = "John";
        String res=loggen.generateLoginForNomAndPrenom(nom,prenom);
        int a = res.compareTo("JRAL2");
        assertEquals("John Ralling ajoute",0,a);
    }*/

}