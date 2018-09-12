/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8ee9938e4b960a50540f1ca9299facc5a5f342d0848b402c322fd14592e4bc32;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.binary.Hex;

/**
 *
 * @author benja
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MessageDigest md = null;
	String password = "Hola-woow-soy-hackeable";
        try {
            
            //SHA-512
            md= MessageDigest.getInstance("SHA-512");
            md.update(password.getBytes());
            byte[] mb = md.digest();
            System.out.println(Hex.encodeHex(mb));
            
            md= MessageDigest.getInstance("SHA-384");
            md.update(password.getBytes());
            byte[] mb0 = md.digest();
            System.out.println(Hex.encodeHex(mb0));
            
            
            
            md= MessageDigest.getInstance("SHA-256");
            md.update(password.getBytes());
            byte[] mb1 = md.digest();
            System.out.println(Hex.encodeHex(mb1));
            
            
            //SHA-1
            md= MessageDigest.getInstance("SHA-1");
            md.update(password.getBytes());
            mb = md.digest();
            System.out.println(Hex.encodeHex(mb));
            
            //MD5
            md= MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            mb = md.digest();
            System.out.println(Hex.encodeHex(mb));
            
        } catch (NoSuchAlgorithmException e) {
            //Error
        }
    }
    
}
