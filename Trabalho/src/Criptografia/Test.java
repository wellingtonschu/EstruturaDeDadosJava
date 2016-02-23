package Criptografia;

import java.security.*;
import javax.crypto.*;

public class Test {

    public static void main (String[] args) throws Exception {

        if (args.length != 1) {
            System.err.println("Exemplo");
            System.exit(1);
        }
        byte[] plainText = args[0].getBytes("UTF8");

        MessageDigest messageDigest = MessageDigest.getInstance("MD%");

        System.out.println("\n" + messageDigest.getProvider().getInfo());

        messageDigest.update(plainText);

        System.out.println("\nDigest: ");

        System.out.println(new String(messageDigest.digest(), "UTF8"));
    }

}
