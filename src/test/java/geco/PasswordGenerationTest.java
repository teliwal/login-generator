package geco;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by telly on 30/11/16.
 */
public class PasswordGenerationTest {
    PasswordGeneration pg = new PasswordGeneration();
    @Test
    public void getRandomPassword() throws Exception {
        String pass = pg.getRandomPassword();
        assertEquals("longueur de 8",8,pass.length());
    }

}