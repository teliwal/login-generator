package geco;

import java.security.SecureRandom;

/**
 * Created by telly on 30/11/16.
 */
public class PasswordGeneration {

    private String f ="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public String getRandomPassword(){
        StringBuilder s =new StringBuilder(8);
        SecureRandom rnd = new SecureRandom();
        for(int i = 0; i < 8; i++)
            s.append(f.charAt(rnd.nextInt(f.length())));
        System.out.println(s.toString());
        return s.toString();
    }
}
